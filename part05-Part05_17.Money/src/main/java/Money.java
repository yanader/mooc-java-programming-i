
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int oldEuros = this.euros;
        int newEuros = addition.euros;
        int oldCents = this.cents;
        int newCents = addition.cents;
        
        int euroInput = ((oldCents+newCents) / 100) + oldEuros + newEuros;
        int centsInput = (oldCents + newCents) % 100;
        
        Money newMoney = new Money(euroInput, centsInput);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        return(this.euros * 100) + this.cents < (compared.euros * 100) + compared.cents;
        }
    
    public Money minus(Money decreaser){
        int oldCents = (this.euros * 100) + this.cents;
        int decrease = (decreaser.euros * 100) + decreaser.cents;
        
        int totalCents = oldCents - decrease;
        
        int eurosInput;
        int centsInput;
        
        if(totalCents <= 0){
            eurosInput = 0;
            centsInput = 0;
        } else {
            eurosInput = totalCents / 100;
            centsInput = totalCents % 100;
        }
        Money newMoney = new Money(eurosInput, centsInput);
        return newMoney;
    }
    
}


