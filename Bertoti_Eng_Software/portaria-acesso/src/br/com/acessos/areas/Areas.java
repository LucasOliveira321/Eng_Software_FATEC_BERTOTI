package br.com.acessos.areas;

import br.com.acessos.user.User;

public enum Areas {
	RESTAURANT{	
		public boolean aproveAcess(User user) {
			if(user.getPermissions().contains(RESTAURANT.toString())) {
				return true;
			}else {
				return false;
			}
		}
	},
	DESK{
		public boolean aproveAcess(User user) {
			if(user.getPermissions().contains(DESK.toString())) {
				return true;
			}else {
				return false;
			}
		}
	},
	WAREHOUSE{
		public boolean aproveAcess(User user) {
			if(user.getPermissions().contains(WAREHOUSE.toString())) {
				return true;
			}else {
				return false;
			}
		}
	},
	OPERATIONS{
		public boolean aproveAcess(User user) {
			if(user.getPermissions().contains(OPERATIONS.toString())) {
				return true;
			}else {
				return false;
			}
		}
	};
	
	
	public abstract boolean aproveAcess(User user);
}
