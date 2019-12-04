/*Zadanie 2. System dologowaniaEtap
i) UżytkownikNapisz klasę do przechowywania danych użytkownika:
imieniai nazwiska, nazwy użytkownika oraz hasła.Wszystkie pola(zmienne instancji)
tej klasy powinny być prywatne. Klasa ta powinna mieć konstruktorprzyjmujący argumentyi
populujący na ich podstawie wszystkie jej pola. Klasa ta powinna mieć gettery
dla wszystkich jej pól.

 */

public class UserData {

    private String name;
    private String surname;
    private String username;
    private String password;

    public UserData(String name, String surname, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
