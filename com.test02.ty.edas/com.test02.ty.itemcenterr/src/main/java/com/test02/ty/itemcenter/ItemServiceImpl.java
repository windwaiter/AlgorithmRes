package com.test02.ty.itemcenter;

import com.test02.ty.edas.itemcenter.Item;
import com.test02.ty.edas.itemcenter.ItemService;


/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public class ItemServiceImpl implements ItemService {

	public Item getItemById( long id ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
	
	public Item getItemByName( String name ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
}
