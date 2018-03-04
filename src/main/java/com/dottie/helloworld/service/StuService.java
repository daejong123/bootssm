package com.dottie.helloworld.service;

import com.dottie.helloworld.entity.StuEntity;
import org.apache.ibatis.annotations.Param;

public interface StuService {

    StuEntity selectById(@Param("id") String id) throws Exception;
}
