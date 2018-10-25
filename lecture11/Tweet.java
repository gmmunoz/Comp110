package comp110.lecture11;

//class definition below
public class Tweet {

	// fields
	private String _handle;
	private String _text;
	private int _likes;
	private int _retweets;

	// constructor
	public Tweet(String handle, String text) {
		_handle = handle;
		_text = text;
		_likes = 0;
		_retweets = 0;
	}

	// methods
	public int getLikes() {
		return _likes;
	}

	// TODO: Add a like method
	public void like() {
		_likes++;
	}

	// TODO: Add a retweet method
	public Tweet retweet(String retweeter) {
		_retweets++;
		Tweet rt = new Tweet(retweeter, "RT" + _text);
		return rt;
	}

	public String toString() {
		String socialLove = " - " + _likes + " likes";
		return "@" + _handle + ": " + _text + " " + socialLove;
	}

	// TODO Auto-generated method stub
	return null;
}

}}