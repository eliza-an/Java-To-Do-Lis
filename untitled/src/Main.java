import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean restart(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Would you like to continue? y/n");
        String output= scanner.nextLine();
        if (Objects.equals(output,"y")){
            return true;
        } else if(Objects.equals(output,"n")) {
            return false;
        }else{
            System.out.println("Unrecognised response");
            return restart();
        }

    }

    public static void func(List <String> list){
        Scanner scanner= new Scanner(System.in);
        boolean running=true;
        while( Objects.equals(running, true)) {
            System.out.println("Welcome to the To-Do list app");
            System.out.println("Please select a number. Would you like to: 1.See your List, 2.Add to list or 3. Remove from list?");
            String Option = scanner.nextLine();
            if (Objects.equals(Option, "1")) {
                System.out.println(list);
                running =restart();
            } else if (Objects.equals(Option, "2")) {
                System.out.println("Please enter an item you want to add");
                String AddItem = scanner.nextLine();
                list.add(AddItem);
                System.out.println(list);
                running =restart();
            } else if (Objects.equals(Option, "3")) {
                System.out.println("Please enter an item you want to remove");
                String RemoveItem = scanner.nextLine();
                if (list.contains(RemoveItem)) {
                    list.remove(RemoveItem);
                    running =restart();
                } else {
                    System.out.println("Could not find that item, taking you back to the main menu");
                    running =restart();
                }
            }
        }
    }
    public static void main(String[] args) {
        List <String> ToDo= new ArrayList<>();
        func(ToDo);
    }
}
