package com.flexibank.sdk.cashier.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\bK\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0017\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR$\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR$\u0010A\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\"\u0010D\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0012\u001a\u0004\bE\u0010\u0014\"\u0004\bF\u0010\u0016R\"\u0010G\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u000b\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u000fR$\u0010J\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\bR\"\u0010M\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0012\u001a\u0004\bN\u0010\u0014\"\u0004\bO\u0010\u0016R\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u000b\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR\"\u0010S\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u000b\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010\u000fR$\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010\u000b\u001a\u0004\bZ\u0010\r\"\u0004\b[\u0010\u000fR\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR$\u0010f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR$\u0010i\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR\"\u0010l\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010\u0012\u001a\u0004\bm\u0010\u0014\"\u0004\bn\u0010\u0016R\"\u0010o\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010^\u001a\u0004\bp\u0010`\"\u0004\bq\u0010bR\"\u0010r\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010^\u001a\u0004\bs\u0010`\"\u0004\bt\u0010bR\"\u0010u\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010^\u001a\u0004\bv\u0010`\"\u0004\bw\u0010bR\"\u0010x\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010^\u001a\u0004\by\u0010`\"\u0004\bz\u0010b¨\u0006{"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierPaymentMethodBean;", "Landroid/os/Parcelable;", "", "accountId", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setAccountId", "(Ljava/lang/String;)V", "", "accountStatus", "I", "getAccountStatus", "()I", "setAccountStatus", "(I)V", "", "availableBalance", "J", "e", "()J", "setAvailableBalance", "(J)V", "cardNo", "j", "setCardNo", "cardType", "getCardType", "setCardType", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "setCountryCode", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", "cvv", "l", "setCvv", "cardPin", "k", "setCardPin", "expiryMonth", "p", "setExpiryMonth", "expiryYear", "q", "setExpiryYear", "memberId", "getMemberId", "setMemberId", "partnerAccNo", "getPartnerAccNo", "setPartnerAccNo", "partnerBankCode", "getPartnerBankCode", "setPartnerBankCode", "remark", "getRemark", "setRemark", "bankName", "h", "setBankName", "bankUrl", "i", "setBankUrl", "bankCode", "g", "setBankCode", "reservedBalance", "getReservedBalance", "setReservedBalance", "senderAccountType", "u", "setSenderAccountType", "token", "getToken", "setToken", "unclearedBalance", "getUnclearedBalance", "setUnclearedBalance", "payType", "r", "setPayType", "reUseable", "t", "setReUseable", "bankAccountNo", "f", "setBankAccountNo", "defaultPayFlag", "getDefaultPayFlag", "setDefaultPayFlag", "", "enable", "Z", "n", "()Z", "setEnable", "(Z)V", "tips", "w", "setTips", "acTips", "c", "setAcTips", "okcardTips", "getOkcardTips", "setOkcardTips", "paymentMethodsDiscount", "s", "A", "expiryFlag", "o", "setExpiryFlag", "needSign", "getNeedSign", "z", "defaultMethodFlag", "m", "setDefaultMethodFlag", "showInPreview", "v", "setShowInPreview", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankCashierPaymentMethodBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCashierPaymentMethodBean> CREATOR = new a();

    @Nullable
    private String acTips;

    @Nullable
    private String accountId;
    private int accountStatus;
    private long availableBalance;

    @Nullable
    private String bankAccountNo;

    @Nullable
    private String bankCode;

    @Nullable
    private String bankName;

    @Nullable
    private String bankUrl;

    @Nullable
    private String cardNo;

    @Nullable
    private String cardPin;

    @Nullable
    private String cardType;

    @Nullable
    private String countryCode;

    @Nullable
    private String currency;

    @Nullable
    private String cvv;
    private boolean defaultMethodFlag;
    private int defaultPayFlag;
    private boolean enable;
    private boolean expiryFlag;

    @Nullable
    private String expiryMonth;

    @Nullable
    private String expiryYear;

    @Nullable
    private String memberId;
    private boolean needSign;

    @Nullable
    private String okcardTips;

    @Nullable
    private String partnerAccNo;

    @Nullable
    private String partnerBankCode;
    private int payType;
    private long paymentMethodsDiscount;
    private int reUseable;

    @Nullable
    private String remark;
    private long reservedBalance;
    private int senderAccountType;
    private boolean showInPreview;

    @Nullable
    private String tips;

    @Nullable
    private String token;
    private long unclearedBalance;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCashierPaymentMethodBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierPaymentMethodBean createFromParcel(Parcel parcel) {
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i7 = parcel.readInt();
            long j6 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            long j10 = parcel.readLong();
            int i10 = parcel.readInt();
            String string17 = parcel.readString();
            long j11 = parcel.readLong();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            String string18 = parcel.readString();
            int i13 = parcel.readInt();
            boolean z8 = false;
            if (parcel.readInt() != 0) {
                z8 = true;
                z3 = true;
            } else {
                z3 = true;
            }
            String string19 = parcel.readString();
            boolean z10 = z3;
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            boolean z11 = z10;
            long j12 = parcel.readLong();
            if (parcel.readInt() == 0) {
                z11 = z8;
            }
            if (parcel.readInt() == 0) {
                z11 = z8;
            }
            if (parcel.readInt() == 0) {
                z11 = z8;
            }
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new FlexiBankCashierPaymentMethodBean(string, i7, j6, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, j10, i10, string17, j11, i11, i12, string18, i13, z8, string19, string20, string21, j12, z11, z11, z11, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierPaymentMethodBean[] newArray(int i7) {
            return new FlexiBankCashierPaymentMethodBean[i7];
        }
    }

    public FlexiBankCashierPaymentMethodBean() {
        this(0);
    }

    public final void A(long j6) {
        this.paymentMethodsDiscount = j6;
    }

    public final void B(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.accountId);
        parcel.writeInt(this.accountStatus);
        parcel.writeLong(this.availableBalance);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.cardType);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.cvv);
        parcel.writeString(this.cardPin);
        parcel.writeString(this.expiryMonth);
        parcel.writeString(this.expiryYear);
        parcel.writeString(this.memberId);
        parcel.writeString(this.partnerAccNo);
        parcel.writeString(this.partnerBankCode);
        parcel.writeString(this.remark);
        parcel.writeString(this.bankName);
        parcel.writeString(this.bankUrl);
        parcel.writeString(this.bankCode);
        parcel.writeLong(this.reservedBalance);
        parcel.writeInt(this.senderAccountType);
        parcel.writeString(this.token);
        parcel.writeLong(this.unclearedBalance);
        parcel.writeInt(this.payType);
        parcel.writeInt(this.reUseable);
        parcel.writeString(this.bankAccountNo);
        parcel.writeInt(this.defaultPayFlag);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.tips);
        parcel.writeString(this.acTips);
        parcel.writeString(this.okcardTips);
        parcel.writeLong(this.paymentMethodsDiscount);
        parcel.writeByte(this.expiryFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needSign ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.defaultMethodFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showInPreview ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAcTips() {
        return this.acTips;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getAvailableBalance() {
        return this.availableBalance;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FlexiBankCashierPaymentMethodBean) {
            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) obj;
            int i7 = flexiBankCashierPaymentMethodBean.payType;
            int i10 = this.payType;
            if (i7 == i10) {
                if (i10 == 1) {
                    return Intrinsics.c(this.accountId, flexiBankCashierPaymentMethodBean.accountId);
                }
                if (i10 != 2) {
                    return false;
                }
                return Intrinsics.c(this.cardNo, flexiBankCashierPaymentMethodBean.cardNo);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBankAccountNo() {
        return this.bankAccountNo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getBankUrl() {
        return this.bankUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCardPin() {
        return this.cardPin;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getDefaultMethodFlag() {
        return this.defaultMethodFlag;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getExpiryFlag() {
        return this.expiryFlag;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getPaymentMethodsDiscount() {
        return this.paymentMethodsDiscount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getReUseable() {
        return this.reUseable;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getSenderAccountType() {
        return this.senderAccountType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getShowInPreview() {
        return this.showInPreview;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountId);
        dest.writeInt(this.accountStatus);
        dest.writeLong(this.availableBalance);
        dest.writeString(this.cardNo);
        dest.writeString(this.cardType);
        dest.writeString(this.countryCode);
        dest.writeString(this.currency);
        dest.writeString(this.cvv);
        dest.writeString(this.cardPin);
        dest.writeString(this.expiryMonth);
        dest.writeString(this.expiryYear);
        dest.writeString(this.memberId);
        dest.writeString(this.partnerAccNo);
        dest.writeString(this.partnerBankCode);
        dest.writeString(this.remark);
        dest.writeString(this.bankName);
        dest.writeString(this.bankUrl);
        dest.writeString(this.bankCode);
        dest.writeLong(this.reservedBalance);
        dest.writeInt(this.senderAccountType);
        dest.writeString(this.token);
        dest.writeLong(this.unclearedBalance);
        dest.writeInt(this.payType);
        dest.writeInt(this.reUseable);
        dest.writeString(this.bankAccountNo);
        dest.writeInt(this.defaultPayFlag);
        dest.writeInt(this.enable ? 1 : 0);
        dest.writeString(this.tips);
        dest.writeString(this.acTips);
        dest.writeString(this.okcardTips);
        dest.writeLong(this.paymentMethodsDiscount);
        dest.writeInt(this.expiryFlag ? 1 : 0);
        dest.writeInt(this.needSign ? 1 : 0);
        dest.writeInt(this.defaultMethodFlag ? 1 : 0);
        dest.writeInt(this.showInPreview ? 1 : 0);
    }

    public final boolean x() {
        int i7 = this.senderAccountType;
        return i7 == 1 || i7 == 46 || i7 == 28 || this.payType == 36;
    }

    public final void y(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.accountId = parcel.readString();
        this.accountStatus = parcel.readInt();
        this.availableBalance = parcel.readLong();
        this.cardNo = parcel.readString();
        this.cardType = parcel.readString();
        this.countryCode = parcel.readString();
        this.currency = parcel.readString();
        this.cvv = parcel.readString();
        this.cardPin = parcel.readString();
        this.expiryMonth = parcel.readString();
        this.expiryYear = parcel.readString();
        this.memberId = parcel.readString();
        this.partnerAccNo = parcel.readString();
        this.partnerBankCode = parcel.readString();
        this.remark = parcel.readString();
        this.bankName = parcel.readString();
        this.bankUrl = parcel.readString();
        this.bankCode = parcel.readString();
        this.reservedBalance = parcel.readLong();
        this.senderAccountType = parcel.readInt();
        this.token = parcel.readString();
        this.unclearedBalance = parcel.readLong();
        this.payType = parcel.readInt();
        this.reUseable = parcel.readInt();
        this.bankAccountNo = parcel.readString();
        this.defaultPayFlag = parcel.readInt();
        this.enable = parcel.readByte() != 0;
        this.tips = parcel.readString();
        this.acTips = parcel.readString();
        this.okcardTips = parcel.readString();
        this.paymentMethodsDiscount = parcel.readLong();
        this.expiryFlag = parcel.readByte() != 0;
        this.needSign = parcel.readByte() != 0;
        this.defaultMethodFlag = parcel.readByte() != 0;
        this.showInPreview = parcel.readByte() != 0;
    }

    public final void z() {
        this.needSign = true;
    }

    public /* synthetic */ FlexiBankCashierPaymentMethodBean(int i7) {
        this(null, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0, null, 0L, 0, 0, null, 0, false, null, null, null, 0L, false, false, false, false);
    }

    public FlexiBankCashierPaymentMethodBean(String str, int i7, long j6, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, long j10, int i10, String str17, long j11, int i11, int i12, String str18, int i13, boolean z3, String str19, String str20, String str21, long j12, boolean z8, boolean z10, boolean z11, boolean z12) {
        this.accountId = str;
        this.accountStatus = i7;
        this.availableBalance = j6;
        this.cardNo = str2;
        this.cardType = str3;
        this.countryCode = str4;
        this.currency = str5;
        this.cvv = str6;
        this.cardPin = str7;
        this.expiryMonth = str8;
        this.expiryYear = str9;
        this.memberId = str10;
        this.partnerAccNo = str11;
        this.partnerBankCode = str12;
        this.remark = str13;
        this.bankName = str14;
        this.bankUrl = str15;
        this.bankCode = str16;
        this.reservedBalance = j10;
        this.senderAccountType = i10;
        this.token = str17;
        this.unclearedBalance = j11;
        this.payType = i11;
        this.reUseable = i12;
        this.bankAccountNo = str18;
        this.defaultPayFlag = i13;
        this.enable = z3;
        this.tips = str19;
        this.acTips = str20;
        this.okcardTips = str21;
        this.paymentMethodsDiscount = j12;
        this.expiryFlag = z8;
        this.needSign = z10;
        this.defaultMethodFlag = z11;
        this.showInPreview = z12;
    }
}
