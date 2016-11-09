/*
 * 
 */

package baseballtest;

/**
 *
 * @author masea3439
 */
public class BaseballTeam extends Sports implements Stats{
    int totalHomeRuns;
    
    public BaseballTeam(int nP, String l, String tN, int tHR){
        super(nP,l,tN);  
        totalHomeRuns=tHR;
    }
    
    /**
     * This method calculates the overall points
     * POST: returns total
     */
    
    @Override
    public int overallPoints(){
        int total;
        total=gamesWon*2+gamesTied;
        return total;
    }
    
    /**
     * This method creates a string of information and returns it
     * POST: returns information 
     */
    
    public String info(){
        String information = "The "+teamName+" with the "+logo+" logo have "+numPlayers+" players and have gotten "+totalHomeRuns+" home runs!";
        return information;
    }
        
}
