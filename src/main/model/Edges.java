package src.main.model;

import java.awt.Point;
public class Edges {
    private Point point1;
    private Point point2;
    public Edges(Point point1,Point point2){
        this.point1=point1;
        this.point2=point2;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Edges)){
            return false;
        }else{
            Edges edges = (Edges)obj;
            return (this.point1.equals(edges.point1)&&this.point2.equals(edges.point2))||(this.point1.equals(edges.point2)&&this.point2.equals(edges.point1));
        }
    }
    public Point getPoint1(){
        return this.point1;
    }
    public int getX1(){
        return this.point1.x;
    }
    public int getY1(){
        return this.point1.y;
    }
    public int getX2(){
        return this.point2.x;
    }
    public int getY2(){
        return this.point2.y;
    }
    public Point getPoint2(){
        return this.point2;
    }
}