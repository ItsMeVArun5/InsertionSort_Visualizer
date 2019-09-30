import processing.core.PApplet;

class Main{
	
	public static void main(String[] args){
		String[] processingArgs = {"InsertionSortVisualizer"};
		InsertionSortVisualizer mySketch = new InsertionSortVisualizer();
		PApplet.runSketch(processingArgs, mySketch);
	}
}