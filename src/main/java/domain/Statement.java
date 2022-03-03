package domain;

import java.util.LinkedList;
import java.util.List;

public class Statement {
    private static final int TOP_OF_THE_LIST = 0;

	public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

    private List<StatementLine> statementLines = new LinkedList<StatementLine>();

    public void addLine(Operation operation, Amount currentBalance) {
		statementLines.add(TOP_OF_THE_LIST, new StatementLine(operation, currentBalance));
	}

    public void printToLines() {
		System.out.println(STATEMENT_HEADER);
		for (StatementLine statementLine : statementLines) {
			statementLine.printTo();
		}
	}
}
