package com.dottie.helloworld.service.impl;

import com.dottie.helloworld.dao.StuDao;
import com.dottie.helloworld.entity.StuEntity;
import com.dottie.helloworld.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {

    @Autowired
    private StuDao stuDao;

    @Override
    public StuEntity selectById(String id) throws Exception {
        return stuDao.select("id", id);
    }
}
