import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wetter {

	/*
	 * Klasse um das Wetter aus dem Emailpostfach (=> hier Thunderbird)
	 * auszulesen und dann für den Tweet aufzubereiten
	 */
	public String getWetterAsString() {

		String inhalt = "";
		FileReader fr;

		// Auslesen der EMail aus der Textfile in die Thunderbird die Emails
		// speichert
		try {

			// init Filereader
			fr = new FileReader("C:\\Users\\jonas-prog\\Desktop\\wetterbotMail\\Inbox");

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
					if (inhaltSchleife.contains("Morgen")) {
						richtigerTeil = true;
					}
					
					if (inhaltSchleife.contains("Die weiteren Aussichten")) {
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

					if (i == 5) {
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

		String ready2Tweet = "";
		String[] teilStueck = inhalt.split("\\|");

		for (int j = 0; j < teilStueck.length; j++) {

			if (teilStueck[j].contains("Morgen") == true) {

				ready2Tweet = ready2Tweet + "Morgens" + teilStueck[j + 1] + teilStueck[j + 2];
				ready2Tweet = ready2Tweet + "\n";

			}
			if (teilStueck[j].contains("Mittag") == true) {
				ready2Tweet = ready2Tweet + "Mittags" + teilStueck[j + 1] + teilStueck[j + 2];
				break;
			}

		}
		// Ersetzten der Zeichen/Wörter "bis" durch "-" sowie "Grad" durch "°"
		ready2Tweet = ready2Tweet.replace(" bis ", "-");
		ready2Tweet = ready2Tweet.replace(" Grad", "°");

		return ready2Tweet;
	}
}
