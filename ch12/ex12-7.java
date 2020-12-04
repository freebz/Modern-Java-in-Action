// 예제 12-7 상대적인 방식으로 LocalDate 속성 바꾸기

LocalDate date1 = LocalDate.of(2017, 9, 21);  // 2017-09-21
LocalDate date2 = date1.plusWeeks(1);	      // 2017-09-28
LocalDate date3 = date2.minusYears(6);	      // 2011-09-28
LocalDate date4 = date3.plus(6, ChronoUnit.MONTHS);  // 2012-03-28
