package com.cyc.demo1.eventservice;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cyc.demo1.event.AfterADoneEvent;
import com.cyc.demo1.listener.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author chenyuchuan
 */
@Slf4j
@Component
public class D implements Service, ApplicationListener<AfterADoneEvent> {

    @Override
    public void service() {
        log.error("进行D服务");
    }

    @Override
    public void onApplicationEvent(AfterADoneEvent afterADoneEvent) {
        log.error("A服务提供的对象为：{} 完成的时间为{}", afterADoneEvent.getSource(), afterADoneEvent.getTimestamp());
        service();
    }
}
