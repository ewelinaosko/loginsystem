import java.util.Scanner;

public class UserLogin {

    private UserData[] userInternal = new UserData[2];
    private int selectedUserIndex;
    private int selectedUserIndexLogin;

    public UserLogin(UserData[] user) throws IllegalAccessException {
        for (int j = 0; j < user.length; j++) {

            if (user[j] == null) {
                throw new IllegalAccessException("Not all data provided for the user!!");
            } else {
                userInternal[j]=user[j];
            }

        }
    }

    public void checkUser(String userExample) throws UnknownUserException {
        boolean flag = true;
        for (int j = 0; j < userInternal.length; j++) {
            if (!userExample.equals(userInternal[j].getUsername())) {
                flag = false;
            } else {
                flag = true;
                selectedUserIndexLogin = j;
                break;
            }
        }
        if (flag == false) {
            throw new UnknownUserException("\nUnknown User: " + userExample);
        }
    }

    public void checkPassword(String passwordExample) throws InvalidPasswordException {
        boolean flag = true;
        for (int j = 0; j < userInternal.length; j++) {
            if (!passwordExample.equals(userInternal[j].getPassword())) {
                flag = false;
            } else {
                flag = true;
                selectedUserIndex = j;
                break;
            }
        }
        if (flag == false || selectedUserIndex != selectedUserIndexLogin) {
            throw new InvalidPasswordException("\nInvalid Password:" + passwordExample);
        }
    }

    private void returnTable() {
        System.out.println("-- Available users for testing: --");
        for (int j = 0; j < userInternal.length; j++) {
            System.out.println(userInternal[j].getUsername() +", "+userInternal[j].getPassword());
        }
        System.out.println("----------------------------------\n");
    }


    public UserData login() {

        returnTable();

        String user;
        String password;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("UserName is: ");
            user = scanner.nextLine();
            checkUser(user);
            try {
                System.out.println("Password is: ");
                password = scanner.nextLine();
                checkPassword(password);
            } catch (InvalidPasswordException g) {
                throw new RuntimeException(g);
            }
        } catch (UnknownUserException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Login success!");
        return new UserData(userInternal[selectedUserIndex].getName(),
                userInternal[selectedUserIndex].getSurname(),
                userInternal[selectedUserIndex].getUsername(),
                userInternal[selectedUserIndex].getPassword());
    }
}


// Etap ii) System do LogowaniaNapisz klasę –system do logowania.
// Klasa ta powinna mieć tablicę zawierającą użytkowników systemu.

// Klasa ta powinna przyjmować jako argument konstruktora tablicę użytkownikówi
// najej podstawie tworzyć własną tablicę zawierającą tych samych użytkowników.

// Jeśli którykolwiek element otrzymanej tablicy byłby nieobecny ( == null),
// rzuć wewnątrz konstruktora IllegalArgumentException.

//    Klasa ta powinna mieć metodę login przyjmującą dwa argumenty:
//    nazwę użytkownika oraz hasło.
//    Metoda ta powinna zwracać obiekt użytkownika pod warunkiem,
//    że zarówno nazwa użytkownika oraz hasło się zgadzają
//    –w przeciwnym razie powinien zostać rzucony wyjąteksprawdzany.
//    W tym celu stwórz klasę LoginException z dwoma odmianami:
//    UnknownUserException oraz InvalidPasswordException.