public class ParseStringToNumber {
    public static void main(String[] args) {
        String numberAsString = "2020";
        System.out.println("Number as String = " + numberAsString);
        //Convert String to primitive types

        int number = Integer.parseInt(numberAsString);//converts the string to integer
        System.out.println(number);

        numberAsString += 1;
        number+=1;

        System.out.println(numberAsString);//string concatenated
        System.out.println(number); // number incremented --> 2021
        double number1 = Double.parseDouble(numberAsString);
        System.out.println(number1);


    }
}
