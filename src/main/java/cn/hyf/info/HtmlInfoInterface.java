package cn.hyf.info;

/**
 * 通过百度搜索页面获取股票的日成交信息
 * 成交量
 * 收盘价等
 * @author hyf
 *
 */
public interface HtmlInfoInterface {
	
	/**
	 * 获取股票收盘价
	 * 单位：元
	 * @param htmstr
	 * @return
	 */
	double getEndPrice(String htmstr);
	
	/**
	 * 获取股票成交量
	 * @param htmstr
	 * @return
	 */
	double getVolume(String htmstr);
	
	/**
	 * 获取股票代码
	 * @param name
	 * @param htmlstr
	 * @return
	 */
	String getCode(String name,String htmlstr);

}
