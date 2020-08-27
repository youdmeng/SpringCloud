package ml.ytooo.dao;

import ml.ytooo.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/19 0019.
 */
@Repository
public interface PaymentDao {

    int create(Payment payment);

    Payment selectById(@Param("id") Long id);


}
