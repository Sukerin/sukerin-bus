package org.sukerin.sukerin.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author dr
 */
@Data
@TableName
public class Role {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String businessId;
    private String name;
    private LocalDateTime createTime;
}
