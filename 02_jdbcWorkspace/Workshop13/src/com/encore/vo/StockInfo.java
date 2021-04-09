package com.encore.vo;

public class StockInfo {
	private String stockname;
    private double currrentprice;
	
    public StockInfo(String stockname, double currrentprice) {
		super();
		this.stockname = stockname;
		this.currrentprice = currrentprice;
	}
    
    

	public StockInfo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public double getCurrrentprice() {
		return currrentprice;
	}

	public void setCurrrentprice(double currrentprice) {
		this.currrentprice = currrentprice;
	}



	@Override
	public String toString() {
		return "StockInfo [stockname=" + stockname + ", currrentprice=" + currrentprice + "]";
	}
    
    
}
