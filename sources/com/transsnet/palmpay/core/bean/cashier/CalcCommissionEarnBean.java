package com.transsnet.palmpay.core.bean.cashier;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001fHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcCommissionEarnBean;", "Landroid/os/Parcelable;", "type", "", "amount", "", "show", "tips", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "setAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getShow", "setShow", "getTips", "setTips", "isShow", "", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/core/bean/cashier/CalcCommissionEarnBean;", "equals", "other", "", "hashCode", "toString", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CalcCommissionEarnBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long amount;

    @Nullable
    private String show;

    @Nullable
    private String tips;

    @Nullable
    private String type;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CalcCommissionEarnBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CalcCommissionEarnBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CalcCommissionEarnBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CalcCommissionEarnBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CalcCommissionEarnBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcCommissionEarnBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CalcCommissionEarnBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CalcCommissionEarnBean[] newArray(int size) {
            return new CalcCommissionEarnBean[size];
        }
    }

    public CalcCommissionEarnBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CalcCommissionEarnBean copy$default(CalcCommissionEarnBean calcCommissionEarnBean, String str, Long l5, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = calcCommissionEarnBean.type;
        }
        if ((i7 & 2) != 0) {
            l5 = calcCommissionEarnBean.amount;
        }
        if ((i7 & 4) != 0) {
            str2 = calcCommissionEarnBean.show;
        }
        if ((i7 & 8) != 0) {
            str3 = calcCommissionEarnBean.tips;
        }
        return calcCommissionEarnBean.copy(str, l5, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShow() {
        return this.show;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final CalcCommissionEarnBean copy(@Nullable String type, @Nullable Long amount, @Nullable String show, @Nullable String tips) {
        return new CalcCommissionEarnBean(type, amount, show, tips);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcCommissionEarnBean)) {
            return false;
        }
        CalcCommissionEarnBean calcCommissionEarnBean = (CalcCommissionEarnBean) other;
        return Intrinsics.c(this.type, calcCommissionEarnBean.type) && Intrinsics.c(this.amount, calcCommissionEarnBean.amount) && Intrinsics.c(this.show, calcCommissionEarnBean.show) && Intrinsics.c(this.tips, calcCommissionEarnBean.tips);
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getShow() {
        return this.show;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.amount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.show;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tips;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isShow() {
        return "1".equals(this.show);
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setShow(@Nullable String str) {
        this.show = str;
    }

    public final void setTips(@Nullable String str) {
        this.tips = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        Long l5 = this.amount;
        String str2 = this.show;
        String str3 = this.tips;
        StringBuilder sb2 = new StringBuilder("CalcCommissionEarnBean(type=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(l5);
        sb2.append(", show=");
        return G.s(sb2, str2, ", tips=", str3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.type);
        parcel.writeValue(this.amount);
        parcel.writeString(this.show);
        parcel.writeString(this.tips);
    }

    public CalcCommissionEarnBean(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.amount = l5;
        this.show = str2;
        this.tips = str3;
    }

    public /* synthetic */ CalcCommissionEarnBean(String str, Long l5, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : l5, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalcCommissionEarnBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Object value = parcel.readValue(Long.TYPE.getClassLoader());
        this(string, value instanceof Long ? (Long) value : null, parcel.readString(), parcel.readString());
    }
}
