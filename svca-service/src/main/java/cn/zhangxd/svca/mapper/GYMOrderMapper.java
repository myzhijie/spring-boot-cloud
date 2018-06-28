package cn.zhangxd.svca.mapper;

import cn.zhangxd.svca.entity.GYMOrder;

import java.util.List;
import java.util.Map;

public interface GYMOrderMapper {
    void insertOrder(GYMOrder gymOrder);

    void updateOrder(Map<String, Object> map);

    List<GYMOrderMapper> queryOrders(Map<String, Object> map);
}
