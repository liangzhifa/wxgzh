package com.zhifa.wxgzh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "B_LOG")
public class BLog implements Serializable {
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField(value = "RESULT")
    private String result;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_RESULT = "RESULT";

    public static final String COL_CREATE_TIME = "CREATE_TIME";
}