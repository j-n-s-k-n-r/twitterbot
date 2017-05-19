
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class testBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			status = twitter.updateStatus("Hello World - Posted By Bot");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
