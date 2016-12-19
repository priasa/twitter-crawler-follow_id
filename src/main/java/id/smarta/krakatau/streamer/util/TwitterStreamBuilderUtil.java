package id.smarta.krakatau.streamer.util;

import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterStreamBuilderUtil {

	public static final String SPACE = " ";

	public static TwitterStream getStream() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("qE4hCbih6cqMRzbpzO7KC27D9");
		cb.setOAuthConsumerSecret("bBgDHTwLrQ0pZu5PHzdPUTkLQKFnO2uMhzMduusrlbAi3aNk4j");
		cb.setOAuthAccessToken("797297631839940608-gS3PvP3rkT340Vbl1q1FHFIFecpGtoE");
		cb.setOAuthAccessTokenSecret("ndyON9DF3xY52H7GKazUf7LWc7YRdb962Xxj4VsvMF2uv");

		return new TwitterStreamFactory(cb.build()).getInstance();
	}
}
