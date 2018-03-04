package com.dottie.helloworld.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AbstractDao<T> {

    // 添加
    void insert(T t) throws Exception;

    // 更新
    void update(T t) throws Exception;

    // 删除
    void delete(@Param("key") String ukfield, @Param("value") Object value) throws Exception;

    // 查询
    T select(@Param("key") String ukfield, @Param("value") Object value) throws Exception;

    // 判断是否存在
    boolean exists(@Param("key") String ukfield, @Param("value") Object value) throws Exception;

    // 模糊查询
    List<T> selectLike(Map<String, Object> map) throws Exception;
}
