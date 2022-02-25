package com.BridgeLabz.MoodAnalyser;

public class MoodAnalyserException extends Exception {

    public enum ExceptionType {
        ENTERED_EMPTY,ENTERED_NULL;
    }
    public ExceptionType type;
    public MoodAnalyserException(ExceptionType type,String message){
        super(message);
        this.type=type;
    }
}
