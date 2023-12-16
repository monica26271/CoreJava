package com.kn.polymorphism.upcasting;



public class ShapeDemo {

	public static void main(String[] args) {
		
//			Shape sh=new Shape();
		
			Rectange r=new Rectange();
//			sh=r;
//			sh.draw();
//			System.out.println(sh.calArea());
			Square s=new Square();
//			sh=s;
//			sh.draw();
//			System.out.println(sh.calArea());
			Circle c=new Circle();
//			sh=c;
//			sh.draw();
//			System.out.println(sh.calArea());
			
			Geometry g=new Geometry();
			
			g.doActivity(r);
			g.doActivity(s);
			g.doActivity(c);

	}

}
