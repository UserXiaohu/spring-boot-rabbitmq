package boot.spring.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试
 */
@Configuration
public class DirectExchangeConfig {
	@Bean
 	public DirectExchange directExchange(){
		return new DirectExchange("direct");
 	}
	
	@Bean
    public Queue directQueue1() {
		return new Queue("directqueue1");
    }
 	
 	@Bean
    public Queue directQueue2() {
		return new Queue("directqueue2");
    }
	
 	//3个binding将交换机和相应队列连起来
 	@Bean
 	public Binding bindingorange(){
		return BindingBuilder.bind(directQueue1()).to(directExchange()).with("orange");
 	}
 	
 	@Bean
 	public Binding bindingblack(){
		return BindingBuilder.bind(directQueue2()).to(directExchange()).with("black");
 	}
 	
 	@Bean
 	public Binding bindinggreen(){
		return BindingBuilder.bind(directQueue2()).to(directExchange()).with("green");
 	}
 	
 	
 	
}
