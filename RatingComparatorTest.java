import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;   

/**
* Tests RatingComparator to ensure correct integers
* are returned.
*/
public class RatingComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests compare method for 1. **/
   @Test public void compare1Test() {
      RatingComparator rc = new RatingComparator();
      SoftballPlayer p1 
         = new Outfielder("10", "Maria Cooper", "RF", 1.0, .345, .122);
      SoftballPlayer p2 
             = new Outfielder("01", "Jenny Harper", "RF", 1.0, .375, .122);
      
      Assert.assertEquals(1, rc.compare(p1, p2));
   }
   
   /** Tests compare method for -1. **/
   @Test public void compare2Test() {
      RatingComparator rc = new RatingComparator();
      SoftballPlayer p1 
             = new Outfielder("10", "Maria Cooper", "RF", 1.0, .345, .122);
      SoftballPlayer p2 
             = new Outfielder("01", "Jenny Harper", "RF", 1.0, .375, .123);
      
      Assert.assertEquals(-1, rc.compare(p2, p1));
   }
   
   /** Tests compare method for 0. **/
   @Test public void compare0Test() {
      RatingComparator rc = new RatingComparator();
      SoftballPlayer p1 
             = new Outfielder("10", "Maria Cooper", "RF", 1.0, .375, .122);
      SoftballPlayer p2 
             = new Outfielder("01", "Jenny Harper", "RF", 1.0, .375, .122);
      
      Assert.assertEquals("These ratings are equal", 0, rc.compare(p1, p2));
   }
}
