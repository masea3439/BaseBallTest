/*
 * 
 */

package baseballtest;

/**
 *
 * @author masea3439
 */
public class BaseballTest {

    /**
     * This method creates the duck baseball team
     * PRE: args the command line arguments
     * POST: prints info about the duck team
     */
    public static void main(String[] args) {
        BaseballTeam ducks = new BaseballTeam(23,"giant duck","the great ducks",7);
        ducks.setGamesWon(7);
        ducks.setGamesLost(5);
        ducks.setGamesTied(2);
        System.out.println(""+ducks.info());
        System.out.println("They have "+ducks.overallPoints()+" points");
    }
    
}
