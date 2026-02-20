// Driver.java
// 2/19/26

package mystuff;

public class Driver {
    public static void main(String[] args) {

        MyStuff phone = new MyStuff();
        phone.originalPrice = 999.99;
        phone.manufacturer = "Samsung";
        phone.model = "Galaxy S23+";

        MyStuff tablet = new MyStuff();
        tablet.originalPrice = 468.39;
        tablet.manufacturer = "Apple";
        tablet.model = "iPad A16";

        MyStuff laptop = new MyStuff();
        laptop.originalPrice = 413.00;
        laptop.manufacturer = "HP";
        laptop.model = "HP Laptop 17-cp2xxx";

        System.out.println("Phone manufacturer: " + phone.manufacturer);
        System.out.println("Tablet originalPrice: " + tablet.originalPrice);
        System.out.println("Laptop model: " + laptop.model);
    }
}