package com.transsnet.palmpay.main.export.bean.rsp;

import Ea.a;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionHistoryBean {
    public long amount;
    private int businessType;
    public String companyIconUrl;
    public String displayAmount;
    public String orderNo;
    public String orderStatus;
    private int payerAccountType;
    public String transType;
    public String transTypeDesc;
    public long updateTime;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransactionHistoryBean transactionHistoryBean = (TransactionHistoryBean) obj;
        return this.amount == transactionHistoryBean.amount && this.updateTime == transactionHistoryBean.updateTime && TextUtils.equals(this.displayAmount, transactionHistoryBean.displayAmount) && TextUtils.equals(this.companyIconUrl, transactionHistoryBean.companyIconUrl) && TextUtils.equals(this.orderNo, transactionHistoryBean.orderNo) && TextUtils.equals(this.orderStatus, transactionHistoryBean.orderStatus) && TextUtils.equals(this.transType, transactionHistoryBean.transType) && TextUtils.equals(this.transTypeDesc, transactionHistoryBean.transTypeDesc) && this.businessType == transactionHistoryBean.businessType && this.payerAccountType == transactionHistoryBean.payerAccountType;
    }

    public int getIconIdByTransType() {
        return a.b(this.amount, this.transType, this.businessType, this.payerAccountType);
    }

    public Uri getIconUriByTransType() {
        return a.c(this.transType, Integer.valueOf(this.businessType), Integer.valueOf(this.payerAccountType), Long.valueOf(this.amount));
    }

    public int hashCode() {
        long j6 = this.amount;
        int i7 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        String str = this.displayAmount;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.companyIconUrl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.updateTime;
        int i10 = (((iHashCode + iHashCode2) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31;
        String str3 = this.orderNo;
        int iHashCode3 = (i10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.orderStatus;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.transType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.transTypeDesc;
        return ((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.businessType) * 31) + this.payerAccountType;
    }
}
