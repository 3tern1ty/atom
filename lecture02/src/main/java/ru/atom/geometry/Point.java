package ru.atom.geometry;

/**
 * Template class for
 */
public class Point implements Collider /* super class and interfaces here if necessary */ {
    // fields
    private int x;
    private int y;

    // and methods

    public Point(int x, int y){
        this.x = setCoords(x);
        this.y = setCoords(y);
    }

    private int setCoords(int coordinate){
        if (coordinate < 0) {
            throw new UnsupportedOperationException();
        }

        return coordinate;
    }

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // cast from Object to Point
        Point point = (Point) o;

        return this.x == point.x && this.y == point.y;


        // your code here
//        throw new UnsupportedOperationException();
    }

    public boolean isColliding(Collider other) {
        return true;
    }
}
