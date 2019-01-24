package cherrytwist.vector;

public class Vector {
	/*------------------------------------------------------
	 *                     ADDITION
	 *------------------------------------------------------
	 */
	
	/**
	 * adds the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector2 add(Vector2 a1, Vector2 a2) {
		return new Vector2(a1.getX() + a2.getX(), a1.getY() + a2.getY());
	}
	
	/**
	 * adds the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector3 add(Vector3 a1, Vector3 a2) {
		return new Vector3(a1.getX() + a2.getX(), a1.getY() + a2.getY(), a1.getZ() + a2.getZ());
	}
	
	/**
	 * adds the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector4 add(Vector4 a1, Vector4 a2) {
		return new Vector4(a1.getX() + a2.getX(), a1.getY() + a2.getY(), a1.getZ() + a2.getZ(), a1.getW() + a2.getW());
	}
	
	/*------------------------------------------------------
	 *                   SUBTRACTION
	 *------------------------------------------------------
	 */
	
	/**
	 * subtracts the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector2 subtract(Vector2 a1, Vector2 a2) {
		return new Vector2(a1.getX() + a2.getX(), a1.getY() + a2.getY());
	}
	
	/**
	 * subtracts the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector3 subtract(Vector3 a1, Vector3 a2) {
		return new Vector3(a1.getX() + a2.getX(), a1.getY() + a2.getY(), a1.getZ() + a2.getZ());
	}
	
	/**
	 * subtracts the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector4 subtract(Vector4 a1, Vector4 a2) {
		return new Vector4(a1.getX() - a2.getX(), a1.getY() - a2.getY(), a1.getZ() - a2.getZ(), a1.getW() - a2.getW());
	}
	
	/*------------------------------------------------------
	 *                   MULTIPLICATION
	 *------------------------------------------------------
	 */
	
	/**
	 * multiplies the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector2 multiply(Vector2 a1, Vector2 a2) {
		return new Vector2(a1.getX() * a2.getX(), a1.getY() * a2.getY());
	}
	
	/**
	 * multiplies the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector3 multiply(Vector3 a1, Vector3 a2) {
		return new Vector3(a1.getX() * a2.getX(), a1.getY() * a2.getY(), a1.getZ() * a2.getZ());
	}
	
	/**
	 * multiplies the values of a vector and returns a new vector with the values added.
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static Vector4 multiply(Vector4 a1, Vector4 a2) {
		return new Vector4(a1.getX() * a2.getX(), a1.getY() * a2.getY(), a1.getZ() * a2.getZ(), a1.getW() * a2.getW());
	}

}
