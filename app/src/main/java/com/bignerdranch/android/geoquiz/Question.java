package com.bignerdranch.android.geoquiz;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    //getter for the question text resource id
    public int getTextResId() {
        return mTextResId;
    }

    //setter  for question text resource id
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    //getter for correct answer flag
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    //setter for correct answer flag
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    //constructor
    public Question(int textResId, boolean answerTrue){
        mTextResId= textResId;
        mAnswerTrue= answerTrue;
    }
}
