// 예제 10-1 반복 형식으로 예제 로그 파일에서 에러 행을 읽는 코드

List<String> errors = new ArrayList<>();
int errorCount = 0;
BufferedReader bufferedReader
    = new BufferedReader(new FileReader(fileName));
String line = bufferedReader.readLine();
while (errorCount < 40 && line != null) {
    if (line.startsWith("ERROR")) {
	errors.add(line);
	errorCount++;
    }
    line = bufferedReader.readLine();
}
