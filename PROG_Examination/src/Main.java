import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales = new int[3][3];

        for(int i = 0; i < productNames.length; i++){
            for(int month =0; month < 3; month++){
                System.out.print("Enter number of sales for month " + (month + 1) + "for" + productNames[i] + ": ");

                sales[i][month] = scanner.nextInt();
            }
            System.out.println();
        }
        Product product = new Product(productNames, sales);
        PrintProduct printer = new PrintProduct();

        int total = product.GetTotalProductsSold();
        double average = product.GetAverageProductSold();
        String mostPopular = product.GetMostPopularProduct();

        printer.printReportHeader();
        printer.printTotal(total);
        printer.printAverage(average);
        printer.printMostPopular(mostPopular);

        scanner.close();
}

}
