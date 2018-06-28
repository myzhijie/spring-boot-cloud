package cn.zhangxd.svca.service;

import cn.zhangxd.svca.entity.GYMOrder;
import cn.zhangxd.svca.mapper.GYMOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("gymOrderService")
public class GYMOrderService {

    @Autowired
    GYMOrderMapper gymOrderMapper;

    public void insertOrder(GYMOrder gymOrder){
        gymOrderMapper.insertOrder(gymOrder);
    }

    public void updateOrder(Map<String, Object> map){
        gymOrderMapper.updateOrder(map);
    }

    public List<GYMOrderMapper> queryOrders(Map<String, Object> map){
        return gymOrderMapper.queryOrders(map);
    }
}
