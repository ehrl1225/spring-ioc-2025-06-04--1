package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestPostService {
    private final TestPostRepository testPostRepository;
    // 싱글톤을 위함
    private static TestPostService instance = null;

    public static TestPostService getInstance() {
        if (instance == null) {
            instance = new TestPostService(TestPostRepository.getInstance());
        }
        return instance;
    }
}
