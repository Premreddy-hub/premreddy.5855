package com.hcl.dy5;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{
			DataOutputStream dout=
					new DataOutputStream(new FileOutputStream("c:/files/data.txt"));
			dout.writeInt(12);
			dout.writeUTF("HCL");
			dout.writeDouble(588.5);
			dout.writeBoolean(true);
			dout.close();
		System.out.println("***File Created***");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		}

}
