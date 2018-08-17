package com.demo.entity;

public class Score {

    private Integer userId;
    private Integer examId;
    private Integer examState;
    private Integer score;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getExamState() {
        return examState;
    }

    public void setExamState(Integer examState) {
        this.examState = examState;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}