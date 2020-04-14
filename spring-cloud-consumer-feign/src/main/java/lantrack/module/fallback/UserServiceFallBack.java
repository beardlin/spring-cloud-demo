package lantrack.module.fallback;


import feign.hystrix.FallbackFactory;

public class UserServiceFallBack implements FallbackFactory<String> {
    @Override
    public String create(Throwable throwable) {

        return null;
    }
}
