package fop.w10pass;

public class NotEnoughLetter extends NotEnoughException{
    public NotEnoughLetter(int should, int is) {
        super(should, is);
    }

    @Override
    public String toString()
    {
        return "You should have more letters in password";
    }
}