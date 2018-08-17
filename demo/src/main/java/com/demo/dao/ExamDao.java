package com.demo.dao;

import com.demo.entity.Exam;
import java.util.List;

public interface ExamDao {

    //select exam
    public Exam getExamById(Integer examId);

    //select exam
    public List<Exam> getExamByExamName(String examName);

    // exam insert
    public void insertExam(Exam record);

    // exam update
    public void updateExam(Exam exam);

    // exam delete
    public void deleteExam(Exam exam);

    // show all exams;
    public List<Exam> showAll();

    public List<Exam> showUserScore(Exam exam);
}