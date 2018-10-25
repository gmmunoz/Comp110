package comp110.lecture11;

import comp110.Console;

public class TweetTests {

	private static Object retweets;

	public static void main(String[] args) {
		Console console = new Console();

		Tweet tweet = new Tweet("handle", "demo");
		console.print("Tweet: " + tweet.toString());

		int likes = tweet.getLikes();
		console.print("likes - expected: 0 - actual: " + likes);

		// test the like method
		tweet.like();
		likes = tweet.getLikes();
		console.print("likes - expected: 1 - actual: " + likes);

		

}