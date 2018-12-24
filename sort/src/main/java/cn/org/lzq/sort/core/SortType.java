package cn.org.lzq.sort.core;

public enum SortType {
	BubbleSort("BubbleSort");
	private String type;
	private SortType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}
}
