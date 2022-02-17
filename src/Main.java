
import java.lang.*;
public class Main {
    public static void main(String[] args){
        String Inn = "Евгений 125";
        String[] New_Inn = Inn.split(" ");
        String name = New_Inn[0];
        int numbers = Integer.parseInt(New_Inn[1]);
        int sum = 0;
        while(numbers != 0){
            sum += (numbers % 10);
            numbers/=10;
        }
        String sum_string;
        switch(sum){
            case 1:
                sum_string = "один";
                break;
            case 2:
                sum_string = "два";
                break;
            case 3:
                sum_string = "три";
                break;
            case 4:
                sum_string = "четыре";
                break;
            case 5:
                sum_string = "пять";
                break;
            case 6:
                sum_string = "шесть";
                break;
            case 7:
                sum_string = "семь";
                break;
            case 8:
                sum_string = "восемь";
                break;
            case 9:
                sum_string = "девять";
                break;
            default: sum_string = "ноль";
        }
        Greetings(name, sum_string);
    }
    private static void Greetings(String name, String sum_string){
        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s ",name, sum_string);
    }

}
