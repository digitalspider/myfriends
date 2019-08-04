package au.com.digitalspider.myfriends.api.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.digitalspider.myfriends.api.contact.ContactApiConstants;
import au.com.digitalspider.myfriends.api.contact.model.Post;
import au.com.digitalspider.myfriends.api.contact.service.PostService;

@RestController
@RequestMapping(ContactApiConstants.API_PATH_POST)
public class PostController extends BaseController<Post, Long> {
	@Autowired
	private PostService postService;

	@Override
	protected PostService getBaseService() {
		return postService;
	}
}