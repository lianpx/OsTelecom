package com.demo.service;

import com.demo.entity.Exam;

import java.util.List;

public interface ExamService {

    public Exam getExamById(int examId);

    public List<Exam> getExamByExamName(String examName);

    public void insertExam(Exam exam);

    public void updateExam(Exam exam);

    public void deleteExam(Exam exam);

    public List<Exam> showAll();

    public List<Exam> showUserScore(Integer userId, String examName);
}
