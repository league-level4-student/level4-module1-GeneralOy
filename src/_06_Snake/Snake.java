package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.GREEN;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	Location newHeadLocation;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE, true);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		/** 1. add a new SnakeSegment object to the snake */
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE, false));
	}

	public Location getHeadLocation() {
		/** 2. return the location of the snake's head */
		return head.getLocation();
	}

	public void update() {
		/**
		 * 1. use a switch statement to check on the currentDirection of the snake and
		 * calculate its next x and y position.
		 */
		switch (currentDirection) {
		case RIGHT: {

			newHeadLocation = new Location(head.getLocation().x + 1, head.getLocation().y);
			break;
		}
		case LEFT: {

			newHeadLocation = new Location(head.getLocation().x - 1, head.getLocation().y);
			break;
		}
		case DOWN: {

			newHeadLocation = new Location(head.getLocation().x, head.getLocation().y + 1);
			break;
		}
		case UP: {

			newHeadLocation = new Location(head.getLocation().x, head.getLocation().y - 1);
			break;
		}
		}

		/**
		 * 2. Iterate through the SnakeSegments in reverse order //2a. Update each snake
		 * segment to the location of the segment // in front of it.
		 */
		for (int i = snake.size() - 1; i > 0; i--) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
		}

		/** 3. set the location of the head to the new location calculated in step 1 */
		snake.get(0).setLocation(newHeadLocation);/** 4. set canMove to true */
		canMove = true;
	}

	public void setDirection(Direction d) {
		if (canMove) {
			if (d == Direction.DOWN && currentDirection != Direction.UP) {
				canMove = false;
				currentDirection = d;
			} else if (d == Direction.UP && currentDirection != Direction.DOWN) {
				canMove = false;
				currentDirection = d;
			} else if (d == Direction.LEFT && currentDirection != Direction.RIGHT) {
				canMove = false;
				currentDirection = d;
			} else if (d == Direction.RIGHT && currentDirection != Direction.LEFT) {
				canMove = false;
				currentDirection = d;
			}
		} else if (canMove) {
			canMove = false;
		} /**
			 * 1. set the current direction equal to the passed in Direction only if canMove
			 * is true. // set canMove equal to false. // make sure the snake cannot
			 * completely reverse directions.
			 */

	}

	public void reset(Location loc) {
		/** 1. clear the snake */
		snake.clear();
		/** 2. set the location of the head */
		head.setLocation(loc);
		/** 3. add the head to the snake */
		snake.add(head);

	}

	public boolean isOutOfBounds() {
		/**
		 * 1. complete the method so it returns true if the head of the snake is outside
		 * of the window // and false otherwise
		 */
		if ((head.getLocation().x * _00_SnakeGame.WINDOW_SCALE >= _00_SnakeGame.WINDOW_WIDTH
				|| head.getLocation().x * _00_SnakeGame.WINDOW_SCALE < 0)
				|| (head.getLocation().y * _00_SnakeGame.WINDOW_SCALE >= _00_SnakeGame.WINDOW_HEIGHT
						|| head.getLocation().y * _00_SnakeGame.WINDOW_SCALE < 0)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isHeadCollidingWithBody() {
		/**
		 * 1. complete the method so it returns true if the head is located // in the
		 * same location as any other body segment
		 */
		System.out.println("test");
		for (SnakeSegment snek : snake) {
			//System.out.println("inside snek");
			//System.out.println(snek.getLocation() + ", head: " + head.getLocation());
			if (!snek.isHead()) {
				//System.out.println("hit1");

				if (head.getLocation().x == snek.getLocation().x && head.getLocation().y == snek.getLocation().y) {
					System.out.println("HIT");
					return true;
				}
			}
			if (head == snek) {
				System.out.println("EQUAL");
			}

		}
		return false;

	}

	public boolean isLocationOnSnake(Location loc) {
		/**
		 * 1. complete the method so it returns true if the passed in // location is
		 * located on the snake
		 */
		for (SnakeSegment snek : snake) {
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					if (loc.x == snek.getLocation().x + a && loc.y == snek.getLocation().y + b) {
						return true;
					}
				}
			}

		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
