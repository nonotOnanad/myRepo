package com.sample.cdp.runner;

import com.sample.cdp.inter.impl.BuyStock;
import com.sample.cdp.inter.impl.SellStock;
import com.sample.cdp.invoker.Broker;
import com.sample.cdp.request.Stock;

public class Runner {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder =  new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
		
	}

}
