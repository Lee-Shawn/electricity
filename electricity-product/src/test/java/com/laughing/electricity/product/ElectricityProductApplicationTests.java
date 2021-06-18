package com.laughing.electricity.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laughing.electricity.product.entity.BrandEntity;
import com.laughing.electricity.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class ElectricityProductApplicationTests {
	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		//brandEntity.setName("斯伯丁");
		//brandService.save(brandEntity);

		/*brandEntity.setBrandId(1L);
		brandEntity.setDescript("NBA比赛专用篮球");
		brandService.updateById(brandEntity);*/
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "斯伯丁"));
		list.forEach(System.out::println);
	}

}
