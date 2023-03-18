package hello.external;


import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {
    public static void main(String[] args) {
        // 자바에서 OS 환경변수 값들을 key value 형식으로 가져오는 방식
        // 데이터베이스 url과 같은 접근 방식을 OS 환경변수에 넣어서 사용 가능
        Map<String, String> getenv = System.getenv();
        for (String env : getenv.keySet()) {
            log.info("env {} = {}", env,System.getenv(env));
        }

        // DBURL = dev.db.com 개발서버
        // DBURL = prod.db.com 배포서버
//        System.getenv("DBURL");
    }
}
