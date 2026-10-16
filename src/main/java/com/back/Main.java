package com.back;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("== 명언앱 ==");

        Scanner sc = new Scanner(System.in);

        int x = 1;

        while (true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();
                System.out.println(x++ +  "번 명언이 등록되었습니다.");
            }
        }
    }
}
