public class Main {

    public static void main(String[] args) {

        UserData userData1 = new UserData("Name1","Surname1","Username1","Password1");
        UserData userData2 = new UserData("Name2","Surname2","Username2","Password2");

        UserData[] userTab = new UserData[2];
        userTab[0] = userData1;
        userTab[1] = userData2;

        try {
            UserData data = new UserLogin(userTab).login();
            System.out.println("User is: " + data.getName() + " " + data.getSurname());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
