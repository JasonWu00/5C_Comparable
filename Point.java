/**
  Represent a point, using Cartesian coordinates
 */

import java.lang.Math;
public class Point implements Comparable{
    private double xcor;
    private double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
        Point dummy = (Point) otherObj;

        double pythDistanceOther = Math.pow(
          (Math.pow(dummy.returnXCor(), 2) +
          Math.pow(dummy.returnYCor(), 2))
        , 0.5);

        double pythDistanceSelf = Math.pow(
          (Math.pow(xcor, 2) +
          Math.pow(ycor, 2))
        , 0.5);

      int output;

      if (pythDistanceSelf == pythDistanceOther)
        output = 0; // temp: all Points are One
      else if (pythDistanceSelf < pythDistanceOther)
        output = -1;
      else
        output = 1;

      return output;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    public double returnXCor() {
      return xcor;
    }

    public double returnYCor() {
      return ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
