public class task12 {
    public static String city = "Tokyo";
    public static double population = 34.5;
    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
        System.out.println("The most populous city is " + city + " with a population of " + population + " million people.");
    }
    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of the city " + city + " is " + population + " million people.");
        System.out.println("While the most populous city " + city + " has a population of " + population + " million people.");
    }
}
