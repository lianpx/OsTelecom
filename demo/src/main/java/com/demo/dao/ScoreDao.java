package com.demo.dao;

import com.demo.entity.Score;

import java.util.List;

public interface ScoreDao {

    //select Score

    public Score getScoreById(Score score);
    public Score getScoreByUserId(Integer userId);
    public Score getScoreByExamId(Integer examId);

    // Score insert
    public void insertScore(Score sore);

    // Score update
    public void updateScore(Score score);

    // Score delete
    public void deleteScore(Score score);

    // show all Scores;
    public List<Score> showAll();

}