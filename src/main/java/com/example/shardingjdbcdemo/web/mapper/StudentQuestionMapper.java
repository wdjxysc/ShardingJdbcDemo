package com.example.shardingjdbcdemo.web.mapper;

import com.example.shardingjdbcdemo.web.vo.StudentQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @formatClassName:  StudentQuestionMapper
 * @Description:TODO(持久层接口)   
 * @author: generation
 * @date:   2022年02月15日 02:28:711
 * @Copyright: generation
 */
public interface StudentQuestionMapper {
	/**
	 * @Title: insertPsStudentQuestion
	 * @Description:新增
	 * @author: generation
	 * @date:   2022年02月15日 02:28:712
	 * @param studentQuestion 新增内容
	 */
	void insertStudentQuestion(StudentQuestion studentQuestion);
	
	/**
	 * @Title: deletePsStudentQuestion
	 * @Description:删除
	 * @author: generation
	 * @date:   2022年02月15日 02:28:712
	 * @param studentQuestion 删除对象条件
	 */
	void deleteStudentQuestion(StudentQuestion studentQuestion);
	
	/**
	 * @Title: updatePsStudentQuestion
	 * @Description:更新
	 * @author: generation
	 * @date:   2022年02月15日 02:28:712
	 * @param studentQuestion 更新条件及目标对象标识
	 */
	void updateStudentQuestion(StudentQuestion studentQuestion);
	
	/**
	 * @Title: listPsStudentQuestion
	 * @Description:查询列表
	 * @author: generation
	 * @date:   2022年02月15日 02:28:712
	 * @param studentQuestion 查询条件
	 * @return List<PsStudentQuestionVO> 返回结果
	 */
	List<StudentQuestion> listStudentQuestion(StudentQuestion studentQuestion);

	List<StudentQuestion> listStudentQuestionClass(StudentQuestion studentQuestion);

	void batchSaveStudentQuestion(@Param("list") List<StudentQuestion> list);

	String selectCreateTime(@Param("examId") String examId);
}
