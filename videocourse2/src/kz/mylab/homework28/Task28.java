package kz.mylab.homework28;

public class Task28 {

    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.eat("myaso");

        try{
            tiger.drink("voda");
            try{
                tiger.drink("pivo");
            } catch (NeVodaException e){
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


class NeMyasoException extends RuntimeException {

    NeMyasoException(String msg){
        super(msg);
    }
    NeMyasoException(){}
}

class NeVodaException extends Exception {
    NeVodaException(String msg){
        super(msg);
    }
    NeVodaException(){}
}

class Tiger{
    public void eat (String food) {
        if(food.equals("myaso")) {
            System.out.println("Tigr est myaso");
        } else{
            throw new NeMyasoException("Tigr ne est "+food);
        }
    }

    public void drink(String liquid) throws NeVodaException {
        if(liquid.equals("voda")){
            System.out.println("Tigr pyet vodu");
        } else{
            throw new NeVodaException("Tigr ne pyet "+liquid);
        }
    }
}
