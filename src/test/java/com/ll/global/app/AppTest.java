import com.ll.standard.util.TestUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest{
    public static String run(final String cmd){
        final Scanner scanner = TestUtil.genScanner(cmd.stripIndent().trim() + "\n종료");

        final ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutToByteArray();

    }
    @Test
    @DisplayName("프로그램 시작 시 \"== 명언 앱 ==\" 출력")
    void t1() {
        final String out = run("");
        assertThat(out)
                .contains("== 명언 앱 ==");
    }
    @Test
    @DisplayName("종료")
    void t2() {
        final String out = run("");
    }
}