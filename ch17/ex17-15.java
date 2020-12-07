// 예제 17-15 Observable에 map을 이용해 화씨를 섭씨로 변환

public static Observable<TempInfo> getCelsiusTemperature(String town) {
    return getTemperature( town )
	    .map( temp -> new TempInfo( temp.getTown(),
			(temp.getTemp() - 32) * 5 / 9) );
}
