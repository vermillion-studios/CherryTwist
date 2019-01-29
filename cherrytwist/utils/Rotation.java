package cherrytwist.utils;

import cherrytwist.vector.Vector3;

public class Rotation extends Vector3 {
	private double x, y , z;
	
	public Rotation(double x, double y, double z) {
		super(x, y, z);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * returns the x value of this rotation.
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * sets the y value of this rotation.
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * returns the y value of this rotation.
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * sets the y value of this rotation.
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * returns the z value of this rotation.
	 */
	public double getZ() {
		return this.z;
	}

	/**
	 * sets the z value of this rotation.
	 */
	public void setZ(double z) {
		this.z = z;
	}
	
	
	
}
