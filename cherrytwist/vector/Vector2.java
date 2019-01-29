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
		return this.x;
	}

	/**
	 * returns the y value of this vector.
	 * @return y
	 */
	public double getY() {
		return this.y;
	}
	
	/**
	 * sets this vector's x value to the x value specified.
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * sets this vector's y value to the y value specified.
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * returns a new string with the values from this vector.
	 * @return String
	 */
	@Override
	public String toString() {
		return new String(this.x + ", " + this.y);
	}
}
