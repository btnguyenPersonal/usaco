/*
ID: peterax1
LANG: JAVA
TASK: ride
*/
 
import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        String s1 = st.nextToken();
        st = new StringTokenizer(f.readLine());
        String s2 = st.nextToken();
        out.println(goWithUFO(s1) == goWithUFO(s2) ? "GO" : "STAY");
        out.close();
    }

    public static int goWithUFO(String input) {
        int sum = 1;
        for (int i = 0; i < input.length(); i++) {
            switch (input.substring(i, i+1)) {
                case "A":
                    sum *= 1;
                    break;
                case "B":
                    sum *= 2;
                    break;
                case "C":
                    sum *= 3;
                    break;
                case "D":
                    sum *= 4;
                    break;
                case "E":
                    sum *= 5;
                    break;
                case "F":
                    sum *= 6;
                    break;
                case "G":
                    sum *= 7;
                    break;
                case "H":
                    sum *= 8;
                    break;
                case "I":
                    sum *= 9;
                    break;
                case "J":
                    sum *= 10;
                    break;
                case "K":
                    sum *= 11;
                    break;
                case "L":
                    sum *= 12;
                    break;
                case "M":
                    sum *= 13;
                    break;
                case "N":
                    sum *= 14;
                    break;
                case "O":
                    sum *= 15;
                    break;
                case "P":
                    sum *= 16;
                    break;
                case "Q":
                    sum *= 17;
                    break;
                case "R":
                    sum *= 18;
                    break;
                case "S":
                    sum *= 19;
                    break;
                case "T":
                    sum *= 20;
                    break;
                case "U":
                    sum *= 21;
                    break;
                case "V":
                    sum *= 22;
                    break;
                case "W":
                    sum *= 23;
                    break;
                case "X":
                    sum *= 24;
                    break;
                case "Y":
                    sum *= 25;
                    break;
                case "Z":
                    sum *= 26;
                    break;
                default:
                    break;
            }
        }
        return sum % 47;
    }
}
