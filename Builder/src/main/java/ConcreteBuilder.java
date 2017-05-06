/**
 * Created by nirjal on 4/22/2017.
 */
public class  {

    private String a;
    private String b;


    public  addA(String a) {
        this.a = a;
        return this;
    }

    public  addB(String b) {
        this.b = b;
        return this;
    }

    public  build () throws  Exception {
        if(validate()) {
            System.out.println("All set the build is ready, here is your product "+a+" "+b);
            return this;
        }
        else {
            throw new Exception("All the variables are not set");
        }
    }

    private boolean validate() {
        if (a != null && b!= null) {
            return true;
        }
        return false;
    }

}
