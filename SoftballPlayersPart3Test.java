import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Serves as JUnit test for SoftballPlayersPart3.
*/
public class SoftballPlayersPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


  /** Tests main method for file name is missing. **/
   @Test public void softballPlayersPart3Test0() {
      String[] args0 = {};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart3 app = new SoftballPlayersPart3(); 
      // initialize contructor.
      SoftballPlayersPart3.main(args0);
      Assert.assertEquals("Team count should be 0. ", 
                        0, SoftballTeam.getTeamCount());
   
   }
   
   /** Tests output when file is not found. **/
   @Test public void softballPlayersPart3Test1() {
      String[] args1 = {"atat.csv"};
      SoftballTeam.resetTeamCount();
      SoftballPlayersPart3.main(args1);
      Assert.assertEquals("Team count should be 0. ",
                     0, SoftballTeam.getTeamCount());
   }
   
   /** Tests valid input string.
   * @throws IOException if file not found. **/
   @Test public void softballPlayersPart3Test2()  {
      SoftballTeam.resetTeamCount();
      String[] args2 = {"softball_player_data_part3a.csv"};
      SoftballPlayersPart3.main(args2);
      Assert.assertEquals("Team count should be 1. ", 
                        1, SoftballTeam.getTeamCount());
   }
}
