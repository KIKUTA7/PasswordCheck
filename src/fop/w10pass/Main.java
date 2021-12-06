package fop.w10pass;

public class Main {
    public static void main(String[] args)  {
        String pwd = "Beqa475638";
        char[] ill = new char[]{'a','b','!'};
        Password pass = new Password(1,4,2,3,10,ill);
     try{   pass.checkFormat(pwd);}
     catch (IllegalCharException e){
          e.printStackTrace();
     }
     catch (NotEnoughException e )
     {
         e.printStackTrace();
     }
     /*
     catch(Exception e)
     {
     e.printStackTrace();
     }

     es shegedzlo dagewera im 2 is nacvlad imitoro Exception is shvilebi arian.
      */
    }
}
