package ru.bmn.web.hsdb.servlet.view.ui;

public class HeadMenuItem {
	private final String id;
	private final String url;
	private final String title;
	private boolean selected = false;
	
	public HeadMenuItem(String id, String url, String title) {
		this.id    = id;
		this.url   = url;
		this.title = title;
	}

	public void select() {
		this.selected = true;
	}

	public boolean is(String current) {
		return this.id == current;
	}

	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public boolean isSelected() {
		return selected;
	}
}
