package com.transsnet.palmpay.core.bean;

import F6.d;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MerchantLogo {
    public String merchantNo;

    public MerchantLogo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public boolean equals(Object o10) {
        try {
            if (o10 instanceof MerchantLogo) {
                return ((MerchantLogo) o10).merchantNo.equals(this.merchantNo);
            }
            return false;
        } catch (Exception e10) {
            d.c("MerchantLogo", "equals: ", e10);
            return false;
        }
    }

    public int hashCode() {
        return TextUtils.isEmpty(this.merchantNo) ? super.hashCode() : this.merchantNo.hashCode();
    }
}
