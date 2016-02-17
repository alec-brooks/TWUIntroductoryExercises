import java.util.ArrayList;
import java.util.List;

class IntroductoryExercises {
    public static void main(String[] args){
        //Triangle Exercises
        System.out.println("Easiest exercise ever");
        System.out.println(getNChars(1, '*'));
        System.out.println("Draw a horizontal line");
        System.out.println(getNChars(8, '*'));
        System.out.println("Draw a vertical line");
        printStarColumn(3);
        System.out.println("Draw a right triangle");
        printRightTriangle(3);
        //Diamond Exercise
        System.out.println("Isosceles Triangle");
        printIsoTri(4);
        System.out.println("Diamond");
        printDiamond(3);
        System.out.println("Diamond Name");
        printDiamondName(5, "Alec");

        //FizzBuzz
        System.out.println("Fizz Buzz");
        fizzBuzz();

        //Prime Factors
        System.out.println("Prime Factorisation");
        System.out.println(generate(5959));
    }

    //Triangle Exercises
    public static String getNChars(int n, char c){
        String s = "";
        for(int i = 0; i<n;i++){
            s += c;
        }
        return s;
    }

    public static void printStarColumn(int n){
        for(int i = 0; i<n;i++){
            System.out.println("*");
        }
    }

    public static void printRightTriangle(int n){
        for(int i = 0; i <n; i++){
            System.out.println(getNChars(i+1, '*'));
        }
    }

    //Diamond Exercises

    public static void printIsoTri(int n){
        int spaceNum = n;
        int starNum = 0;
        String s;
        for(int i = 0; i < n; i++){
            //Initial star will occupy nth column, so spaceNum starts at n-1
            spaceNum -= 1;
            //Stars will start at one, and add two either side for each row
            starNum = 1 + i * 2;
            s = "";
            s += getNChars(spaceNum, ' ');
            s += getNChars(starNum, '*');

            System.out.println(s);
        }
    }

    public static void printDiamond(int n){
        int spaceNum = 0;
        int starNum = n;
        String s;
        //First part of diamond is a triangle
        printIsoTri(n);
        //Second half
        for(int i = n-1; i > 0; i--){
            spaceNum +=1;
            starNum = (i * 2) - 1;

            s = "";
            s += getNChars(spaceNum, ' ');
            s += getNChars(starNum, '*');

            System.out.println(s);
        }
    }
    public static void printDiamondName(int n, String name){
        int spaceNum = n;
        int starNum = 0;
        String s;
        //First half
        for(int i = 0; i < n-1; i++){
            //Initial star will occupy nth column, so spaceNum starts at n-1
            spaceNum -= 1;
            //Stars will start at one, and add two either side for each row
            starNum = 1 + i * 2;
            s = "";
            s += getNChars(spaceNum, ' ');
            s += getNChars(starNum, '*');

            System.out.println(s);
        }
        System.out.println(name);
        spaceNum = 0;
        //Second half
        for(int i = n-1; i > 0; i--){
            spaceNum +=1;
            starNum = (i * 2) - 1;

            s = "";
            s += getNChars(spaceNum, ' ');
            s += getNChars(starNum, '*');
            System.out.println(s);
        }
    }

    //FizzBuzz
    public static void fizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if(i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }

    //Prime Factors
    //Uses Trial Division method of factorization
    public static List<Integer> generate(int n){
        List<Integer> factors = new ArrayList<Integer>();
        //Start divisor at first prime
        int divisor = 2;

        while(n > 1){
            //Divide n by divisor until no longer divisible by it
            //This ensures that only primes are added to factors
            while(n % divisor == 0){
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}