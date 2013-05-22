
package developer.encounterTable.dice;

import java.util.Random;

/**
 *
 * @author Richard Webb
 * 
 * implements the generic template for the Dice Interface, will use this as the main class
 * 
 */
public class DataDice implements Dice {
    
       Random numberGenerator = new Random();
       
        
       @Override
    public int D3() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(3);
        return randomNumber;
    }

       @Override
    public int D4() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(4);
        return randomNumber;
    }

       @Override
    public int D6() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(6);
        return randomNumber;
    }

       @Override
    public int D8() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(8);
        return randomNumber;
    }

       @Override
    public int D10() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(10);
        return randomNumber;
    }

       @Override
    public int D12() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(12);
        return randomNumber;
    }

       @Override
    public int D20() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(20);
        return randomNumber;
    }

       @Override
    public int D100() {
        int randomNumber;
        randomNumber = 1 + numberGenerator.nextInt(100);
        return randomNumber;
    }
    
}
