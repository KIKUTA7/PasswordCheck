package fop.w10pass;

public class NotEnoughException extends Exception{
    private int should;
    private final int is;
    public NotEnoughException (int should, int is)
    {
        this.should = should;
        this.is = is;
    }

    @Override
    public String toString() {
        return "you should have bigger password";
    }
}
