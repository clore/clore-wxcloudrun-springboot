package net.clore.wxcr.service;

import net.clore.wxcr.model.Counter;

import java.util.Optional;

public interface CounterService {

  Optional<Counter> getCounter(String openid);

  void upsertCount(Counter counter);

  void clearCount(String openid);
}
