package net.clore.wxcr.dao;

import net.clore.wxcr.model.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountersMapper {

  Counter getCounter(@Param("openid") String openid);

  void upsertCount(Counter counter);

  void clearCount(@Param("openid") String openid);
}
