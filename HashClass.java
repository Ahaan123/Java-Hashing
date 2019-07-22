import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashClass {

	public static void main(String[] args) {
		

	}
	public static String getHash(String passw) throws NoSuchAlgorithmException
	{ 
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.reset();
		byte[] h = md.digest(passw.getBytes());
		return bytestoStringHex(h);
			
	}
	public final static char[] hexarray = "0123456789ABCDEF".toCharArray();
	public static String bytestoStringHex(byte[] b)
	{
		char[] hexchars = new char[b.length*2];
		for (int i = 0; i<b.length; i++)
		{
			int v = b[i] & 0xFF;
			hexchars[i*2] = hexarray[v >>> 4];
			hexchars[i*2+1] = hexarray[v & 0x0F];
			
		}
		return new String(hexchars).toLowerCase();
	}
}
