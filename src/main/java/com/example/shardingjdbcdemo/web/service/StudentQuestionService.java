package com.example.shardingjdbcdemo.web.service;


import com.example.shardingjdbcdemo.web.vo.StudentQuestion;
import com.example.shardingjdbcdemo.web.mapper.StudentQuestionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**   
 * @formatClassName: StudentQuestionService
 * @Description:TODO    
 * @author: generation
 * @date:   2022年02月15日 02:28:734
 * @Copyright: generation
 */
@Service
public class StudentQuestionService {

	@Resource
	private StudentQuestionMapper studentQuestionMapper;

	public void insertStudentQuestion(StudentQuestion studentQuestion){
		studentQuestionMapper.insertStudentQuestion(studentQuestion);
	}

	public void deleteStudentQuestion(StudentQuestion studentQuestion){
		studentQuestionMapper.deleteStudentQuestion(studentQuestion);
	}


	public void updateStudentQuestion(StudentQuestion studentQuestion){
		studentQuestionMapper.updateStudentQuestion(studentQuestion);
	}


	public List<StudentQuestion> listStudentQuestion(StudentQuestion studentQuestion){
		List<StudentQuestion> list = studentQuestionMapper.listStudentQuestion(studentQuestion);
		return list;
	}

	public List<StudentQuestion> listStudentQuestionClass(StudentQuestion studentQuestion){
		List<StudentQuestion> list = studentQuestionMapper.listStudentQuestionClass(studentQuestion);
		return list;
	}

	public void batchSaveStudentQuestion(List<StudentQuestion> studentQuestions){
		studentQuestionMapper.batchSaveStudentQuestion(studentQuestions);
	}
}