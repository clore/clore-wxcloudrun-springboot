package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;

import java.util.Optional;
import java.util.List;

public interface CounterService {

  Optional<Counter> getCounter(String openid);

  void upsertCount(Counter counter);

  void clearCount(String openid);
}
