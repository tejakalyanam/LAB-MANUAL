interface Playable {
    abstract void Play();
    
}
class FootBall implements Playable{
    public void Play(){
        System.out.println("Playing Football");
    }
}
class VolleyBall implements Playable{
    public void Play(){
        System.out.println("Playing VolleyBall");
    }
}
class BasketBall implements Playable{
    public void Play(){
        System.out.println("Playing BasketBall");
    }
}
class Games {
    public static void main(String[] args) {
        FootBall FB = new FootBall();
        VolleyBall VB = new VolleyBall();
        BasketBall BB = new BasketBall();
        FB.Play();
        System.out.println("    ");
        VB.Play();
        System.out.println("    ");
        BB.Play();
    }
}
