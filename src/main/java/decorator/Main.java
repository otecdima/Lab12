package decorator;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        TimedDocument time = new TimedDocument(document);
        System.out.println(time.measureTime()/(double)1000000000);
//        System.out.println(document.parse());
    }
}