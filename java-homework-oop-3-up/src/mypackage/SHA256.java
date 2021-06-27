package mypackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 implements Encription {

	@Override
	public String encript(String input) throws NoSuchAlgorithmException {
		try {
		    MessageDigest md = MessageDigest.getInstance("SHA-256");
		    byte[] messageDigest = md.digest(input.getBytes());
		    BigInteger no = new BigInteger(1, messageDigest);
		    String hashtext = no.toString(16);
		    while (hashtext.length() < 32) {
		        hashtext = "0" + hashtext;
		    }
		    return hashtext;
		}
		catch (NoSuchAlgorithmException e) {
		    throw new RuntimeException(e);
		}
	}

}
