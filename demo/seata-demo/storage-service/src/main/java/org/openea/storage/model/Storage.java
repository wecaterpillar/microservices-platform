package org.openea.storage.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 库存
 *
 */
@Data
@Accessors(chain = true)
@TableName("storage_tbl")
public class Storage {
    @TableId
    private Long id;
    private String commodityCode;
    private Long count;
}
