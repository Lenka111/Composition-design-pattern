
public class Main {
	public static void main(String[] args) {
		Tub tub = new Tub(13);
		System.out.println("Tub size is "+tub.getSize());
		System.out.println("Bubble color is "+tub.getBubbleColor());
		
		Bathroom bthr = new Bathroom();
		System.out.println("Tub size is "+bthr.getTubSize() +", bubble color is "+ bthr.getBubbleColor() 
		+", bubble radius is "+ bthr.getBubbleRadius());
	}

}
