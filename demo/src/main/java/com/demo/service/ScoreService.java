package com.demo.service;

import com.demo.entity.Score;

import java.util.List;

public interface ScoreService {

    // Score select
    public Score getScoreByUserId(Integer userId);
    public Score getScoreByExamId(Integer examId);
    public Score getScoreById(Score score);

    // Score insert
    public void insertScore(Score score);

    // Score update
    public void updateScore(Score score);

    // Score delete
    public void deleteScore(Score score);

    // show all Scores;
    public List<Score> showAll();


    public List<Score> showUserScore();
}
