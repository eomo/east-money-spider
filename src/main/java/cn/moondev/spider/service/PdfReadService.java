package cn.moondev.spider.service;

import com.google.common.base.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class PdfReadService {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://pdf.dfcfw.com/pdf/H2_AN201701180277316602_1.pdf");
        PDDocument document = PDDocument.load(url.openStream());
        int total = document.getNumberOfPages();
        PDFTextStripper pts = new PDFTextStripper();
        String content;
        List<String> lines;
        StringBuilder date = new StringBuilder();
        for (int index = 1; index < total; index++) {
            pts.setStartPage(index);
            pts.setEndPage(index + 1);
            content = pts.getText(document);
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
