package com.cqnu.purchasedao;

import com.cqnu.purchasedao.mapper.StudentMapper;
import com.cqnu.purchasedao.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest(classes = PurchaseDaoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PurchaseDaoApplicationTests {
	@Autowired
	private StudentMapper studentMapper;
	@Test
	public void contextLoads() {
		List<Student> stuList=studentMapper.queryStuList();
		for (Student student:stuList){
			System.out.println(student);
		}
	}

}
