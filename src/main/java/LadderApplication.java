import domain.*;
import dto.InputDto;
import ui.InputView;
import ui.ResultView;

public class LadderApplication {
    private static final String ALL_RESULTS = "all";

    public static void main(String[] args) {
        InputDto inputDto = InputView.askInput();
        LadderGame ladderGame = convertInputToLadderGame(inputDto);
        ResultView.printLadderGame(ladderGame);

        repeatUntilGivenAll(ladderGame);
    }

    private static LadderGame convertInputToLadderGame(final InputDto inputDto) {
        Participants participants = inputDto.getParticipants();
        Rewards rewards = inputDto.getRewards();
        int ladderHeight = inputDto.getLadderHeight();

        HeadAndTail headAndTail = HeadAndTail.init(participants, rewards);
        Ladder ladder = Ladder.init(ladderHeight, participants.size());

        return LadderGame.init(headAndTail, ladder);
    }

    private static void repeatUntilGivenAll(final LadderGame ladderGame) {
        String name;
        do{
            name = InputView.askResultOf();
            ResultView.printResultOf(name, ladderGame);
        } while ( !name.equals(ALL_RESULTS) );
    }
}
