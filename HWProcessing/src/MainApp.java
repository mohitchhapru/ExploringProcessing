import processing.core.PApplet;

public class MainApp extends PApplet{

    public static void main(String[] args){
        PApplet.main("MainApp",args);
    }

    public void setup(){
        size(100,100);
        noStroke();
    }
    public void draw(){
        background(001);
        fill(0,0,255);
        rect(mouseX,mouseY,40,40);

    }
    public void settings(){

    }
}
