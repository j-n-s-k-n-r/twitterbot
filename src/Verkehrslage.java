import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Verkehrslage {
	public String getVerkehrslageAsString() {

		FileReader fr;
		try {
			
			//init Filereader
			fr = new FileReader("C:\\Users\\jonas-prog\\Desktop\\cred.txt");
			
			//init BufferedReader
			BufferedReader br = new BufferedReader(fr);
			
			//Einlesen EMailadresse aus cred.txt
			String emailadresse = "";
			try {
				emailadresse = br.readLine();
			} catch (IOException e1) {
				System.out.println("Emailadresse not found");
				e1.printStackTrace();
			}
			
			//Einlesen Passwort aus cred.txt
			String password = "";
			try {
				password = br.readLine();
			} catch (IOException e) {
				System.out.println("password not found");
				e.printStackTrace();
			}
			
			//Debugoutput
			System.out.println(emailadresse);
			System.out.println(password);

			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e2) {
			System.out.println("cred.txt not found");
			e2.printStackTrace();
		}

		
		
		
		//EMailpart
		// if (xx)
		// return meldung

		return "kein Stau => kein Wunder auch ";
	}
}
