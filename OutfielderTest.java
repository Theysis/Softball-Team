import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*Tests Outfielder class for errors.
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

  /** Tests resetCount Method. **/
   @Test public void resetCountTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.resetCount();
      Assert.assertEquals(0, player.getCount());
   }

   /** Tests getNumber Method. **/
   @Test public void getNumberTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals("01", player.getNumber());
      player.resetCount();
   }
   
   /** Tests setNumber Method. **/
   @Test public void setNumberTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.setNumber("09");
      Assert.assertEquals("09", player.getNumber());
      player.resetCount();
   }
   
   /** Tests getName Method. **/
   @Test public void getNameTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals("Kaylee Jones", player.getName());
      player.resetCount();
   }
  
   /** Tests setName Method. **/ 
   @Test public void setNameTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.setName("Carleen Mays");
      Assert.assertEquals("Carleen Mays", player.getName());
      player.resetCount();
   }
   
   /** Tests getPosition Method. **/
   @Test public void getPositionTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals("LF", player.getPosition());
      player.resetCount();
   }
   
   /** Tests setPosition Method. **/
   @Test public void setPositionTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.setPosition("RF");
      Assert.assertEquals("RF", player.getPosition());
      player.resetCount();
   }
   
   /** Tests getBattingAvg Method. **/
   @Test public void getBattingAvgTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(.375, player.getBattingAvg(), .0001);
      player.resetCount();
   }
   
   /** Tests setBattingAvg Method. **/ 
   @Test public void setBattingAvgTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.setBattingAvg(.400);
      Assert.assertEquals(.400, player.getBattingAvg(), .0001);
      player.resetCount();
   }
   
   /** Tests getSpecializationFactor method. **/
   @Test public void getSpecFactorTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(1.0, player.getSpecializationFactor(), .0001);
      player.resetCount();
   }
   
   /** Tests setSpecializationFactor method. **/
   @Test public void setSpecFactorTest() {
      Outfielder player 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player.setSpecializationFactor(3.9);
      Assert.assertEquals(3.9, player.getSpecializationFactor(), .0001);
      player.resetCount();
   }
   
   /** Tests getCount Method. **/
   @Test public void getCountTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Outfielder player2 
               = new Outfielder("02", "Shirley Curly", "RF", 1.0, .500, .950);
      Assert.assertEquals(2, player1.getCount());
   }
   
   /** Tests stats method. **/
   @Test public void statsTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(".375", player1.stats());
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals("01 Kaylee Jones (LF) .375"
         + "\nSpecialization Factor: 1.0 (class Outfielder) Rating: 3.562",
          player1.toString());
   }
   
   /** Tests getOutfielderFieldingAvg method. **/
   @Test public void getOutFieldingAvgTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(.950, player1.getOutfielderFieldingAvg(), .0001);
   }
   
   /** Tests setOutfielderFieldingAvg method. **/
   @Test public void setOutFieldingAvgTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      player1.setOutfielderFieldingAvg(.850);
      Assert.assertEquals(.850, player1.getOutfielderFieldingAvg(), .0001);
   }
   
   /** Tests rating method. **/
   @Test public void ratingTest() {
      Outfielder player1 
               = new Outfielder("01", "Kaylee Jones", "LF", 1.0, .375, .950);
      Assert.assertEquals(3.5625, player1.rating(), .0001);
   }
}
