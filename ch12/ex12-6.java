// 예제 12-6 절대적인 방식으로 LocalDate의 속성 바꾸기

LocalDate date1 = LocalDate.of(2017, 9, 21);  // 2017-09-21
LocalDate date2 = date1.withYear(2011);	      // 2011-09-21
LocalDate date3 = date2.withDayOfMonth(25);   // 2011-09-25
LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 2);  // 2011-02-25
