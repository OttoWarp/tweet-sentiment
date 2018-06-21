package com.amazonaws.serverless.tweetsentiment;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Core Tweet Sentiment logic.
 */
@Slf4j
public class TweetSentiment {

    public void publishSentimentMetrics(List<String> tweetStrings) {

        log.info("Recieved tweets:{}", tweetStrings);
    }
}
