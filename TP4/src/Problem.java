
package src ;

import java.util.List;

/**
 * 
 */
public class Problem
{
    private List<City> cities ;
    private City startCity ;
    
    public Problem ( List<City> cities , City startCity )
    {
        this.cities = cities ;
        this.startCity = startCity ;
    }
    /**
     * 
     * @return
     */
    public State initialState()
    {
        return new State(this.startCity);
    }    

    /**
     * 
     * @param state
     * @return
     */
    public boolean isGoalState(State state)
    {
        return ( state.visitedCities().size() == this.cities.size() ) ;
    }
    
    
}
