package greenflies;

/**
 *
 * @author Fredrick Oluoch
 */

public class GreenFlies{

    /**
     * @param args the command line arguments
     */
    /**
     * Question 1: The Greenfly Problem
        Write a Java program to solve the following problem. 
        Greenfly can reproduce asexually. After one week of life a lone female can produce eight offspring a day. 
        Starting at the beginning of day 1 with a single mature female, how many greenfly could there be by the end of day 28? It may be assumed that:
        :There are no deaths
        :All offspring are females
        Note that at the end of day 1 there will be 9 greenfly (original + 8 offspring). 
        At the end of day 7 there will be 57 greenfly (original + 8 × 7 offspring). 
        At the end of day 8 there will be 129 greenfly (original + 8 × 8 offspring + 64 offspring from the daughters produced on day 1).
        * 
        * Day (1-7) = NumberOfParent(s) + (8 offspring * NumberofDay(s))
        * Day 8 = NumberOfParent(s) + (8 offspring * NumberofDay(s))
        * Day 1 = 1+(1*8) = 9
        * Day 2 = 1+(2*8) = 17
        * Day 3 = 1+(3*8) =  25
        * Day 4 = 1+(4*8) = 33
        * Day 7 = 1+(7*8) = 57
        * Day 8 = 9*8+57 = ((1+(1*8)) * 8) + 57 = 129
        * Day 9 = 17*8+129 =((1+(2*8)) * 8) + 129 = 265
        * 
     * @param 
     */
    
    public static int calculateParents(int day){
        
        int numberOfWeeks = (day - 1)/7;
        
        //System.out.println("Number of Weeks "+numberOfWeeks);
        
        if (day <= 7){
            
            return 1;
            
        }else
        
        {                
            int numberOfDaysForTheWeek = 7*numberOfWeeks;   
            
            int v = (int) (Math.pow(8, numberOfWeeks) * (day-numberOfDaysForTheWeek)); 
            
                        
            return (calculateParents(numberOfDaysForTheWeek)+ v);
        }
        
    }
    
    public static int calculateOffsprings(int day){
        
        return calculateParents(day)*8;
    }
    
    public static int calculateTotal(int day){
        
        int totalParents = calculateParents(day);
        int matureOffSprings = 0;
        int immatureOffSprings = 0;
        
        for (int i = 1; i < day+1; i++){
            
            if(i>7)
                matureOffSprings += calculateOffsprings(i-7);  
                immatureOffSprings += calculateParents(i)*8;            
        }
        
                int cummulativeOffSprings = immatureOffSprings - matureOffSprings;
                int totalGreenFlies = cummulativeOffSprings + totalParents;
        
        return totalGreenFlies;
    }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 30; i++) {
            
            System.out.println("Total number of Greenflies on day "+(i+1)+" is "+calculateTotal(i));            
        }
        
    }
    
}