package com.zhifa.wxgzh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName(value = "USER_UPLOAD_IMAGES")
public class UserUploadImages implements Serializable {
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    /**
     * openid
     */
    @TableField(value = "OPEN_ID")
    private String openId;

    /**
     * 图片地址
     */
    @TableField(value = "PIC_URL")
    private String picUrl;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_OPEN_ID = "OPEN_ID";

    public static final String COL_PIC_URL = "PIC_URL";
}