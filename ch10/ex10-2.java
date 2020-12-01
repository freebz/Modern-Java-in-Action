// 예제 10-2 함수형으로 로그 파일의 에러 행을 읽음

List<String> errors = Files.lines(Paths.get(fileName))
                           .filter(line -> line.startsWith("ERROR"))
                           .limit(40)
                           .collect(toList());
