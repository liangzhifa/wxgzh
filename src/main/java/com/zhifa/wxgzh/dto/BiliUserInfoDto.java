package com.zhifa.wxgzh.dto;

public class BiliUserInfoDto {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"isLogin":true,"email_verified":1,"face":"http://i1.hdslb.com/bfs/face/3c2e391da784adce3dd40a472ee9b624e4586a87.jpg","level_info":{"current_level":4,"current_min":4500,"current_exp":5815,"next_exp":10800},"mid":184865921,"mobile_verified":1,"money":732,"moral":70,"official":{"role":0,"title":"","desc":"","type":-1},"officialVerify":{"type":-1,"desc":""},"pendant":{"pid":0,"name":"","image":"","expire":0,"image_enhance":"","image_enhance_frame":""},"scores":0,"uname":"宇智波止水丶丶","vipDueDate":0,"vipStatus":0,"vipType":0,"vip_pay_type":0,"vip_theme_type":0,"vip_label":{"path":"","text":"","label_theme":""},"vip_avatar_subscript":0,"vip_nickname_color":"","wallet":{"mid":184865921,"bcoin_balance":0,"coupon_balance":0,"coupon_due_time":0},"has_shop":false,"shop_url":"","allowance_count":0,"answer_status":0}
     */

    private int code;
    private String message;
    private int ttl;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * isLogin : true
         * email_verified : 1
         * face : http://i1.hdslb.com/bfs/face/3c2e391da784adce3dd40a472ee9b624e4586a87.jpg
         * level_info : {"current_level":4,"current_min":4500,"current_exp":5815,"next_exp":10800}
         * mid : 184865921
         * mobile_verified : 1
         * money : 732
         * moral : 70
         * official : {"role":0,"title":"","desc":"","type":-1}
         * officialVerify : {"type":-1,"desc":""}
         * pendant : {"pid":0,"name":"","image":"","expire":0,"image_enhance":"","image_enhance_frame":""}
         * scores : 0
         * uname : 宇智波止水丶丶
         * vipDueDate : 0
         * vipStatus : 0
         * vipType : 0
         * vip_pay_type : 0
         * vip_theme_type : 0
         * vip_label : {"path":"","text":"","label_theme":""}
         * vip_avatar_subscript : 0
         * vip_nickname_color :
         * wallet : {"mid":184865921,"bcoin_balance":0,"coupon_balance":0,"coupon_due_time":0}
         * has_shop : false
         * shop_url :
         * allowance_count : 0
         * answer_status : 0
         */

        private boolean isLogin;
        private int email_verified;
        private String face;
        private LevelInfoBean level_info;
        private int mid;
        private int mobile_verified;
        private int money;
        private int moral;
        private OfficialBean official;
        private OfficialVerifyBean officialVerify;
        private PendantBean pendant;
        private int scores;
        private String uname;
        private int vipDueDate;
        private int vipStatus;
        private int vipType;
        private int vip_pay_type;
        private int vip_theme_type;
        private VipLabelBean vip_label;
        private int vip_avatar_subscript;
        private String vip_nickname_color;
        private WalletBean wallet;
        private boolean has_shop;
        private String shop_url;
        private int allowance_count;
        private int answer_status;

        public boolean isIsLogin() {
            return isLogin;
        }

        public void setIsLogin(boolean isLogin) {
            this.isLogin = isLogin;
        }

        public int getEmail_verified() {
            return email_verified;
        }

        public void setEmail_verified(int email_verified) {
            this.email_verified = email_verified;
        }

        public String getFace() {
            return face;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public LevelInfoBean getLevel_info() {
            return level_info;
        }

        public void setLevel_info(LevelInfoBean level_info) {
            this.level_info = level_info;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public int getMobile_verified() {
            return mobile_verified;
        }

        public void setMobile_verified(int mobile_verified) {
            this.mobile_verified = mobile_verified;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getMoral() {
            return moral;
        }

        public void setMoral(int moral) {
            this.moral = moral;
        }

        public OfficialBean getOfficial() {
            return official;
        }

        public void setOfficial(OfficialBean official) {
            this.official = official;
        }

        public OfficialVerifyBean getOfficialVerify() {
            return officialVerify;
        }

        public void setOfficialVerify(OfficialVerifyBean officialVerify) {
            this.officialVerify = officialVerify;
        }

        public PendantBean getPendant() {
            return pendant;
        }

        public void setPendant(PendantBean pendant) {
            this.pendant = pendant;
        }

        public int getScores() {
            return scores;
        }

        public void setScores(int scores) {
            this.scores = scores;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public int getVipDueDate() {
            return vipDueDate;
        }

        public void setVipDueDate(int vipDueDate) {
            this.vipDueDate = vipDueDate;
        }

        public int getVipStatus() {
            return vipStatus;
        }

        public void setVipStatus(int vipStatus) {
            this.vipStatus = vipStatus;
        }

        public int getVipType() {
            return vipType;
        }

        public void setVipType(int vipType) {
            this.vipType = vipType;
        }

        public int getVip_pay_type() {
            return vip_pay_type;
        }

        public void setVip_pay_type(int vip_pay_type) {
            this.vip_pay_type = vip_pay_type;
        }

        public int getVip_theme_type() {
            return vip_theme_type;
        }

        public void setVip_theme_type(int vip_theme_type) {
            this.vip_theme_type = vip_theme_type;
        }

        public VipLabelBean getVip_label() {
            return vip_label;
        }

        public void setVip_label(VipLabelBean vip_label) {
            this.vip_label = vip_label;
        }

        public int getVip_avatar_subscript() {
            return vip_avatar_subscript;
        }

        public void setVip_avatar_subscript(int vip_avatar_subscript) {
            this.vip_avatar_subscript = vip_avatar_subscript;
        }

        public String getVip_nickname_color() {
            return vip_nickname_color;
        }

        public void setVip_nickname_color(String vip_nickname_color) {
            this.vip_nickname_color = vip_nickname_color;
        }

        public WalletBean getWallet() {
            return wallet;
        }

        public void setWallet(WalletBean wallet) {
            this.wallet = wallet;
        }

        public boolean isHas_shop() {
            return has_shop;
        }

        public void setHas_shop(boolean has_shop) {
            this.has_shop = has_shop;
        }

        public String getShop_url() {
            return shop_url;
        }

        public void setShop_url(String shop_url) {
            this.shop_url = shop_url;
        }

        public int getAllowance_count() {
            return allowance_count;
        }

        public void setAllowance_count(int allowance_count) {
            this.allowance_count = allowance_count;
        }

        public int getAnswer_status() {
            return answer_status;
        }

        public void setAnswer_status(int answer_status) {
            this.answer_status = answer_status;
        }

        public static class LevelInfoBean {
            /**
             * current_level : 4
             * current_min : 4500
             * current_exp : 5815
             * next_exp : 10800
             */

            private int current_level;
            private int current_min;
            private int current_exp;
            private int next_exp;

            public int getCurrent_level() {
                return current_level;
            }

            public void setCurrent_level(int current_level) {
                this.current_level = current_level;
            }

            public int getCurrent_min() {
                return current_min;
            }

            public void setCurrent_min(int current_min) {
                this.current_min = current_min;
            }

            public int getCurrent_exp() {
                return current_exp;
            }

            public void setCurrent_exp(int current_exp) {
                this.current_exp = current_exp;
            }

            public int getNext_exp() {
                return next_exp;
            }

            public void setNext_exp(int next_exp) {
                this.next_exp = next_exp;
            }
        }

        public static class OfficialBean {
            /**
             * role : 0
             * title :
             * desc :
             * type : -1
             */

            private int role;
            private String title;
            private String desc;
            private int type;

            public int getRole() {
                return role;
            }

            public void setRole(int role) {
                this.role = role;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class OfficialVerifyBean {
            /**
             * type : -1
             * desc :
             */

            private int type;
            private String desc;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }
        }

        public static class PendantBean {
            /**
             * pid : 0
             * name :
             * image :
             * expire : 0
             * image_enhance :
             * image_enhance_frame :
             */

            private int pid;
            private String name;
            private String image;
            private int expire;
            private String image_enhance;
            private String image_enhance_frame;

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getExpire() {
                return expire;
            }

            public void setExpire(int expire) {
                this.expire = expire;
            }

            public String getImage_enhance() {
                return image_enhance;
            }

            public void setImage_enhance(String image_enhance) {
                this.image_enhance = image_enhance;
            }

            public String getImage_enhance_frame() {
                return image_enhance_frame;
            }

            public void setImage_enhance_frame(String image_enhance_frame) {
                this.image_enhance_frame = image_enhance_frame;
            }
        }

        public static class VipLabelBean {
            /**
             * path :
             * text :
             * label_theme :
             */

            private String path;
            private String text;
            private String label_theme;

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getLabel_theme() {
                return label_theme;
            }

            public void setLabel_theme(String label_theme) {
                this.label_theme = label_theme;
            }
        }

        public static class WalletBean {
            /**
             * mid : 184865921
             * bcoin_balance : 0
             * coupon_balance : 0
             * coupon_due_time : 0
             */

            private int mid;
            private int bcoin_balance;
            private int coupon_balance;
            private int coupon_due_time;

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public int getBcoin_balance() {
                return bcoin_balance;
            }

            public void setBcoin_balance(int bcoin_balance) {
                this.bcoin_balance = bcoin_balance;
            }

            public int getCoupon_balance() {
                return coupon_balance;
            }

            public void setCoupon_balance(int coupon_balance) {
                this.coupon_balance = coupon_balance;
            }

            public int getCoupon_due_time() {
                return coupon_due_time;
            }

            public void setCoupon_due_time(int coupon_due_time) {
                this.coupon_due_time = coupon_due_time;
            }
        }
    }
}
