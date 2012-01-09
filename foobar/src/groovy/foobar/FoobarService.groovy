package foobar

import org.springframework.beans.factory.InitializingBean

class FoobarService implements InitializingBean {

    def magicService

    void afterPropertiesSet() {
        if (magicService == null) {
            throw new RuntimeException("magicService is null")
        }
    }
}
