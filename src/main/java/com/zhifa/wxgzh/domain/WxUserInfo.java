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
@TableName(value = "wx_user_info")
public class WxUserInfo implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 微信openid
     */
    @TableField(value = "wx_open_id")
    private String wxOpenId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_WX_OPEN_ID = "wx_open_id";
}