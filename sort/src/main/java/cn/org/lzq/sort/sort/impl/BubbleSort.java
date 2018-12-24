package cn.org.lzq.sort.sort.impl;

import java.util.Comparator;

import cn.org.lzq.sort.core.SortDirection;
import cn.org.lzq.sort.sort.Sort;

public class BubbleSort implements Sort {

	@Override
	public <T> T[] getResult(T[] arr,SortDirection sortDirection,Comparator<T> comparator) {
		String direction = sortDirection.getDirection();
		if(direction.equals("Positive")) {
			return this.getPositiveResult(arr, comparator);
		}else {
			return this.getReverseResult(arr, comparator);
		}
	}

	@Override
	public <T> T[] getPositiveResult(T[] arr, Comparator<T> comparator) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int comparedResult = comparator.compare(arr[j], arr[j+1]);
				if(comparedResult>0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	@Override
	public <T> T[] getReverseResult(T[] arr, Comparator<T> comparator) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int comparedResult = comparator.compare(arr[j], arr[j+1]);
				if(comparedResult<0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
