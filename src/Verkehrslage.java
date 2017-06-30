import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Verkehrslage {
	public String getVerkehrslageAsString() {
		
		//Unstable Class 
		/*
		String inhalt = "";
		FileReader fr;
		try {

			// init Filereader
			fr = new FileReader("C:\\Users\\jonas-prog\\Desktop\\tb\\Inbox");

			// init BufferedReader
			BufferedReader br = new BufferedReader(fr);

			boolean richtigerTeil = false;
			boolean inboxEnde5 = false;
			String inhaltSchleife = "";
			int i = 0;

			try {
				while (inboxEnde5 == false) {

					inhaltSchleife = "";
					inhaltSchleife = br.readLine();
					// System.out.println(inhaltSchleife);
					if (inhaltSchleife.contains("Hier die von Ihnen angeforderten Staumeldungen")) {
						richtigerTeil = true;
						System.out.println("wirdTrue");
					}
					if (inhaltSchleife.contains(
							"Alle Suchergebnisse sind ohne Gewähr und erheben keinen Anspruch auf Vollständigkeit und Aktualität.")) {
						break;
						// richtigerTeil= false;
						// System.out.println("getFalse");
					}

					if (richtigerTeil == true) {
						System.out.println("D3");
						inhalt = inhalt + inhaltSchleife; // + br.readLine();
					}
					if (inhaltSchleife.isEmpty() == true) {
						i++;
					} else {
						i = 0;
					}

					if (i == 5) {
						inboxEnde5 = true;
					}
					br.close();
				}

			} catch (IOException e1) {
				System.out.println("Error1");
				e1.printStackTrace();
			}

		} catch (FileNotFoundException e2) {
			System.out.println("Inbox not found");
			e2.printStackTrace();
		}

		String[] abschnitte = inhalt.split("[");
		String meldungen ="";
		String[] A42Meldungen;
		for (int j =0; j<abschnitte.length;j++)
		{
			if (abschnitte[j].contains("A42") == true)
					{
						A42Meldungen =abschnitte[j].split("A42");
						for (int k =0; k<A42Meldungen.length;k++)
						{
							meldungen = meldungen + A42Meldungen[j];
						}
					}
		}
		System.out.println(meldungen);
		
		*/
		return "kein Stau => kein Wunder auch ";
		
	}
}
