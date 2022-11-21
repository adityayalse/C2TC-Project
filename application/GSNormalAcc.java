package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges)
	{
		System.out.println("NORMAL CHARGES ARE "+charges+" AND WITH DELIVERY CHARGES ARE "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
