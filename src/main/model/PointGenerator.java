package src.main.model;

import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;
public class PointGenerator {
    private int nmbPoint;
    private int maxX;
    private int maxY;
    private int space;
    public PointGenerator(int nmbPoint,int maxX,int maxY,int space){
        this.nmbPoint = nmbPoint;
        this.maxX=maxX;
        this.maxY=maxY;
        this.space = space;
    }
    private Point generatePoint(int maxX,int maxY){
        Random random = new Random();
        int x = random.nextInt(maxX);
        int y = random.nextInt(maxY);
        return new Point(x, y);
    }
    private boolean distanceGreaterThan(ArrayList<Point>listPoints,Point p,int dist ){
        for(Point point:listPoints){
            if(p.distance(point)<dist){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Point> randomPoint(){
        ArrayList<Point> randomPoints = new ArrayList<Point>();
        int nmbGeneratedPoint = 0; 
        while(nmbGeneratedPoint<nmbPoint){
            Point point = generatePoint(maxX, maxY);
            if(distanceGreaterThan(randomPoints, point,space)){
                randomPoints.add(point);
                nmbGeneratedPoint++;
            }
        }
        
    }
}
