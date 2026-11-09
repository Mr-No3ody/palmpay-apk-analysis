package com.transsnet.palmpay.credit.bean;

import androidx.annotation.Keep;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJJ\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/QuotaChange;", "", "type", "", "beforeValue", "", "curValue", "loanProduct", "remainingDays", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/transsnet/palmpay/credit/bean/QuotaChange;", "equals", "", "other", "hashCode", "toString", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuotaChange {

    @JvmField
    @Nullable
    public final String beforeValue;

    @JvmField
    @Nullable
    public final String curValue;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public final Integer remainingDays;

    @JvmField
    @Nullable
    public final Integer type;

    public QuotaChange(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num2) {
        this.type = num;
        this.beforeValue = str;
        this.curValue = str2;
        this.loanProduct = str3;
        this.remainingDays = num2;
    }

    public static /* synthetic */ QuotaChange copy$default(QuotaChange quotaChange, Integer num, String str, String str2, String str3, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = quotaChange.type;
        }
        if ((i7 & 2) != 0) {
            str = quotaChange.beforeValue;
        }
        if ((i7 & 4) != 0) {
            str2 = quotaChange.curValue;
        }
        if ((i7 & 8) != 0) {
            str3 = quotaChange.loanProduct;
        }
        if ((i7 & 16) != 0) {
            num2 = quotaChange.remainingDays;
        }
        Integer num3 = num2;
        String str4 = str2;
        return quotaChange.copy(num, str, str4, str3, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBeforeValue() {
        return this.beforeValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurValue() {
        return this.curValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }

    @NotNull
    public final QuotaChange copy(@Nullable Integer type, @Nullable String beforeValue, @Nullable String curValue, @Nullable String loanProduct, @Nullable Integer remainingDays) {
        return new QuotaChange(type, beforeValue, curValue, loanProduct, remainingDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuotaChange)) {
            return false;
        }
        QuotaChange quotaChange = (QuotaChange) other;
        return Intrinsics.c(this.type, quotaChange.type) && Intrinsics.c(this.beforeValue, quotaChange.beforeValue) && Intrinsics.c(this.curValue, quotaChange.curValue) && Intrinsics.c(this.loanProduct, quotaChange.loanProduct) && Intrinsics.c(this.remainingDays, quotaChange.remainingDays);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.beforeValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.curValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.loanProduct;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.remainingDays;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.type;
        String str = this.beforeValue;
        String str2 = this.curValue;
        String str3 = this.loanProduct;
        Integer num2 = this.remainingDays;
        StringBuilder sb2 = new StringBuilder("QuotaChange(type=");
        sb2.append(num);
        sb2.append(", beforeValue=");
        sb2.append(str);
        sb2.append(", curValue=");
        u.x(sb2, str2, ", loanProduct=", str3, ", remainingDays=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ QuotaChange(Integer num, String str, String str2, String str3, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, str3, (i7 & 16) != 0 ? 0 : num2);
    }
}
