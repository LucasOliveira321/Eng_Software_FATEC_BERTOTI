package br.com.acessos.areas;

import br.com.acessos.user.User;

public enum Areas {
	RESTAURANT{
		public String getArea(){
			return "restaurant";
		}
		
		public boolean aproveAcess(User user, Areas area) {
			if(user.getPermissions().contains(area.getArea())) {
				return true;
			}else {
				return false;
			}
		}
	},
	DESK{
		public String getArea(){
			return "desk";
		}
		public boolean aproveAcess(User user, Areas area) {
			if(user.getPermissions().contains(area.getArea())) {
				return true;
			}else {
				return false;
			}
		}
	},
	WAREHOUSE{
		public String getArea(){
			return "warehouse";
		}
		public boolean aproveAcess(User user, Areas area) {
			if(user.getPermissions().contains(area.getArea())) {
				return true;
			}else {
				return false;
			}
		}
	},
	OPERATIONS{
		public String getArea(){
			return "operations";
		}
		public boolean aproveAcess(User user, Areas area) {
			if(user.getPermissions().contains(area.getArea())) {
				return true;
			}else {
				return false;
			}
		}
	};
	
	public abstract String getArea();
	public abstract boolean aproveAcess(User user, Areas area);
}
