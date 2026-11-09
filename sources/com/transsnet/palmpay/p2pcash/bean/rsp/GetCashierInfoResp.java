package com.transsnet.palmpay.p2pcash.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GetCashierInfoResp extends CommonResult {
    public DataBean data;

    public static class CalculationDtoBean {
        public String amount;
        public AvailableItemBean availableItem;
        public String bonus;
        public String bonusAmount;
        public String cacheKey;
        public String cashback;
        public String coins;
        public String coinsAmount;
        public String coinsExchangeRate;
        public String couponAmount;
        public String couponId;
        public String couponType;
        public String deductionPoint;
        public String deductionPointAmount;
        public String discountAmount;
        public String discountAmountType;
        public String discountTariffName;
        public String earlyRefundEnable;
        public String elevy;
        public String exchangeRate;
        public long fee;
        public FeeDetailBean feeDetail;
        public String feeDetailMap;
        public String feeTraiffId;
        public String hasCoupon;
        public String interestPenaltyFeeTips;
        public String limitPayeeAccountType;
        public String limitPayerAccountType;
        public String memberId;
        public String offlineMerchantSubAmount;
        public String offlineMerchantSubExtraAmount;
        public String offlineMerchantSubShopId;
        public String offlineMerchantSubTransType;
        public String offlineMerchantTransType;
        public String offlineSubCalculation;
        public String okcardFee;
        public String optimalChoice;
        public long orderAmount;
        public long payAmount;
        public String payStampDuty;
        public String payeeAmount;
        public String payeeFee;
        public String payeePointsBackCount;
        public String payeeRebateAmount;
        public String payeeReturnAmount;
        public String payeeReturnPoint;
        public String payeeVat;
        public String payerDeductionPointsBackAmount;
        public String payerDeductionPointsBackCount;
        public String payerPointsBackCount;
        public String platformFee;
        public String platformVat;
        public String pointsBackConversion;
        public String receiveStampDuty;
        public String returnAmount;
        public String returnBonus;
        public String returnPoint;
        public String riskMsg;
        public String seqId;
        public String shopName;
        public String showCoupon;
        public String totalAmount;
        public String useBonus;
        public String useCoupon;
        public String useDiscount;
        public String usePoint;
        public String useReturnPoint;
        public long vat;
        public String zeroFeeTips;

        public static class AvailableItemBean {
            public String bonus;
            public String bonusAmount;
            public String couponAvailableCount;
            public String deductionPoint;
            public String deductionPointAmount;
            public String discountAmount;
            public String showAvailable;
        }

        public static class FeeDetailBean {
            public String totalAmount;
        }
    }

    public static class DataBean {
        public String applyOkCard;
        public CalculationDtoBean calculationDto;
        public String detainmentContent;
        public LimitAmountRespBean limitAmountResp;
        public String okCardPromotionUrl;
        public List<PayUnableBean> payUnable;
        public List<PaymentMethod> paymentMethodList;
    }

    public static class LimitAmountRespBean {
        public long maxAmount;
        public long minAmount;
    }

    public static class PayUnableBean {
        public String acTips;
        public int senderAccountType;
    }

    public static class PaymentMethodListBean {
        public String acTips;
        public String accountId;
        public String accountStatus;
        public long availableBalance;
        public String bankAccountNo;
        public String bankCode;
        public String bankName;
        public String bankUrl;
        public String cardNo;
        public String cardType;
        public String countryCode;
        public String createTime;
        public String currency;
        public String cvv;
        public boolean defaultMethodFlag;
        public String defaultPayFlag;
        public String enable;
        public String expiryFlag;
        public String expiryMonth;
        public String expiryYear;
        public String lastUpdateTime;
        public String memberId;
        public boolean needSign;
        public String okcardTips;
        public String partnerAccNo;
        public String partnerBankCode;
        public int payType;
        public String reUseable;
        public String remark;
        public long reservedBalance;
        public int senderAccountType;
        public String tips;
        public String token;
        public long unclearedBalance;
        public String useNum;
    }
}
