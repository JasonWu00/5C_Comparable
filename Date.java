/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int returnTotalDays() {
      return y * 365 + m * 30 + d;
    }

    public int compareTo(Object otherObj) {
      int output;
      Date dummy = (Date) otherObj;

      int totalDaysSelf = returnTotalDays();
      int totalDaysOther = dummy.returnTotalDays();

      if (totalDaysSelf == totalDaysOther)
        output = 0;
      else if (totalDaysSelf > totalDaysOther)
        output = 1;
      else
        output = -1;

      return output;
    }

}
