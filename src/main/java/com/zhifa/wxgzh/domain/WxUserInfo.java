package com.zhifa.wxgzh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
@TableName(value = "WX_USER_INFO")
public class WxUserInfo implements Serializable {


    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @TableField(value = "SUBSCRIBE")
    private String subscribe;

    /**
     * 微信openid
     */
    @TableField(value = "OPEN_ID")
    private String openId;

    @TableField(value = "NICK_NAME")
    private String nickName;

    @TableField(value = "SEX")
    private String sex;

    @TableField(value = "CITY")
    private String city;

    @TableField(value = "COUNTRY")
    private String country;

    @TableField(value = "PROVINCE")
    private String province;

    @TableField(value = "LANGUAGE")
    private String language;

    @TableField(value = "HEAD_IMG_URL")
    private String headImgUrl;

    @TableField(value = "SUBSCRIBE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date subscribeTime;

    @TableField(value = "CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @TableField(value = "REMARK")
    private String remark;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_SUBSCRIBE = "SUBSCRIBE";

    public static final String COL_OPEN_ID = "OPEN_ID";

    public static final String COL_NICK_NAME = "NICK_NAME";

    public static final String COL_SEX = "SEX";

    public static final String COL_CITY = "CITY";

    public static final String COL_COUNTRY = "COUNTRY";

    public static final String COL_PROVINCE = "PROVINCE";

    public static final String COL_LANGUAGE = "LANGUAGE";

    public static final String COL_HEAD_IMG_URL = "HEAD_IMG_URL";

    public static final String COL_SUBSCRIBE_TIME = "SUBSCRIBE_TIME";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_REMARK = "REMARK";

    public WxUserInfo() {
        log.info("============构造方法=============");
    }
}
