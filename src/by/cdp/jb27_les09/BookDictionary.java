package by.cdp.jb27_les09;

import java.util.Random;

public class BookDictionary extends Book {

		public String lang;
		
		
		public String setLanguage() {
			
			int i;
			
			String [] lang_temp;
			lang_temp = new String[5]; 
			 
			  lang_temp[0] = "English";
			  lang_temp[1] = "French";
			  lang_temp[2] = "Deutch";
			  lang_temp[3] = "Russian";
			  lang_temp[4] = "Belorussian";  
			
			Random rand = new Random ();
				
				i=rand.nextInt(5);
						
				switch (i) {
				
				case 0: 
					lang=lang_temp[0];
					break;
					
				case 1:
					lang=lang_temp[1];
					break;
					
				case 2:
					lang=lang_temp[2];
					break;
				
				case 3:
					lang=lang_temp[3];
					break;
				
				case 4:
					lang=lang_temp[4];
					break;
				}
		
			return lang;
		}
		
	}

