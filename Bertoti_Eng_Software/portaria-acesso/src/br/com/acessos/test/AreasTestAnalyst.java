package br.com.acessos.test;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.acessos.areas.Areas;
import br.com.acessos.user.JobRole;
import br.com.acessos.user.User;

class AreasTestAnalyst {
	
	private User user;
	
	public void initialize(JobRole job) {
		this.user = new User("Name",new BigDecimal("1000"),job.getPermissions());
	}

	@Test
	void checkIfPermissionOfAcessIsTrueForAnalystOnDesk(){
		initialize(JobRole.ANALYST);
		boolean check =  Areas.DESK.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForAnalystOnRestaurant(){
		initialize(JobRole.ANALYST);
		boolean check =  Areas.RESTAURANT.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForAnalystOnWarehouse(){
		initialize(JobRole.ANALYST);
		boolean check =  Areas.WAREHOUSE.aproveAcess(user);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForAnalystOnOperations(){
		initialize(JobRole.ANALYST);
		boolean check =  Areas.OPERATIONS.aproveAcess(user);
		assertEquals(false,check);
	}

	@Test
	void checkIfPermissionOfAcessIsFalseForManagerOnDesk(){
		initialize(JobRole.MANAGER);
		boolean check = Areas.DESK.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForManagerOnRestaurant(){
		initialize(JobRole.MANAGER);
		boolean check =  Areas.RESTAURANT.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForManagerOnWarehouse(){
		initialize(JobRole.MANAGER);
		boolean check =  Areas.WAREHOUSE.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForManagerOnOperations(){
		initialize(JobRole.MANAGER);
		boolean check =  Areas.OPERATIONS.aproveAcess(user);
		assertEquals(true,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForDeveloperOnDesk(){
		initialize(JobRole.DEVELOPER);
		boolean check =  Areas.DESK.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForDeveloperOnRestaurant(){
		initialize(JobRole.DEVELOPER);
		boolean check =  Areas.RESTAURANT.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForDeveloperOnWarehouse(){
		initialize(JobRole.DEVELOPER);
		boolean check =  Areas.WAREHOUSE.aproveAcess(user);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForDeveloperOnOperations(){
		initialize(JobRole.DEVELOPER);
		boolean check =  Areas.OPERATIONS.aproveAcess(user);
		assertEquals(false,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForOperatorOnDesk(){
		initialize(JobRole.OPERATOR);
		boolean check =  Areas.DESK.aproveAcess(user);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForOperatorOnRestaurant(){
		initialize(JobRole.OPERATOR);
		boolean check =  Areas.RESTAURANT.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForOperatorOnWarehouse(){
		initialize(JobRole.OPERATOR);
		boolean check =  Areas.WAREHOUSE.aproveAcess(user);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForOperatorOnOperations(){
		initialize(JobRole.OPERATOR);
		boolean check =  Areas.OPERATIONS.aproveAcess(user);
		assertEquals(true,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForStockistOnDesk(){
		initialize(JobRole.STOCKIST);
		boolean check =  Areas.DESK.aproveAcess(user);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForStockistOnRestaurant(){
		initialize(JobRole.STOCKIST);
		boolean check =  Areas.RESTAURANT.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForStockistOnWarehouse(){
		initialize(JobRole.STOCKIST);
		boolean check =  Areas.WAREHOUSE.aproveAcess(user);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForStockistOnOperations(){
		initialize(JobRole.STOCKIST);
		boolean check =  Areas.OPERATIONS.aproveAcess(user);
		assertEquals(true,check);
	}

}


