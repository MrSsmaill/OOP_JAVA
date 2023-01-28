package seminar_3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Forma forma = new Forma();
    forma.button.cotvert();
    forma.button.click();
    }
}

class Forma{
    Button button = new Button();
}
class Button{
    String format;
    public void cotvert(){
        System.out.println("введите формат\n" +
                "JPEG\n" +
                "PNG\n" +
                "ICO\n" +
                "GIF\n" +
                "TIFF\n" +
                "WebP\n" +
                "EPS\n" +
                "SVG");
        Scanner scanner = new Scanner(System.in);
        this.format = scanner.nextLine();
    }
    public Button() {
        System.out.println("привет");;
    }

    public void click(){
        new Converter(format);
    }
}