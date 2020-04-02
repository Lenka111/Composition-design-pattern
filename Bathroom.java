//Elena Voinu
public class Bathroom {
	
// bathroom has a Tub	
private Tub bathtub;

public Bathroom() {
	//create the object bathtub
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

