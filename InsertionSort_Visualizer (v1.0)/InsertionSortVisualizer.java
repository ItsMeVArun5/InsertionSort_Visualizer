import processing.core.PApplet;

class InsertionSortVisualizer extends PApplet{

    float bars[];
    float temp,temp_1;
    int sortedIndex;
    int unsortedIndex = 1;
    boolean isElementPlaced = true;
    int size = (int) random(20,40); //number of bars..........

	public void settings(){
        size(800, 500);
        
        bars = new float[size];
        
        //Generating random values of bars......................
        for (int i=0; i<size; i++){
            bars[i] = random (100, height);
        }
	}
	
	public void draw(){
        frameRate(7);
        background(255);
        createBars();

        if (unsortedIndex < size){
            if (isElementPlaced == true){
                temp = bars[unsortedIndex];
                sortedIndex = unsortedIndex - 1;
                isElementPlaced = false;
            }
            
                if ((sortedIndex >= 0) && (temp < bars[sortedIndex])){
                    temp_1 = bars[sortedIndex];
                    bars[sortedIndex] = temp;
                    bars[sortedIndex+1] = temp_1;
                    drawBars(temp, 50+(sortedIndex+1)*15, 251, 0, 0);
                    sortedIndex--;
                }
                else{
                    bars[sortedIndex+1] = temp;
                    drawBars(temp, 50+(sortedIndex+1)*15, 0, 251, 0);
                    isElementPlaced = true;
                    unsortedIndex++;
                }
        }
        else{
            noLoop();
        }

    }
    
    public void createBars(){
        //Drawing each bar on canvas.....................
        for (int i=0; i<size; i++){
            drawBars(bars[i], 50+i*15, 51, 0, 0);
        }
    }
    
    public void drawBars(float barSize, int shiftX, int R, int G, int B){
        strokeWeight(10);
        stroke(R, G, B);
        strokeCap(SQUARE);
        line(shiftX+50, 100, shiftX+50, barSize);
    }
	
}