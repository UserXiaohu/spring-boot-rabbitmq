package boot.spring.rabbitMQ.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import boot.spring.po.Mail;



@Component
public class DirectListener1 {
	@RabbitListener(queues = "directqueue1")
	public void displayMail(Mail mail) throws Exception {
		//编写对应的业务代码！！！！！！！
		System.out.println("directqueue1队列监听器1号收到消息"+mail.toString());
	}
}
