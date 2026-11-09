package com.transsnet.palmpay.credit.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/CLPromoteData;", "Landroid/os/Parcelable;", "calculateType", "", "creditQuota", "", FirebaseAnalytics.Param.TERM, "maxLoanDays", "interestRatio", "", "loanAmount", "dailyInterest", "termSpan", "termSpanUnit", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "Ljava/lang/Double;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLPromoteData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public final Integer calculateType;

    @JvmField
    @Nullable
    public final Long creditQuota;

    @JvmField
    @Nullable
    public final Long dailyInterest;

    @JvmField
    @Nullable
    public final Double interestRatio;

    @JvmField
    @Nullable
    public final Long loanAmount;

    @JvmField
    @Nullable
    public final Integer maxLoanDays;

    @JvmField
    @Nullable
    public final Integer term;

    @JvmField
    @Nullable
    public final Integer termSpan;

    @JvmField
    @NotNull
    public final String termSpanUnit;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.CLPromoteData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/CLPromoteData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/CLPromoteData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/CLPromoteData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CLPromoteData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLPromoteData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CLPromoteData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLPromoteData[] newArray(int size) {
            return new CLPromoteData[size];
        }
    }

    public CLPromoteData(@Nullable Integer num, @Nullable Long l5, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d2, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num4, @NotNull String termSpanUnit) {
        Intrinsics.checkNotNullParameter(termSpanUnit, "termSpanUnit");
        this.calculateType = num;
        this.creditQuota = l5;
        this.term = num2;
        this.maxLoanDays = num3;
        this.interestRatio = d2;
        this.loanAmount = l6;
        this.dailyInterest = l8;
        this.termSpan = num4;
        this.termSpanUnit = termSpanUnit;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.calculateType);
        parcel.writeValue(this.creditQuota);
        parcel.writeValue(this.term);
        parcel.writeValue(this.maxLoanDays);
        parcel.writeValue(this.interestRatio);
        parcel.writeValue(this.loanAmount);
        parcel.writeValue(this.dailyInterest);
    }

    public /* synthetic */ CLPromoteData(Integer num, Long l5, Integer num2, Integer num3, Double d2, Long l6, Long l8, Integer num4, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l5, num2, num3, d2, l6, l8, (i7 & 128) != 0 ? 0 : num4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? "" : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CLPromoteData(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls2 = Long.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value3 instanceof Integer ? (Integer) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Integer num3 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(Double.TYPE.getClassLoader());
        Double d2 = value5 instanceof Double ? (Double) value5 : null;
        Object value6 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value6 instanceof Long ? (Long) value6 : null;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        this(num, l5, num2, num3, d2, l6, value7 instanceof Long ? (Long) value7 : null, null, null, MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, null);
    }
}
