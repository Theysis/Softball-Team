/** 
* Class serves to define those with the Infielder trait.
*/
public class Infielder extends SoftballPlayer {
   private double infielderFieldingAvg = 0.0;

   /**
  * Serves as constructor for infielder class.
  * @param infielderAvgIn double representing player infielding point average.
  * @param numberIn String representing player number.
  * @param nameIn String representing player name.
  * @param posIn String representing player position.
  * @param specIn double representing player's specialization factor.
  * @param batIn double representing player's batting average.
  */
   public Infielder(String numberIn, String nameIn, String posIn,
                double specIn, double batIn, double infielderAvgIn) {
      super(numberIn, nameIn, posIn, specIn, batIn);
      infielderFieldingAvg = infielderAvgIn;
   }
   
   /**
   * @return double representing infielderFieldingAvg.
   */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
   * @param averageIn double representing inputed infielder avg.
   */
   public void setInfielderFieldingAvg(double averageIn) {
      infielderFieldingAvg = averageIn;
   }
   
   /**
   * @return double representing player rating.
   */
   public double rating() {
      return (BASE_RATING * pSpec * pBat * infielderFieldingAvg);
   }
   
   
}