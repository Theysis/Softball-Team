import java.text.DecimalFormat;
/**
* Abstract class that stores softball player data. 
*
* Project_09
* Joshua Wyatt - COMP1210 - 011
* 4/3/2019
*/
public abstract class SoftballPlayer implements Comparable<SoftballPlayer> {
// p represents player
   protected String pNumber = "";
   protected String pName = "";
   protected String pPos = "";
   protected double pSpec = 0.0;
   protected double pBat = 0.0;
   protected static int numberOfPlayers = 0;
   /** Sets the Base Rating. **/
   public static final int BASE_RATING = 10;

/**
* Serves as constructor for class.
* @param numberIn String representing player number.
* @param nameIn String representing player name.
* @param posIn String representing player position.
* @param specIn double representing player's specialization factor.
* @param batIn double representing player's batting average.
*/
   public SoftballPlayer(String numberIn, String nameIn,
                      String posIn, double specIn, double batIn) {
      pNumber = numberIn;
      pName = nameIn;
      pPos = posIn;
      pSpec = specIn;
      pBat = batIn;
      numberOfPlayers++;
   }

/**
* @return String representing given player's number.
*/
   public String getNumber() {
      return pNumber;
   }

/**
* @param numIn String representing new player number.
*/
   public void setNumber(String numIn) {
      pNumber = numIn;
   }

/**
* @return String representing current name.
*/
   public String getName() {
      return pName;
   }

/**
* @param nameEntered String representing new name.
*/
   public void setName(String nameEntered) {
      pName = nameEntered;
   }

/**
* @return String representing position. 
*/
   public String getPosition() {
      return pPos;
   }

/**
* @param posChanged String representing new position.
*/
   public void setPosition(String posChanged) {
      pPos = posChanged;
   }

/**
* @return double representing batting average.
*/
   public double getBattingAvg() {
      return pBat;
   }

/**
* @param batAvgIn double representing inputed batting average.
*/
   public void setBattingAvg(double batAvgIn) {
      pBat = batAvgIn;
   }

/**
* @return double representing specialilization factor.
*/
   public double getSpecializationFactor() {
      return pSpec;
   }

/**
* @param specFactIn double representing inputed specialization factor.
*/
   public void setSpecializationFactor(double specFactIn) {
      pSpec = specFactIn;
   }

/**
* @return int representing count of players.
*/
   public static int getCount() {
      return numberOfPlayers;
   }

/**
* Method resets the count of number of players.
*/
   public static void resetCount() {
      numberOfPlayers = 0;
   }

/**
* @return String representing the batting average.
*/
   public String stats() {
      DecimalFormat df = new DecimalFormat(".000");
      String stat = df.format(pBat);
      return stat;
   }

/**
* @return String representing output for this method.
*/
   public String toString() { 
      DecimalFormat df = new DecimalFormat("##.000");
      String output = this.getNumber() + " " + this.getName() + " ("
             + this.getPosition() + ") " + this.stats();
      output += "\nSpecialization Factor: " + pSpec
             + " (" + this.getClass() + ") Rating: " + df.format(this.rating());
      return output;
   }

/**
* @return double representing rating of a softball player.
*/
   public abstract double rating();
   
   
/**
* @param softballPlayerIn SoftballPlayer representing comparable player.
* @return int representing result of comparing the two players.
*/
   public int compareTo(SoftballPlayer softballPlayerIn) {
      return pNumber.compareTo(softballPlayerIn.getNumber());
   }
}