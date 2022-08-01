public class TestDice {

    @Test
    public void diceConstructorTest() {
        Integer expected = 2;
        Dice testDie = new Dice(expected);
        Integer actual = testDie.getNumberOfDiceBeingRolled();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diceRollTest() {
        Dice dieTest = new Dice(2);
        Integer expected = dieTest.rollDie();
        Assert.assertTrue((expected >= 2 && expected <= 12));
    }
}

