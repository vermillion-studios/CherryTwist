package cherrytwist.vector;

public class Vector4 {
	private double x, y, z, w;

	public Vector4(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
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
	 * returns the z value of this vector.
	 * @return z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * returns the y value of this vector.
	 * @return w
	 */
	public double getW() {
		return w;
	}
	
	/**
	 * returns a new string with the values from this vector.
	 * @return String
	 */
	public String toString() {
		return new String(this.x + ", " + this.y + ", " + this.z + ", " + this.w);
	}
}
