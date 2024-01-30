package com.ll.global.app;

import com.ll.standard.util.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    @DisplayName("프로그램 시작시 \"== 명언 앱 ==\" 출력")
    void t1(){
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

        Scanner scanner = TestUtil.genScanner("""
                종료
                """.stripIndent());

        new App(scanner).run();

        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

        assertThat(out)
                .contains("== 명언 앱 ==");
    }

    @Test
    @DisplayName("종료")
    void t2(){
        Scanner scanner = TestUtil.genScanner("""
                종료
                """.stripIndent());
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

        String out = byteArrayOutputStream.toString().trim();
        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

    }

}
