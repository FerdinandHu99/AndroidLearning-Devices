package com.ferdinand;

import com.ferdinand.ICallback;
import com.ferdinand.Book;

interface IHelloService
{
	void sayhello();
	int sayhello_to(String name);
	void registerCallback(int pid, ICallback callback);
	int sayhelloin(in Book book);
	int sayhelloout(out Book book);
	int sayhelloinout(inout Book book);
	oneway void sayhellooneway(in Book book);
}