package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Counter implements Serializable {

  private String openid;

  private Integer count;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
