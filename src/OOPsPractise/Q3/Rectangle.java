/*
Rectangle Class
Create a class Rectangle with length and width.
Add methods to calculate area and perimeter.
Create objects and print area & perimeter.
 */

package OOPsPractise.Q3;

public class Rectangle {
    double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length*width;
    }

    double perimeter(){
        return 2*(length + width);
    }
}
