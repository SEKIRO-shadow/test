package cn.kdcrm.service.impl;

import cn.kdcrm.mapper.SystemRoleMapper;
import cn.kdcrm.pojo.SystemRole;
import cn.kdcrm.service.SystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemRoleServiceImpl implements SystemRoleService {

    @Autowired
    SystemRoleMapper roleMapper;


    @Override
    public int deleteByPrimaryKey(String roleId) {
        return 0;
    }

    @Override
    public int insert(SystemRole record) {
        return 0;
    }

    @Override
    public SystemRole selectByPrimaryKey(String roleId) {
        return null;
    }

    @Override
    public List<SystemRole> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(SystemRole record) {
        return 0;
    }
}
