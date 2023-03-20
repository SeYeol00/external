package hello;


import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class EnvironmentCheck {
    // 스프링에서 제공하는 환경변수 설정 클래스
    // getProperty를 통해서 환경변수를 가져올 수 있다.
    // 커맨드라인 옵션 인수, 자바 시스템 속성, OS환경변수, 설정 데이터 파일 등등 다 가져온다.
    // 커맨드라인 옵션 인수가 우선 순위를 가진다.
    // 더 유연한 것이 우선권을 가진다.
    // 범위가 더 좁은 것인 우선권을 가진다.
    private final Environment environment;

    @PostConstruct
    public void init(){
        String url = environment.getProperty("url");
        String username = environment.getProperty("username");
        String password = environment.getProperty("password");
        log.info("env url = {}",url);
        log.info("env username url = {}",username);
        log.info("env password url = {}",password);
    }
}
