package de.thro.inf.prg3.a03;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public class DeathState extends State
{
    public DeathState(Animal animal)
    {
        super(animal, -1);
    }

    State successor()
    {
        return this;
    }
}
