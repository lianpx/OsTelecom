package com.demo.controller;

import com.demo.entity.Exam;
import com.demo.entity.Score;
import com.demo.service.ExamService;
import com.demo.service.ScoreService;
import org.hibernate.internal.util.StringHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin  //跨域
@RequestMapping(value= "/score", produces = "application/json; charset=utf-8")
public class ScoreController {
  @Resource
  private ScoreService scoreService;

  @Resource
  private ExamService examService;


  @RequestMapping(value="/showScore",produces = "application/json; charset=utf-8")
  @ResponseBody
  public Score toIndex(HttpServletRequest request, Model model){
    int userId = 0, examId = 0;
    String examName = null;
    if (request.getParameter("userId") != null) {
      userId = Integer.parseInt(request.getParameter("userId"));
    } else {
      userId = 0;
    }
    if (request.getParameter("examId") != null) {
      examId = Integer.parseInt(request.getParameter("examId"));
    } else {
      examId = 0;
    }
    if (StringHelper.isNotEmpty(request.getParameter("examName"))) {
      examName = request.getParameter("examName");
    }

    Score result = new Score();
    if (userId > 0 && examId > 0) {
      Score score = new Score();
      score.setUserId(userId);
      result = this.scoreService.getScoreById(score);
    } else if (userId > 0) {
      result = this.scoreService.getScoreByUserId(userId);
    } else if (examId > 0) {
      result = this.scoreService.getScoreByExamId(examId);
    } else {

    }
    return result;
  }

  @RequestMapping("/showUserScore")
  @ResponseBody
  public List<Exam> showUserScore(HttpServletRequest request, Model model) {
    int userId = 0;
    String examName = "";
    if (request.getParameter("userId") != null) {
      userId = Integer.parseInt(request.getParameter("userId"));
    } else {
      userId = 0;
    }
    if (StringHelper.isNotEmpty(request.getParameter("examName"))) {
      examName = request.getParameter("examName");
    }
    System.out.println("查询所有: ");
    System.out.println("userId = " +userId + "  examName = " + examName);
    List<Exam> ExamList = examService.showUserScore(userId, examName);
    for(Exam exam:ExamList) {
      System.out.println("用户："+exam);
    }
    return ExamList;
  }


  @RequestMapping("/showAll")
  @ResponseBody
  public List<Score> showAll() {
    System.out.println("查询所有");
    List<Score> ScoreList = scoreService.showAll();
    for(Score score:ScoreList) {
      System.out.println("用户："+score);
    }
    return ScoreList;
  }

  @RequestMapping(value = "/insert")
  @ResponseBody
  public Score insertScore(Score score) {
    scoreService.insertScore(score);
    Score result = this.scoreService.getScoreByUserId(score.getUserId());
    return result;
  }

  @RequestMapping(value = "/update")
  @ResponseBody
  public Score updateScore(Score score) {
    scoreService.updateScore(score);
    Score result = this.scoreService.getScoreByUserId(score.getUserId());
    return result;
  }

  @RequestMapping(value = "/delete")
  @ResponseBody
  public Score deleteScore(Score score) {
    scoreService.deleteScore(score);
    Score result = this.scoreService.getScoreByUserId(score.getUserId());
    return result;
  }

}