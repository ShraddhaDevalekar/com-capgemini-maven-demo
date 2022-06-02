package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;
public class GenericsDemo {
  public static void main(String[] args) {
	//List marks = new ArrayList();
	
	  List<Integer> marks =new ArrayList();
	marks.add(98);
	marks.add(97);
	marks.add(87);
	marks.add(98);
	System.out.println(marks);
}
}

