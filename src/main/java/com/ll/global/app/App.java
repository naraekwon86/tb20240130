package com.ll.global.app;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        System.out.print("명언 : ");
        System.out.print("작가 : ");

        System.out.println("1번 명언이 등록되었습니다.");
        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) break;
        }

        System.out.println("종료");
    }
}
