package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {
    // 커맨드라인은 쌩으로 문자열로 받기 때문에 key value가 아니다.
    public static void main(String[] args) {
        for (String arg: args){
            log.info("arg {}",arg);
        }
    }
}
