// 예제 12-2 TemporalField를 이용해서 LocalDate값 읽기

int year = date.get(ChronoField.YEAR);
int month = date.get(ChronoField.MONTH_OF_YEAR);
int day = date.get(ChronoField.DAY_OF_MONTH);


int year = date.getYear();
int month = date.getMonthValue();
int day = date.getDayOfMonth();
