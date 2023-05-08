
public class Minge extends Exception {
public int x;
public int y;
public Minge(int x, int y) {
	
	this.x = x;
	this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

 CoordinateGenerator random = new CoordinateGenerator();

 public void suteaza() {
	    setX(random.generateX());
	    setY(random.generateY());
	}




}
