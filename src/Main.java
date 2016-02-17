class IntroductoryExercises {
    public static void main(String[] args){
        System.out.println(getSingleStar());
        System.out.println(getNStars(8));
    }

    //Triangle Exercises

    public static String getSingleStar(){
        return "*";
    }

    public static String getNStars(int n){
        String s = "";
        for(int i = 0; i<n;i++){
            s += "*";
        }
        return s;
    }

    public static void printStarColumn(int n){
        for(int i = 0; i<n;i++){
            System.out.println("*");
        }
    }
}