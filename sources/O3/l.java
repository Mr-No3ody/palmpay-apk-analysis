package O3;

import com.flexibank.sdk.core.bean.FlexiBankEarlyRefundBean;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"LO3/l;", "LW3/f;", "<init>", "()V", "LO3/l$b;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "LO3/l$b;", "getData", "()LO3/l$b;", "setData", "(LO3/l$b;)V", "b", "d", "a", "c", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends W3.f {

    @Nullable
    private b data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"LO3/l$a;", "", "<init>", "()V", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "", "amount", "J", "getAmount", "()J", "setAmount", "(J)V", "show", "getShow", "setShow", "tips", "getTips", "setTips", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private long amount;

        @Nullable
        private String show;

        @Nullable
        private String tips;

        @Nullable
        private String type;
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\"\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\"\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010\u0011R\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\r\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0011R\"\u0010:\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R\"\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\r\u001a\u0004\b>\u0010\u000f\"\u0004\b?\u0010\u0011R\"\u0010@\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001a\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR$\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR\"\u0010F\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\r\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010\u0011R\"\u0010I\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\r\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010\u0011R$\u0010L\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\b\"\u0004\bN\u0010\nR\"\u0010O\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\r\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011R\"\u0010R\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\r\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010\u0011R\"\u0010U\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\r\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R$\u0010X\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\b\"\u0004\bZ\u0010\nR\"\u0010[\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\u001a\u001a\u0004\b\\\u0010\u001c\"\u0004\b]\u0010\u001eR\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010`\u001a\u0004\bf\u0010b\"\u0004\bg\u0010dR\"\u0010h\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010`\u001a\u0004\bi\u0010b\"\u0004\bj\u0010dR\"\u0010k\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010`\u001a\u0004\bl\u0010b\"\u0004\bm\u0010dR\"\u0010n\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010`\u001a\u0004\bo\u0010b\"\u0004\bp\u0010dR\"\u0010q\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010\r\u001a\u0004\br\u0010\u000f\"\u0004\bs\u0010\u0011R\"\u0010t\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010\r\u001a\u0004\bu\u0010\u000f\"\u0004\bv\u0010\u0011R\"\u0010w\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010\r\u001a\u0004\bx\u0010\u000f\"\u0004\by\u0010\u0011R\"\u0010z\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010`\u001a\u0004\b{\u0010b\"\u0004\b|\u0010dR\"\u0010}\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010`\u001a\u0004\b~\u0010b\"\u0004\b\u007f\u0010dR(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u0006\u001a\u0005\b\u0081\u0001\u0010\b\"\u0005\b\u0082\u0001\u0010\nR,\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R(\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\b\"\u0005\b\u008c\u0001\u0010\nR(\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\b\"\u0005\b\u008f\u0001\u0010\nR(\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\b\"\u0005\b\u0092\u0001\u0010\nR,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R,\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R&\u0010¡\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010\r\u001a\u0005\b¢\u0001\u0010\u000f\"\u0005\b£\u0001\u0010\u0011R,\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R,\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001¨\u0006²\u0001"}, d2 = {"LO3/l$b;", "", "<init>", "()V", "", "seqId", "Ljava/lang/String;", "getSeqId", "()Ljava/lang/String;", "setSeqId", "(Ljava/lang/String;)V", "", "amount", "J", "getAmount", "()J", "setAmount", "(J)V", "couponAmount", "getCouponAmount", "setCouponAmount", "couponId", "getCouponId", "setCouponId", "", "deductionPoint", "I", "getDeductionPoint", "()I", "setDeductionPoint", "(I)V", "deductionPointAmount", "getDeductionPointAmount", "setDeductionPointAmount", "exchangeRate", "getExchangeRate", "setExchangeRate", "fee", "getFee", "setFee", "orderAmount", "getOrderAmount", "setOrderAmount", "payAmount", "getPayAmount", "setPayAmount", "payeeAmount", "getPayeeAmount", "setPayeeAmount", "payeeFee", "getPayeeFee", "setPayeeFee", "payeeVat", "getPayeeVat", "setPayeeVat", "platformFee", "getPlatformFee", "setPlatformFee", "platformVat", "getPlatformVat", "setPlatformVat", "returnAmount", "getReturnAmount", "setReturnAmount", "returnPoint", "getReturnPoint", "setReturnPoint", "shopName", "getShopName", "setShopName", "totalAmount", "getTotalAmount", "setTotalAmount", "discountAmount", "getDiscountAmount", "setDiscountAmount", "discountTariffName", "getDiscountTariffName", "setDiscountTariffName", "vat", "getVat", "setVat", "okcardFee", "getOkcardFee", "setOkcardFee", "payeeRebateAmount", "getPayeeRebateAmount", "setPayeeRebateAmount", "couponType", "getCouponType", "setCouponType", "availableCoupon", "getAvailableCoupon", "setAvailableCoupon", "", "showCoupon", "Z", "getShowCoupon", "()Z", "setShowCoupon", "(Z)V", "useCoupon", "getUseCoupon", "setUseCoupon", "useDiscount", "getUseDiscount", "setUseDiscount", "usePoint", "getUsePoint", "setUsePoint", "useBonus", "getUseBonus", "setUseBonus", "bonusAmount", "getBonusAmount", "setBonusAmount", "bonus", "getBonus", "setBonus", "returnBonus", "getReturnBonus", "setReturnBonus", "useReturnPoint", "getUseReturnPoint", "setUseReturnPoint", "earlyRefundEnable", "getEarlyRefundEnable", "setEarlyRefundEnable", "zeroFeeTips", "getZeroFeeTips", "setZeroFeeTips", "LO3/j;", "feeDetail", "LO3/j;", "getFeeDetail", "()LO3/j;", "setFeeDetail", "(LO3/j;)V", "interestPenaltyFeeTips", "getInterestPenaltyFeeTips", "setInterestPenaltyFeeTips", "riskMsg", "getRiskMsg", "setRiskMsg", "cacheKey", "getCacheKey", "setCacheKey", "LO3/l$d;", "availableItem", "LO3/l$d;", "getAvailableItem", "()LO3/l$d;", "setAvailableItem", "(LO3/l$d;)V", "LO3/l$a;", "commissionEarn", "LO3/l$a;", "getCommissionEarn", "()LO3/l$a;", "setCommissionEarn", "(LO3/l$a;)V", "payMentMethodsDiscount", "getPayMentMethodsDiscount", "setPayMentMethodsDiscount", "Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "earlyRefund", "Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "getEarlyRefund", "()Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;", "setEarlyRefund", "(Lcom/flexibank/sdk/core/bean/FlexiBankEarlyRefundBean;)V", "LO3/l$c;", "feeTips", "LO3/l$c;", "getFeeTips", "()LO3/l$c;", "setFeeTips", "(LO3/l$c;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        private long amount;
        private int availableCoupon;

        @Nullable
        private d availableItem;
        private long bonus;
        private long bonusAmount;

        @Nullable
        private String cacheKey;

        @Nullable
        private a commissionEarn;
        private long couponAmount;
        private long couponId;

        @Nullable
        private String couponType;
        private int deductionPoint;
        private long deductionPointAmount;
        private long discountAmount;

        @Nullable
        private String discountTariffName;

        @Nullable
        private FlexiBankEarlyRefundBean earlyRefund;
        private boolean earlyRefundEnable;
        private long exchangeRate;
        private long fee;

        @Nullable
        private j feeDetail;

        @Nullable
        private c feeTips;

        @Nullable
        private String interestPenaltyFeeTips;
        private long okcardFee;
        private long orderAmount;
        private long payAmount;
        private long payMentMethodsDiscount;
        private long payeeAmount;
        private long payeeFee;
        private long payeeRebateAmount;
        private long payeeVat;
        private long platformFee;
        private long platformVat;
        private long returnAmount;
        private long returnBonus;
        private int returnPoint;

        @Nullable
        private String riskMsg;

        @Nullable
        private String seqId;

        @Nullable
        private String shopName;
        private boolean showCoupon;
        private long totalAmount;
        private boolean useBonus;
        private boolean useCoupon;
        private boolean useDiscount;
        private boolean usePoint;
        private boolean useReturnPoint;
        private long vat;

        @Nullable
        private String zeroFeeTips;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"LO3/l$c;", "", "<init>", "()V", "", "tipsText", "Ljava/lang/String;", "getTipsText", "()Ljava/lang/String;", "setTipsText", "(Ljava/lang/String;)V", "tipsTitle", "getTipsTitle", "setTipsTitle", "confirmPaymentTips", "getConfirmPaymentTips", "setConfirmPaymentTips", "showConfirmPaymentTipsFlag", "getShowConfirmPaymentTipsFlag", "setShowConfirmPaymentTipsFlag", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        @Nullable
        private String confirmPaymentTips;

        @Nullable
        private String showConfirmPaymentTipsFlag;

        @Nullable
        private String tipsText;

        @Nullable
        private String tipsTitle;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LO3/l$d;", "", "<init>", "()V", "", "bonus", "J", "getBonus", "()J", "setBonus", "(J)V", "bonusAmount", "getBonusAmount", "setBonusAmount", "couponAvailableCount", "getCouponAvailableCount", "setCouponAvailableCount", "deductionPoint", "getDeductionPoint", "setDeductionPoint", "deductionPointAmount", "getDeductionPointAmount", "setDeductionPointAmount", "discountAmount", "getDiscountAmount", "setDiscountAmount", "", "showAvailable", "Z", "getShowAvailable", "()Z", "setShowAvailable", "(Z)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        private long bonus;
        private long bonusAmount;
        private long couponAvailableCount;
        private long deductionPoint;
        private long deductionPointAmount;
        private long discountAmount;
        private boolean showAvailable;
    }

    public l() {
        super(0);
    }
}
