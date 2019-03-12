package com.col.dao;

import java.util.List;

import com.col.model.BlogComment;

public interface BlogCommentDao {
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getBlogComment(int blogPostId);
	void deleteBlogComment(BlogComment blogComment);
}