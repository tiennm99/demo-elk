package com.miti99;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
  public static void main(String[] args) {
    var random = ThreadLocalRandom.current();
    var scheduler = Executors.newSingleThreadScheduledExecutor();
    scheduler.scheduleAtFixedRate(
        () -> {
          log.info("Random: {}", random.nextInt());
        },
        1,
        1,
        TimeUnit.SECONDS);
  }
}
