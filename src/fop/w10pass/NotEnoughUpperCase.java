package fop.w10pass;

public class NotEnoughUpperCase extends NotEnoughLetter{
    public NotEnoughUpperCase(int should, int is) {
        super(should, is);
    }
    @Override
    public String toString()
    {
        return "Not enough upper case";
    }
}
