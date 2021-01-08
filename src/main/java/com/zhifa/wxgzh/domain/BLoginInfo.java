package com.zhifa.wxgzh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "B_LOGIN_INFO")
public class BLoginInfo implements Serializable {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField(value = "TS")
    private Integer ts;

    @TableField(value = "URL")
    private String url;

    @TableField(value = "DedeUserID")
    private String dedeuserid;

    @TableField(value = "DedeUserID__ckMd5")
    private String dedeuseridCkmd5;

    @TableField(value = "Expires")
    private String expires;

    @TableField(value = "SESSDATA")
    private String sessdata;

    @TableField(value = "BILI_JCT")
    private String biliJct;

    @TableField(value = "GOURL")
    private String gourl;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_TS = "TS";

    public static final String COL_URL = "URL";

    public static final String COL_DEDEUSERID = "DedeUserID";

    public static final String COL_DEDEUSERID__CKMD5 = "DedeUserID__ckMd5";

    public static final String COL_EXPIRES = "Expires";

    public static final String COL_SESSDATA = "SESSDATA";

    public static final String COL_BILI_JCT = "BILI_JCT";

    public static final String COL_GOURL = "GOURL";
}