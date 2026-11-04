
package Task04;

public class Main {
    public static void main(String[] args) {
        String status = "NEW";

        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;

            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;

            case "SHIPPED":
                System.out.println("Order is on the way");
                break;

            case "DELIVERED":
                System.out.println("Order delivered");
                break;

            default:
                System.out.println("Unknown status");
        }
    }
}

