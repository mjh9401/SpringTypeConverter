package hello.typeConverter;

import hello.typeConverter.converter.IntegerToStringConverter;
import hello.typeConverter.converter.IpPortToStringConverter;
import hello.typeConverter.converter.StringToIntegerConverter;
import hello.typeConverter.converter.StringToIpPortConvert;
import hello.typeConverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // 우선순위 때문에 주석처리
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConvert());
        registry.addConverter(new IpPortToStringConverter());

        // 추가
        registry.addFormatter(new MyNumberFormatter());
    }
}
