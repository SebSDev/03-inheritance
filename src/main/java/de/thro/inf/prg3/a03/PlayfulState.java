package de.thro.inf.prg3.a03;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public class PlayfulState extends State
{
    public PlayfulState(Animal animal, int duration)
    {
        super(animal, duration);
    }

    State successor()
    {
        logger.info("Yoan... getting tired!");
        return new SleepingState(animal, animal.getSleep());
    }
}
