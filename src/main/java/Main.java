import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите поисковой запрос для поиска изображений:");
        String query = scanner.nextLine();
        System.out.println("Введите количество изображений:");
        int pages = Integer.parseInt(scanner.nextLine());

        GoogleImageLoader loader = new GoogleImageLoader(query, pages);
        loader.parseAndLoad();

        System.out.println("Изображения скачаны");
    }
}