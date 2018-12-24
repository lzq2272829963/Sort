package cn.org.lzq.sort.factory;

import cn.org.lzq.sort.core.SortType;
import cn.org.lzq.sort.sort.Sort;

public class SortFactory {
	public static Sort getSort(SortType sortType) {
		Sort instance = null;
		try {
			instance = (Sort)Class.forName("cn.org.lzq.sort.sort.impl."+sortType.getType()).newInstance();
		} catch (Exception e) {
			System.err.println("创建Sort实例失败");
			e.printStackTrace();
		} 
		return instance;
	}
}
