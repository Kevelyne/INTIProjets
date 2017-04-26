package fr.adaming.spanc.securite;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Cryptage {
	
		private static BCryptPasswordEncoder bc = new BCryptPasswordEncoder(12);
		
		public static String crypterMDP(String mot) {
		return bc.encode(mot);
	}

//		public static void main(String[] args) {
//			System.out.println(crypterMDP("test"));
//		}
}