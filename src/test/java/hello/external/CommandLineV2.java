package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
public class CommandLineV2 {
    // --url=evdb --username=dev_user --password=dev_pw mode=on
    public static void main(String[] args) {
        for (String arg: args){
            log.info("arg {}",arg);
        }

        // 스프링에서 제공하는 args를 key value로 만들어주는 인터페이스와 구현체
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        // 스트링 배열을 받는다.
        log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs()));
        // 옵션 안 받은 거
        log.info("NonOptionsArgs = {}", appArgs.getNonOptionArgs());
        // 옵션 받은 거
        log.info("OptionsNames = {}", appArgs.getOptionNames());

        Set<String> optionNames = appArgs.getOptionNames();
        for(String optionName : optionNames){
            log.info("Option arg{}={}",optionName, appArgs.getOptionValues(optionName));
        }
        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");
        log.info("url = {}",url);
        log.info("username = {}",username);
        log.info("password = {}",password);
        log.info("mode = {}",mode);


    }
}
