package com.back;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("== 명언 앱 ==");

        Scanner sc = new Scanner(System.in);

        int count = 0;

        String[] contents = new String[10];
        String[] authors = new String[10];

        while (true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                if (count >= contents.length) {
                    System.out.println("더 이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("명언 : ");
                String content = sc.nextLine();

                System.out.print("작가 : ");
                String author = sc.nextLine();

                contents[count] = content;
                authors[count] = author;

                System.out.println(++count +  "번 명언이 등록되었습니다.");
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");

                for (int i = count - 1; i >= 0; i--) {
                    System.out.println( (i + 1) + " / " + authors[i] + " / " + contents[i]);
                }
            }
        }
    }
}
