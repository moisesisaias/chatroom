package chattuuClient.model;

import java.util.Base64;

public final class Security {
	
	private Security()
	{
		
	}
	
	public static String encrypt(String msg ){
		
		String encodedString = Base64.getEncoder().encodeToString(msg.getBytes());
		return(encodedString);
	}
	
	
	public static String decrypt(String msg) {
		
		byte[] decodedBytes = Base64.getDecoder().decode(msg);
		String decodedString = new String(decodedBytes);
		return (decodedString);
	}

}
