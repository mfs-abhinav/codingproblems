package com.abhi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int result = 0;
    	// 10 20 20 10 10 30 50 10 20
    	
    	Map<Integer,List<Integer>> sock = new HashMap<Integer,List<Integer>>();
    	
    	for(int i=0; i<n; i++) {
    		if(sock.containsKey(ar[i])) {
    			sock.get(ar[i]).add(ar[i]);
    		} else {
    			List<Integer> item = new ArrayList<Integer>();
    			item.add(ar[i]);
    			sock.put(ar[i], item);
    		}
    	}
    	System.out.println(sock.keySet());
    	for(Integer i: sock.keySet()) {
    		result += sock.get(i).size()/2;
    		System.out.println("Count of sock " + i + " is : " + sock.get(i).size()/2);
    	}
    	System.out.println("Total matching count is: " + result);
    	return result;
    }


    public static void main(String[] args) throws IOException {

        sockMerchant(9, new int[] {10,20,20,10,10,30,50,10,20});

    }
}
