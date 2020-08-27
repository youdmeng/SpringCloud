package ml.ytooo.service.impl;

import ml.ytooo.dao.PaymentDao;
import ml.ytooo.entity.Payment;
import ml.ytooo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.selectById(id);
    }
}
