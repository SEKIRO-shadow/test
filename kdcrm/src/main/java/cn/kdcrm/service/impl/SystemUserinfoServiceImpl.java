package cn.kdcrm.service.impl;


import cn.kdcrm.mapper.SystemUserinfoMapper;
import cn.kdcrm.pojo.SystemUserinfo;
import cn.kdcrm.service.SystemUserinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@SuppressWarnings("all")
public class SystemUserinfoServiceImpl implements SystemUserinfoService {

    @Autowired
    SystemUserinfoMapper systemUserinfoMapper;

    @Override
    public int deleteByPrimaryKey(String userinfoUid) {
        return systemUserinfoMapper.deleteByPrimaryKey(userinfoUid);
    }

    @Override
    @Transactional(rollbackFor = Exception.class,propagation =Propagation.REQUIRED)
    public int insert(SystemUserinfo record) {
        return systemUserinfoMapper.insert(record);
    }

    @Override
    public SystemUserinfo selectByPrimaryKey(String userinfoUid) {
        return systemUserinfoMapper.selectByPrimaryKey(userinfoUid);
    }
    /**
     *
     * @param pageNum 当前页
     * @param pageSize 每页显示的条数
     * @return
     */
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public PageInfo<SystemUserinfo> selectAll(SystemUserinfo systemUserinfo,int pageNum, int pageSize) {

        /*Object redisValue=redisTemplate.opsForValue().get("systemUserinfoService.selectAll-"+pageNum);

        if(redisValue!=null)
        {
            System.out.println("redis获取数据");
            return (PageInfo<SystemUserinfo>)redisValue;
        }else {*/
            System.out.println("数据库获取数据");

            PageInfo<SystemUserinfo> pageInfo = null;
            //告诉分页组件，要显示的页码和每页显示的条数
            PageHelper.startPage(pageNum, pageSize);
            //查询所有的用户信息
            List<SystemUserinfo> list = systemUserinfoMapper.selectAll(systemUserinfo);
            pageInfo = new PageInfo<>(list, pageSize);

            //redisTemplate.opsForValue().set("systemUserinfoService.selectAll-" + pageNum, pageInfo);

            return pageInfo;
        //}

    }

    @Override
    public int updateByPrimaryKey(SystemUserinfo record) {
        return systemUserinfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public SystemUserinfo login(String userinfoLoginid, String userinfoPassword) {
        return systemUserinfoMapper.login(userinfoLoginid,userinfoPassword);
    }
}

