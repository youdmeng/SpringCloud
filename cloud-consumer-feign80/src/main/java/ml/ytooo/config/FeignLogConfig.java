package ml.ytooo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.util.calendar.LocalGregorianCalendar;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/20 0020.
 */
@Configuration
public class FeignLogConfig {
    @Bean
    public Logger.Level getLevel() {
        return Logger.Level.FULL;
    }
}
