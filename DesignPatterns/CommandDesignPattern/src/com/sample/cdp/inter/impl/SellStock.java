package com.sample.cdp.inter.impl;

import com.sample.cdp.inter.Order;
import com.sample.cdp.request.Stock;

public class SellStock implements Order {
	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
