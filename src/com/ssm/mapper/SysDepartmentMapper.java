package com.ssm.mapper;

import com.ssm.po.SysDepartment;
import com.ssm.po.SysDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDepartmentMapper {
    int countByExample(SysDepartmentExample example);

    int deleteByExample(SysDepartmentExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(SysDepartment record);

    int insertSelective(SysDepartment record);

    List<SysDepartment> selectByExample(SysDepartmentExample example);

    SysDepartment selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") SysDepartment record, @Param("example") SysDepartmentExample example);

    int updateByExample(@Param("record") SysDepartment record, @Param("example") SysDepartmentExample example);

    int updateByPrimaryKeySelective(SysDepartment record);

    int updateByPrimaryKey(SysDepartment record);
}