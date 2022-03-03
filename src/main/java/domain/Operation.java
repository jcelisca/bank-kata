package domain;

import java.time.LocalDate;

public class Operation {
    private Amount value;
    private LocalDate date;
    private static final String EMPTY_VALUE = "          ";

    public Operation(Amount value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public Amount balanceAfterOperation(Amount currentBalance) {
		return currentBalance.add(value);
	}

    public void printLine(Amount currentBalance){
        System.out.println(date+addValue()+addCurrentBalance(currentBalance));
    }

    private String addValue(){
        if(value.valueOf() > 0){
            double element = value.valueOf();
            String valor = " |  " + Double.toString(element) + "  |"+ EMPTY_VALUE + "| " ;
            return valor;
        }
        double element = value.valueOf();
        String valor = " |"+ EMPTY_VALUE + "| " + Double.toString(element) + "  | ";
        return valor;
    }

    private String addCurrentBalance(Amount currentBalance){
        double currentvalue = currentBalance.valueOf();
        return Double.toString(currentvalue);
    }

}
