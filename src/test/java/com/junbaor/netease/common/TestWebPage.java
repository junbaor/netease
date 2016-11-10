package com.junbaor.netease.common;

import net.dongliu.requests.Requests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2016/11/9.
 */
public class TestWebPage {
    private static final Logger LOG = LoggerFactory.getLogger(TestWebPage.class);

    @Test
    public void test() {
        String url = "http://music.163.com/#/user/home?id=32689809";
        String text = Requests.get(url).send().readToText();
        LOG.info(text);
    }

}
