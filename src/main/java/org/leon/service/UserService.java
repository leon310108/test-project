package org.leon.service;

public interface UserService<T> {
	
	public T saveWithRollBack(T t);
	public T saveWithoutRollBack(T t);

}
