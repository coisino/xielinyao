package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ReviewDao;
import com.example.pojo.Review;
import com.example.service.ReviewService;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDao reviewDao = null;
	
	@Override
	public List<Review> queryall() {
		return reviewDao.queryall();
	}
	
	@Override
	public int saveRev(Review reviewVo) {
		return reviewDao.saveRev(reviewVo);
	}

	 
}