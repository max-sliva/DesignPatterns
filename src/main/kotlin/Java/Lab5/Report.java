package Java.Lab5;

public class Report {
    private String header;
    private String footer;
    private String text;

    public Report(String header, String footer, String text) {
        this.header = header;
        this.footer = footer;
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printReport(){
        System.out.println(header);
        System.out.println();
        System.out.println(text);
        System.out.println();
        System.out.println(footer);
    }
}

