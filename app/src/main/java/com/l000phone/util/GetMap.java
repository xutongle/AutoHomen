package com.l000phone.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DJ on 2016/11/18.
 */

public class GetMap {

    public static Map<String, String> getMap() {

        Map<String, String> ask = new HashMap<>();

        ask.put("_HOP_", "{\"sign\":\"ba4767a053ddfe6f66c3a265cc23251f\"," +
                "\"action\":\"front.get_index\",\"current_time\":1479269055," +
                "\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        ask.put("appid", "2");
        ask.put("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        ask.put("channel", "anzhi_v6115");
        ask.put("deviceid", "haodou864394010208983");
        ask.put("from", "android");
        ask.put("ip", "172.16.152.15");
        ask.put("limit", "30");
        ask.put("loguid", "0");
        ask.put("network", "WIFI");
        ask.put("offset", "0");
        ask.put("sign", "");
        ask.put("uid", "0");
        ask.put("uuid", "9ea70fa9356586ff23fc31785f735cf1");
        ask.put("vc", "105");
        ask.put("virtual", "0");
        ask.put("vn", "6.1.15");

        return ask;
    }

    public static Map<String, String> getMap2() {

        Map<String, String> ask = new HashMap<>();

        ask.put("_HOP_", "{\"sign\":\"293be8dcb5414e5c0fa9d5434cf0527e\",\"action\":\"cms.feed.page\",\"current_time\":1479626103,\"secret_id\":\"5722f877e4b0d4512e3fd872\",\"version\":\"1.0\"}");
        ask.put("appid", "2");
        ask.put("appkey", "9ef269eec4f7a9d07c73952d06b5413f");
        ask.put("channel", "anzhi_v6115");
        ask.put("deviceid", "haodou352284040670808");
        ask.put("format", "1");
        ask.put("from", "android");
        ask.put("ip", "172.16.151.15");
        ask.put("limit", "30");
        ask.put("loguid", "0");
        ask.put("name", "page_guide_1");
        ask.put("network", "WIFI");
        ask.put("offset", "0");
        ask.put("uuid", "bdf542fa8eb3bcbc457a5383dc48fc0c");
        ask.put("vc", "105");
        ask.put("virtual", "0");
        ask.put("vn", "6.1.15");

        return ask;
    }

    public static Map<String, String> getMap_HoutMeun(String info,String offset) {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "10");
        agg.put("sign","99f1bcd28fa73dd09879155786b621ba");
        agg.put("uid", "10283273");
        agg.put("uuid", "bdf542fa8eb3bcbc457a5383dc48fc0c");
        agg.put("offset", offset);
        agg.put("appqs", "haodourecipe://haodou.com/recommend/recipe/?keyword=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&title=%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1&tab=%E5%85%A8%E9%83%A8%3A%E7%83%AD%E9%97%A8%E8%8F%9C%E8%B0%B1%7C%E7%A7%81%E4%BA%BA%3A%E7%A7%81%E4%BA%BA%E5%AE%9A%E5%88%B6%7C%E6%97%B6%E4%BB%A4%3A%E6%97%B6%E4%BB%A4%E4%BD%B3%E8%82%B4%7C%E8%BE%BE%E4%BA%BA%3A%E8%BE%BE%E4%BA%BA%E8%8F%9C%E8%B0%B1%7C%E6%9C%80%E6%96%B0%3A%E6%9C%80%E6%96%B0%E8%8F%9C%E8%B0%B1%7C%E7%83%98%E7%84%99%3A%E5%BF%AB%E4%B9%90%E7%9A%84%E7%83%98%E7%84%99");
        agg.put("type", info);

        return agg;
    }


    public static Map<String, String> getMap_Kitchen(String info) {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("tagid",info);
        agg.put("uid", "10283273");
        agg.put("uuid", "bdf542fa8eb3bcbc457a5383dc48fc0c");
        agg.put("offset", "0");
        agg.put("appqs", "haodourecipe://haodou.com/wiki/list/");
        agg.put("type","1");

        return agg;
    }


    public static Map<String, String> getMap_HotEvent() {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("offset", "0");
        agg.put("appqs", "haodourecipe://haodou.com/latestactive/official/");

        return agg;

    }


    public static Map<String, String> getMap_Ifi() {

        Map<String, String> agg = new HashMap<>();

        agg.put("", "GET /index.php?appid=2&appkey=9ef269eec4f7a9d07c73952d06b5413f&format=json&sessionid=1479805159680&vc=105&vn=6.1.15&loguid=10283273&deviceid=haodou864394010248476&uuid=bdf542fa8eb3bcbc457a5383dc48fc0c&channel=anzhi_v6115&method=Search.getCateList&virtual=&signmethod=md5&v=3&timestamp=1479806420&nonce=0.32336944435166803&appsign=f790b189e3c09b9478a0d4ece1f42856 HTTP/1.1");
        agg.put("Charset", "UTF-8");
        agg.put("Accept-Encoding", "gzip, deflate");
        agg.put("User-Agent", "HAODOU_RECIPE_CLIENT;(vivo-X510t;anzhi_v6115;Android-4.4.2-19;1280x720;105;bdf542fa8eb3bcbc457a5383dc48fc0c;WIFI-)");
        agg.put("Host", "api.haodou.com");
        agg.put("Connection","close");

        return agg;

    }


    public static Map<String, String> getMap_Ifi_Food(String info) {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("scene", "t1");
        agg.put("tagid", info);
        agg.put("uuid", "bdf542fa8eb3bcbc457a5383dc48fc0c");
        agg.put("offset", "0");

        return agg;

    }

    public static Map<String, String> getMap_Video() {

        Map<String, String> agg = new HashMap<>();

        agg.put("sign", "99f1bcd28fa73dd09879155786b621ba");
        agg.put("uid", "10283273");
        agg.put("return_request_id", "");
        agg.put("uuid", "bdf542fa8eb3bcbc457a5383dc48fc0c");
        agg.put("appqs", "haodourecipe://haodou.com/recipe/info/?id=1006888&video=1");
        agg.put("rid","1006888");

        return agg;

    }

    public static Map<String, String> getMap_Comment() {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("sign", "99f1bcd28fa73dd09879155786b621ba");
        agg.put("uid", "10283273");
        agg.put("appqs", "haodourecipe://haodou.com/recipe/info/?id=1006888&video=1");
        agg.put("rid", "1006888");
        agg.put("offset", "0");
        agg.put("type", "0");
        agg.put("cid","");

        return agg;

    }


    public static Map<String, String> getMap_Hot_Video() {

        Map<String, String> agg = new HashMap<>();

        agg.put("sign", "");
        agg.put("uid", "0");
        agg.put("appqs", "haodourecipe://haodou.com/Video/index/");

        return agg;

    }



    public static Map<String, String> getMap_HotIfi() {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("offset", "0");
        return agg;

    }

    public static Map<String, String> getMap_VideoInfo(String info) {

        Map<String, String> agg = new HashMap<>();

        agg.put("limit", "20");
        agg.put("offset", "0");
        agg.put("type", "1");
        agg.put("cate_id", info);

        return agg;

    }

}
