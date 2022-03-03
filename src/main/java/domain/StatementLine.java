package domain;

public class StatementLine {
    private Operation operation;
    private Amount currentBalance;

    public StatementLine(Operation operation, Amount currentBalance) {
		this.operation = operation;
		this.currentBalance = currentBalance;
	}

    public void printTo(){
        this.operation.printLine(currentBalance);
    }
}
