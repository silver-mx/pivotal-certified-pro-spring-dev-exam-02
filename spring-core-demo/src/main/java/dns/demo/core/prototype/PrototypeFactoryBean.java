package dns.demo.core.prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrototypeFactoryBean {

    public PrototypeFactoryBean() {
    }

    @Lookup("interfaceProxyMode")
    public PrototypeInterface createPrototypeInterfaceProxyModeBean() {
        // Spring will proxy the call and the null will be never returned
        log.info("=====>>>>>> THIS MUST NOT BE LOGGED .......");
        return null;
    }

    @Lookup
    public PrototypeCgLibProxyModeBean createPrototypeCgLibProxyModeBean() {
        // Spring will proxy the call and the null will be never returned
        log.info("=====>>>>>> THIS MUST NOT BE LOGGED .......");
        return null;
    }

    @Lookup
    public PrototypeDefaultProxyModeBean createPrototypeDefaultProxyModeBean() {
        // Spring will proxy the call and the null will be never returned
        log.info("=====>>>>>> THIS MUST NOT BE LOGGED .......");
        return null;
    }
}
