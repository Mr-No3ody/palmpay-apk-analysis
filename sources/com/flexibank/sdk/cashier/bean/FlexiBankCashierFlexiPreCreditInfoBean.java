package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R$\u0010$\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR$\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR*\u0010+\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\b¨\u00064"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierFlexiPreCreditInfoBean;", "Landroid/os/Parcelable;", "", "okCardPreCreditAmount", "Ljava/lang/Long;", "getOkCardPreCreditAmount", "()Ljava/lang/Long;", "setOkCardPreCreditAmount", "(Ljava/lang/Long;)V", "", "okCardPreCreditDesc", "Ljava/lang/String;", "getOkCardPreCreditDesc", "()Ljava/lang/String;", "setOkCardPreCreditDesc", "(Ljava/lang/String;)V", "", "okCardPreCreditFlag", "Ljava/lang/Boolean;", "getOkCardPreCreditFlag", "()Ljava/lang/Boolean;", "setOkCardPreCreditFlag", "(Ljava/lang/Boolean;)V", "", "okCardWhiteType", "Ljava/lang/Integer;", "getOkCardWhiteType", "()Ljava/lang/Integer;", "setOkCardWhiteType", "(Ljava/lang/Integer;)V", "applyStatus", "getApplyStatus", "setApplyStatus", "targetWhiteFlag", "getTargetWhiteFlag", "setTargetWhiteFlag", "dueDate", "getDueDate", "setDueDate", "okcardTips", "getOkcardTips", "setOkcardTips", "", "okCardPreCreditTags", "Ljava/util/List;", "getOkCardPreCreditTags", "()Ljava/util/List;", "setOkCardPreCreditTags", "(Ljava/util/List;)V", "okCardPreCreditDiscountAmount", "getOkCardPreCreditDiscountAmount", "setOkCardPreCreditDiscountAmount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCashierFlexiPreCreditInfoBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCashierFlexiPreCreditInfoBean> CREATOR = new a();

    @Nullable
    private Integer applyStatus;

    @Nullable
    private String dueDate;

    @Nullable
    private Long okCardPreCreditAmount;

    @Nullable
    private String okCardPreCreditDesc;

    @Nullable
    private Long okCardPreCreditDiscountAmount;

    @Nullable
    private Boolean okCardPreCreditFlag;

    @Nullable
    private List<String> okCardPreCreditTags;

    @Nullable
    private Integer okCardWhiteType;

    @Nullable
    private String okcardTips;

    @Nullable
    private Boolean targetWhiteFlag;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCashierFlexiPreCreditInfoBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierFlexiPreCreditInfoBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FlexiBankCashierFlexiPreCreditInfoBean(lValueOf, string, boolValueOf, numValueOf, numValueOf2, boolValueOf2, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierFlexiPreCreditInfoBean[] newArray(int i7) {
            return new FlexiBankCashierFlexiPreCreditInfoBean[i7];
        }
    }

    public FlexiBankCashierFlexiPreCreditInfoBean(Long l5, String str, Boolean bool, Integer num, Integer num2, Boolean bool2, String str2, String str3, ArrayList arrayList, Long l6) {
        this.okCardPreCreditAmount = l5;
        this.okCardPreCreditDesc = str;
        this.okCardPreCreditFlag = bool;
        this.okCardWhiteType = num;
        this.applyStatus = num2;
        this.targetWhiteFlag = bool2;
        this.dueDate = str2;
        this.okcardTips = str3;
        this.okCardPreCreditTags = arrayList;
        this.okCardPreCreditDiscountAmount = l6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCashierFlexiPreCreditInfoBean)) {
            return false;
        }
        FlexiBankCashierFlexiPreCreditInfoBean flexiBankCashierFlexiPreCreditInfoBean = (FlexiBankCashierFlexiPreCreditInfoBean) obj;
        return Intrinsics.c(this.okCardPreCreditAmount, flexiBankCashierFlexiPreCreditInfoBean.okCardPreCreditAmount) && Intrinsics.c(this.okCardPreCreditDesc, flexiBankCashierFlexiPreCreditInfoBean.okCardPreCreditDesc) && Intrinsics.c(this.okCardPreCreditFlag, flexiBankCashierFlexiPreCreditInfoBean.okCardPreCreditFlag) && Intrinsics.c(this.okCardWhiteType, flexiBankCashierFlexiPreCreditInfoBean.okCardWhiteType) && Intrinsics.c(this.applyStatus, flexiBankCashierFlexiPreCreditInfoBean.applyStatus) && Intrinsics.c(this.targetWhiteFlag, flexiBankCashierFlexiPreCreditInfoBean.targetWhiteFlag) && Intrinsics.c(this.dueDate, flexiBankCashierFlexiPreCreditInfoBean.dueDate) && Intrinsics.c(this.okcardTips, flexiBankCashierFlexiPreCreditInfoBean.okcardTips) && Intrinsics.c(this.okCardPreCreditTags, flexiBankCashierFlexiPreCreditInfoBean.okCardPreCreditTags) && Intrinsics.c(this.okCardPreCreditDiscountAmount, flexiBankCashierFlexiPreCreditInfoBean.okCardPreCreditDiscountAmount);
    }

    public final int hashCode() {
        Long l5 = this.okCardPreCreditAmount;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        String str = this.okCardPreCreditDesc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.okCardPreCreditFlag;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.okCardWhiteType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.applyStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.targetWhiteFlag;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.dueDate;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.okcardTips;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.okCardPreCreditTags;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l6 = this.okCardPreCreditDiscountAmount;
        return iHashCode9 + (l6 != null ? l6.hashCode() : 0);
    }

    public final String toString() {
        Long l5 = this.okCardPreCreditAmount;
        String str = this.okCardPreCreditDesc;
        Boolean bool = this.okCardPreCreditFlag;
        Integer num = this.okCardWhiteType;
        Integer num2 = this.applyStatus;
        Boolean bool2 = this.targetWhiteFlag;
        String str2 = this.dueDate;
        String str3 = this.okcardTips;
        List<String> list = this.okCardPreCreditTags;
        Long l6 = this.okCardPreCreditDiscountAmount;
        StringBuilder sb2 = new StringBuilder("FlexiBankCashierFlexiPreCreditInfoBean(okCardPreCreditAmount=");
        sb2.append(l5);
        sb2.append(", okCardPreCreditDesc=");
        sb2.append(str);
        sb2.append(", okCardPreCreditFlag=");
        sb2.append(bool);
        sb2.append(", okCardWhiteType=");
        sb2.append(num);
        sb2.append(", applyStatus=");
        sb2.append(num2);
        sb2.append(", targetWhiteFlag=");
        sb2.append(bool2);
        sb2.append(", dueDate=");
        u.x(sb2, str2, ", okcardTips=", str3, ", okCardPreCreditTags=");
        sb2.append(list);
        sb2.append(", okCardPreCreditDiscountAmount=");
        sb2.append(l6);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l5 = this.okCardPreCreditAmount;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        dest.writeString(this.okCardPreCreditDesc);
        Boolean bool = this.okCardPreCreditFlag;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Integer num = this.okCardWhiteType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        Integer num2 = this.applyStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Boolean bool2 = this.targetWhiteFlag;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        dest.writeString(this.dueDate);
        dest.writeString(this.okcardTips);
        dest.writeStringList(this.okCardPreCreditTags);
        Long l6 = this.okCardPreCreditDiscountAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FlexiBankCashierFlexiPreCreditInfoBean() {
        Boolean bool = Boolean.FALSE;
        this(0L, null, bool, 0, 0, bool, null, null, null, 0L);
    }
}
