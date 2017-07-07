import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Verkehrslage {
	public String getVerkehrslageAsString() {

		// Unstable Class

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
					if (inhaltSchleife.contains("Hier die von Ihnen angeforderten Staumeldungen")) {
						richtigerTeil = true;

					}
					if (inhaltSchleife.contains(
							"Alle Suchergebnisse sind ohne Gewähr und erheben keinen Anspruch auf Vollständigkeit und Aktualität.")) {
						break;

					}

					if (richtigerTeil == true) {
						inhalt = inhalt + inhaltSchleife;
					}
					if (inhaltSchleife.isEmpty() == true) {
						i++;
					} else {
						i = 0;
					}

					if (i == 10) {
						inboxEnde5 = true;
					}

				}

				br.close();

			} catch (IOException e1) {
				System.out.println("Error1");
				e1.printStackTrace();
			}

		} catch (FileNotFoundException e2) {
			System.out.println("Inbox not found");
			e2.printStackTrace();
		}

		String meldungen = "";

		if (inhalt.contains("[ A42 ]")) {
			meldungen = meldungen + "Stau auf A42 | ";
		}
		if (inhalt.contains("[ A59 ]")) {
			meldungen = meldungen + "Stau auf A59 | ";
		}
		if (inhalt.contains("[ A3 ]")) {
			meldungen = meldungen + "Stau auf A3 ";
		}

		return meldungen;

	}
}
