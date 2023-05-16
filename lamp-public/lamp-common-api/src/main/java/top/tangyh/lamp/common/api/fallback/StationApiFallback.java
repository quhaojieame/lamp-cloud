package top.tangyh.lamp.common.api.fallback;

import org.springframework.stereotype.Component;
import top.tangyh.lamp.common.api.StationApi;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * 熔断类
 *
 * @author zuihou
 * @date 2020年02月09日11:24:23
 */
@Component
public class StationApiFallback implements StationApi {
    @Override
    public Map<Serializable, Object> findByIds(Set<Serializable> ids) {
        return Collections.emptyMap();
    }
}
