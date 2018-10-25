package comp110.lecture11;

//class definition below
public class CreedsTweets {
	public static void main(String[] args) {

		Twitter twitter = new Twitter();

		Tweet bears = new Tweet("dwight", "Bears. Beats. Battlestar Galactica.");
		Tweet pbj = new Tweet("kevin", "They'd be good together, like PB&J.");
		Tweet bankruptcy = new Tweet("michael", "I. DECLARE. BANKRUPTCY.");

		Tweet creedRt =
				// methods
				twitter.post(bears);
		twitter.post(bankruptcy);
		twitter.post(pbj);

	}

}
