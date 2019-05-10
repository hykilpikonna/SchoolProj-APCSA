import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;

/**
 * The class {@code Jumper} represents a GridWorld actor that can move
 * straight forward 2 cells at max every time {@code act()} is called.
 * <p>
 * When {@code act()} is called:
 * A jumper would turn 45 degrees to the right when it is not able to
 * complete a full two cell move.
 * <p>
 * How to determine if it can complete the move:
 * It will complete the move, aka. "jumps over", if an instance of
 * {@code Rock} or {@code Flower} is present in the grid one cell
 * directly in front of it, but it will not complete the move if the
 * actor is not a {@code Rock} nor a {@code Flower}.
 * <p>
 * It will not complete the move if the destination cell two cells in
 * front of its current location is non-valid, or occupied by another
 * actor. Therefore it would not override any existing actors.
 * <p>
 * In any case where it cannot move, it turns 45 degrees to the right.
 *
 * <p>
 * 1a. If the location two cells in front of the Jumper is occupied,
 *      the Jumper would turn to the right 45 degrees.
 * 1b. If the location two cells in front of the Jumper is out of the grid
 *      the Jumper would turn to the right 45 degrees.
 * 1c. If the Jumper is facing the edge of the grid,
 *      the Jumper would turn to the right 45 degrees.
 * 1d. If the Jumper encounters another Actor,
 *      the Jumper would turn to the right 45 degrees.
 * 1e. If the Jumper encounters another Jumper,
 *      the Jumper would turn to the right 45 degrees.
 * 1f. The jumper would never override any other Actor present
 *      in the grid.
 * 2a. The Jumper class should extend the Actor class.
 * 2b. The Bug class is similar to the Jumper class.
 * 2c. Yes, there should be a constructor. This constructor
 *      does not need to have any parameters.
 * 2d. The act method should be overridden.
 * 2e. The turn method should be added.
 * 2f. In order to test this class, we would test all the different
 *      scenarios that were described in the previous section to make
 *      sure the Jumper works correctly in all circumstances.
 *
 * @author Hykilpikonna (Jack) (https://github.com/hykilpikonna)
 * @author Steve Rosario
 * @author Kyle Lopez
 *
 * @since 2019-02-27 15:23
 */
public class Jumper extends Actor
{
    /**
     * Construct a jumper instance. It initialize its color to RED to
     * distinguish its look from the default actor.
     */
    public Jumper()
    {
        super();
        setColor(Color.RED);
    }

    /**
     * Every time {@code act()} is called:
     * Jumps to the destination which is the location two cells forward
     * from its current location. Turns 45 degrees if the destination is
     * not valid on the grid, or if the destination is already occupied
     * by another actor, or if there is an actor in front of it that is
     * not a {@code Rock} nor a {@code Flower}.
     */
    @Override
    public void act()
    {
        // Get the grid, make sure it is not null.
        Grid<Actor> grid = getGrid();
        if (grid == null)
        {
            return;
        }

        // Get loc. 1 cell in front and destination 2 cells in front.
        Location front = getLocation().getAdjacentLocation(getDirection());
        Location destination = front.getAdjacentLocation(getDirection());

        // Turns if destination is not valid.
        if (!grid.isValid(destination))
        {
            turn();
            return;
        }

        // Turns if destination is occupied by another actor.
        if (grid.get(destination) != null)
        {
            turn();
            return;
        }

        // Turns if there is an actor in front of it that is not a
        //   {@code Rock} nor a {@code Flower}.
        Actor actorInFront = grid.get(front);
        if (actorInFront != null &&
                !(actorInFront instanceof Rock) &&
                !(actorInFront instanceof Flower))
        {
            turn();
            return;
        }


        // Jump to the destination
        moveTo(destination);
    }

    /**
     * Turns the jumper 45 degrees right without changing its location.
     */
    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }
}
