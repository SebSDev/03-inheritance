package de.thro.inf.prg3.a03;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public class HungryState extends State
{
    public HungryState(Animal animal, int duration)
    {
        super(animal, duration);
    }

    State successor()
    {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState(animal);
    }

    State feed()
    {
        logger.info("You feed the cat...");
        return new DigestingState(animal, animal.getDigest());
    }
}
