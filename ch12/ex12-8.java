// 예제 12-8 미리 정의된 TemporalAdjusters 사용하기

import static java.time.temporal.TemporalAdjusters.*;
LocalDate date1 = LocalDate.of(2014, 3, 18);    // 2014-03-18
LocalDate date2 = date1.with(nextOrSame(DayOfWeek.SUNDAY));    // 2014-03-23
LocalDate date3 = date2.with(lastDayOfMonth());    // 2014-03-31
