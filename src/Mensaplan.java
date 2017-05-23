import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Mensaplan {
	
	public String getEssenAsString(){
		URL url;
	    InputStream is = null;
	    BufferedReader br;
	    String html = "", line;

	    try {
	        url = new URL("https://www.stw-d.de/gastronomie/speiseplaene/mensa-kamp-lintfort/");
	        is = url.openStream();  // throws an IOException
	        br = new BufferedReader(new InputStreamReader(is));

	        while( (line = br.readLine() ) != null) {
	            html = html + line;
	        }
	    } catch (MalformedURLException mue) {
	         mue.printStackTrace();
	    } catch (IOException ioe) {
	         ioe.printStackTrace();
	    } finally {
	        try {
	            if (is != null) is.close();
	        } catch (IOException ioe) {
	            // nothing to see here
	        }
	    }
	    
	    String [] essen1 = html.split("Essen I");
	    String [] essen2 = html.split("Essen II");
	    
	    String essen = essen1[1].split("<li data-info=\"2,00\">")[1].split("\\[F\\]")[0].split("\\[R\\]")[0].split("\\[S\\]")[0].split("\\[Z\\]")[0].split("\\[V\\]")[0].split(" \\(")[0];
	    essen = essen + " und " + essen2[1].split("<li data-info=\"2,00\">")[1].split("\\[F\\]")[0].split("\\[R\\]")[0].split("\\[S\\]")[0].split("\\[Z\\]")[0].split("\\[V\\]")[0].split(" \\(")[0];
	    return essen;
	}
}
