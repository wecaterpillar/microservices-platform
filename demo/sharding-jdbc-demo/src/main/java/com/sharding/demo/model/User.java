package com.sharding.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import org.openea.common.model.SuperEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User extends SuperEntity {
	private static final long serialVersionUID = 8898492657846787286L;
	private String companyId;
	private String name;
}
