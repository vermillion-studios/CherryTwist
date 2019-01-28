package cherrytwist.vector;

public class Vector2 {
	private double x, y;

	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * returns the x value of this vector.
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/**
	 * returns the y value of this vector.
	 * @return y
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * returns a new string with the values from this vector.
	 * @return String
	 */
	public String toString() {
		return new String(this.x + ", " + this.y);
	}
}
