package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class CounterServiceImpl implements CounterService {

  final CountersMapper countersMapper;

  public CounterServiceImpl(@Autowired CountersMapper countersMapper) {
    this.countersMapper = countersMapper;
  }

  @Override
  public Optional<Counter> getCounter(String openid) {
    return Optional.ofNullable(countersMapper.getCounter(openid));
  }

  @Override
  public void upsertCount(Counter counter) {
    countersMapper.upsertCount(counter);
  }

  @Override
  public void clearCount(String openid) {
    countersMapper.clearCount(openid);
  }
}
