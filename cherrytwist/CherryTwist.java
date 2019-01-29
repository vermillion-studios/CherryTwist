package cherrytwist;

public class CherryTwist {
	private static String version = "1.01.4";
	
	public static String getVersion() {
		return version;
	}
	
	public static void main(String[] args) {
		System.out.println("[CherryTwist v" + version + "] library has been loaded.");
	}
}
