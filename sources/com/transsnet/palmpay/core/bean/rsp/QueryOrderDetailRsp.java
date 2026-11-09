package com.transsnet.palmpay.core.bean.rsp;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000289B·\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010.\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103¢\u0006\u0004\b4\u00105R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010 \u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0012\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0014\u0010%\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00106R\u0012\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u00107R\u0012\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u00106R\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp;", "", "orderNo", "", "transType", "payId", "orderStatus", "", "orderStatusDesc", "payerBankCard", "payerBankCode", "payerBankName", "payerBankUrl", "payerName", "payerHeadImage", "payerMobileNo", "payerMemberId", "payeeMobileNo", "payeeName", "payeeMappingCode", "payeeMerchantName", "payeeShopName", "payeeFee", "", "payFee", "payeeVat", "amount", "deductionPointAmount", "payAmount", "returnPoint", "couponId", "couponAmount", "discountAmount", "errorMessage", "payTypeDesc", "paymentTypeDesc", "orderSuccessTime", "createTime", "remark", "receiptDesc", "returnPointFlag", "", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "cashEarned", "paymentMethods", "", "Lcom/transsnet/palmpay/core/bean/rsp/PaymentMethodComb;", "orderResultList", "Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp$OrderResultItemBean;", "orderResultKeyDetail", "Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp$OrderResultKeyDetailBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/transsnet/palmpay/core/bean/BillProcessDetail;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp$OrderResultKeyDetailBean;)V", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "OrderResultItemBean", "OrderResultKeyDetailBean", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryOrderDetailRsp {

    @JvmField
    @Nullable
    public final Long amount;

    @JvmField
    @Nullable
    public Long cashEarned;

    @JvmField
    @Nullable
    public final Long couponAmount;

    @JvmField
    @Nullable
    public final Long couponId;

    @JvmField
    @Nullable
    public final Long createTime;

    @JvmField
    @Nullable
    public final Long deductionPointAmount;

    @JvmField
    @Nullable
    public final Long discountAmount;

    @JvmField
    @Nullable
    public final String errorMessage;

    @JvmField
    @Nullable
    public final String orderNo;

    @JvmField
    @Nullable
    public OrderResultKeyDetailBean orderResultKeyDetail;

    @JvmField
    @Nullable
    public List<OrderResultItemBean> orderResultList;

    @JvmField
    public final int orderStatus;

    @JvmField
    @Nullable
    public final String orderStatusDesc;

    @JvmField
    @Nullable
    public final BillProcessDetail orderStatusInfo;

    @JvmField
    @Nullable
    public final Long orderSuccessTime;

    @JvmField
    @Nullable
    public final Long payAmount;

    @JvmField
    @Nullable
    public final Long payFee;

    @JvmField
    @Nullable
    public final String payId;

    @JvmField
    @Nullable
    public final String payTypeDesc;

    @JvmField
    @Nullable
    public final Long payeeFee;

    @JvmField
    @Nullable
    public final String payeeMappingCode;

    @JvmField
    @Nullable
    public final String payeeMerchantName;

    @JvmField
    @Nullable
    public final String payeeMobileNo;

    @JvmField
    @Nullable
    public final String payeeName;

    @JvmField
    @Nullable
    public final String payeeShopName;

    @JvmField
    @Nullable
    public final Long payeeVat;

    @JvmField
    @Nullable
    public final String payerBankCard;

    @JvmField
    @Nullable
    public final String payerBankCode;

    @JvmField
    @Nullable
    public final String payerBankName;

    @JvmField
    @Nullable
    public final String payerBankUrl;

    @JvmField
    @Nullable
    public final String payerHeadImage;

    @JvmField
    @Nullable
    public final String payerMemberId;

    @JvmField
    @Nullable
    public final String payerMobileNo;

    @JvmField
    @Nullable
    public final String payerName;

    @JvmField
    @Nullable
    public List<PaymentMethodComb> paymentMethods;

    @JvmField
    @Nullable
    public final String paymentTypeDesc;

    @JvmField
    @Nullable
    public final String receiptDesc;

    @JvmField
    @Nullable
    public final String remark;

    @JvmField
    @Nullable
    public final Long returnPoint;

    @JvmField
    @Nullable
    public final Boolean returnPointFlag;

    @JvmField
    @Nullable
    public final String transType;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp$OrderResultItemBean;", "", "contentKey", "", "contentValue", "contentSubKey", "contentSubValue", "contentSubUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderResultItemBean {

        @JvmField
        @Nullable
        public String contentKey;

        @JvmField
        @Nullable
        public String contentSubKey;

        @JvmField
        @Nullable
        public String contentSubUrl;

        @JvmField
        @Nullable
        public String contentSubValue;

        @JvmField
        @Nullable
        public String contentValue;

        public OrderResultItemBean() {
            this(null, null, null, null, null, 31, null);
        }

        public OrderResultItemBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.contentKey = str;
            this.contentValue = str2;
            this.contentSubKey = str3;
            this.contentSubValue = str4;
            this.contentSubUrl = str5;
        }

        public /* synthetic */ OrderResultItemBean(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/QueryOrderDetailRsp$OrderResultKeyDetailBean;", "", "paymentMethodKey", "", "paymentMethodValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderResultKeyDetailBean {

        @JvmField
        @Nullable
        public String paymentMethodKey;

        @JvmField
        @Nullable
        public String paymentMethodValue;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderResultKeyDetailBean() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public OrderResultKeyDetailBean(@Nullable String str, @Nullable String str2) {
            this.paymentMethodKey = str;
            this.paymentMethodValue = str2;
        }

        public /* synthetic */ OrderResultKeyDetailBean(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
        }
    }

    public QueryOrderDetailRsp(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable Long l17, @Nullable Long l18, @Nullable String str21, @Nullable String str22, @Nullable Boolean bool, @Nullable BillProcessDetail billProcessDetail, @Nullable Long l19, @Nullable List<PaymentMethodComb> list, @Nullable List<OrderResultItemBean> list2, @Nullable OrderResultKeyDetailBean orderResultKeyDetailBean) {
        this.orderNo = str;
        this.transType = str2;
        this.payId = str3;
        this.orderStatus = i7;
        this.orderStatusDesc = str4;
        this.payerBankCard = str5;
        this.payerBankCode = str6;
        this.payerBankName = str7;
        this.payerBankUrl = str8;
        this.payerName = str9;
        this.payerHeadImage = str10;
        this.payerMobileNo = str11;
        this.payerMemberId = str12;
        this.payeeMobileNo = str13;
        this.payeeName = str14;
        this.payeeMappingCode = str15;
        this.payeeMerchantName = str16;
        this.payeeShopName = str17;
        this.payeeFee = l5;
        this.payFee = l6;
        this.payeeVat = l8;
        this.amount = l10;
        this.deductionPointAmount = l11;
        this.payAmount = l12;
        this.returnPoint = l13;
        this.couponId = l14;
        this.couponAmount = l15;
        this.discountAmount = l16;
        this.errorMessage = str18;
        this.payTypeDesc = str19;
        this.paymentTypeDesc = str20;
        this.orderSuccessTime = l17;
        this.createTime = l18;
        this.remark = str21;
        this.receiptDesc = str22;
        this.returnPointFlag = bool;
        this.orderStatusInfo = billProcessDetail;
        this.cashEarned = l19;
        this.paymentMethods = list;
        this.orderResultList = list2;
        this.orderResultKeyDetail = orderResultKeyDetailBean;
    }

    public /* synthetic */ QueryOrderDetailRsp(String str, String str2, String str3, int i7, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Long l5, Long l6, Long l8, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, String str18, String str19, String str20, Long l17, Long l18, String str21, String str22, Boolean bool, BillProcessDetail billProcessDetail, Long l19, List list, List list2, OrderResultKeyDetailBean orderResultKeyDetailBean, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i7, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, l5, l6, l8, l10, l11, l12, l13, l14, l15, l16, str18, str19, str20, l17, l18, str21, str22, (i11 & 8) != 0 ? Boolean.FALSE : bool, (i11 & 16) != 0 ? null : billProcessDetail, (i11 & 32) != 0 ? null : l19, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : list2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : orderResultKeyDetailBean);
    }
}
