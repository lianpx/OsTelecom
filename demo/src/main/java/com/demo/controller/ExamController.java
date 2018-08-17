package com.demo.controller;

import com.demo.entity.Exam;
import com.demo.service.ExamService;
import com.demo.service.ExamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping(value= "/exam", produces = "application/json; charset=utf-8")
public class ExamController {
  @Resource
  private ExamService examService;

  @RequestMapping(value="/showExam",produces = "application/json; charset=utf-8")
  @ResponseBody
  public Exam toIndex(HttpServletRequest request, Model model){
    int examId = Integer.parseInt(request.getParameter("examId"));
    Exam exam = this.examService.getExamById(examId);
    return exam;
  }

  @RequestMapping(value="/showExamByExamName",produces = "application/json; charset=utf-8")
  @ResponseBody
  public List<Exam> getExamByExamName(HttpServletRequest request, Model model){
    String examName = String.format(request.getParameter("examName"));
    System.out.println("examName: " + examName);
    List<Exam> examList = this.examService.getExamByExamName(examName);
    for(Exam exam:examList) {
      System.out.println("用户："+exam);
    }
    return examList;
  }



  @RequestMapping("/showAll")
  @ResponseBody
  public List<Exam> showAll() {
    System.out.println("查询所有");
    List<Exam> examList = examService.showAll();
    for(Exam exam:examList) {
      System.out.println("用户："+exam);
    }
    return examList;
  }

  @RequestMapping(value = "/insertExam",produces = "application/json; charset=utf-8")
  @ResponseBody
  public Exam insertExam(Exam exam) throws ParseException {
//    System.out.println("before = " + exam.getExamStartDate());
//    SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    String d1 = format.format(exam.getExamStartDate());
//    System.out.println("turn = " + format.parse(d1));
//    exam.setExamStartDate(format.parse(d1));
    examService.insertExam(exam);
    Exam result = this.examService.getExamById(exam.getExamId());
    return result;
  }

  @RequestMapping(value = "/insert")
  @ResponseBody
   public Exam insertExam(HttpServletRequest request, Model model) throws ParseException {
      Exam exam  = new Exam();
      exam.setExamId(Integer.parseInt(request.getParameter("examId")));
      exam.setExamName(String.format(request.getParameter("examName")));
      exam.setExamSubject(String.format(request.getParameter("examSubject")));
      exam.setExamProvince(String.format(request.getParameter("examProvince")));
      SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String d1 = format.format(request.getParameter("examStartDate"));
      exam.setExamStartDate(format.parse(d1));
      String d2 = format.format(request.getParameter("examEndDate"));
      exam.setExamEndDate(format.parse(d2));
      String d3 = format.format(request.getParameter("examDeadlineTime"));
      exam.setExamDeadlineTime(format.parse(d3));
      exam.setExamRemark(String.format(request.getParameter("examRemark")));

      examService.insertExam(exam);
      Exam result = this.examService.getExamById(exam.getExamId());
      return result;
  }

  @RequestMapping(value = "/update")
  @ResponseBody
  public Exam updateExam(Exam exam) {
    examService.updateExam(exam);
    Exam result = this.examService.getExamById(exam.getExamId());
    return result;
  }

  @RequestMapping(value = "/delete")
  @ResponseBody
  public Exam deleteExam(Exam exam) {
    examService.deleteExam(exam);
    Exam result = this.examService.getExamById(exam.getExamId());
    return result;
  }

}