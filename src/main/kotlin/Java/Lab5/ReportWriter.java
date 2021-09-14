package Java.Lab5;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static j2html.TagCreator.*;

public class ReportWriter {

    public void writeHtmlReport(Report report, String location) {
        String htmlText = html(
                body(
                h1(report.getHeader()),
                br(),
                p(report.getText()),
                br(),
                p(report.getFooter())
                )
        ).render();
        try {
            FileWriter fWriter = new FileWriter(new File(location+".html"));
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(htmlText.replace("\n", "<br>"));
            bWriter.close();
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HTML Report written: \n"+htmlText);
    }

    public void writePdfReport(Report report, String location) {
        PDDocument doc = new PDDocument();
        PDPage page = new PDPage();
        doc.addPage(page);

        PDPageContentStream contentStream = null; //создаем поток для вывода данных в документ
        try {
            contentStream = new PDPageContentStream(doc, page);
            contentStream.beginText(); //начинаем работу с потоком
            PDType0Font font = PDType0Font.load( doc, new File("arial.ttf")); //загружаем нужный шрифт с поддержкой кириллицы
    //этот файл должен лежать в корневой папке проекта
            contentStream.setFont(font, 16f); //задаем размер шрифта
            contentStream.setLeading(24.5f); //устанавливаем межстрочный интервал
            contentStream.newLineAtOffset(25f, 725f);
            contentStream.showText(report.getHeader()); //добавляем текст из первой переменной в поток вывода
            contentStream.newLine(); //добавляем переход на новую строку
            //todo сделать метод преобразования текста с несколькими строками в массив строк
            //можно через сплит
            contentStream.showText(report.getText()); //добавляем текст из второй переменной в поток вывода
            contentStream.newLine(); //добавляем переход на новую строку
            contentStream.showText(report.getFooter()); //добавляем текст из второй переменной в поток вывода
            contentStream.endText(); //окончание работы с текстом
            contentStream.close(); //закрываем поток вывода
            doc.save(location+".pdf"); //сохраняем документ
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Pdf Report written");
    }
}