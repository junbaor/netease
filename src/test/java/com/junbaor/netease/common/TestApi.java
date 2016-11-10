package com.junbaor.netease.common;

import com.alibaba.fastjson.JSON;
import com.junbaor.netease.model.playlist.PlayListResponse;
import com.junbaor.netease.model.record.RecordResponse;
import net.dongliu.requests.Requests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TestApi {
    private static final Logger LOG = LoggerFactory.getLogger(TestApi.class);

    private static final String userId = "32689809";

    private static Map<String, String> headers = new HashMap<>();

    static {
        headers.put("Referer", "http://music.163.com");
        headers.put("Origin", "http://music.163.com");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        headers.put("Content-Type", "application/x-www-form-urlencoded");
    }

    @Test
    public void testPlayList() {
        String data = "{\"uid\":" + userId + ",\"wordwrap\":\"7\",\"offset\":\"0\",\"total\":\"true\",\"limit\":\"1000\"}";

        Map<String, String> forms = EncryptUtils.encrypt(data);
        String url = "http://music.163.com/weapi/user/playlist";
        String text = Requests.post(url).headers(headers).forms(forms).send().readToText();
        LOG.debug(text);
        PlayListResponse playListResponse = JSON.parseObject(text, PlayListResponse.class);
        LOG.info(text);

    }

    @Test
    public void testRecord() {
        String data = "{\"uid\":" + userId + ",\"limit\":1000,\"offset\":0,\"total\":true,\"type\":\"-1\"}";

        Map<String, String> forms = EncryptUtils.encrypt(data);
        String url = "http://music.163.com/weapi/v1/play/record";
        String text = Requests.post(url).headers(headers).forms(forms).send().readToText();
        LOG.debug(text);
        RecordResponse recordResponse = JSON.parseObject(text, RecordResponse.class);
        LOG.info(text);
    }

    @Test
    public void testCloudSearch() {
        //"{"hlpretag":"<span class=\"s-fc7\">","hlposttag":"</span>","id":"32689809","s":"junbaor","type":"1002","offset":"0","total":"true","limit":"30","csrf_token":"5d2055cc7991877c678dbf55e61e8444"}"
        // type 1000 歌单 1002 用户 1009 电台
        String data = "{\"hlpretag\":\"\",\"hlposttag\":\"\",\"s\":\"junbaor\",\"type\":\"1002\",\"offset\":\"0\",\"total\":\"true\",\"limit\":\"30\"}";

        Map<String, String> forms = EncryptUtils.encrypt(data);
        String url = "http://music.163.com/weapi/cloudsearch/get/web";
        String text = Requests.post(url).headers(headers).forms(forms).send().readToText();
        LOG.debug(text);
    }
}
