package net.clore.wxcr.service.impl;

import net.clore.wxcr.dao.CountersMapper;
import net.clore.wxcr.model.Counter;
import net.clore.wxcr.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
