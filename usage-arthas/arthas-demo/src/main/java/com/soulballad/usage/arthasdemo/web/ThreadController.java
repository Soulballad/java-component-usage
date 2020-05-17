package com.soulballad.usage.arthasdemo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class ThreadController {

    private boolean interrupted = false;

    @RequestMapping(value = "/thread/occupy", method = RequestMethod.GET)
    public String highOccupy() {

        interrupted = false;
        new Thread(() -> {
            while (!interrupted) {
                log.info("thread occupy ...");
            }
        }, "occupy-thread").start();

        return "thread";
    }

    @RequestMapping(value = "/thread/shutdown", method = RequestMethod.GET)
    public String shutdown() {
        // 结束高占用状态，同时返回首页
        interrupted = true;
        return "index";
    }

    @RequestMapping(value = "/thread/normal", method = RequestMethod.GET)
    public String normal() {

        interrupted = false;
        new Thread(() -> {
            while (!interrupted) {
                try {
                    Thread.sleep(1500);
                    log.info("thread normal ...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "normal-thread").start();

        return "thread";
    }

    @RequestMapping(value = "/thread/dead", method = RequestMethod.GET)
    public void death() {

        Object objectA = new Object();
        Object objectB = new Object();

        new Thread(() -> {
            synchronized (objectA) {
                String threadName = Thread.currentThread().getName();
                log.info("thread [{}] got objectA", threadName);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    log.error("thread [{}] sleep occurs error, {}", threadName, e);
                }
                log.info("thread [{}] sleep end", threadName);
                synchronized (objectB) {
                    log.info("thread [{}] got objectB", threadName);
                }
            }
        }, "dead-thread-1").start();

        new Thread(() -> {
            synchronized (objectB) {
                String threadName = Thread.currentThread().getName();
                log.info("thread [{}] got objectB", threadName);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    log.error("thread [{}] sleep occurs error, {}", threadName, e);
                }
                log.info("thread [{}] sleep end", threadName);
                synchronized (objectA) {
                    log.info("thread [{}] got objectA", threadName);
                }
            }
        }, "dead-thread-2").start();
    }
}
