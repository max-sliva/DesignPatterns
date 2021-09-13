package Java.Lab5;

public class ReportGeneratorFacade {
    public void generateReport(ReportType type, Report report, String location){


        ReportWriter writer = new ReportWriter();
        switch(type)
        {
            case HTML:
                writer.writeHtmlReport(report, location);
                break;

            case PDF:
                writer.writePdfReport(report, location);
                break;
        }
    }
}
