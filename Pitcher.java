 /**
* Class defines those with the pitcher trait.
*/
public class Pitcher extends SoftballPlayer {
   protected int wins = 0;
   protected int losses = 0;
   protected double era = 0.0; // earned run average

/**
* Serves as constructor for pitcher class.
* @param numberIn String representing player number.
* @param nameIn String representing player name.
* @param posIn String representing player position.
* @param specIn double representing player's specialization factor.
* @param batIn double representing player's batting average.
* @param winIn int representing number of wins.
* @param lossIn int representing number of losses.
* @param eraIn double representing era average.
*/
   public Pitcher(String numberIn, String nameIn, String posIn, 
      double specIn, double batIn, int winIn, int lossIn, double eraIn) {
      super(numberIn, nameIn, posIn, specIn, batIn);
      wins = winIn;
      losses = lossIn;
      era = eraIn;
   }

/**
* @return int representing wins.
*/
   public int getWins() {
      return wins;
   }

/**
* @param winsIn int representing inputed wins.
*/
   public void setWins(int winsIn) {
      wins = winsIn;
   }

/**
* @return int representing losses.
*/
   public int getLosses() {
      return losses;
   }

/**
* @param lossesIn int representing inputed losses.
*/
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }

/**
* @return double representing era.
*/
   public double getEra() {
      return era;
   }

/**
* @param eravgIn double representing new era.
*/
   public void setEra(double eravgIn) {
      era = eravgIn;
   }

/**
* @return double representing the rating of the player.
*/
   public double rating() {
      return (BASE_RATING * pSpec * (1 / (1 + era)) * ((wins - losses) / 25.0));
   }
   
/**
* @return String representing wins, losses and era.
*/
   public String stats() {
      String stat = wins + " wins, " + losses + " losses, "
         + era + " ERA";
      return stat;
   }
   
}