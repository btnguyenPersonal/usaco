/*
ID: peterax1
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;

class gift1 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> currentMoney;
        ArrayList<String> currentMembers;
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int numGroupMembers = Integer.parseInt(st.nextToken());
        ArrayList<String> members = new ArrayList<String>();
        for(int i = 0; i < members.size(); i++) {
            st = new StringTokenizer(f.readLine());
            members.add(st.nextToken());
        }
        currentMembers = members;
        for(int i = 0; i < members.size(); i++) {
            st = new StringTokenizer(f.readLine());
            int money = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            ArrayList<String> receivers = new ArrayList<String>();
            for(int p = 0; p < people; p++) {
                st = new StringTokenizer(f.readLine());
                receivers.add(st.nextToken());
            }
            // TODO calculate everything with money and receivers
        }
        out.println();
        out.close();
    }
}
