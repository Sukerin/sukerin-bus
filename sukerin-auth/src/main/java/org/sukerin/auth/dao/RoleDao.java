package org.sukerin.auth.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sukerin.sukerin.common.Role;


/**
 * @author dr
 */
@Mapper
public interface RoleDao extends BaseMapper<Role> {
}
