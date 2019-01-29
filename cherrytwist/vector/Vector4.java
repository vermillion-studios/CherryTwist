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
	 * returns the z value of this vector.
	 * @return z
	 */
	public double getZ() {
		return this.z;
	}

	/**
	 * returns the y value of this vector.
	 * @return w
	 */
	public double getW() {
		return this.w;
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
	 * sets this vector's z value to the z value specified.
	 */
	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * sets this vector's w value to the w value specified.
	 */
	public void setW(double w) {
		this.w = w;
	}

	/**
	 * returns a new string with the values from this vector.
	 * @return String
	 */
	@Override
	public String toString() {
		return new String(this.x + ", " + this.y + ", " + this.z + ", " + this.w);
	}
}
