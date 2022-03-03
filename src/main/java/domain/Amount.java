package domain;

public class Amount {
    private double value;

    public Amount(double value){
        this.value = value;
    }

    public static Amount amountOf(double value){
        return new Amount(value);
    }

    public Amount add(Amount sumValue){
        double currentValue = this.value + sumValue.value;
        return amountOf(currentValue);
    }

    public Amount negative() {
		return amountOf(-value);
	}

    public double valueOf(){
        return this.value;
    }
}
