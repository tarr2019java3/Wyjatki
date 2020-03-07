package pl.sd.wyjatki;

import pl.sd.wyjatki.exceptions.EmailException;

public  class  Main{

    public  static  void  main(String[]  args)  {

        User user = new User();

        user.setLogin("admin");
        try {
            user.setEmail("dks@.pldls");
        }catch (EmailException e){
            e.printStackTrace();
        }
      //  throw new EmailException("zły adres email");



    }
}

