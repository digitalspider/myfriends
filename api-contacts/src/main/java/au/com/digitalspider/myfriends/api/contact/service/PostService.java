package au.com.digitalspider.myfriends.api.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.digitalspider.myfriends.api.contact.model.AuditableEntity;
import au.com.digitalspider.myfriends.api.contact.model.Post;
import au.com.digitalspider.myfriends.api.contact.repo.PostRepository;

@Service
public class PostService extends BaseAuditableService<Post, Long> {
	@Autowired
	private PostRepository postRepository;

	@Override
	protected PostRepository getRepository() {
		return postRepository;
	}

	@Override
	protected AuditableEntity getAuditableEntity(Post entity) {
		return entity;
	}
}