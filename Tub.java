
public class Tub {
	private int size;
	private Bubble bubble;
	
	public Tub(int size) {
		this.size = size;
		bubble = new Bubble();
		bubble.setColor("blue");
		bubble.setRadius(13);
		
	}
	public String getBubbleColor() {
		return bubble.getColor();
	}
	public int getBubbleRadius() {
		return bubble.getRadius();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
