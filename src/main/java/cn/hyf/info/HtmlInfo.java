package cn.hyf.info;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlInfo implements HtmlInfoInterface {

	Logger log = LoggerFactory.getLogger(this.getClass());

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
		if (htmlstr.indexOf(name) != -1) {
			String[] str = htmlstr.split(name);
			log.info(name + "的数据：" + str.length);
			Set<String> set = new HashSet<String>();
			for (int i = str.length - 1; i > 0; i--) {
				String tempstr = str[i];
				int n = 13;
				if (tempstr.length() < 13) {
					n = tempstr.length();
				}
				// System.out.println(tempstr.substring(0, n));

				String codestr = tempstr.substring(0, n);

				if (codestr.length() == 13) {
					String codestr_last8 = codestr.substring(5);
					String reg = "(\\(|\\[)[0-9]{6}(\\)|\\])";
					boolean iscodestr = Pattern.matches(reg, codestr_last8);
					if (iscodestr) {
						set.add(codestr_last8);
//						System.out.println(codestr_last8);
					}

				}
			}
			log.info(" set size  " + set.size());
			Iterator<String> it = set.iterator();
			String code = "";
			while (it.hasNext()) {
				if ("".equals(code)) {
					code = it.next().substring(1, 7);
				} else {
					if (!code.equals(it.next().substring(1, 7))) {
						return null;
					}
				}
			}
			
			if (!"".equals(code)) {
				return code;
			}

		}
		return null;
	}

}
