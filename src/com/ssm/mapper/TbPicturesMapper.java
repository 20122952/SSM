package com.ssm.mapper;

import com.ssm.po.TbPictures;
import com.ssm.po.TbPicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPicturesMapper {
    int countByExample(TbPicturesExample example);

    int deleteByExample(TbPicturesExample example);

    int deleteByPrimaryKey(String picturesId);

    int insert(TbPictures record);

    int insertSelective(TbPictures record);

    List<TbPictures> selectByExample(TbPicturesExample example);

    TbPictures selectByPrimaryKey(String picturesId);

    int updateByExampleSelective(@Param("record") TbPictures record, @Param("example") TbPicturesExample example);

    int updateByExample(@Param("record") TbPictures record, @Param("example") TbPicturesExample example);

    int updateByPrimaryKeySelective(TbPictures record);

    int updateByPrimaryKey(TbPictures record);
}