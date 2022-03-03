package domain;

import static domain.Amount.amountOf;
import java.time.LocalDate;

public class Account {

    private Statement statement;
    private Amount balance = amountOf(0);

    public Account(Statement statement) {
		this.statement = statement;
	}

    public void deposit(Amount value, LocalDate date) {
        transaction(value, date);
    }

    public void withdraw(Amount value, LocalDate date){
        transaction(value.negative(), date);
    }

    public void printStatements() {
        statement.printToLines();
    }

    public void transaction(Amount value, LocalDate date){
        Operation operation = new Operation(value, date);
        Amount balanceAmount = operation.balanceAfterOperation(balance);
        balance = balanceAmount;
        statement.addLine(operation, balance);
    }
}
