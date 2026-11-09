package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean;", "Landroid/os/Parcelable;", "", "totalPayerTax", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setTotalPayerTax", "(Ljava/lang/Long;)V", "totalPayeeTax", "getTotalPayeeTax", "setTotalPayeeTax", "totalPlatformTax", "g", "setTotalPlatformTax", "", "payerTaxTips", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setPayerTaxTips", "(Ljava/lang/String;)V", "title", "e", "setTitle", "", "Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean$TaxDetail;", "payerTaxDetails", "Ljava/util/List;", "c", "()Ljava/util/List;", "setPayerTaxDetails", "(Ljava/util/List;)V", "payeeTaxDetails", "getPayeeTaxDetails", "setPayeeTaxDetails", "platformTaxDetails", "getPlatformTaxDetails", "setPlatformTaxDetails", "TaxDetail", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCashierTaxDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCashierTaxDetailBean> CREATOR = new a();

    @Nullable
    private List<TaxDetail> payeeTaxDetails;

    @Nullable
    private List<TaxDetail> payerTaxDetails;

    @Nullable
    private String payerTaxTips;

    @Nullable
    private List<TaxDetail> platformTaxDetails;

    @Nullable
    private String title;

    @Nullable
    private Long totalPayeeTax;

    @Nullable
    private Long totalPayerTax;

    @Nullable
    private Long totalPlatformTax;

    @Parcelize
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006%"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCashierTaxDetailBean$TaxDetail;", "Landroid/os/Parcelable;", "", "taxAmount", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "setTaxAmount", "(Ljava/lang/Long;)V", "tariffId", "getTariffId", "setTariffId", "", "tariffName", "Ljava/lang/String;", "getTariffName", "()Ljava/lang/String;", "setTariffName", "(Ljava/lang/String;)V", "tariffType", "getTariffType", "setTariffType", "subTariffType", "getSubTariffType", "setSubTariffType", "feeMode", "getFeeMode", "setFeeMode", "remark", "c", "setRemark", "title", "e", "setTitle", "platformAmount", "getPlatformAmount", "setPlatformAmount", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TaxDetail implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TaxDetail> CREATOR = new a();

        @Nullable
        private String feeMode;

        @Nullable
        private Long platformAmount;

        @Nullable
        private String remark;

        @Nullable
        private String subTariffType;

        @Nullable
        private Long tariffId;

        @Nullable
        private String tariffName;

        @Nullable
        private String tariffType;

        @Nullable
        private Long taxAmount;

        @Nullable
        private String title;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TaxDetail> {
            @Override // android.os.Parcelable.Creator
            public final TaxDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxDetail(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final TaxDetail[] newArray(int i7) {
                return new TaxDetail[i7];
            }
        }

        public TaxDetail() {
            this(null, null, null, null, null, null, null, null, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRemark() {
            return this.remark;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getTaxAmount() {
            return this.taxAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaxDetail)) {
                return false;
            }
            TaxDetail taxDetail = (TaxDetail) obj;
            return Intrinsics.c(this.taxAmount, taxDetail.taxAmount) && Intrinsics.c(this.tariffId, taxDetail.tariffId) && Intrinsics.c(this.tariffName, taxDetail.tariffName) && Intrinsics.c(this.tariffType, taxDetail.tariffType) && Intrinsics.c(this.subTariffType, taxDetail.subTariffType) && Intrinsics.c(this.feeMode, taxDetail.feeMode) && Intrinsics.c(this.remark, taxDetail.remark) && Intrinsics.c(this.title, taxDetail.title) && Intrinsics.c(this.platformAmount, taxDetail.platformAmount);
        }

        public final int hashCode() {
            Long l5 = this.taxAmount;
            int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
            Long l6 = this.tariffId;
            int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
            String str = this.tariffName;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tariffType;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subTariffType;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.feeMode;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.remark;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.title;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l8 = this.platformAmount;
            return iHashCode8 + (l8 != null ? l8.hashCode() : 0);
        }

        public final String toString() {
            Long l5 = this.taxAmount;
            Long l6 = this.tariffId;
            String str = this.tariffName;
            String str2 = this.tariffType;
            String str3 = this.subTariffType;
            String str4 = this.feeMode;
            String str5 = this.remark;
            String str6 = this.title;
            Long l8 = this.platformAmount;
            StringBuilder sb2 = new StringBuilder("TaxDetail(taxAmount=");
            sb2.append(l5);
            sb2.append(", tariffId=");
            sb2.append(l6);
            sb2.append(", tariffName=");
            u.x(sb2, str, ", tariffType=", str2, ", subTariffType=");
            u.x(sb2, str3, ", feeMode=", str4, ", remark=");
            u.x(sb2, str5, ", title=", str6, ", platformAmount=");
            sb2.append(l8);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l5 = this.taxAmount;
            if (l5 == null) {
                dest.writeInt(0);
            } else {
                q0.t(dest, 1, l5);
            }
            Long l6 = this.tariffId;
            if (l6 == null) {
                dest.writeInt(0);
            } else {
                q0.t(dest, 1, l6);
            }
            dest.writeString(this.tariffName);
            dest.writeString(this.tariffType);
            dest.writeString(this.subTariffType);
            dest.writeString(this.feeMode);
            dest.writeString(this.remark);
            dest.writeString(this.title);
            Long l8 = this.platformAmount;
            if (l8 == null) {
                dest.writeInt(0);
            } else {
                q0.t(dest, 1, l8);
            }
        }

        public TaxDetail(Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, Long l8) {
            this.taxAmount = l5;
            this.tariffId = l6;
            this.tariffName = str;
            this.tariffType = str2;
            this.subTariffType = str3;
            this.feeMode = str4;
            this.remark = str5;
            this.title = str6;
            this.platformAmount = l8;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCashierTaxDetailBean> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierTaxDetailBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i10 = 0; i10 != i7; i10++) {
                    arrayList.add(TaxDetail.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i11 = parcel.readInt();
                arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(TaxDetail.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList3 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList3.add(TaxDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new FlexiBankCashierTaxDetailBean(lValueOf, lValueOf2, lValueOf3, string, string2, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCashierTaxDetailBean[] newArray(int i7) {
            return new FlexiBankCashierTaxDetailBean[i7];
        }
    }

    public FlexiBankCashierTaxDetailBean() {
        this(null, null, null, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPayerTaxDetails() {
        return this.payerTaxDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPayerTaxTips() {
        return this.payerTaxTips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCashierTaxDetailBean)) {
            return false;
        }
        FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean = (FlexiBankCashierTaxDetailBean) obj;
        return Intrinsics.c(this.totalPayerTax, flexiBankCashierTaxDetailBean.totalPayerTax) && Intrinsics.c(this.totalPayeeTax, flexiBankCashierTaxDetailBean.totalPayeeTax) && Intrinsics.c(this.totalPlatformTax, flexiBankCashierTaxDetailBean.totalPlatformTax) && Intrinsics.c(this.payerTaxTips, flexiBankCashierTaxDetailBean.payerTaxTips) && Intrinsics.c(this.title, flexiBankCashierTaxDetailBean.title) && Intrinsics.c(this.payerTaxDetails, flexiBankCashierTaxDetailBean.payerTaxDetails) && Intrinsics.c(this.payeeTaxDetails, flexiBankCashierTaxDetailBean.payeeTaxDetails) && Intrinsics.c(this.platformTaxDetails, flexiBankCashierTaxDetailBean.platformTaxDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getTotalPayerTax() {
        return this.totalPayerTax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getTotalPlatformTax() {
        return this.totalPlatformTax;
    }

    public final int hashCode() {
        Long l5 = this.totalPayerTax;
        int iHashCode = (l5 == null ? 0 : l5.hashCode()) * 31;
        Long l6 = this.totalPayeeTax;
        int iHashCode2 = (iHashCode + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.totalPlatformTax;
        int iHashCode3 = (iHashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.payerTaxTips;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TaxDetail> list = this.payerTaxDetails;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<TaxDetail> list2 = this.payeeTaxDetails;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TaxDetail> list3 = this.platformTaxDetails;
        return iHashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "FlexiBankCashierTaxDetailBean(totalPayerTax=" + this.totalPayerTax + ", totalPayeeTax=" + this.totalPayeeTax + ", totalPlatformTax=" + this.totalPlatformTax + ", payerTaxTips=" + this.payerTaxTips + ", title=" + this.title + ", payerTaxDetails=" + this.payerTaxDetails + ", payeeTaxDetails=" + this.payeeTaxDetails + ", platformTaxDetails=" + this.platformTaxDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l5 = this.totalPayerTax;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Long l6 = this.totalPayeeTax;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.totalPlatformTax;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        dest.writeString(this.payerTaxTips);
        dest.writeString(this.title);
        List<TaxDetail> list = this.payerTaxDetails;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<TaxDetail> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, i7);
            }
        }
        List<TaxDetail> list2 = this.payeeTaxDetails;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<TaxDetail> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, i7);
            }
        }
        List<TaxDetail> list3 = this.platformTaxDetails;
        if (list3 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list3.size());
        Iterator<TaxDetail> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, i7);
        }
    }

    public FlexiBankCashierTaxDetailBean(Long l5, Long l6, Long l8, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.totalPayerTax = l5;
        this.totalPayeeTax = l6;
        this.totalPlatformTax = l8;
        this.payerTaxTips = str;
        this.title = str2;
        this.payerTaxDetails = arrayList;
        this.payeeTaxDetails = arrayList2;
        this.platformTaxDetails = arrayList3;
    }
}
