package com.transsnet.palmpay.core.bean;

import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0014\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR \u0010\u0017\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR \u0010\u001a\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR \u0010\u001d\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR \u0010 \u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\u001e\u0010#\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001e\u0010&\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001e\u0010)\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR \u0010,\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR \u0010/\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR \u00102\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000fR \u00105\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR \u00108\u001a\u0004\u0018\u00010\u000b8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u000fR\u001e\u0010;\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR\u001e\u0010>\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR\u001e\u0010A\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR\u001a\u0010D\u001a\u00020EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bK\u0010\r\"\u0004\bL\u0010\u000fR\u001e\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/transsnet/palmpay/core/bean/BaseOrderDetailBean;", "", "<init>", "()V", "categoryId", "", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "payAmount", "", "getPayAmount", "()Ljava/lang/Long;", "setPayAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "businessAmount", "getBusinessAmount", "setBusinessAmount", "payFee", "getPayFee", "setPayFee", "vatFee", "getVatFee", "setVatFee", "loyaltyPoint", "getLoyaltyPoint", "setLoyaltyPoint", "couponAmount", "getCouponAmount", "setCouponAmount", "discountAmount", "getDiscountAmount", "setDiscountAmount", "orderNo", "getOrderNo", "setOrderNo", "transTypeName", "getTransTypeName", "setTransTypeName", "transType", "getTransType", "setTransType", "returnPoint", "getReturnPoint", "setReturnPoint", "returnBonus", "getReturnBonus", "setReturnBonus", "bonus", "getBonus", "setBonus", "createTime", "getCreateTime", "setCreateTime", "updateTime", "getUpdateTime", "setUpdateTime", "payeeQRAccountNo", "getPayeeQRAccountNo", "setPayeeQRAccountNo", "partnerAccountNo", "getPartnerAccountNo", "setPartnerAccountNo", "paymentMethod", "getPaymentMethod", "setPaymentMethod", "businessType", "", "getBusinessType", "()I", "setBusinessType", "(I)V", "commissionAmount", "getCommissionAmount", "setCommissionAmount", "autoRenewal", "", "getAutoRenewal", "()Ljava/lang/Boolean;", "setAutoRenewal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "extendFields", "", "Lcom/transsnet/palmpay/custom_view/bean/OrderDetailItemBean;", "ticketExtendFields", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseOrderDetailBean {
    private int businessType;

    @JvmField
    @Nullable
    public List<OrderDetailItemBean> extendFields;

    @JvmField
    @Nullable
    public List<OrderDetailItemBean> ticketExtendFields;

    @Nullable
    private String categoryId = "";

    @Nullable
    private Long payAmount = 0L;

    @Nullable
    private Long businessAmount = 0L;

    @Nullable
    private Long payFee = 0L;

    @Nullable
    private Long vatFee = 0L;

    @Nullable
    private Long loyaltyPoint = 0L;

    @Nullable
    private Long couponAmount = 0L;

    @Nullable
    private Long discountAmount = 0L;

    @Nullable
    private String orderNo = "";

    @Nullable
    private String transTypeName = "";

    @Nullable
    private String transType = "";

    @Nullable
    private Long returnPoint = 0L;

    @Nullable
    private Long returnBonus = 0L;

    @Nullable
    private Long bonus = 0L;

    @Nullable
    private Long createTime = 0L;

    @Nullable
    private Long updateTime = 0L;

    @Nullable
    private String payeeQRAccountNo = "";

    @Nullable
    private String partnerAccountNo = "";

    @Nullable
    private String paymentMethod = "";

    @Nullable
    private Long commissionAmount = 0L;

    @Nullable
    private Boolean autoRenewal = Boolean.FALSE;

    @Nullable
    public final Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    @Nullable
    public final Long getBonus() {
        Long l5 = this.bonus;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getBusinessAmount() {
        Long l5 = this.businessAmount;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCategoryId() {
        String str = this.categoryId;
        return str == null ? "" : str;
    }

    @Nullable
    public final Long getCommissionAmount() {
        return this.commissionAmount;
    }

    @Nullable
    public final Long getCouponAmount() {
        Long l5 = this.couponAmount;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getCreateTime() {
        Long l5 = this.createTime;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getDiscountAmount() {
        Long l5 = this.discountAmount;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getLoyaltyPoint() {
        Long l5 = this.loyaltyPoint;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final String getOrderNo() {
        String str = this.orderNo;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getPartnerAccountNo() {
        String str = this.partnerAccountNo;
        return str == null ? "" : str;
    }

    @Nullable
    public final Long getPayAmount() {
        Long l5 = this.payAmount;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getPayFee() {
        Long l5 = this.payFee;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final String getPayeeQRAccountNo() {
        String str = this.payeeQRAccountNo;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getPaymentMethod() {
        String str = this.paymentMethod;
        return str == null ? "" : str;
    }

    @Nullable
    public final Long getReturnBonus() {
        Long l5 = this.returnBonus;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getReturnPoint() {
        Long l5 = this.returnPoint;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final String getTransType() {
        String str = this.transType;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getTransTypeName() {
        String str = this.transTypeName;
        return str == null ? "" : str;
    }

    @Nullable
    public final Long getUpdateTime() {
        Long l5 = this.updateTime;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    @Nullable
    public final Long getVatFee() {
        Long l5 = this.vatFee;
        if (l5 == null) {
            return 0L;
        }
        return l5;
    }

    public final void setAutoRenewal(@Nullable Boolean bool) {
        this.autoRenewal = bool;
    }

    public final void setBonus(@Nullable Long l5) {
        this.bonus = l5;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setBusinessType(int i7) {
        this.businessType = i7;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setCommissionAmount(@Nullable Long l5) {
        this.commissionAmount = l5;
    }

    public final void setCouponAmount(@Nullable Long l5) {
        this.couponAmount = l5;
    }

    public final void setCreateTime(@Nullable Long l5) {
        this.createTime = l5;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setLoyaltyPoint(@Nullable Long l5) {
        this.loyaltyPoint = l5;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setPartnerAccountNo(@Nullable String str) {
        this.partnerAccountNo = str;
    }

    public final void setPayAmount(@Nullable Long l5) {
        this.payAmount = l5;
    }

    public final void setPayFee(@Nullable Long l5) {
        this.payFee = l5;
    }

    public final void setPayeeQRAccountNo(@Nullable String str) {
        this.payeeQRAccountNo = str;
    }

    public final void setPaymentMethod(@Nullable String str) {
        this.paymentMethod = str;
    }

    public final void setReturnBonus(@Nullable Long l5) {
        this.returnBonus = l5;
    }

    public final void setReturnPoint(@Nullable Long l5) {
        this.returnPoint = l5;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setTransTypeName(@Nullable String str) {
        this.transTypeName = str;
    }

    public final void setUpdateTime(@Nullable Long l5) {
        this.updateTime = l5;
    }

    public final void setVatFee(@Nullable Long l5) {
        this.vatFee = l5;
    }
}
