/** 
* Class defines those with the relief pitcher trait.
*/ 
public class ReliefPitcher extends Pitcher {
   private int saves = 0;

/**
* Serves as constructor for ReliefPitcher class.
* @param savesIn int representing number of saves.
* @param numberIn String representing player number.
* @param nameIn String representing player name.
* @param posIn String representing player position.
* @param specIn double representing player's specialization factor.
* @param batIn double representing player's batting average.
* @param winIn int representing number of wins.
* @param lossIn int representing number of losses.
* @param eraIn double representing era average.
*/
   public ReliefPitcher(String numberIn, String nameIn, String posIn,
      double specIn, double batIn, int winIn, int lossIn, 
            double eraIn, int savesIn) {
      super(numberIn, nameIn, posIn, specIn, batIn, winIn, lossIn, eraIn);
      saves = savesIn;
   }

/**
* @return int representing saves.
*/
   public int getSaves() {
      return saves;
   }

/**
* @param saveIn int representing saves.
*/
   public void setSaves(int saveIn) {
      saves = saveIn;
   }

/**
* @return double represneting rating for the player.
*/
   public double rating() {
      return (BASE_RATING * pSpec * (1 / (1 + era)) 
               * ((wins - losses + saves) / 30.0));
   }

/**
* @return String representing wins, losses, saves, and era.
*/
   public String stats() {
      String stat = wins + " wins, " + losses + " losses, "
         + saves + " saves, " + era + " ERA";
      return stat;
   
   }
}