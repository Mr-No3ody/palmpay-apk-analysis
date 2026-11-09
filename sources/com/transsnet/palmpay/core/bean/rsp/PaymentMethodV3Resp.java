package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentMethodV3Resp extends CommonResult {
    public DataBean data;

    public static class DataBean {
        public List<PaymentMethod> payAble;
        public List<ActivityConfig> payUnable;
    }
}
