//Elena Voinu
public class Bathroom {
private Tub bathtub;

public Bathroom() {
	bathtub = new Tub(12);
	
}

public int getTubSize() {
	return bathtub.getSize();
}
public String getBubbleColor() {
	return bathtub.getBubbleColor();
}
public int getBubbleRadius() {
	return bathtub.getBubbleRadius();
}
}

