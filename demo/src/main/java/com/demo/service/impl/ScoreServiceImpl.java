package com.demo.service.impl;

import com.demo.dao.ScoreDao;
import com.demo.entity.Score;
import com.demo.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreDao scoreDao;

    @Override
    public Score getScoreById(Score score) {
        return scoreDao.getScoreById(score);
    }

    // Score select
    @Override
    public Score getScoreByUserId(Integer userId) {
        return scoreDao.getScoreByUserId(userId);
    }

    @Override
    public Score getScoreByExamId(Integer examId) {
        return scoreDao.getScoreByExamId(examId);
    }

    @Override
    public void insertScore(Score score) {
        scoreDao.insertScore(score);
    }

    @Override
    public void updateScore(Score score) {
        scoreDao.updateScore(score);
    }

    @Override
    public void deleteScore(Score score) {
        scoreDao.deleteScore(score);
    }

    @Override
    public List<Score> showAll() {
        return scoreDao.showAll();
    }

    @Override
    public List<Score> showUserScore() {
        return null;
    }

}