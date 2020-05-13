package com.shiqla.mall.product;

import com.shiqla.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiqlamallProductApplicationTests
{

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads ()
    {
    }

}
