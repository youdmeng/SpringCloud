package ml.ytooo.service;

import org.springframework.stereotype.Service;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/24 0024.
 */
@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "降级 -- paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "降级 -- paymentInfo_TimeOut";
    }
}
