package com.insufficientlight.androidproject;

public class CombatEngine
    //Combat engine is the handler for combats, it calculates the math and spits the results back out to the user
{

    public static int armyLosses (int armyOneCP, int armyTwoCP, int armyOneTroops, int armyTwoTroops)
    {
        return 1;
    }

    public static int combatPowerCalculate (Class armyName)
    {
        return 1;
    }

    public static String battleLoop(Class armyOne, Class armyTwo)
    {
        int armyOneUnits = 0;
        int armyTwoUnits = 0;
        int armyOnePower = 0;
        int armyTwoPower = 0;
        int counter = 0;
        boolean retreat = false;

        armyOnePower = combatPowerCalculate(armyOne);
        armyTwoPower = combatPowerCalculate(armyTwo);

        armyOneUnits = armyOne.getTroopCount();
        armyTwoUnits = armyTwo.getTroopCount();

        while (!retreat)
        {
            if (counter >= 0)
            {
                //OfferRetreat
            }
            armyOneUnits = armyLosses(armyOnePower, armyTwoPower, armyOneUnits, armyTwoUnits);
            armyTwoUnits = armyLosses(armyOnePower, armyTwoPower, armyOneUnits, armyTwoUnits);
            if (armyOneUnits == 0)
            {
                return "yeet";
            }
            if (armyTwoUnits == 0)
            {
                return "yeetnot";
            }
        }
        return "France loses";
    }

}

