public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;

        System.out.println(result);

        int previousResult = result;

        System.out.println("previous result " + previousResult);

        result = result - 1;

        System.out.println("New Result is " + result);


        result = result * 10;

        System.out.println("New result again " + result);

        result = result / 5;

        System.out.println("Divided result " + result);

        result = result % 3;

        System.out.println("Remainder is " + result);

        //abbreviated operators --short hand notations
        //result = result +1;

        result++;
        System.out.println(result);

        result--;

        System.out.println(result);

        result+= 2;
        //result = result + 2;
        System.out.println(result);
    }
}
