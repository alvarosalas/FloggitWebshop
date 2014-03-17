package se.lajv.floggitWebshop.Interface;

public interface CartInterface {

	public void get(String username, String password, String email);

	public void remove(String username, String password, String email);
	
}
