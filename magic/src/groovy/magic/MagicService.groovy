package magic

import org.springframework.beans.factory.InitializingBean

class MagicService implements InitializingBean {

    def sessionFactory

    void afterPropertiesSet() {
        if (sessionFactory == null) {
            throw new RuntimeException("sessionFactory is not set")
        }
    }
}
