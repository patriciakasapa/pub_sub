package turntabl.io.pub_sub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class PubSubApplication {

	public static final Logger logger = LoggerFactory.getLogger(PubSubApplication.class);

	/*@RequestMapping("/")
    public String index(){
	    logger.trace("Loading logged files");
	    logger.debug("Loading");
	    logger.info("Please note");
	    logger.warn("Exit");
	    logger.error("No customer with this id exist");

	    return "Logs seen";
    }*/

	public static void main(String[] args) {
		SpringApplication.run(PubSubApplication.class, args);

		logger.info("New customer added");
		logger.warn("Customer deleted");
		logger.error("Customer not found");
	}





























	@Bean
	Receiver receiver(CountDownLatch latch) {
		return new Receiver(latch);
	}

	@Bean
	CountDownLatch latch() {
		return new CountDownLatch(1);
	}







}
