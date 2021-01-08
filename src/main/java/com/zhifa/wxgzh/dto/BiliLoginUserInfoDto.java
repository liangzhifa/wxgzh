package com.zhifa.wxgzh.dto;

public class BiliLoginUserInfoDto {
    /**
     * code : 0
     * status : true
     * ts : 1610093400
     * data : {"url":"https://passport.biligame.com/crossDomain?DedeUserID=184865921&DedeUserID__ckMd5=9beebd7db977a5ff&Expires=15551000&SESSDATA=93b5dc45%2C1625645400%2C2b1cb%2A11&bili_jct=55eeca7d6fc1b8dbad6d9a70e4bd5f5a&gourl=http%3A%2F%2Fwww.bilibili.com"}
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
         * url : https://passport.biligame.com/crossDomain?
         * DedeUserID=184865921&
         * DedeUserID__ckMd5=9beebd7db977a5ff&
         * Expires=15551000&
         * SESSDATA=93b5dc45%2C1625645400%2C2b1cb%2A11&
         * bili_jct=55eeca7d6fc1b8dbad6d9a70e4bd5f5a&
         * gourl=http%3A%2F%2Fwww.bilibili.com
         */

        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
