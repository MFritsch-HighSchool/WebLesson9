import java.awt.Color;
import java.util.Random;

import apcslib.DrawingTool;
import apcslib.SketchPad;

public class KurveBuilder {
	DrawingTool pen;
	
	public void setupWorld() {
		pen = new DrawingTool();
	}
	public void drawStar(int length, int level, int x, int y){
		pen.up();
		pen.move(x,y);
		pen.setDirection(120);
		for(int looper = 3; looper > 0; looper++){
		drawCurve(length,level);
		turnCorner();
		}
	}
	
	private void turnCorner() {
		pen.turn(240);
		
	}
	public void drawCurve(int length, int level){
		if(level == 0){
			pen.down();
			pen.move(length);
		}
			
		else{
			drawCurve(length/3, level-1);
			pen.turn(60);
			drawCurve(length/3, level-1);
			pen.turn(240);
			drawCurve(length/3, level-1);
			pen.turn(60);
			drawCurve(length/3, level-1);
		}
		
		
//		
//		pen.down();
//		if(level == 1)	
//			pen.move(length);
//		else
//			drawCurve(length/3, level-1);
//		pen.turn(60);
//		if(level == 1)	
//			pen.move(length);
//		else
//			drawCurve(length/3, level-1);
//		pen.turn(240);
//		if(level == 1)
//			pen.move(length);
//		else
//			drawCurve(length/3, level-1);
//		pen.turn(60);
//		if(level == 1)
//			pen.move(length);
//		else
//			drawCurve(length/3, level-1);
	}

}
