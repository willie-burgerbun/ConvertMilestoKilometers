public class ConvertMilestoKilometers {
    public static void main(String[] args) {
    System.out.println("Miles\tKilometers");
    System.out.println("---------------------");
    
    for (int miles = 1; miles <= 10; miles++) {
      double kilometers = miles * 1.609;
      System.out.printf("%d\t\t%.3f%n", miles, kilometers);
    }
  }
}