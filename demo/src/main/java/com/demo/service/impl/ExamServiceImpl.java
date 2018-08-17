package com.demo.service.impl;

import com.demo.dao.ExamDao;
import com.demo.entity.Exam;
import com.demo.service.ExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("examService")
public class ExamServiceImpl implements ExamService {

    @Resource
    private ExamDao examDao;

    @Override
    public Exam getExamById(int examId) {
        return examDao.getExamById(examId);
    }

    @Override
    public List<Exam> getExamByExamName(String examName) {
        return examDao.getExamByExamName(examName);
    }

    @Override
    public void insertExam(Exam exam) {
        examDao.insertExam(exam);
    }

    @Override
    public void updateExam(Exam exam) {
        examDao.updateExam(exam);
    }

    @Override
    public void deleteExam(Exam exam) {
        examDao.deleteExam(exam);
    }

    @Override
    public List<Exam> showAll() {
        return examDao.showAll();
    }

    @Override
    public List<Exam> showUserScore(Integer userId, String examName) {
        System.out.println(userId + " ------------  " +examName );
        Exam exam = new Exam();
        exam.setUserId(userId);
        exam.setExamName(examName);
        return examDao.showUserScore(exam);
    }

}