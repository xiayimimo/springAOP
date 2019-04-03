package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ContestantIntroducer {
	
	@DeclareParents(value = "aop.Performer+", defaultImpl = OutstandingContestant.class)
	public static Contestant contestant;
}
