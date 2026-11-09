package com.transsnet.palmpay.core.bean.payment;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.EarlyRefundBean;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewPayInfoResp extends CommonResult {
    private DataBean data;

    public static class CommissionEarnBean {
        public long amount;
        public String show;
        public String tips;
        public String type;

        public boolean isShow() {
            return "1".equals(this.show);
        }
    }

    public static class DataBean {
        public long amount;
        public int availableCoupon;
        public PaymentAvailableBean availableItem;
        public long bonus;
        public long bonusAmount;
        public String cacheKey;
        public CommissionEarnBean commissionEarn;
        public long couponAmount;
        public long couponId;
        public String couponType;
        public int deductionPoint;
        public long deductionPointAmount;
        public long discountAmount;
        public String discountTariffName;
        public EarlyRefundBean earlyRefund;
        public boolean earlyRefundEnable;
        public long exchangeRate;
        public long fee;
        public PaymentFeeDetail feeDetail;
        public long feeExclVat;
        public FeeTips feeTips;
        public String interestPenaltyFeeTips;
        public long orderAmount;
        public long payAmount;
        public long payMentMethodsDiscount;
        public long payeeAmount;
        public long payeeFee;
        public long payeeVat;
        public long payerShowVat;
        public long platformFee;
        public long platformVat;
        public long returnAmount;
        public long returnBonus;
        public int returnPoint;
        public String riskMsg;
        public String seqId;
        public String shopName;
        public boolean showCoupon;
        public long totalAmount;
        public boolean useBonus;
        public boolean useCoupon;
        public boolean useDiscount;
        public boolean usePoint;
        public boolean useReturnPoint;
        public long vat;
        public String zeroFeeTips;
    }

    public static class FeeTips {
        public String confirmPaymentTips;
        public String showConfirmPaymentTipsFlag;
        public String tipsText;
    }

    public static class PaymentAvailableBean {
        public long bonus;
        public long deductionPoint;
        public long deductionPointAmount;
        public long discountAmount;
        public boolean showAvailable;
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
