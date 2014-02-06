package com.bobpaulin.backend.web;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.bobpaulin.shared.data.MessageDataService;
import com.bobpaulin.shared.model.Message;

import org.springframework.validation.BindingResult;

public class BackendControllerTest extends BackendController {
	
	private BackendController backendController;
	
	@Before
	public void setUp() throws Exception {
		backendController = new BackendController();
	}

	@Test
	public void testCreateMessage() {
		
		backendController.setMessageDataService(new MessageDataService() {
			
			@Override
			public void save(Object dataObject) {
				// Do nothing
				
			}
			
			@Override
			public List<Message> getUserMessages(String userName) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Message> getBookMessages(String bookId) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		Message message = new Message();
		message.setBookId("123");
		message.setMessageText("Test");
		message.setPostDate(new Date());
		message.setUserName("bob");
		String result = backendController.createMessage(message, null);
		
		assertEquals("Controller should return book id", "redirect:review/123", result);
	}

}
