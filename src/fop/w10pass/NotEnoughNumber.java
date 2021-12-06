package fop.w10pass;

public class NotEnoughNumber extends NotEnoughException{
    public NotEnoughNumber(int should, int is) {
        super(should, is);
    }
    @Override
    public String toString()
    {
        return "Not enough number of digits";
    }
}
