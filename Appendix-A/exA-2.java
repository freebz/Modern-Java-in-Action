// A.1.1 어노테이션 반복

@interface Author { String name(); }

@Author(name="Raoul") @Author(name="Mario") @Author(name="Alan")
class Book{ }


@interface Author { String name(); }
@interface Authors {
    Author[] value();
}

@Authors(
    { @Author(name="Raoul"), @Author(name="Mario"), @Author(name="Alan") }
)
class Book{}	 


@Repeatable(Authors.class)
@interface Author { String name(); }
@interface Authors {
    Author[] value();
}

@Author(name="Raoul") @Author(name="Mario") @Author(name="Alan")
class Book{ }


public static void main(String[] args) {
    Author[] authors = Book.class.getAnnotationsByType(Author.class);
    Arrays.asList(authors).forEach(a -> { System.out.println(a.name()); });
}
