package com.chengkz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chengkz.domain.Emp;

/**
* @author maste
* @description 针对表【t_emp】的数据库操作Mapper
* @createDate 2023-12-16 15:20:21
* @Entity com.chengkz.domain.Emp
*/
public interface EmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

}
