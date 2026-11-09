package com.transsnet.palmpay.core.bean.rsp;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OkCardPreCreditInfoRsp {
    public int applyStatus;
    public String dueDate;
    public long okCardPreCreditAmount;
    public String okCardPreCreditDesc;
    public long okCardPreCreditDiscountAmount;
    public boolean okCardPreCreditFlag;
    public List<String> okCardPreCreditTags;
    public int okCardWhiteType;
    public String okcardTips;
    public boolean targetWhiteFlag;

    public boolean canShowAtPaymentMethodDialog() {
        if (this.okCardPreCreditFlag) {
            return false;
        }
        int i7 = this.applyStatus;
        return (i7 == -1 || i7 == 2) && this.targetWhiteFlag;
    }
}
