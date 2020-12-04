// 예제 12-9 TemporalAdjuster 인터페이스

@FunctionInterface
public interface TemporalAdjuster {
    Temporal adjustInto(Temporal temporal);
}
