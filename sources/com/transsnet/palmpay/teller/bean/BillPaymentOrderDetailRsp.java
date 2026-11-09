package com.transsnet.palmpay.teller.bean;

import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001e\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001c\u00108\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR\u001e\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001c\u0010H\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001e\u0010K\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R\u001e\u0010N\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bO\u0010.\"\u0004\bP\u00100R\u001c\u0010Q\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0007\"\u0004\bS\u0010\tR\u001e\u0010T\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u0010\n\u0002\u0010A\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R\u001c\u0010W\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\tR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0007\"\u0004\b\\\u0010\tR\u001c\u0010]\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0007\"\u0004\b_\u0010\tR\u001c\u0010`\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0007\"\u0004\bb\u0010\tR\u001c\u0010c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0007\"\u0004\be\u0010\tR\u001e\u0010f\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\bg\u0010.\"\u0004\bh\u00100R\u001c\u0010i\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0007\"\u0004\bk\u0010\tR\u001c\u0010l\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0007\"\u0004\bn\u0010\tR\u001c\u0010o\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0007\"\u0004\bq\u0010\tR\u001c\u0010r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0007\"\u0004\bt\u0010\tR\u001c\u0010u\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010\tR\u001e\u0010x\u001a\u0004\u0018\u00010yX\u0086\u000e¢\u0006\u0010\n\u0002\u0010~\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0007\"\u0005\b\u0081\u0001\u0010\tR\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0007\"\u0005\b\u0084\u0001\u0010\tR\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0007\"\u0005\b\u0087\u0001\u0010\tR\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0007\"\u0005\b\u008a\u0001\u0010\tR\u001f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0007\"\u0005\b\u008d\u0001\u0010\tR!\u0010\u008e\u0001\u001a\u0004\u0018\u00010yX\u0086\u000e¢\u0006\u0012\n\u0002\u0010~\u001a\u0005\b\u008f\u0001\u0010{\"\u0005\b\u0090\u0001\u0010}R\"\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u0007\"\u0005\b\u0099\u0001\u0010\tR\"\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001RE\u0010¦\u0001\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010§\u0001j\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`¨\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/BillPaymentOrderDetailRsp;", "Lcom/transsnet/palmpay/core/bean/BaseOrderDetailBean;", "<init>", "()V", "tokenName", "", "getTokenName", "()Ljava/lang/String;", "setTokenName", "(Ljava/lang/String;)V", "bankName", "getBankName", "setBankName", "billerId", "getBillerId", "setBillerId", "billerName", "getBillerName", "setBillerName", "subscribeTips", "getSubscribeTips", "setSubscribeTips", "billerLogo", "getBillerLogo", "setBillerLogo", "countryName", "getCountryName", "setCountryName", "currencySymbol", "getCurrencySymbol", "setCurrencySymbol", "customerDisplayName", "getCustomerDisplayName", "setCustomerDisplayName", "redeemCode", "getRedeemCode", "setRedeemCode", "redeemPin", "getRedeemPin", "setRedeemPin", "redeemDesc", "getRedeemDesc", "setRedeemDesc", "expireTime", "", "getExpireTime", "()Ljava/lang/Long;", "setExpireTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "redeemNote", "getRedeemNote", "setRedeemNote", "redeemCodeDisplay", "getRedeemCodeDisplay", "setRedeemCodeDisplay", "redemptionUrl", "getRedemptionUrl", "setRedemptionUrl", "orderStatus", "", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "orderStatusDesc", "getOrderStatusDesc", "setOrderStatusDesc", "errorCode", "getErrorCode", "setErrorCode", "errorMessage", "getErrorMessage", "setErrorMessage", "flexiDiscount", "getFlexiDiscount", "setFlexiDiscount", "unclaimedReturnPoint", "getUnclaimedReturnPoint", "setUnclaimedReturnPoint", "payId", "getPayId", "setPayId", "payerAccountType", "getPayerAccountType", "setPayerAccountType", "payerBankName", "getPayerBankName", "setPayerBankName", "payerCardNo", "getPayerCardNo", "setPayerCardNo", "paymentItemId", "getPaymentItemId", "setPaymentItemId", "itemName", "getItemName", "setItemName", "paymentItemName", "getPaymentItemName", "setPaymentItemName", "bonusAmount", "getBonusAmount", "setBonusAmount", "customerId", "getCustomerId", "setCustomerId", "rechargePIN", "getRechargePIN", "setRechargePIN", "itemRemark", "getItemRemark", "setItemRemark", "memberName", "getMemberName", "setMemberName", "icon", "getIcon", "setIcon", "needClaimPoint", "", "getNeedClaimPoint", "()Ljava/lang/Boolean;", "setNeedClaimPoint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "address", "getAddress", "setAddress", "pendingCouponRemark", "getPendingCouponRemark", "setPendingCouponRemark", "fullName", "getFullName", "setFullName", "mobileNo", "getMobileNo", "setMobileNo", "bsstToken", "getBsstToken", "setBsstToken", "renewal", "getRenewal", "setRenewal", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "getOrderStatusInfo", "()Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "setOrderStatusInfo", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "statusReplenishInfo", "getStatusReplenishInfo", "setStatusReplenishInfo", "feeDetailList", "Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "getFeeDetailList", "()Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "setFeeDetailList", "(Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;)V", "autoRenewalOrderFields", "Lcom/transsnet/palmpay/teller/bean/AutoRenewalOrderBean;", "getAutoRenewalOrderFields", "()Lcom/transsnet/palmpay/teller/bean/AutoRenewalOrderBean;", "setAutoRenewalOrderFields", "(Lcom/transsnet/palmpay/teller/bean/AutoRenewalOrderBean;)V", "payResultExtParam", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPayResultExtParam", "()Ljava/util/HashMap;", "setPayResultExtParam", "(Ljava/util/HashMap;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillPaymentOrderDetailRsp extends BaseOrderDetailBean {

    @Nullable
    private String address;

    @Nullable
    private AutoRenewalOrderBean autoRenewalOrderFields;

    @Nullable
    private String bankName;

    @Nullable
    private String billerId;

    @Nullable
    private String billerLogo;

    @Nullable
    private String billerName;

    @Nullable
    private Long bonusAmount;

    @Nullable
    private String bsstToken;

    @Nullable
    private String countryName;

    @Nullable
    private String currencySymbol;

    @Nullable
    private String customerDisplayName;

    @Nullable
    private String customerId;

    @Nullable
    private String errorCode;

    @Nullable
    private String errorMessage;

    @Nullable
    private Long expireTime;

    @Nullable
    private PaymentFeeDetail feeDetailList;

    @Nullable
    private Long flexiDiscount;

    @Nullable
    private String fullName;

    @Nullable
    private String icon;

    @Nullable
    private String itemName;

    @Nullable
    private String itemRemark;

    @Nullable
    private String memberName;

    @Nullable
    private String mobileNo;

    @Nullable
    private Boolean needClaimPoint;

    @Nullable
    private Integer orderStatus;

    @Nullable
    private String orderStatusDesc;

    @Nullable
    private BillProcessDetail orderStatusInfo;

    @Nullable
    private String payId;

    @Nullable
    private HashMap<String, String> payResultExtParam;

    @Nullable
    private Integer payerAccountType;

    @Nullable
    private String payerBankName;

    @Nullable
    private String payerCardNo;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String paymentItemName;

    @Nullable
    private String pendingCouponRemark;

    @Nullable
    private String rechargePIN;

    @Nullable
    private String redeemCode;

    @Nullable
    private String redeemCodeDisplay;

    @Nullable
    private String redeemDesc;

    @Nullable
    private String redeemNote;

    @Nullable
    private String redeemPin;

    @Nullable
    private String redemptionUrl;

    @Nullable
    private Boolean renewal;

    @Nullable
    private String statusReplenishInfo;

    @Nullable
    private String subscribeTips;

    @Nullable
    private String tokenName;

    @Nullable
    private Long unclaimedReturnPoint;

    public BillPaymentOrderDetailRsp() {
        Boolean bool = Boolean.FALSE;
        this.needClaimPoint = bool;
        this.renewal = bool;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final AutoRenewalOrderBean getAutoRenewalOrderFields() {
        return this.autoRenewalOrderFields;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Long getBonusAmount() {
        return this.bonusAmount;
    }

    @Nullable
    public final String getBsstToken() {
        return this.bsstToken;
    }

    @Nullable
    public final String getCountryName() {
        return this.countryName;
    }

    @Nullable
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    @Nullable
    public final String getCustomerDisplayName() {
        return this.customerDisplayName;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final PaymentFeeDetail getFeeDetailList() {
        return this.feeDetailList;
    }

    @Nullable
    public final Long getFlexiDiscount() {
        return this.flexiDiscount;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getItemName() {
        return this.itemName;
    }

    @Nullable
    public final String getItemRemark() {
        return this.itemRemark;
    }

    @Nullable
    public final String getMemberName() {
        return this.memberName;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final Boolean getNeedClaimPoint() {
        return this.needClaimPoint;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @Nullable
    public final BillProcessDetail getOrderStatusInfo() {
        return this.orderStatusInfo;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final HashMap<String, String> getPayResultExtParam() {
        return this.payResultExtParam;
    }

    @Nullable
    public final Integer getPayerAccountType() {
        return this.payerAccountType;
    }

    @Nullable
    public final String getPayerBankName() {
        return this.payerBankName;
    }

    @Nullable
    public final String getPayerCardNo() {
        return this.payerCardNo;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    public final String getPendingCouponRemark() {
        return this.pendingCouponRemark;
    }

    @Nullable
    public final String getRechargePIN() {
        return this.rechargePIN;
    }

    @Nullable
    public final String getRedeemCode() {
        return this.redeemCode;
    }

    @Nullable
    public final String getRedeemCodeDisplay() {
        return this.redeemCodeDisplay;
    }

    @Nullable
    public final String getRedeemDesc() {
        return this.redeemDesc;
    }

    @Nullable
    public final String getRedeemNote() {
        return this.redeemNote;
    }

    @Nullable
    public final String getRedeemPin() {
        return this.redeemPin;
    }

    @Nullable
    public final String getRedemptionUrl() {
        return this.redemptionUrl;
    }

    @Nullable
    public final Boolean getRenewal() {
        return this.renewal;
    }

    @Nullable
    public final String getStatusReplenishInfo() {
        return this.statusReplenishInfo;
    }

    @Nullable
    public final String getSubscribeTips() {
        return this.subscribeTips;
    }

    @Nullable
    public final String getTokenName() {
        return this.tokenName;
    }

    @Nullable
    public final Long getUnclaimedReturnPoint() {
        return this.unclaimedReturnPoint;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setAutoRenewalOrderFields(@Nullable AutoRenewalOrderBean autoRenewalOrderBean) {
        this.autoRenewalOrderFields = autoRenewalOrderBean;
    }

    public final void setBankName(@Nullable String str) {
        this.bankName = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerLogo(@Nullable String str) {
        this.billerLogo = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBonusAmount(@Nullable Long l5) {
        this.bonusAmount = l5;
    }

    public final void setBsstToken(@Nullable String str) {
        this.bsstToken = str;
    }

    public final void setCountryName(@Nullable String str) {
        this.countryName = str;
    }

    public final void setCurrencySymbol(@Nullable String str) {
        this.currencySymbol = str;
    }

    public final void setCustomerDisplayName(@Nullable String str) {
        this.customerDisplayName = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setExpireTime(@Nullable Long l5) {
        this.expireTime = l5;
    }

    public final void setFeeDetailList(@Nullable PaymentFeeDetail paymentFeeDetail) {
        this.feeDetailList = paymentFeeDetail;
    }

    public final void setFlexiDiscount(@Nullable Long l5) {
        this.flexiDiscount = l5;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setItemName(@Nullable String str) {
        this.itemName = str;
    }

    public final void setItemRemark(@Nullable String str) {
        this.itemRemark = str;
    }

    public final void setMemberName(@Nullable String str) {
        this.memberName = str;
    }

    public final void setMobileNo(@Nullable String str) {
        this.mobileNo = str;
    }

    public final void setNeedClaimPoint(@Nullable Boolean bool) {
        this.needClaimPoint = bool;
    }

    public final void setOrderStatus(@Nullable Integer num) {
        this.orderStatus = num;
    }

    public final void setOrderStatusDesc(@Nullable String str) {
        this.orderStatusDesc = str;
    }

    public final void setOrderStatusInfo(@Nullable BillProcessDetail billProcessDetail) {
        this.orderStatusInfo = billProcessDetail;
    }

    public final void setPayId(@Nullable String str) {
        this.payId = str;
    }

    public final void setPayResultExtParam(@Nullable HashMap<String, String> map) {
        this.payResultExtParam = map;
    }

    public final void setPayerAccountType(@Nullable Integer num) {
        this.payerAccountType = num;
    }

    public final void setPayerBankName(@Nullable String str) {
        this.payerBankName = str;
    }

    public final void setPayerCardNo(@Nullable String str) {
        this.payerCardNo = str;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setPendingCouponRemark(@Nullable String str) {
        this.pendingCouponRemark = str;
    }

    public final void setRechargePIN(@Nullable String str) {
        this.rechargePIN = str;
    }

    public final void setRedeemCode(@Nullable String str) {
        this.redeemCode = str;
    }

    public final void setRedeemCodeDisplay(@Nullable String str) {
        this.redeemCodeDisplay = str;
    }

    public final void setRedeemDesc(@Nullable String str) {
        this.redeemDesc = str;
    }

    public final void setRedeemNote(@Nullable String str) {
        this.redeemNote = str;
    }

    public final void setRedeemPin(@Nullable String str) {
        this.redeemPin = str;
    }

    public final void setRedemptionUrl(@Nullable String str) {
        this.redemptionUrl = str;
    }

    public final void setRenewal(@Nullable Boolean bool) {
        this.renewal = bool;
    }

    public final void setStatusReplenishInfo(@Nullable String str) {
        this.statusReplenishInfo = str;
    }

    public final void setSubscribeTips(@Nullable String str) {
        this.subscribeTips = str;
    }

    public final void setTokenName(@Nullable String str) {
        this.tokenName = str;
    }

    public final void setUnclaimedReturnPoint(@Nullable Long l5) {
        this.unclaimedReturnPoint = l5;
    }
}
