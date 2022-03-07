package syntax.task10.solution1002;

/*Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
        Объявляет о результате постройки.
        Объявляет о результате и указывает количество этажей.
        Объявляет о результате и указывает застройщика.*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper(int floor) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floor);
    }

    public Skyscraper(String buildDeveloper) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + buildDeveloper);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
