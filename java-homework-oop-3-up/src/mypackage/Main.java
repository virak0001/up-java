package mypackage;

import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MD5 md5 = new MD5();
		Input md5Input = new Input("VIRAK.RAN");
		md5Input.setEncription(md5);
		System.out.println("MD5: " + md5Input.displayEncript());
		
		SHA1 sha1 = new SHA1();
		Input sha1Input = new Input("VIRAK.RAN");
		sha1Input.setEncription(sha1);
		System.out.println("SHA1: " + sha1Input.displayEncript());
		
		SHA256 sha256 = new SHA256();
		Input sha256Input = new Input("VIRAK.RAN");
		sha256Input.setEncription(sha256);
		System.out.println("SHA1: " + sha256Input.displayEncript());
	}
}
