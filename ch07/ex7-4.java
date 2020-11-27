// 예제 7-4 반복형으로 단어 수를 세는 메서드

public int countWordsIteratively(String s) {
    int counter = 0;
    boolean lastSpace = true;
    for (char c : s.toCharArray()) {
	if (Character.isWhitespace(c)) {
	    lastSpace = true;
	} else {
	    if (lastSpace) counter++;
	    lastSpace = false;
	}
    }
    return counter;
}
