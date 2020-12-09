// A.1 어노테이션

@Before
public void setUp() {
    this.list = new ArrayList<>();
}

@Test
public void testAlgorithm() {
    ...
    assertEquals(5, list.size());
}
