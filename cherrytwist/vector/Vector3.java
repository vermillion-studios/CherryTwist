package cherrytwist.vector;

public class Vector3 {
	private int x, y, z;

	public Vector3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * returns the x value of this vector.
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * returns the y value of this vector.
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * returns the z value of this vector.
	 * @return z
	 */
	public int getZ() {
		return z;
	}
	
	/**
	 * returns a new string with the values from this vector.
	 * @return String
	 */
	public String toString() {
		return new String(this.x + ", " + this.y + ", " + this.z);
	}
}
