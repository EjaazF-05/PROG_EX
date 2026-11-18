public class Product implements IProduct{
    private String[] productNames;
    private int[][] sales;

    public Product(String[] productNames, int[][] sales){
        this.productNames = productNames;
        this.sales = sales;
    }
    @Override
    public int GetTotalProductsSold(){
        int total = 0;
        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                total += sales[i][j];
            }
        }
        return total;
    }
    @Override
    public double GetAverageProductSold(){
        int total = GetTotalProductsSold();
        int numberOfEnteries = sales.length * sales[0].length;
        return (double) total / numberOfEnteries;
    }
    @Override
    public String GetMostPopularProduct(){
        int[] productTotals = new int[productNames.length];

        for(int i =0; I < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                productTotals[i] += sales[i][j];
            }
        }
        int maxTotal = productTotals[0];
        int maxIndex = 0;

        for(int i = 1; i < productTotals.length; i++){
            if(productTotals[i] > maxIndex){
                maxTotal = productTotals[i];
                maxIndex = i;
            }
        }
        return productNames[maxIndex] + "(" + maxTotal + ")";
    }
}
