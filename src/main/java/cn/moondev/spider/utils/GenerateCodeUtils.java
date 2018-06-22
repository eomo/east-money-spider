package cn.moondev.spider.utils;

import cn.moondev.spider.utils.ModelClassInfo;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class GenerateCodeUtils {

    public static void main(String[] args) throws Exception {
//        mybatisMap("BalanceSheet");
//        mybatisMap("IncomeStatement");
//        mybatisMap("CashFlowStatement");
//        insertSQL("BalanceSheet");
//        insertSQL("CashFlowStatement");
//        insertSQL("IncomeStatement");
//        createTableSQL("BalanceSheet");
//        createTableSQL("CashFlowStatement");
//        createTableSQL("IncomeStatement");
//        getterAndSetter("BalanceSheet");
//        getterAndSetter("CashFlowStatement");
        getterAndSetter("IncomeStatement");
    }

    public static void getterAndSetter(String javaName) throws Exception {
        List<ModelClassInfo> cdxList = getCDXList(javaName);
        for (ModelClassInfo cdx : cdxList) {
            String str = "this." + cdx.field + " = NumberUtils.convertCent(json.getString(\""+cdx.jsonFiled+"\"));";
            System.out.println(str);
        }
    }

    /**
     * 建表语句
     *
     * @param javaName
     * @throws Exception
     */
    public static void createTableSQL(String javaName) throws Exception {
        List<ModelClassInfo> cdxList = getCDXList(javaName);
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ").append("t" + mysqlField(javaName)).append("(").append("\n");
        sb.append("        id BIGINT PRIMARY KEY AUTO_INCREMENT,");
        for (ModelClassInfo cdx : cdxList) {
            sb.append("        ");
            sb.append(cdx.mysqlField).append(" ").append("BIGINT NOT NULL DEFAULT 0 COMMENT '").append(cdx.content).append("',").append("\n");
        }
        sb.append("        UNIQUE KEY unique_index_code_date(`security_code`,`report_date`,`date_type`)").append("\n");
        sb.append(")ENGINE=INNODB DEFAULT CHARSET=utf8mb4;");
        System.out.println(sb.toString());
    }

    /**
     * 生成insert语句
     */
    public static void insertSQL(String javaName) throws Exception {
        List<ModelClassInfo> cdxList = getCDXList(javaName);
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append("t" + mysqlField(javaName)).append("(").append("\n");
        for (ModelClassInfo cdx : cdxList) {
            sb.append("        ");
            sb.append(cdx.mysqlField).append(",").append("\n");
        }
        sb.append(") VALUES (");
        for (ModelClassInfo cdx : cdxList) {
            sb.append("        ");
            sb.append(String.format("#{item.%s},", cdx.field)).append("\n");
        }
        sb.append(")ON DUPLICATE KEY UPDATE");
        for (ModelClassInfo cdx : cdxList) {
            sb.append("        ");
            sb.append(String.format("%s = VALUES(%s),", cdx.mysqlField, cdx.mysqlField)).append("\n");
        }
        System.out.println(sb.toString());
    }


    /**
     * 生成mybatis resultMap
     */
    public static void mybatisMap(String javaName) throws Exception {
        List<ModelClassInfo> cdxList = getCDXList(javaName);
        for (ModelClassInfo cdx : cdxList) {
            String format = "<result column=\"%s\" property=\"%s\"/>";
            System.out.println(String.format(format, cdx.mysqlField, cdx.field));
        }
    }


    public static List<ModelClassInfo> getCDXList(String javaName) throws Exception {
        File file = new File("/Users/Moon/WorkSpace/github.com/east-money-spider/src/main/java/cn/moondev/spider/model/" + javaName + ".java");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String content = "";
        String field = "";
        String jsonField = "";
        List<ModelClassInfo> cdxList = Lists.newArrayList();
        while ((line = reader.readLine()) != null) {
            // 获取注释
            if (line.contains("//")) {
                content = line.substring(7);
            }
            if (line.contains("public String") || line.contains("public long")) {
                if (line.contains("public String")) {
                    field = line.substring(18);
                } else {
                    field = line.substring(16);
                }
            }
            if (line.contains("@JSONField")) {
                jsonField = line.substring(23).trim();
            }
            if (!Strings.isNullOrEmpty(content) && !Strings.isNullOrEmpty(field) && !Strings.isNullOrEmpty(jsonField)) {
                cdxList.add(new ModelClassInfo(field.substring(0, field.length() - 1),jsonField.substring(0,jsonField.length()-2), content));
                content = "";
                field = "";
            }
        }
        for (ModelClassInfo cdx : cdxList) {
            cdx.mysqlField = mysqlField(cdx.field);
        }
        return cdxList;
    }


    public static String mysqlField(String field) {
        StringBuilder sb = new StringBuilder();
        char[] chars = field.toCharArray();
        for (char ch : chars) {
            if (Character.isLowerCase(ch)) {
                sb.append(ch);
            } else if (Character.isUpperCase(ch)) {
                sb.append("_").append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}
