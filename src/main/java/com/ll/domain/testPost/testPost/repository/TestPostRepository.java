package com.ll.domain.testPost.testPost.repository;

public class TestPostRepository {
    // 싱글톤을 위함
    private static TestPostRepository instance = null;

    private TestPostRepository() {

    }

    public static TestPostRepository getInstance(){
        if (instance == null){
            instance = new TestPostRepository();
        }
        return instance;
    }
}
