package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentMethodV4Resp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public boolean applyOkCard;
        public PreviewPayInfoResp.DataBean calculationDto;
        public LimitAmountResp limitAmountResp;
        public String okCardPromotionUrl;
        public List<ActivityConfig> payUnable;
        public List<PaymentMethod> paymentMethodList;
    }
}
