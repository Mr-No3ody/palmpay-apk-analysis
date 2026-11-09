package com.flexibank.sdk.cashier.bean;

import W3.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp;", "LW3/f;", "<init>", "()V", "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "e", "()Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "setData", "(Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;)V", "DataBean", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankPayByOrderResp extends f {

    @Nullable
    private DataBean data;

    @Parcelize
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010)\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\"\u0010,\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\"\u00102\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001e\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR$\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010H\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR$\u0010K\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR$\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR$\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR$\u0010T\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR$\u0010W\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR$\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR$\u0010]\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\b¨\u0006`"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankPayByOrderResp$DataBean;", "Landroid/os/Parcelable;", "", "businessData", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setBusinessData", "(Ljava/lang/String;)V", "orderData", "g", "setOrderData", "orderNo", "h", "setOrderNo", "", "flag", "Z", "f", "()Z", "setFlag", "(Z)V", "payId", "j", "setPayId", "subPayId", "p", "setSubPayId", "", "verifyMethod", "I", "r", "()I", "setVerifyMethod", "(I)V", "url", "q", "setUrl", "payRouteId", "k", "setPayRouteId", "queryMaxSec", "o", "setQueryMaxSec", "payStatus", "l", "setPayStatus", "payStatusDesc", "m", "setPayStatusDesc", "extVerifyMethod", "getExtVerifyMethod", "setExtVerifyMethod", "otpReference", "i", "setOtpReference", "errorMsg", "e", "setErrorMsg", "successfulDesc", "getSuccessfulDesc", "setSuccessfulDesc", "pendingDesc", "getPendingDesc", "setPendingDesc", "", "pendingAcTime", "J", "getPendingAcTime", "()J", "setPendingAcTime", "(J)V", "pendingAcTips", "getPendingAcTips", "setPendingAcTips", "discountTips", "getDiscountTips", "setDiscountTips", "pendingCountdownAcTips", "getPendingCountdownAcTips", "setPendingCountdownAcTips", "promptMessage", "n", "setPromptMessage", "channelTransactionId", "d", "setChannelTransactionId", "transType", "getTransType", "setTransType", "verifyTransactionId", "getVerifyTransactionId", "setVerifyTransactionId", "clientCfg", "getClientCfg", "setClientCfg", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataBean implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DataBean> CREATOR = new a();

        @Nullable
        private String businessData;

        @Nullable
        private String channelTransactionId;

        @Nullable
        private String clientCfg;

        @Nullable
        private String discountTips;

        @Nullable
        private String errorMsg;
        private int extVerifyMethod;
        private boolean flag;

        @Nullable
        private String orderData;

        @Nullable
        private String orderNo;

        @Nullable
        private String otpReference;

        @Nullable
        private String payId;

        @Nullable
        private String payRouteId;
        private int payStatus;

        @Nullable
        private String payStatusDesc;
        private long pendingAcTime;

        @Nullable
        private String pendingAcTips;

        @Nullable
        private String pendingCountdownAcTips;

        @Nullable
        private String pendingDesc;

        @Nullable
        private String promptMessage;
        private int queryMaxSec;

        @Nullable
        private String subPayId;

        @Nullable
        private String successfulDesc;

        @Nullable
        private String transType;

        @Nullable
        private String url;
        private int verifyMethod;

        @Nullable
        private String verifyTransactionId;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DataBean> {
            @Override // android.os.Parcelable.Creator
            public final DataBean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DataBean[] newArray(int i7) {
                return new DataBean[i7];
            }
        }

        public DataBean() {
            this(null, null, null, false, null, null, 0, null, null, 0, 0, null, 0, null, null, null, null, 0L, null, null, null, null, null, null, null, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBusinessData() {
            return this.businessData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getChannelTransactionId() {
            return this.channelTransactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getFlag() {
            return this.flag;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getOrderData() {
            return this.orderData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getOrderNo() {
            return this.orderNo;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getOtpReference() {
            return this.otpReference;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getPayId() {
            return this.payId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getPayRouteId() {
            return this.payRouteId;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getPayStatus() {
            return this.payStatus;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getPayStatusDesc() {
            return this.payStatusDesc;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getPromptMessage() {
            return this.promptMessage;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getQueryMaxSec() {
            return this.queryMaxSec;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getSubPayId() {
            return this.subPayId;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getVerifyMethod() {
            return this.verifyMethod;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.businessData);
            dest.writeString(this.orderData);
            dest.writeString(this.orderNo);
            dest.writeInt(this.flag ? 1 : 0);
            dest.writeString(this.payId);
            dest.writeString(this.subPayId);
            dest.writeInt(this.verifyMethod);
            dest.writeString(this.url);
            dest.writeString(this.payRouteId);
            dest.writeInt(this.queryMaxSec);
            dest.writeInt(this.payStatus);
            dest.writeString(this.payStatusDesc);
            dest.writeInt(this.extVerifyMethod);
            dest.writeString(this.otpReference);
            dest.writeString(this.errorMsg);
            dest.writeString(this.successfulDesc);
            dest.writeString(this.pendingDesc);
            dest.writeLong(this.pendingAcTime);
            dest.writeString(this.pendingAcTips);
            dest.writeString(this.discountTips);
            dest.writeString(this.pendingCountdownAcTips);
            dest.writeString(this.promptMessage);
            dest.writeString(this.channelTransactionId);
            dest.writeString(this.transType);
            dest.writeString(this.verifyTransactionId);
            dest.writeString(this.clientCfg);
        }

        public DataBean(String str, String str2, String str3, boolean z3, String str4, String str5, int i7, String str6, String str7, int i10, int i11, String str8, int i12, String str9, String str10, String str11, String str12, long j6, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
            this.businessData = str;
            this.orderData = str2;
            this.orderNo = str3;
            this.flag = z3;
            this.payId = str4;
            this.subPayId = str5;
            this.verifyMethod = i7;
            this.url = str6;
            this.payRouteId = str7;
            this.queryMaxSec = i10;
            this.payStatus = i11;
            this.payStatusDesc = str8;
            this.extVerifyMethod = i12;
            this.otpReference = str9;
            this.errorMsg = str10;
            this.successfulDesc = str11;
            this.pendingDesc = str12;
            this.pendingAcTime = j6;
            this.pendingAcTips = str13;
            this.discountTips = str14;
            this.pendingCountdownAcTips = str15;
            this.promptMessage = str16;
            this.channelTransactionId = str17;
            this.transType = str18;
            this.verifyTransactionId = str19;
            this.clientCfg = str20;
        }
    }

    public FlexiBankPayByOrderResp() {
        super(0);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DataBean getData() {
        return this.data;
    }
}
