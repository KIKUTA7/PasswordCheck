package fop.w10pass;

public class NotEnoughLowerCase extends NotEnoughLetter{
    public NotEnoughLowerCase(int should, int is) {
        super(should, is);
    }
    @Override
    public String toString()
    {
        return "Not enough lower case";
    }
}
