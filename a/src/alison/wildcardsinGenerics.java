package alison;

import java.util.ArrayList;
import java.util.List;


abstract class wildcardsinGenerics {

	
	abstract void draw();
}
	
	
class Rectangle extends wildcardsinGenerics{
  void draw() {System.out.println("drawing rectangle");}
}

class Circle extends wildcardsinGenerics{
	void draw() {System.out.println("drawing circle");}
}


class test{
	//creating a method that aspect only child class of shape
	
	public static void drawshap (List <? extends wildcardsinGenerics >lists) {
		
		for(wildcardsinGenerics s:lists) {
			s.draw();// calling method of shape class by child class instance
		}
	}
	
	
	public static void main(String[] args) {
		
		
		List<Rectangle> list  = new ArrayList <Rectangle>();
		list.add(new Rectangle());
		
		
		List<Circle> list1  = new ArrayList <Circle>();
		list1.add(new Circle());
		list1.add(new Circle());
		
		drawshap(list);
		drawshap(list1);
		
	}
	
}
