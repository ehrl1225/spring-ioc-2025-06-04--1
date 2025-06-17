package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestFacadePostService;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public ApplicationContext() {

    }

    public <T> T genBean(String beanName) {
        // 하드 코딩 방식
        return switch (beanName){
            case "testPostService" ->(T) TestPostService.getInstance();
            case "testPostRepository" ->(T) TestPostRepository.getInstance();
            case "testFacadePostService" -> (T) new TestFacadePostService(TestPostService.getInstance(), TestPostRepository.getInstance());
            default -> (T)null;
        };

    }
}
