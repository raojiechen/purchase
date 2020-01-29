package com.cqnu.purchasedao.mapper;


import com.cqnu.purchasedao.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    List<Student> queryStuList();
}
