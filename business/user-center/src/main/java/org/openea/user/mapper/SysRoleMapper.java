package org.openea.user.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.openea.db.mapper.SuperMapper;

import org.openea.common.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 角色
 */
@Mapper
public interface SysRoleMapper extends SuperMapper<SysRole> {
	List<SysRole> findList(Page<SysRole> page, @Param("r") Map<String, Object> params);

	List<SysRole> findAll();
}
