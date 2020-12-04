// 예제 12-1 LocalDate 만들고 값 읽기

LocalDate date = LocalDate.of(2017, 9, 21);  // 2017-09-21
int year = date.getYear();		     // 2017
Month month = date.getMonth();		     // SEPTEMBER
int day = date.getDayOfMonth();		     // 21
DayOfWeek dow = date.getDayOfWeek();	     // THURSDAY
int len = date.lengthOfMonth();		     // 31 (3월의 일 수)
boolean leap = date.isLeapYear();	     // false (윤년이 아님)
