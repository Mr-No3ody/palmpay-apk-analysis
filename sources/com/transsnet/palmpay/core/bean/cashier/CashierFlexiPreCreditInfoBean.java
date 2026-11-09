package com.transsnet.palmpay.core.bean.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", "Landroid/os/Parcelable;", "okCardPreCreditAmount", "", "okCardPreCreditDesc", "", "okCardPreCreditFlag", "", "okCardWhiteType", "", "applyStatus", "targetWhiteFlag", "dueDate", "okcardTips", "okCardPreCreditTags", "", "okCardPreCreditDiscountAmount", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashierFlexiPreCreditInfoBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public Integer applyStatus;

    @JvmField
    @Nullable
    public String dueDate;

    @JvmField
    @Nullable
    public Long okCardPreCreditAmount;

    @JvmField
    @Nullable
    public String okCardPreCreditDesc;

    @JvmField
    @Nullable
    public Long okCardPreCreditDiscountAmount;

    @JvmField
    @Nullable
    public Boolean okCardPreCreditFlag;

    @JvmField
    @Nullable
    public List<String> okCardPreCreditTags;

    @JvmField
    @Nullable
    public Integer okCardWhiteType;

    @JvmField
    @Nullable
    public String okcardTips;

    @JvmField
    @Nullable
    public Boolean targetWhiteFlag;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CashierFlexiPreCreditInfoBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CashierFlexiPreCreditInfoBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CashierFlexiPreCreditInfoBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierFlexiPreCreditInfoBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashierFlexiPreCreditInfoBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CashierFlexiPreCreditInfoBean[] newArray(int size) {
            return new CashierFlexiPreCreditInfoBean[size];
        }
    }

    public CashierFlexiPreCreditInfoBean() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.okCardPreCreditAmount);
        parcel.writeString(this.okCardPreCreditDesc);
        parcel.writeValue(this.okCardPreCreditFlag);
        parcel.writeValue(this.okCardWhiteType);
        parcel.writeValue(this.applyStatus);
        parcel.writeValue(this.targetWhiteFlag);
        parcel.writeString(this.dueDate);
        parcel.writeString(this.okcardTips);
        parcel.writeStringList(this.okCardPreCreditTags);
        parcel.writeValue(this.okCardPreCreditDiscountAmount);
    }

    public CashierFlexiPreCreditInfoBean(@Nullable Long l5, @Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable Long l6) {
        this.okCardPreCreditAmount = l5;
        this.okCardPreCreditDesc = str;
        this.okCardPreCreditFlag = bool;
        this.okCardWhiteType = num;
        this.applyStatus = num2;
        this.targetWhiteFlag = bool2;
        this.dueDate = str2;
        this.okcardTips = str3;
        this.okCardPreCreditTags = list;
        this.okCardPreCreditDiscountAmount = l6;
    }

    public /* synthetic */ CashierFlexiPreCreditInfoBean(Long l5, String str, Boolean bool, Integer num, Integer num2, Boolean bool2, String str2, String str3, List list, Long l6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : l5, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? Boolean.FALSE : bool, (i7 & 8) != 0 ? 0 : num, (i7 & 16) != 0 ? 0 : num2, (i7 & 32) != 0 ? Boolean.FALSE : bool2, (i7 & 64) != 0 ? null : str2, (i7 & 128) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : list, (i7 & 512) != 0 ? 0L : l6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CashierFlexiPreCreditInfoBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        String string = parcel.readString();
        Class cls2 = Boolean.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Boolean bool = value2 instanceof Boolean ? (Boolean) value2 : null;
        Class cls3 = Integer.TYPE;
        Object value3 = parcel.readValue(cls3.getClassLoader());
        Integer num = value3 instanceof Integer ? (Integer) value3 : null;
        Object value4 = parcel.readValue(cls3.getClassLoader());
        Integer num2 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Boolean bool2 = value5 instanceof Boolean ? (Boolean) value5 : null;
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        Object value6 = parcel.readValue(cls.getClassLoader());
        this(l5, string, bool, num, num2, bool2, string2, string3, arrayListCreateStringArrayList, value6 instanceof Long ? (Long) value6 : null);
    }
}
