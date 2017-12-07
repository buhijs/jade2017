package m05;

public final class NullCustomer extends Customer {
	

	private static NullCustomer nullCustomer;
	
	private NullCustomer() {
	}
	
    public String getName() {
        return "Null Customer";
    }
    
    public boolean isNull(){
    	return true;
    }
    
    public static Customer getInstance(){
    	
    	if(nullCustomer == null){
    		nullCustomer = new NullCustomer();
    	}
    	
    	return nullCustomer;
    }


}
