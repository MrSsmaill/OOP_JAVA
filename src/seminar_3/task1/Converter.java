package seminar_3.task1;

public class Converter {

    public String format;

    public Converter(String format) {
        switch (format){
            case ("JPEG"):
                System.out.println("сохранено в JPEG");
                break;
            case("PNG"):
                System.out.println("сохранено в PNG");
                break;
            case ("ICO"):
                System.out.println("сохранено в ICO");
                break;
            case("GIF"):
                System.out.println("сохранено в GIF");
                break;
            case ("TIFF"):
                System.out.println("сохранено в TIFF");
                break;
            case("WebP"):
                System.out.println("сохранено в WebP");
                break;
            case ("EPS"):
                System.out.println("сохранено в EPS");
                break;
            case("SVG"):
                System.out.println("сохранено в SVG");
                break;
            default:
                System.out.println("не вeрный формат");
                break;
        }
    }
}
