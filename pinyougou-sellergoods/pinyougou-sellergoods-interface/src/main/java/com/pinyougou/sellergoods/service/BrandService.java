package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandService {


    /**
     *查询所有商标列表
     * @return 所有商标列表
     */
    public List<TbBrand> queryAll();
}



