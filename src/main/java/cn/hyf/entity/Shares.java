package cn.hyf.entity;

/**
 * 股票基本信息
 * @author hyf
 *
 */
public class Shares {
	
	private String name;//股票名称
	private String code;//股票代码
	private double volume;//成交量
	private double price;//价格
	private double turnover_rate;//换手率
	private double priceearning_ratio;//市盈率
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTurnover_rate() {
		return turnover_rate;
	}
	public void setTurnover_rate(double turnover_rate) {
		this.turnover_rate = turnover_rate;
	}
	public double getPriceearning_ratio() {
		return priceearning_ratio;
	}
	public void setPriceearning_ratio(double priceearning_ratio) {
		this.priceearning_ratio = priceearning_ratio;
	}
	
	
	

}
