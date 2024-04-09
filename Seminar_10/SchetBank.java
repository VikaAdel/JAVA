package Seminar_10;

public class SchetBank<Curr extends Valy> {
    private Curr curr;
    private int bal;

    public Curr GetCurr() {
        return curr;
    }

    public void SetCurr(Curr curr) {
        this.curr = curr;
    }

    public SchetBank(Curr curr, int bal) {
        this.curr = curr;
        this.bal = bal;
    }

    public SchetBank() {

    }

    public int GetBal() {
        return bal;
    }

    public int GetMany(int summ) {
        this.bal = this.bal - summ;
        return this.bal;
    }

    public int SetMany(int summ) {
        this.bal = this.bal + summ;
        return this.bal;
    }

}
