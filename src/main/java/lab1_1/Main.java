package lab1_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final String AUTHOR_NAME = "Ovchynnikov Kostiantyn";

    public static HashMap<String, View> ROUTES= new HashMap<String, View>( );

    // I know that not all frameworks/libs use this type of routing setup
    // but still, that's first lab :)
    static {
        ROUTES.put("/login", new LoginView());
        ROUTES.put("/logout", new LogoutView());
    }

    public static void main(String[] args) {
        System.out.println("Hello, this is " + AUTHOR_NAME + " lab1");
        System.out.println(
                "Please enter view address: \n" + "Currently supported views - ");
        ROUTES.forEach((String route, View view) -> System.out.println(route + " " + view));

        Scanner reader = new Scanner(System.in);
        while (true) {
            String route = reader.nextLine();
            View view = ROUTES.get(route);
            if (view != null) {
                String response = view.handleRequest();
                System.out.println(response);
            } else {
                System.out.println("This view is  not supported");
            }
        }

    }
}
