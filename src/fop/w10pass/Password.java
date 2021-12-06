package fop.w10pass;

public class Password extends Exception{
    private final int nrUpperShould, nrLowerShould, nrSpecialShould,
            nrNumbersShould, lengthShould;
    private final char[] illegalChars;

    private static boolean matchesIllegalCharacter(char[] illegalChars,
            char c) {
        for (int i = 0; i < illegalChars.length; i++)
            if (c == illegalChars[i])
                return true;
        return false;
    }

    public Password(int nrUpperShould, int nrLowerShould, int nrSpecialShould,
            int nrNumbersShould, int lengthShould, char[] illegalChars) {
        this.nrUpperShould = nrUpperShould;
        this.nrLowerShould = nrLowerShould;
        this.nrSpecialShould = nrSpecialShould;
        this.nrNumbersShould = nrNumbersShould;
        this.lengthShould = lengthShould;
        this.illegalChars = illegalChars;
    }

    public void checkFormat(String pwd) throws IllegalCharException,NotEnoughException{
        int up=0,lo=0,spe=0,num=0,len=pwd.length();
        for (int i=0;i<pwd.length();i++)
        {
            if(matchesIllegalCharacter(illegalChars,pwd.charAt(i))) throw new IllegalCharException(pwd.charAt(i));
            if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9') num++;
            else if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z') up++;
            else if(pwd.charAt(i)>='a' && pwd.charAt(i)<='z') lo++;
            else spe++;}
        if(up<nrUpperShould ) throw new NotEnoughUpperCase(nrUpperShould,up);
        if(lo<nrLowerShould) throw new NotEnoughUpperCase(nrLowerShould,lo);
        if(spe < nrSpecialShould) throw new NotEnoughUpperCase(nrSpecialShould,spe);
        if(len < lengthShould ) throw new NotEnoughUpperCase(lengthShould,len);
        if(num < nrNumbersShould ) throw new NotEnoughUpperCase(nrNumbersShould,num);


    }
}
