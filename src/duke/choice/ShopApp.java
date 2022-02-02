package duke.choice;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 1/30/22 - 9:14 PM
 */
public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("Hello " + c1.name);

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        Clothing item2 = new Clothing();
        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";

        Clothing[] clothing = {item1, item2, new Clothing(), new Clothing()};
        clothing[2].description = "Green Scarf";
        clothing[2].price = 5.0;
        clothing[2].size = "S";
        clothing[3].description = "Blue T-Shirt";
        clothing[3].price = 10.5;
        clothing[3].size = "S";


//        System.out.println("item1= Description: " + item1.description + ", Price: " + item1.price + ", Size: " + item1.size);
//        System.out.println("item2= Description: " + item2.description + ", Price: " + item2.price + ", Size: " + item2.size);
//        total = (2 * item2.price + item1.price) * (1 + tax);
//        total += total * tax;

        int measurement = 3;
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        for (Clothing item : clothing) {
            if (c1.size.equals(item.size)) {
                total += total + item.price;
                System.out.println("Item = Description: " + item.description + ", Price: " + item.price + ", Size: " + item.size);
                if (total > 15) break;
            }
            System.out.println("Total = " + total);
        }
    }
}
