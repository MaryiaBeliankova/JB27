package by.cdp.jb27_les06;

import java.util.Random;

public class RandString {
	
	    public static final String SOURCES =
	            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	    public static void main(String[] args) {
	        
	    	RandString rs = new RandString();
	        System.out.println(rs.generateString(new Random(), SOURCES, 10));
	        
	    }

	    
	   public String generateString(Random random, String characters, int length) {
	        char[] text = new char[length];
	        for (int i = 0; i < length; i++) {
	            text[i] = characters.charAt(random.nextInt(characters.length()));
	        }
	        return new String(text);
	    }

}
