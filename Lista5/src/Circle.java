
public class Circle {
	private double radius;
	private static final double PI= 3.14;
	
	public double area() {
		return PI*radius*radius;
	}
	
	public double circumference() {
		return 2*PI*radius;
	}
	
	public void increaseRadius(double percent){
		this.radius=radius*(percent/100+1);
	}
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Current area = "
				+area()
				+", Current circumference = "
				+circumference();
	}
}
