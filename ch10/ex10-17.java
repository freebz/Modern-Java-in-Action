// 예제 10-17 jOOQ DSL을 이용해 데이터베이스에서 책 선택

Class.forName("org.h2.Driver");
try (Connection c =
        getConnection("jdbc:h2:~/sql-goodies-with-mapping", "sa", "")) {
    DSL.using(c)
       .select(BOOK.AUTHOR, BOOK.TITLE)
       .where(BOOK.PUBLISHED_IN.eq(2016))
       .orderBy(BOOK.TITLE)
       .collect(groupingBy(
           r -> r.getValue(BOOK.AUTHOR),
	   LinkedHashMap::new,
	   mapping(r -> r.getValue(BOOK.TITLE), toList())))
	   .forEach((author, titles) ->
       System.out.println(author + " is author of " + titles));
}
