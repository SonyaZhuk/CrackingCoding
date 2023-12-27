package leetcode.easy.string;

/**
 * {@link <a href="https://leetcode.com/problems/goal-parser-interpretation/">1678. Goal Parser Interpretation</a>}.
 */
public class GoalParserInterpretation {

    //"G()(al)"
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
