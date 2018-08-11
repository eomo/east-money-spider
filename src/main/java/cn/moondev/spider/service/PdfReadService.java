package cn.moondev.spider.service;

import com.google.common.base.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class PdfReadService {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\CHEN\\Desktop\\创业板公司基本信息库\\上海雪榕生物科技股份有限公司.pdf");
        PDDocument document = PDDocument.load(new FileInputStream(file));
        int total = document.getNumberOfPages();
        PDFTextStripper pts = new PDFTextStripper();
        pts.setSortByPosition(true);// 排序

        String content;
        List<String> lines;
        StringBuilder date = new StringBuilder();
        for (int index = 1; index < total; index++) {
            pts.setStartPage(index);
            pts.setEndPage(index + 1);
            content = pts.getText(document);
            lines = Splitter.on("\n").splitToList(content);
            boolean printLine = false;
            for (String line : lines) {
                if (line.contains("发行股票")) {
                    printLine = true;
                    continue;
                }
                if (printLine) {
                    System.out.println(line);
                    continue;
                }
                if (line.contains("发行债券")) {
                    printLine = false;
                    break;
                }
//                if (line.contains("待上市信息")) {
//                    printLine = true;
//                    continue;
//                }
//                if (printLine) {
//                    System.out.println(line);
//                    continue;
//                }
//                if (line.contains("动产抵押")) {
//                    printLine = false;
//                    break;
//                }
            }





            if (content.contains("第二节") && content.contains("概览") && !content.contains("......")) {
                lines = Splitter.on("\n").splitToList(content);
                for (String line : lines) {
                    if (line.contains("日期") || line.contains("时间")) {
                        System.out.println(line);
                    }
                }
                break;
            }
        }
    }
}
