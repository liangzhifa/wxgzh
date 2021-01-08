package com.zhifa.wxgzh.dto;

public class BiliLoginUrlDto {

    /**
     * code : 0
     * status : true
     * ts : 1610091231
     * data : {"url":"https://passport.bilibili.com/qrcode/h5/login?oauthKey=f3b552bdb94959230d3fb2cf1db93028","oauthKey":"f3b552bdb94959230d3fb2cf1db93028"}
     */

    private int code;
    private boolean status;
    private int ts;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * url : https://passport.bilibili.com/qrcode/h5/login?oauthKey=f3b552bdb94959230d3fb2cf1db93028
         * oauthKey : f3b552bdb94959230d3fb2cf1db93028
         */

        private String url;
        private String oauthKey;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getOauthKey() {
            return oauthKey;
        }

        public void setOauthKey(String oauthKey) {
            this.oauthKey = oauthKey;
        }
    }
}
