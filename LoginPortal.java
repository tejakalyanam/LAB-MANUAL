interface LoginSystem {

    boolean Login(String ID, int pass);
}

class CollegePortal implements LoginSystem {
    public boolean Login(String ID, int pass) {
        if ((ID=="TEJA") && (pass==24138)){
            System.out.println("Login Successful..!");
            return true;
        }else {
            System.out.println("Invalid ID or Password");
            return false;
        }
    }
}
class LoginPortal {
    public static void main(String[] args) {
        CollegePortal CP = new CollegePortal();
        CP.Login("TEJA", 24138);
    }
}