package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Message {

    private static final Properties messages = new Properties();

    static {
        try (InputStream input = Message.class.getClassLoader().getResourceAsStream("messages.properties")) {
            if (input == null) {
                throw new RuntimeException("Properties file not found");
            }
            messages.load(new InputStreamReader(input, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static void showMessage(String key) {
        String message = messages.getProperty(key);
        System.out.println(message != null ? message : "Message not found " + key);
    }
}
