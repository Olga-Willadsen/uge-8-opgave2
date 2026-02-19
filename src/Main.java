import java.util.ArrayList;

public class Main {

    //ArrayList<Product> allProducts = new ArrayList<>();



    void main () {

        Product p1 = new Product("cucumber", 7.95, new String[]{"eco", "green", "healthy"});
        Product p2 = new Product("Banana", 2.50, new String[]{"eco", "yellow", "sweet"});
        Product p3 = new Product("cabbage", 12.75, new String[]{"purple","healthy", "round"});
        Product p4 = new Product("grapes", 24.00, new String[]{"round", "sweeet", "green"});

        Product [] allProducts = {p1, p2 ,p3 ,p4};

//
//        allProducts.add(p1);
//        allProducts.add(p2);
//        allProducts.add(p3);
//        allProducts.add(p4);

        Product mostExpensiceProduct = mostExpensive(allProducts);

        System.out.println(mostExpensiceProduct.name);

        printInfo(p1);


    }


    Product mostExpensive(Product[] allProducts) {
        Product mostExpensive = allProducts[0];
        for (Product p : allProducts) {
            if (p.price > mostExpensive.price) {
                mostExpensive = p;
            }
        }
        return mostExpensive;
    }

    void printInfo (Product p){
        System.out.println(p.name);
        System.out.println(p.price);
//            System.out.println(p.tags);
        for (int i = 0; i <p.tags.length ; i++) {
            System.out.println(p.tags[i]);
        }
    }




}
