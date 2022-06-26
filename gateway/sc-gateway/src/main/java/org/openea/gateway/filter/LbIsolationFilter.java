package org.openea.gateway.filter;

/*import org.springframework.cloud.gateway.config.LoadBalancerProperties;
import org.springframework.cloud.gateway.filter.LoadBalancerClientFilter;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;*/

/**
 * 传递负载均衡隔离值
 *
 */
/*
@Component
@ConditionalOnProperty(name = ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED, havingValue = "true")
public class LbIsolationFilter extends LoadBalancerClientFilter {
    public LbIsolationFilter(LoadBalancerClient loadBalancer, LoadBalancerProperties properties) {
        super(loadBalancer, properties);
    }

    @Override
    protected ServiceInstance choose(ServerWebExchange exchange) {
        String vresion = exchange.getRequest().getHeaders().getFirst(CommonConstant.Z_L_T_VERSION);
        if (StrUtil.isNotEmpty(vresion)) {
            if (this.loadBalancer instanceof RibbonLoadBalancerClient) {
                RibbonLoadBalancerClient client = (RibbonLoadBalancerClient) this.loadBalancer;
                String serviceId = ((URI) exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR)).getHost();
                return client.choose(serviceId, vresion);
            }
        }
        return super.choose(exchange);
    }
}
*/
