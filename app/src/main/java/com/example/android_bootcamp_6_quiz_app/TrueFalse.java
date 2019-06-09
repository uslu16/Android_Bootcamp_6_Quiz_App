package com.example.android_bootcamp_6_quiz_app;

public class TrueFalse {

private int mQuestionId;
private boolean mAnswer;

    public TrueFalse(int questionStringID, boolean trueOrFalse ) {

        mQuestionId = questionStringID;
        mAnswer = trueOrFalse;

    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
