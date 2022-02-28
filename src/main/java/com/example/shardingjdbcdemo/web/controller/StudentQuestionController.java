package com.example.shardingjdbcdemo.web.controller;

import com.example.shardingjdbcdemo.web.service.StudentQuestionService;
import com.example.shardingjdbcdemo.web.vo.StudentQuestion;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentQuestionController
 * @Description TODO
 * @Author Administrator
 * @Date 2022/2/28 13:54
 **/
@RestController
public class StudentQuestionController {
    @Resource
    private StudentQuestionService studentQuestionService;

    @PostMapping(value = "/insert")
    public String insert(@RequestBody StudentQuestion studentQuestion){
        studentQuestionService.insertStudentQuestion(studentQuestion);
        return "success";
    }

    @GetMapping(value = "/list")
    public List<StudentQuestion> list(@RequestParam String examId){
        StudentQuestion query = new StudentQuestion();
        query.setExamId(examId);
        final List<StudentQuestion> studentQuestions = studentQuestionService.listStudentQuestion(query);
        return studentQuestions;
    }

}
