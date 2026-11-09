package com.flexibank.sdk.core.bean;

import O3.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.google.gson.annotations.Expose;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.h;
import p355xf.m;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001ER\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b\u0005\u0010\u001dR$\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\"\u0010,\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR$\u0010/\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b0\u0010\u0013R\"\u00101\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0010\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R*\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010<\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierPaymentMethodBean;", "Lcom/flexibank/sdk/core/bean/FlexiBankBaseData;", "", "installmentActiveGuide", "Z", "F", "()Z", "S", "(Z)V", "installmentRaiseAmountEnable", "G", "T", "", "tipsColor", "Ljava/lang/String;", "J", "()Ljava/lang/String;", "X", "(Ljava/lang/String;)V", "userName", "K", "Y", "", "authFlag", "I", "C", "()I", "O", "(I)V", "verifyFlag", "L", "discountType", "E", "R", "", "discountAmount", "D", "()J", "Q", "(J)V", "isDefault", "M", "P", "isNewAdded", "N", "U", "phone", "W", "payMentMethodsDiscount", "H", "V", "La4/h$a;", "mOkCardPreCreditInfo", "La4/h$a;", "getMOkCardPreCreditInfo", "()La4/h$a;", "setMOkCardPreCreditInfo", "(La4/h$a;)V", "getMOkCardPreCreditInfo$annotations", "()V", "LO3/l$b;", "calculationDto", "LO3/l$b;", "getCalculationDto", "()LO3/l$b;", "setCalculationDto", "(LO3/l$b;)V", "getCalculationDto$annotations", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankPaymentMethod extends FlexiBankCashierPaymentMethodBean implements FlexiBankBaseData {
    private int authFlag;

    @Expose(serialize = false)
    @Nullable
    private l.b calculationDto;
    private long discountAmount;

    @Nullable
    private String discountType;
    private boolean installmentActiveGuide;
    private boolean installmentRaiseAmountEnable;
    private int isDefault;
    private int isNewAdded;

    @Expose(deserialize = false, serialize = false)
    @Nullable
    private h.a mOkCardPreCreditInfo;
    private long payMentMethodsDiscount;

    @Nullable
    private String phone;

    @Nullable
    private String tipsColor;

    @Nullable
    private String userName;
    private int verifyFlag;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22091a = new a(null);

    @NotNull
    public static final Parcelable.Creator<FlexiBankPaymentMethod> CREATOR = new b();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod$a;", "Lkotlinx/parcelize/Parceler;", "Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "", "flags", "", "write", "(Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;Landroid/os/Parcel;I)V", "create", "(Landroid/os/Parcel;)Lcom/flexibank/sdk/core/bean/FlexiBankPaymentMethod;", "", "TYPE_DISCOUNT", "Ljava/lang/String;", "TYPE_CASHBACK", "UNREUSEABLE", "I", "FLAG_REUSEABLE", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parceler<FlexiBankPaymentMethod> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public FlexiBankPaymentMethod[] newArray(int i7) {
            Intrinsics.checkNotNullParameter("Generated by Android Extensions automatically", "message");
            throw new m("Generated by Android Extensions automatically");
        }

        private a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        @NotNull
        public FlexiBankPaymentMethod create(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FlexiBankPaymentMethod flexiBankPaymentMethod = new FlexiBankPaymentMethod(0);
            flexiBankPaymentMethod.y(parcel);
            flexiBankPaymentMethod.S(parcel.readByte() != 0);
            flexiBankPaymentMethod.T(parcel.readByte() != 0);
            flexiBankPaymentMethod.X(parcel.readString());
            flexiBankPaymentMethod.Y(parcel.readString());
            flexiBankPaymentMethod.O(parcel.readInt());
            flexiBankPaymentMethod.Z(parcel.readInt());
            flexiBankPaymentMethod.R(parcel.readString());
            flexiBankPaymentMethod.Q(parcel.readLong());
            flexiBankPaymentMethod.P(parcel.readInt());
            flexiBankPaymentMethod.U(parcel.readInt());
            flexiBankPaymentMethod.W(parcel.readString());
            flexiBankPaymentMethod.V(parcel.readLong());
            return flexiBankPaymentMethod;
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(@NotNull FlexiBankPaymentMethod flexiBankPaymentMethod, @NotNull Parcel parcel, int i7) {
            Intrinsics.checkNotNullParameter(flexiBankPaymentMethod, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            flexiBankPaymentMethod.B(parcel);
            parcel.writeByte(flexiBankPaymentMethod.getInstallmentActiveGuide() ? (byte) 1 : (byte) 0);
            parcel.writeByte(flexiBankPaymentMethod.getInstallmentRaiseAmountEnable() ? (byte) 1 : (byte) 0);
            parcel.writeString(flexiBankPaymentMethod.getTipsColor());
            parcel.writeString(flexiBankPaymentMethod.getUserName());
            parcel.writeInt(flexiBankPaymentMethod.getAuthFlag());
            parcel.writeInt(flexiBankPaymentMethod.getVerifyFlag());
            parcel.writeString(flexiBankPaymentMethod.getDiscountType());
            parcel.writeLong(flexiBankPaymentMethod.getDiscountAmount());
            parcel.writeInt(flexiBankPaymentMethod.getIsDefault());
            parcel.writeInt(flexiBankPaymentMethod.getIsNewAdded());
            parcel.writeString(flexiBankPaymentMethod.getPhone());
            parcel.writeLong(flexiBankPaymentMethod.getPayMentMethodsDiscount());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FlexiBankPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankPaymentMethod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return FlexiBankPaymentMethod.f22091a.create(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankPaymentMethod[] newArray(int i7) {
            return new FlexiBankPaymentMethod[i7];
        }
    }

    public FlexiBankPaymentMethod() {
        this(0);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getAuthFlag() {
        return this.authFlag;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getDiscountAmount() {
        return this.discountAmount;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getDiscountType() {
        return this.discountType;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getInstallmentActiveGuide() {
        return this.installmentActiveGuide;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getInstallmentRaiseAmountEnable() {
        return this.installmentRaiseAmountEnable;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getPayMentMethodsDiscount() {
        return this.payMentMethodsDiscount;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getTipsColor() {
        return this.tipsColor;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final int getVerifyFlag() {
        return this.verifyFlag;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final int getIsNewAdded() {
        return this.isNewAdded;
    }

    public final void O(int i7) {
        this.authFlag = i7;
    }

    public final void P(int i7) {
        this.isDefault = i7;
    }

    public final void Q(long j6) {
        this.discountAmount = j6;
    }

    public final void R(String str) {
        this.discountType = str;
    }

    public final void S(boolean z3) {
        this.installmentActiveGuide = z3;
    }

    public final void T(boolean z3) {
        this.installmentRaiseAmountEnable = z3;
    }

    public final void U(int i7) {
        this.isNewAdded = i7;
    }

    public final void V(long j6) {
        this.payMentMethodsDiscount = j6;
    }

    public final void W(String str) {
        this.phone = str;
    }

    public final void X(String str) {
        this.tipsColor = str;
    }

    public final void Y(String str) {
        this.userName = str;
    }

    public final void Z(int i7) {
        this.verifyFlag = i7;
    }

    @Override // com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean
    public final boolean equals(Object obj) {
        if (obj instanceof FlexiBankPaymentMethod) {
            FlexiBankPaymentMethod flexiBankPaymentMethod = (FlexiBankPaymentMethod) obj;
            if (flexiBankPaymentMethod.getPayType() == getPayType()) {
                int payType = getPayType();
                if (payType == 1) {
                    return Intrinsics.c(getAccountId(), flexiBankPaymentMethod.getAccountId());
                }
                if (payType != 2) {
                    return false;
                }
                return Intrinsics.c(getCardNo(), flexiBankPaymentMethod.getCardNo());
            }
        }
        return false;
    }

    @Override // com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        f22091a.write(this, dest, i7);
    }

    public FlexiBankPaymentMethod(int i7) {
        super(0);
        this.installmentActiveGuide = false;
        this.installmentRaiseAmountEnable = false;
        this.tipsColor = null;
        this.userName = null;
        this.authFlag = 0;
        this.verifyFlag = 0;
        this.discountType = null;
        this.discountAmount = 0L;
        this.isDefault = 0;
        this.isNewAdded = 0;
        this.phone = null;
        this.payMentMethodsDiscount = 0L;
        this.mOkCardPreCreditInfo = null;
        this.calculationDto = null;
    }
}
