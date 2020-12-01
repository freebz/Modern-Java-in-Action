// 예제 10-19 스프링 통합 DSL을 이용해 스프링 통합 흐름 설정하기

@Configuration
@EnableIntegration
public class MyConfiguration {

    @Bean
    public MessageSource<?> integerMessageSource() {
	MethodInvokingMessageSource source =
	    new MethodInvokingMessageSource();
	source.setObject(new AtomicInteger());
	source.setMethodName("getAndIncreent");
	return source;
    }

    @Bean
    public DirectChannel inputChannel() {
	return new DirectChannel();
    }

    @Bean
    public IntegrationFlow myFlow() {
	return IntegrationFlows
	    .from(this.integerMessageSource(),
		c -> c.poller(Pollers.fixedRate(10)))
	    .channel(this.inputChannel())
	    .filter((Integer p) -> p % 2 == 0)
	    .transform(Object::toString)
	    channel(MessageChannels.queue("queueChannel"))
	    .get();
    }
}
