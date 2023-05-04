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
	void checkIfPermissionOfAcessIsTrueForAnalystOnDesk(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.ANALYST.getPermissions());
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForAnalystOnRestaurant(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.ANALYST.getPermissions());
		boolean check =  Areas.RESTAURANT.aproveAcess(user,Areas.RESTAURANT);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForAnalystOnWarehouse(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.ANALYST.getPermissions());
		boolean check =  Areas.WAREHOUSE.aproveAcess(user,Areas.WAREHOUSE);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForAnalystOnOperations(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.ANALYST.getPermissions());
		boolean check =  Areas.OPERATIONS.aproveAcess(user,Areas.OPERATIONS);
		assertEquals(false,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForManagerOnDesk(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.MANAGER.getPermissions());
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForManagerOnRestaurant(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.MANAGER.getPermissions());
		boolean check =  Areas.RESTAURANT.aproveAcess(user,Areas.RESTAURANT);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForManagerOnWarehouse(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.MANAGER.getPermissions());
		boolean check =  Areas.WAREHOUSE.aproveAcess(user,Areas.WAREHOUSE);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForManagerOnOperations(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.MANAGER.getPermissions());
		boolean check =  Areas.OPERATIONS.aproveAcess(user,Areas.OPERATIONS);
		assertEquals(true,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForDeveloperOnDesk(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.DEVELOPER.getPermissions());
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForDeveloperOnRestaurant(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.DEVELOPER.getPermissions());
		boolean check =  Areas.RESTAURANT.aproveAcess(user,Areas.RESTAURANT);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForDeveloperOnWarehouse(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.DEVELOPER.getPermissions());
		boolean check =  Areas.WAREHOUSE.aproveAcess(user,Areas.WAREHOUSE);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForDeveloperOnOperations(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.DEVELOPER.getPermissions());
		boolean check =  Areas.OPERATIONS.aproveAcess(user,Areas.OPERATIONS);
		assertEquals(false,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForOperatorOnDesk(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.OPERATOR.getPermissions());
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForOperatorOnRestaurant(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.OPERATOR.getPermissions());
		boolean check =  Areas.RESTAURANT.aproveAcess(user,Areas.RESTAURANT);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForOperatorOnWarehouse(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.OPERATOR.getPermissions());
		boolean check =  Areas.WAREHOUSE.aproveAcess(user,Areas.WAREHOUSE);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForOperatorOnOperations(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.OPERATOR.getPermissions());
		boolean check =  Areas.OPERATIONS.aproveAcess(user,Areas.OPERATIONS);
		assertEquals(true,check);
	}
	
	@Test
	void checkIfPermissionOfAcessIsTrueForStockistOnDesk(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.STOCKIST.getPermissions());
		boolean check =  Areas.DESK.aproveAcess(user,Areas.DESK);
		assertEquals(false,check);
	}
	@Test
	void checkIfPermissionOfAcessIsTrueForStockistOnRestaurant(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.STOCKIST.getPermissions());
		boolean check =  Areas.RESTAURANT.aproveAcess(user,Areas.RESTAURANT);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForStockistOnWarehouse(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.STOCKIST.getPermissions());
		boolean check =  Areas.WAREHOUSE.aproveAcess(user,Areas.WAREHOUSE);
		assertEquals(true,check);
	}
	@Test
	void checkIfPermissionOfAcessIsFalseForStockistOnOperations(){
		User user = new User("Name",new BigDecimal("1000"),JobRole.STOCKIST.getPermissions());
		boolean check =  Areas.OPERATIONS.aproveAcess(user,Areas.OPERATIONS);
		assertEquals(true,check);
	}

}
