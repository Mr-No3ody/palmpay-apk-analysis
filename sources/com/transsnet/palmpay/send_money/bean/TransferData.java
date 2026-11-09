package com.transsnet.palmpay.send_money.bean;

import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteRelationshipBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TransferData extends BaseOrderDetailBean {
    public long amount;
    public GuideInfoBean bankGuidePp;
    public long cashEarned;
    public TransferDetailCompensation compensation;
    public long deductPoint;
    public EarlyRefundFeeInfoBean earlyRefundFeeInfo;
    public AddFavoriteRelationshipBean favoriteLabel;
    public OrderCompensateBean orderCompensate;
    public String orderId;
    public OrderResultKeyDetailBean orderResultKeyDetail;
    public List<OrderResultItemBean> orderResultList;
    public int orderStatus;
    public String orderStatusDesc;
    public BillProcessDetail orderStatusInfo;
    public long recipientAmount;
    public String recipientBankAccount;
    public String recipientBankCode;
    public String recipientBankName;
    public String recipientBankUrl;
    public String recipientFirstName;
    public String recipientFullName;
    public String recipientHeadImage;
    public String recipientLastName;
    public String recipientPhone;
    public long redeemPoint;
    public String sendMemberId;
    public String senderHeadImage;
    public String senderNickname;
    public String senderPhone;
    public String senderRemark;
    public long taxFee;

    public static class EarlyRefundFeeInfoBean {
        public String desc;
        public String name;
    }

    public static class GuideInfoBean {
        public String contentPrefix;
        public String contentSuffix;
        public String jumpPath;
    }

    public static class OrderResultItemBean {
        public String contentKey;
        public String contentSubKey;
        public String contentSubUrl;
        public String contentSubValue;
        public String contentValue;
    }

    public static class OrderResultKeyDetailBean {
        public String paymentMethodKey;
        public String paymentMethodValue;
        public String recipientAccountDarkValue;
        public String recipientAccountKey;
        public String recipientAccountValue;
    }
}
