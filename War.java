package home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class War {
		
		public void Wars() {
			ArrayList<String> wars = new ArrayList<String>();
			wars.add("FAKULTAS TEKNIK");
			wars.add("FAKULTAS KEGURUAN DAN ILMU PENDIDIKAN");
			wars.add("FAKULTAS KESEHATAN");
		
			System.out.println("Sebelum disorting");
			for(String a : wars) {
				System.out.println(a);
			}
		
			System.out.println("Setelah disorting");
			Collections.sort(wars);
			for(String war : wars) {
				System.out.println(war);		
			}
		}
}
