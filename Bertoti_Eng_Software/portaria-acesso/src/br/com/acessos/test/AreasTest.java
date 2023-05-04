package br.com.acessos.test;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.acessos.areas.Areas;
import br.com.acessos.user.JobRole;
import br.com.acessos.user.User;

class AreasTest {
	
	private User user;
	
	
	public void initialize() {
		User user = new User("Name",new BigDecimal("1000"),JobRole.ANALYST.getPermissions());
	}

	@Test
	void test(){
		initialize();
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		
		assertEquals(true,check);
	}

}
