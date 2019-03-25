package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    //ADD_ENUMERATIONS_HERE;

    ROCK,
    PAPER,
    SCISSOR;

    private RockPaperScissorHandSign beats;

    static {

        PAPER.beats = ROCK;
        ROCK.beats = SCISSOR;
        SCISSOR.beats = PAPER;
    }

    private RockPaperScissorHandSign wins;

    static {

        PAPER.wins = SCISSOR;
        ROCK.wins = PAPER;
        SCISSOR.wins = ROCK;
    }


    public RockPaperScissorHandSign getWinner() {
        return wins;
    }

    public RockPaperScissorHandSign getLoser() {
        return beats;
    }
}
