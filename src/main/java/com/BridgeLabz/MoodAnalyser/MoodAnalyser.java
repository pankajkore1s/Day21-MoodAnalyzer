package com.BridgeLabz.MoodAnalyser;

public class MoodAnalyser {
    public String analysisMood(String message) throws MoodAnalyserException {
            try {
                if (message == "") {
                    throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Enter Proper mood");
                }
                if (message.contains("Sad")) {
                    return "SAD";
                } else {
                    return "HAPPY";
                }
            } catch (NullPointerException e) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Enter proper mood");
            }
        }
    }