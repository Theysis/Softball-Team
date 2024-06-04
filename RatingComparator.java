import java.util.Comparator;
/**
* Implements Comparator interface based on rating.
*/
public class RatingComparator implements Comparator<SoftballPlayer> {
   /**
   * @param p1 Any SoftballPlayer with a defined rating
   * @param p2 Any SoftballPlayer with a defined rating.
   * @return integer representing a positive, negative, or equal to comparison.
   */
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      double r1 = p1.rating();
      double r2 = p2.rating();
      if (r1 < r2) {
         return 1;
      }  
      else if (r1 > r2) {
         return -1;
      }
      else {
         return 0;
      }
   }
}