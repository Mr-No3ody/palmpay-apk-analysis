package com.transsnet.palmpay.credit.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "Landroid/os/Parcelable;", "accountType", "", "billId", "", "billOutstandingAmount", "repaymentDateStamp", "outstandingBillCount", "cardNo", "", "extensionTag", "loanProduct", "productTitle", "unpaidPenalty", "penalty", "loanNo", "androidLink", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "writeToParcel", "", "flags", "describeContents", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutstandingAccount implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @Nullable
    public final Integer accountType;

    @JvmField
    @Nullable
    public final String androidLink;

    @JvmField
    @Nullable
    public final Long billId;

    @JvmField
    @Nullable
    public final Long billOutstandingAmount;

    @JvmField
    @Nullable
    public final String cardNo;

    @JvmField
    @Nullable
    public final String extensionTag;

    @JvmField
    @Nullable
    public final String loanNo;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public final Integer outstandingBillCount;

    @JvmField
    @Nullable
    public final Long penalty;

    @JvmField
    @Nullable
    public final String productTitle;

    @JvmField
    @Nullable
    public final Long repaymentDateStamp;

    @JvmField
    @Nullable
    public final Long unpaidPenalty;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.OutstandingAccount$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/OutstandingAccount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/OutstandingAccount;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<OutstandingAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OutstandingAccount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OutstandingAccount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OutstandingAccount[] newArray(int size) {
            return new OutstandingAccount[size];
        }
    }

    public OutstandingAccount(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Long l8, @Nullable Integer num2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l10, @Nullable Long l11, @Nullable String str5, @Nullable String str6) {
        this.accountType = num;
        this.billId = l5;
        this.billOutstandingAmount = l6;
        this.repaymentDateStamp = l8;
        this.outstandingBillCount = num2;
        this.cardNo = str;
        this.extensionTag = str2;
        this.loanProduct = str3;
        this.productTitle = str4;
        this.unpaidPenalty = l10;
        this.penalty = l11;
        this.loanNo = str5;
        this.androidLink = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.accountType);
        parcel.writeValue(this.billId);
        parcel.writeValue(this.billOutstandingAmount);
        parcel.writeValue(this.outstandingBillCount);
        parcel.writeValue(this.repaymentDateStamp);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.extensionTag);
        parcel.writeString(this.loanProduct);
        parcel.writeString(this.productTitle);
        parcel.writeValue(this.unpaidPenalty);
        parcel.writeValue(this.penalty);
        parcel.writeString(this.loanNo);
        parcel.writeString(this.androidLink);
    }

    public /* synthetic */ OutstandingAccount(Integer num, Long l5, Long l6, Long l8, Integer num2, String str, String str2, String str3, String str4, Long l10, Long l11, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l5, l6, l8, num2, str, str2, str3, str4, l10, l11, (i7 & 2048) != 0 ? null : str5, (i7 & 4096) != 0 ? null : str6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OutstandingAccount(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls2 = Long.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls2.getClassLoader());
        Long l8 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value5 instanceof Integer ? (Integer) value5 : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l10 = value6 instanceof Long ? (Long) value6 : null;
        Object value7 = parcel.readValue(cls2.getClassLoader());
        this(num, l5, l6, l8, num2, string, string2, string3, string4, l10, value7 instanceof Long ? (Long) value7 : null, parcel.readString(), parcel.readString());
    }
}
