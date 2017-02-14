package com.javatpoint.abh.javastring;

//StringBuffer capacity() method
public class TestStringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		//System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		//System.out.println(sb);
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e
											// (oldcapacity*2)+2
		//System.out.println(sb);
	}

}
