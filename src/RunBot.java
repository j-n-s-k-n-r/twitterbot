import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class RunBot {

	public static void main(String[] args) {
		
		
		String test="";
		test=new Verkehrslage().getVerkehrslageAsString();
		System.out.println(test);
		
		/*DateFormat dateFormat = new SimpleDateFormat("EE dd.MM", Locale.GERMANY);
		Date date = new Date();
		
		
		String tweet = dateFormat.format(date) + ":\nEssen: " + new Mensaplan().getEssenAsString() + "\nWetter: " + new Wetter().getWetterAsString() + "\nVerkehr: " + new Verkehrslage().getVerkehrslageAsString(); 
		
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("ENMyMU02MswJ5PpEF6Xw76xYY")
		  .setOAuthConsumerSecret("uQPDyYDyKL2Ux0OBdieknw3EJaaEh9iJeSepUbJEYqRlh50vmQ")
		  .setOAuthAccessToken("865174379948363777-NLd6ZiDN3T2tUBwbvl0hcdwVgDjKA6j")
		  .setOAuthAccessTokenSecret("rUUCIBWhjp1IUA6bjxme3Q8VfhDPZVBsDT3xVwfr8lobk");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
	    Status status = null;
		try {
			status = twitter.updateStatus(tweet);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	*/
	}

}
