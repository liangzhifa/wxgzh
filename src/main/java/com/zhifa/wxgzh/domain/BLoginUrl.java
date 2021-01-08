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
@TableName(value = "B_LOGIN_URL")
public class BLoginUrl implements Serializable {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField(value = "CODE")
    private Integer code;

    @TableField(value = "TS")
    private Integer ts;

    @TableField(value = "URL")
    private String url;

    @TableField(value = "OAUTHKEY")
    private String oauthkey;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_CODE = "CODE";

    public static final String COL_TS = "TS";

    public static final String COL_URL = "URL";

    public static final String COL_OAUTHKEY = "OAUTHKEY";
}