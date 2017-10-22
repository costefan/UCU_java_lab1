package lab1_1;

public class LoginView implements View {
    @Override
    public String handleRequest() {
        System.out.println("Handling request ...");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        return this.toString() + " fake response";
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
