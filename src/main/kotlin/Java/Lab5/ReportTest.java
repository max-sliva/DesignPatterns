package Java.Lab5;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ReportTest {
    public static void main(String args[]){
        String text = "Когда я на почте служил ямщиком\n" +
                "Ко мне постучался косматый геолог\n" +
                "И глядя на карту на белой стене\n" +
                "Он усмехнулся мне";
        String header = "Сказочная тайга, гр. 'Агата Кристи'";
        String footer = "Авторы: Самойлов Г. / Козлов А.";
        Report myReport = new Report(header, footer, text);
        myReport.printReport();
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
//        System.out.println("path = "+path);
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();
        reportGeneratorFacade.generateReport(ReportType.HTML, myReport, path+"\\report");
        reportGeneratorFacade.generateReport(ReportType.PDF, myReport, path+"\\report");

    }
}
