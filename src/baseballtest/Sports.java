/*
 * 
 */

package baseballtest;

/**
 *
 * @author masea3439
 */
public abstract class Sports{
    int numPlayers;
    String logo;
    String teamName;
    int gamesWon;
    int gamesLost;
    int gamesTied;
    
    public Sports(int nP, String l, String tN){
        numPlayers=nP;
        logo = l;
        teamName = tN;
    }
    
    public void setGamesWon(int gW){
        gamesWon=gW;      
    }
    public void setGamesLost(int gL){
        gamesLost=gL;
    }
    public void setGamesTied(int gT){
        gamesTied=gT;
    }
}
