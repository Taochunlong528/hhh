package tcl.hd.restaurant.impl;

import java.util.ArrayList;
import java.util.List;

public class Shoping {
private Menu menu;
private List<Menu> list;
public Shoping() {
	super();
	this.menu = new Menu();
	this.list=new ArrayList<Menu>();
}
//加入购物车
public void  addMenus(Menu menu){
	list.add(menu);
	
}
//查询购物车
public List<Menu> getMenu(){
	
	return list;
}
//删除某个菜
public void deleteByid(int id){
	
}
}
