package com.gpt.server.config;

public class ChatGptConfig {
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";
    public static final String API_KEY = "";
    public static final String MODEL = "gpt-3.5-turbo";
    public static final Integer MAX_TOKEN = 400;
    public static final Double TEMPERATURE = 0.2;
    public static final Double TOP_P = 0.2;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8";
    public static final String URL = "https://api.openai.com/v1/chat/completions";
}
