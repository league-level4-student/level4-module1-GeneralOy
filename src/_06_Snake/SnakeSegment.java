package _06_Snake;

import java.awt.Graphics;

public class SnakeSegment {
	private Location location;
	private int size;
	private boolean isHead;

	public SnakeSegment(Location loc, int size, boolean headQ) {
		this.location = loc;
		this.size = size;
		this.isHead = headQ;
	}

	public void setLocation(Location loc) {
		this.location = loc;
	}

	public Location getLocation() {
		return location;
	}
	
	public boolean isHead() {
		return isHead;
	}

	public void draw(Graphics g) {
		g.setColor(Snake.SNAKE_COLOR);
		g.drawRect(location.x * size, location.y * size, size, size);
		;
	}
}
