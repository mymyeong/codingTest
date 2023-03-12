import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bamin3 {

    class ProductInfo {
        private int productNumber;
        private String productName;
        private int productPrice;

        public ProductInfo(int productNumber, String productName, int productPrice) {
            this.productNumber = productNumber;
            this.productName = productName;
            this.productPrice = productPrice;
        }

        @Override
        public String toString() {
            return "ProductInfo{" +
                    "productNumber=" + productNumber +
                    ", productName='" + productName + '\'' +
                    ", productPrice=" + productPrice +
                    '}';
        }
    }

    class DailyProductSales {
        private String salesDate;
        private int productNumber;
        private int salesCount;

        public DailyProductSales(String salesDate, int productNumber, int salesCount) {
            this.salesDate = salesDate;
            this.productNumber = productNumber;
            this.salesCount = salesCount;
        }

        @Override
        public String toString() {
            return "DailyProductSales{" +
                    "salesDate=" + salesDate +
                    ", productNumber=" + productNumber +
                    ", salesCount=" + salesCount +
                    '}';
        }
    }

    public String[] solution(String[] productInfo, String[] dailyProductSales) {

        List<ProductInfo> productInfos = Arrays.stream(productInfo).map(it ->
                {
                    String[] product = it.split(",");
                    int productNumber = Integer.parseInt(product[0]);
                    String productName = product[1];
                    int productPrice = Integer.parseInt(product[2]);
                    return new ProductInfo(productNumber, productName, productPrice);
                }
        ).collect(Collectors.toList());

        return Arrays.stream(dailyProductSales).map(it ->
                {
                    String[] sale = it.split(",");
                    String salesDate = sale[0];
                    int productNumber = Integer.parseInt(sale[1]);
                    int salesCount = Integer.parseInt(sale[2]);
                    return new DailyProductSales(salesDate, productNumber, salesCount);
                }
        ).map(it ->
                {
                    ProductInfo findProductInfo = productInfos.stream().filter(product -> product.productNumber == it.productNumber).findFirst().get();
                    return productSaleJoinString(it, findProductInfo);
                }
        ).toArray(String[]::new);
    }

    private static String productSaleJoinString(DailyProductSales dailyProductSales, ProductInfo productInfo) {
        return dailyProductSales.salesDate + "," + dailyProductSales.productNumber + "," + productInfo.productName + "," + (dailyProductSales.salesCount * productInfo.productPrice);
    }
}
