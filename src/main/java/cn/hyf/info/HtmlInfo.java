package cn.hyf.info;

public class HtmlInfo implements HtmlInfoInterface {

	@Override
	public double getEndPrice(String htmstr) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double getVolume(String htmstr) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getCode(String name, String htmlstr) {
		// TODO Auto-generated method stub
		if(htmlstr.indexOf(name) != -1){
			
		}
		return null;
	}

}
