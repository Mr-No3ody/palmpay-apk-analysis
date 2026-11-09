package com.transsnet.palmpay.core.bean.cashier;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0080\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0007HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;", "Landroid/os/Parcelable;", "totalPayerTax", "", "totalPayeeTax", "totalPlatformTax", "payerTaxTips", "", "title", "payerTaxDetails", "", "Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean$TaxDetail;", "payeeTaxDetails", "platformTaxDetails", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTotalPayerTax", "()Ljava/lang/Long;", "setTotalPayerTax", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTotalPayeeTax", "setTotalPayeeTax", "getTotalPlatformTax", "setTotalPlatformTax", "getPayerTaxTips", "()Ljava/lang/String;", "setPayerTaxTips", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getPayerTaxDetails", "()Ljava/util/List;", "setPayerTaxDetails", "(Ljava/util/List;)V", "getPayeeTaxDetails", "setPayeeTaxDetails", "getPlatformTaxDetails", "setPlatformTaxDetails", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TaxDetail", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CashierTaxDetailBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashierTaxDetailBean> CREATOR = new Creator();

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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashierTaxDetailBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashierTaxDetailBean createFromParcel(Parcel parcel) {
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
            return new CashierTaxDetailBean(lValueOf, lValueOf2, lValueOf3, string, string2, arrayList, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashierTaxDetailBean[] newArray(int i7) {
            return new CashierTaxDetailBean[i7];
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010Jz\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000202HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000202R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012¨\u0006>"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean$TaxDetail;", "Landroid/os/Parcelable;", "taxAmount", "", "tariffId", "tariffName", "", "tariffType", "subTariffType", "feeMode", "remark", "title", "platformAmount", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getTaxAmount", "()Ljava/lang/Long;", "setTaxAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTariffId", "setTariffId", "getTariffName", "()Ljava/lang/String;", "setTariffName", "(Ljava/lang/String;)V", "getTariffType", "setTariffType", "getSubTariffType", "setSubTariffType", "getFeeMode", "setFeeMode", "getRemark", "setRemark", "getTitle", "setTitle", "getPlatformAmount", "setPlatformAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/core/bean/cashier/CashierTaxDetailBean$TaxDetail;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TaxDetail implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TaxDetail> CREATOR = new Creator();

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
        public static final class Creator implements Parcelable.Creator<TaxDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxDetail(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxDetail[] newArray(int i7) {
                return new TaxDetail[i7];
            }
        }

        public TaxDetail() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public static /* synthetic */ TaxDetail copy$default(TaxDetail taxDetail, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, Long l8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                l5 = taxDetail.taxAmount;
            }
            if ((i7 & 2) != 0) {
                l6 = taxDetail.tariffId;
            }
            if ((i7 & 4) != 0) {
                str = taxDetail.tariffName;
            }
            if ((i7 & 8) != 0) {
                str2 = taxDetail.tariffType;
            }
            if ((i7 & 16) != 0) {
                str3 = taxDetail.subTariffType;
            }
            if ((i7 & 32) != 0) {
                str4 = taxDetail.feeMode;
            }
            if ((i7 & 64) != 0) {
                str5 = taxDetail.remark;
            }
            if ((i7 & 128) != 0) {
                str6 = taxDetail.title;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                l8 = taxDetail.platformAmount;
            }
            String str7 = str6;
            Long l10 = l8;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            String str11 = str;
            return taxDetail.copy(l5, l6, str11, str2, str10, str8, str9, str7, l10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getTaxAmount() {
            return this.taxAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getTariffId() {
            return this.tariffId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTariffName() {
            return this.tariffName;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTariffType() {
            return this.tariffType;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSubTariffType() {
            return this.subTariffType;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFeeMode() {
            return this.feeMode;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Long getPlatformAmount() {
            return this.platformAmount;
        }

        @NotNull
        public final TaxDetail copy(@Nullable Long taxAmount, @Nullable Long tariffId, @Nullable String tariffName, @Nullable String tariffType, @Nullable String subTariffType, @Nullable String feeMode, @Nullable String remark, @Nullable String title, @Nullable Long platformAmount) {
            return new TaxDetail(taxAmount, tariffId, tariffName, tariffType, subTariffType, feeMode, remark, title, platformAmount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxDetail)) {
                return false;
            }
            TaxDetail taxDetail = (TaxDetail) other;
            return Intrinsics.c(this.taxAmount, taxDetail.taxAmount) && Intrinsics.c(this.tariffId, taxDetail.tariffId) && Intrinsics.c(this.tariffName, taxDetail.tariffName) && Intrinsics.c(this.tariffType, taxDetail.tariffType) && Intrinsics.c(this.subTariffType, taxDetail.subTariffType) && Intrinsics.c(this.feeMode, taxDetail.feeMode) && Intrinsics.c(this.remark, taxDetail.remark) && Intrinsics.c(this.title, taxDetail.title) && Intrinsics.c(this.platformAmount, taxDetail.platformAmount);
        }

        @Nullable
        public final String getFeeMode() {
            return this.feeMode;
        }

        @Nullable
        public final Long getPlatformAmount() {
            return this.platformAmount;
        }

        @Nullable
        public final String getRemark() {
            return this.remark;
        }

        @Nullable
        public final String getSubTariffType() {
            return this.subTariffType;
        }

        @Nullable
        public final Long getTariffId() {
            return this.tariffId;
        }

        @Nullable
        public final String getTariffName() {
            return this.tariffName;
        }

        @Nullable
        public final String getTariffType() {
            return this.tariffType;
        }

        @Nullable
        public final Long getTaxAmount() {
            return this.taxAmount;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
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

        public final void setFeeMode(@Nullable String str) {
            this.feeMode = str;
        }

        public final void setPlatformAmount(@Nullable Long l5) {
            this.platformAmount = l5;
        }

        public final void setRemark(@Nullable String str) {
            this.remark = str;
        }

        public final void setSubTariffType(@Nullable String str) {
            this.subTariffType = str;
        }

        public final void setTariffId(@Nullable Long l5) {
            this.tariffId = l5;
        }

        public final void setTariffName(@Nullable String str) {
            this.tariffName = str;
        }

        public final void setTariffType(@Nullable String str) {
            this.tariffType = str;
        }

        public final void setTaxAmount(@Nullable Long l5) {
            this.taxAmount = l5;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public String toString() {
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
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
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

        public TaxDetail(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l8) {
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

        public /* synthetic */ TaxDetail(Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, Long l8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : l6, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? null : str5, (i7 & 128) != 0 ? null : str6, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : l8);
        }
    }

    public CashierTaxDetailBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashierTaxDetailBean copy$default(CashierTaxDetailBean cashierTaxDetailBean, Long l5, Long l6, Long l8, String str, String str2, List list, List list2, List list3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l5 = cashierTaxDetailBean.totalPayerTax;
        }
        if ((i7 & 2) != 0) {
            l6 = cashierTaxDetailBean.totalPayeeTax;
        }
        if ((i7 & 4) != 0) {
            l8 = cashierTaxDetailBean.totalPlatformTax;
        }
        if ((i7 & 8) != 0) {
            str = cashierTaxDetailBean.payerTaxTips;
        }
        if ((i7 & 16) != 0) {
            str2 = cashierTaxDetailBean.title;
        }
        if ((i7 & 32) != 0) {
            list = cashierTaxDetailBean.payerTaxDetails;
        }
        if ((i7 & 64) != 0) {
            list2 = cashierTaxDetailBean.payeeTaxDetails;
        }
        if ((i7 & 128) != 0) {
            list3 = cashierTaxDetailBean.platformTaxDetails;
        }
        List list4 = list2;
        List list5 = list3;
        String str3 = str2;
        List list6 = list;
        return cashierTaxDetailBean.copy(l5, l6, l8, str, str3, list6, list4, list5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTotalPayerTax() {
        return this.totalPayerTax;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTotalPayeeTax() {
        return this.totalPayeeTax;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTotalPlatformTax() {
        return this.totalPlatformTax;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPayerTaxTips() {
        return this.payerTaxTips;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<TaxDetail> component6() {
        return this.payerTaxDetails;
    }

    @Nullable
    public final List<TaxDetail> component7() {
        return this.payeeTaxDetails;
    }

    @Nullable
    public final List<TaxDetail> component8() {
        return this.platformTaxDetails;
    }

    @NotNull
    public final CashierTaxDetailBean copy(@Nullable Long totalPayerTax, @Nullable Long totalPayeeTax, @Nullable Long totalPlatformTax, @Nullable String payerTaxTips, @Nullable String title, @Nullable List<TaxDetail> payerTaxDetails, @Nullable List<TaxDetail> payeeTaxDetails, @Nullable List<TaxDetail> platformTaxDetails) {
        return new CashierTaxDetailBean(totalPayerTax, totalPayeeTax, totalPlatformTax, payerTaxTips, title, payerTaxDetails, payeeTaxDetails, platformTaxDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashierTaxDetailBean)) {
            return false;
        }
        CashierTaxDetailBean cashierTaxDetailBean = (CashierTaxDetailBean) other;
        return Intrinsics.c(this.totalPayerTax, cashierTaxDetailBean.totalPayerTax) && Intrinsics.c(this.totalPayeeTax, cashierTaxDetailBean.totalPayeeTax) && Intrinsics.c(this.totalPlatformTax, cashierTaxDetailBean.totalPlatformTax) && Intrinsics.c(this.payerTaxTips, cashierTaxDetailBean.payerTaxTips) && Intrinsics.c(this.title, cashierTaxDetailBean.title) && Intrinsics.c(this.payerTaxDetails, cashierTaxDetailBean.payerTaxDetails) && Intrinsics.c(this.payeeTaxDetails, cashierTaxDetailBean.payeeTaxDetails) && Intrinsics.c(this.platformTaxDetails, cashierTaxDetailBean.platformTaxDetails);
    }

    @Nullable
    public final List<TaxDetail> getPayeeTaxDetails() {
        return this.payeeTaxDetails;
    }

    @Nullable
    public final List<TaxDetail> getPayerTaxDetails() {
        return this.payerTaxDetails;
    }

    @Nullable
    public final String getPayerTaxTips() {
        return this.payerTaxTips;
    }

    @Nullable
    public final List<TaxDetail> getPlatformTaxDetails() {
        return this.platformTaxDetails;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Long getTotalPayeeTax() {
        return this.totalPayeeTax;
    }

    @Nullable
    public final Long getTotalPayerTax() {
        return this.totalPayerTax;
    }

    @Nullable
    public final Long getTotalPlatformTax() {
        return this.totalPlatformTax;
    }

    public int hashCode() {
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

    public final void setPayeeTaxDetails(@Nullable List<TaxDetail> list) {
        this.payeeTaxDetails = list;
    }

    public final void setPayerTaxDetails(@Nullable List<TaxDetail> list) {
        this.payerTaxDetails = list;
    }

    public final void setPayerTaxTips(@Nullable String str) {
        this.payerTaxTips = str;
    }

    public final void setPlatformTaxDetails(@Nullable List<TaxDetail> list) {
        this.platformTaxDetails = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTotalPayeeTax(@Nullable Long l5) {
        this.totalPayeeTax = l5;
    }

    public final void setTotalPayerTax(@Nullable Long l5) {
        this.totalPayerTax = l5;
    }

    public final void setTotalPlatformTax(@Nullable Long l5) {
        this.totalPlatformTax = l5;
    }

    @NotNull
    public String toString() {
        return "CashierTaxDetailBean(totalPayerTax=" + this.totalPayerTax + ", totalPayeeTax=" + this.totalPayeeTax + ", totalPlatformTax=" + this.totalPlatformTax + ", payerTaxTips=" + this.payerTaxTips + ", title=" + this.title + ", payerTaxDetails=" + this.payerTaxDetails + ", payeeTaxDetails=" + this.payeeTaxDetails + ", platformTaxDetails=" + this.platformTaxDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
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
                it.next().writeToParcel(dest, flags);
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
                it2.next().writeToParcel(dest, flags);
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
            it3.next().writeToParcel(dest, flags);
        }
    }

    public CashierTaxDetailBean(@Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable String str, @Nullable String str2, @Nullable List<TaxDetail> list, @Nullable List<TaxDetail> list2, @Nullable List<TaxDetail> list3) {
        this.totalPayerTax = l5;
        this.totalPayeeTax = l6;
        this.totalPlatformTax = l8;
        this.payerTaxTips = str;
        this.title = str2;
        this.payerTaxDetails = list;
        this.payeeTaxDetails = list2;
        this.platformTaxDetails = list3;
    }

    public /* synthetic */ CashierTaxDetailBean(Long l5, Long l6, Long l8, String str, String str2, List list, List list2, List list3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : l6, (i7 & 4) != 0 ? null : l8, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : list, (i7 & 64) != 0 ? null : list2, (i7 & 128) != 0 ? null : list3);
    }
}
