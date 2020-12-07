// 예제 17-16 한 개 이상 도시의 온도 보고를 합친다.

public static Observable<TempInfo> getCelsiusTemperatures(String... towns) {
    return Observable.merge(Arrays.stream(towns)
			          .map(TempObservable::getCelsiusTemperature)
			          .collect(toList()));
}
