package com.example.Cryptocurrency.http;

import com.slack.api.Slack;
import com.slack.api.webhook.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SlackHttpClient {

    public void send(String message) {
        try {
            Slack instance = Slack.getInstance();
            Payload payload = Payload.builder()
                    .text(message)
                    .build();
            instance.send("https://hooks.slack.com/services/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", payload);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
