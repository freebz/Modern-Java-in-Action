// 예제 12-10 패턴으로 DateTimeFormatter 만들기

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate date1 = LocalDate.of(2014, 3, 18);
String fromattedDate = date1.format(formatter);
LocalDate date2 = LocalDate.parse(formattedDate, formatter);
