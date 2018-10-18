package de.thro.inf.prg3.a03;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public class DigestingState extends State
{
    public DigestingState(Animal animal, int duration)
    {
        super(animal, duration);
    }

    State successor()
    {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(animal, animal.getAwake() - animal.getDigest());
    }
}
