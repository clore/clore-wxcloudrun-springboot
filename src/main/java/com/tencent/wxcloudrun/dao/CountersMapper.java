package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface CountersMapper {

  Counter getCounter(@Param("openid") String openid);

  void upsertCount(Counter counter);

  void clearCount(@Param("openid") String openid);
}
