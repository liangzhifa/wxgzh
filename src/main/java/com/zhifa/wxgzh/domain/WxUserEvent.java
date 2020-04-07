package com.zhifa.wxgzh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "WX_USER_EVENT")
@Builder
public class WxUserEvent implements Serializable {
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 用于openid
     */
    @TableField(value = "OPEN_ID")
    private String openId;

    /**
     * 操作事件
     */
    @TableField(value = "EVENT")
    private String event;

    /**
     * 操作时间
     */
    @TableField(value = "CREATE_TIME")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_OPEN_ID = "OPEN_ID";

    public static final String COL_EVENT = "EVENT";

    public static final String COL_CREATE_TIME = "CREATE_TIME";
}
