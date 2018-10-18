package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Sebastian Schäffler
 * created at 17.10.2018
 * description:
 */
public abstract class State
{
    protected final Animal animal;
    protected static final Logger logger = LogManager.getLogger();
    protected int t = 0;
    private int duration;

    public State(Animal animal, int duration)
    {
        this.animal = animal;
        this.duration = duration;
    }

    final State tick()
    {
        logger.info("tick()");

        t++;

        if (t < duration || duration < 0)
        {
            return this;
        }

        return this.successor();
    }

    abstract State successor();
}
