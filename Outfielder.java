   /**
* Class defines those with the Outfielder trait.
*
*/
public class Outfielder extends SoftballPlayer {

   private double outfielderFieldingAvg = 0.0;

/**
* Serves as constructor for OutFielder class.
* @param outFielderAvgIn double representing inputed outfielder avg.
* @param numberIn String representing player number.
* @param nameIn String representing player name.
* @param posIn String representing player position.
* @param specIn double representing player's specialization factor.
* @param batIn double representing player's batting average.
*/
   public Outfielder(String numberIn, String nameIn, String posIn, 
                  double specIn, double batIn, double outFielderAvgIn) {
      super(numberIn, nameIn, posIn, specIn, batIn);
      outfielderFieldingAvg = outFielderAvgIn;
   }

/**
* @return double representing outfielder fielding average.
*/
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }

/**
* @param outFieldIn double representing outfielder fielding avg.
*/
   public void setOutfielderFieldingAvg(double outFieldIn) {
      outfielderFieldingAvg = outFieldIn;
   }

/**
* @return double representing rating for player.
*/
   public double rating() {
      return BASE_RATING * pSpec * pBat * outfielderFieldingAvg;
   }


}