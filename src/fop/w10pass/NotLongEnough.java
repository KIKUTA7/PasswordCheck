package fop.w10pass;

public class NotLongEnough extends NotEnoughException{
    public NotLongEnough(int should, int is) {
        super(should, is);
    }
    @Override
    public String toString()
    {
        return "You should have bigger password";
    }
}
