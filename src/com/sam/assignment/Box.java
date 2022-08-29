package com.sam.assignment;


public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(){}
    public Box(double len)
    {
        width=len;
        height=len;
        depth=len;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(Box box)
    {
        this.width = box.getWidth();
        this.height = box.getHeight();
        this.depth = box.getDepth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    public void setDim(double width, double height, double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public boolean equalsTo(Box box) {
        if (this == box) return true;
        if (box == null || getClass() != box.getClass()) return false;
        Box box1 = box;
        return Double.compare(box1.width, width) == 0 && Double.compare(box1.height, height) == 0 && Double.compare(box1.depth, depth) == 0;
    }

   public double volume()
   {
       return height*width*depth;
   }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
