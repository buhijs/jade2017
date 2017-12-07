package m04.taxservice.services;

import m04.taxservice.ITax;

public class DETax implements ITax {

	@Override
	public double getTax(double total) {
		// TODO Auto-generated method stub
		return total*0.08+40;
	}

}
