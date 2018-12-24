package cn.org.lzq.sort.sort;

import java.util.Comparator;

import cn.org.lzq.sort.core.SortDirection;

public interface Sort {
	public <T> T[] getResult(T[] arr,SortDirection sortDirection,Comparator<T> comparator);
	public <T> T[] getPositiveResult(T[] arr,Comparator<T> comparator);
	public <T> T[] getReverseResult(T[] arr,Comparator<T> comparator);
}
