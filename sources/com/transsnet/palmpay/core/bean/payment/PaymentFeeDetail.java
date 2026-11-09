package com.transsnet.palmpay.core.bean.payment;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PaymentFeeDetail {
    public List<DetailBean> detail;
    public long totalAmount;

    public static class DetailBean {
        public long fee;
        public String remark;
        public String subTypeId;
        public String subTypeName;
        public TransferServiceFee transferServiceFee;
        public long vat;
    }

    public static class TransferServiceFee {
        public long minAmount;
        public String nextBillDate;
        public long transferAmount;
        public long transferBorrowDays;
        public double transferRatio;
    }
}
