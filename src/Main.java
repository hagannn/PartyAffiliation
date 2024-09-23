import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char getParty(String prompt) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        System.out.print(prompt);
        char party = br.readLine().charAt(0);
        party = Character.toUpperCase(party);

        return party;

    }

    static void getReport(char party) {
        if (party == 'D') {
            System.out.println("You get a Democratic Donkey");
        } else if (party == 'R') {
            System.out.println("You get a Republican Elephant");
        } else if (party == 'I') {
            System.out.println("You are Independent");
        } else {
            System.out.println("You are other");
        }
    }

    public static void main(String[] args) throws IOException {
        char party = getParty("Enter your party (D/R/I): ");
        getReport(party);
    }
}
