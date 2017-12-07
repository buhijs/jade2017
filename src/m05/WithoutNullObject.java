package m05;

public class WithoutNullObject {
        public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Customer cust = Customer.getCustomer(i);
            //if(!cust.isNull()){
            	System.out.println(i + ": " + cust.getName());
            //}
        }
    }
}
