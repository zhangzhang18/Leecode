package javatest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangchunmeng <zhangchunmeng@kuaishou.com>
 * Created on 2023/2/9
 */
public class BitTest {
    public static final long DAY_SECOND_MS = 24 * 3600 * 1000L;
    public static void main(String[] args) {
        System.out.println("1 << 1 =" + (1 << 1));
        System.out.println("1 << 2 =" + (1 << 2));
        System.out.println("1 << 3 =" + (1 << 3));
        System.out.println("1 << 4 =" + (1 << 4));
        System.out.println("1 << 5 =" + (1 << 5));
        System.out.println("1 << 9 =" + (1 << 9));
        System.out.println( (1 << 1)|(1 << 2)|(1 << 3)|(1 << 4) -(1 << 4) );

        System.out.println(minusDaysToLong(-1));

        BigDecimal multiple =
                BigDecimal.valueOf(150).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
        System.out.println(multiple.multiply(BigDecimal.valueOf(10)));

        System.out.println(Arrays.toString(new String("rrdul_8080").getBytes()));
    }

    public static Long minusDaysToLong(int subDay) {
        long startTime = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0)
                .withNano(0).toInstant(ZoneOffset.of("+8")).toEpochMilli() - subDay * DAY_SECOND_MS;
        return startTime;
    }
}


