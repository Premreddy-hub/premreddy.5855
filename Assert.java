package com.hcl.dy5;

public class Assert {
	public void incr(){
		int pay=20000;
		for(int i = 0;i < 8;i++){
			pay = pay+5000;
			assert pay < 40000;
			System.out.println(pay);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Assert().incr();      
	}

}
