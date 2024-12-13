/*
    Implement a structure called Point that represents a point in 2D space. The structure should have two fields, x and y, 
    both of type double. Implement the following functions:
    
    - A function called readPoint that reads the coordinates of a point from the user.
    - A function called printPoint that prints the coordinates of a point.
    - A function called distance that calculates the distance between two points.
    - A function called move that moves a point by a given distance along the x and y axes.
    - A function called scale that scales a point by a given factor.
*/

#include <stdio.h>
#include <math.h>

typedef struct {
    double x;
    double y;
} Point;

int main(int argc, char const *argv[])
{
    Point p1, p2;
    read_point(&p1); 
    read_point(&p2);

    print_point(p1);
    print_point(p2);

    printf("Distance between the two points: %lf\n", distance(p1, p2));

    move(&p1, 2, 3);
    print_point(p1);

    scale(&p2, 2);
    print_point(p2);
    
    return 0;
}

void read_point(Point *p) {
    printf("Input coordinate x: ");
    scanf("%lf", &(p->x));
    
    printf("Input coordinate y: ");
    scanf("%lf", &(p->y));
}

void print_point(Point p) {
    printf("Point: (%lf,%lf)\n", p.x, p.y);
}

double distance(Point p1, Point p2) {
    // Pythagorean theorem
    /*
        distance = sqrt((x2-x1)^2 + (y2-y1)^2)

        where:
        - x1, y1 are the coordinates of the first point
        - x2, y2 are the coordinates of the second point
    */  
}

void move(Point *p, double dx, double dy) {

}

void scale(Point *p, double factor) {

}
