package m05;

public class Customer {

    private String name;
    
    /*
     * Mock data
     */
    private static String[] customers = {
        "Peter Fern",
        "",
        "Thom Mack",
        "Joy Brill",
        "Fess Manor",
        "",
        "Polly Nance",
        ""
    };

    protected Customer(int ID) {
        this.name = customers[ID];
    }
    
    protected Customer() {
    }


    public static Customer getCustomer(int ID) {
        if (ID < 0) {
            return NullCustomer.getInstance();
        }
        if (ID < customers.length) {
            if (customers[ID].equals("")) {
                return NullCustomer.getInstance();
            }
            return new Customer(ID);
        }
        return NullCustomer.getInstance();
    }

    public String getName() {
        return this.name;
    }
    
    public boolean isNull(){
    	return false;
    }
}
