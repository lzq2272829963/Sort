package cn.org.lzq.sort.core;

public enum SortDirection {
	Positive("Positive"),Reverse("Reverse");
	private String direction;
	private SortDirection(String direction) {
		this.direction=direction;
	}
	public String getDirection() {
		return this.direction;
	}
}
