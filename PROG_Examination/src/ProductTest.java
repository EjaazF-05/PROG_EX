import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.*;


public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
        String[] names = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales ={{25, 18, 20}, {15, 10,12}, {18, 15, 20}};

        Product product = new Product(names, sales);
        assertEquals(153, product.GetAverageProductSold());

    }
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
        String[] names = {"Cozy Nights Monarch mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        int[][] sales ={{25, 18, 20}, {15, 10,12}, {18, 15, 20}};

        Product product = new Product(names, sales);
        assertEquals(17.0, product.GetAverageProductSold(), 0.01);
    }
}
