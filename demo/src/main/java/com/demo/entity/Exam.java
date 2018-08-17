package com.demo.entity;

import java.util.Date;

public class Exam {
    private Integer examId;

    private String examName;

    private String examSubject;

    private String examProvince;

    private Date examStartDate;

    private Date examEndDate;

    private Date examDeadlineTime;

    private String examRemark;

    private Integer userId;
    private String userName;
    private Integer score;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public String getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(String examSubject) {
        this.examSubject = examSubject == null ? null : examSubject.trim();
    }

    public String getExamProvince() {
        return examProvince;
    }

    public void setExamProvince(String examProvince) {
        this.examProvince = examProvince == null ? null : examProvince.trim();
    }

    public Date getExamStartDate() {
        return examStartDate;
    }

    public void setExamStartDate(Date examStartDate) {
        this.examStartDate = examStartDate;
    }

    public Date getExamEndDate() {
        return examEndDate;
    }

    public void setExamEndDate(Date examEndDate) {
        this.examEndDate = examEndDate;
    }

    public Date getExamDeadlineTime() {
        return examDeadlineTime;
    }

    public void setExamDeadlineTime(Date examDeadlineTime) {
        this.examDeadlineTime = examDeadlineTime;
    }

    public String getExamRemark() {
        return examRemark;
    }

    public void setExamRemark(String examRemark) {
        this.examRemark = examRemark == null ? null : examRemark.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}