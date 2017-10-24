package com.gmail.archangelwolf98;

public class Network {
	private static long[] phoneList = new long[100];
	
	public static boolean searche(long number) {
		for(int i =0; i<phoneList.length;i++) {
			if(phoneList[i]==number) {
				return true;
			}
		}
		return false;
	}
	
	public static void registrationNumber(long number) {
		for(int i=0;i<phoneList.length;i++) {
			if(phoneList[i]==0) {
				phoneList[i]=number;
				break;
			}
		}
	}
}
