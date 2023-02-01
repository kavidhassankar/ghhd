package com.java;

import java.util.HashMap;

public class HashMapTaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "ragu kavi ragu kavi mani suesh";
		HashMap<String,Integer>  d=new HashMap<>();
		String []ks=text.split(" ");
		for(String name:ks) {
			if(d.get(name)!=null) {
				d.put(name,d.get(name)+1 );
			}
				else {
				d.put(name, 1);
				}
		}
				System.out.println(d);
				}
				
		}
	
	  
	 
		

  



