package com.example.shardingjdbcdemo.web.vo;

import lombok.Data;

import java.util.Date;

@Data
public class StudentQuestion {

    /**
     * 自增长主键
     */
    private Long id;

    /**
     * 考试id
     */
    private String examId;

    /**
     * 学生id
     */
    private String personId;

    /**
     * 评题id
     */
    private String answerSheetItemId;

    /**
     * 题目id
     */
    private String quesId;

    /**
     * 是否选做题 0:非选做题 1:选做题
     */
    private Integer isOptional;

    /**
     * 是否推荐题 0:非推荐题 1:推荐题
     */
    private Integer isRecommend;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDel;

    private String clazzId;


	public StudentQuestion(){}

	public StudentQuestion(String examId, String clazzId){
	    this.examId = examId;
	    this.clazzId = clazzId;
    }

	public StudentQuestion(String examId, String personId, String answerSheetItemId, String quesId, Integer isOptional, Integer isRecommend){
        this.examId = examId;
        this.personId = personId;
        this.answerSheetItemId = answerSheetItemId;
        this.quesId = quesId;
        this.isOptional = isOptional;
        this.isRecommend = isRecommend;
        this.createTime = new Date();
        this.isDel = 0;
    }
}