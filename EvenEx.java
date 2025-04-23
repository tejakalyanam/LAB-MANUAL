class EvenException {
    public static void checknumber(int number) throws Exception {
        if (number %2 == 0){
            throw new Exception("Even number isn't allowed :" + number);
        } else {
            System.out.println("Valid Odd number is allowed:" + number);
        }
    }
}
class EvenEx {
    public static void main(String[] args){
        try {
            EvenException.checknumber(6);
        } catch (Exception  e){
            System.out.println("Exception caught:" + e.getMessage());
        }
    }
}