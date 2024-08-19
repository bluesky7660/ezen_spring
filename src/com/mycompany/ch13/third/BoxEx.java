package com.mycompany.ch13.third;

public class BoxEx {

	public static void main(String[] args) {
//		Util util = new Util();
		Box<String> box = new Box<>();
		Box<Integer> box2 = Util.boxing(1111);
		Box<String> box3 = Util.boxing("sadaion");
	}

}
