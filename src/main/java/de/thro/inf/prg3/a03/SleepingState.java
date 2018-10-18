package de.thro.inf.prg3.a03;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public class SleepingState extends State
{
    public SleepingState(Animal animal, int duration)
    {
        super(animal, duration);
    }

    State successor()
    {
        logger.info("Yoan... getting hungry!");
        return new HungryState(animal, animal.getAwake());
    }
}
