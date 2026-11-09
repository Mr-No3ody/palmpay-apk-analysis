package com.transsnet.palmpay.teller.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010.\u001a\u00020/2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR\u001c\u0010%\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00064"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/ChannelDataItemBean;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "billerName", "", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "businessType", "getBusinessType", "setBusinessType", "customerId", "getCustomerId", "setCustomerId", "fullName", "getFullName", "setFullName", "memberId", "getMemberId", "setMemberId", "paymentItemId", "getPaymentItemId", "setPaymentItemId", "referenceId", "getReferenceId", "setReferenceId", "paymentItemName", "getPaymentItemName", "setPaymentItemName", "billerId", "getBillerId", "setBillerId", "icon", "getIcon", "setIcon", "businessAmount", "", "getBusinessAmount", "()J", "setBusinessAmount", "(J)V", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChannelDataItemBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;
    private long businessAmount;

    @Nullable
    private String businessType;

    @Nullable
    private String customerId;

    @Nullable
    private String fullName;

    @Nullable
    private String icon;

    @Nullable
    private String memberId;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String paymentItemName;

    @Nullable
    private String referenceId;

    /* JADX INFO: renamed from: com.transsnet.palmpay.teller.bean.ChannelDataItemBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/ChannelDataItemBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/teller/bean/ChannelDataItemBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/teller/bean/ChannelDataItemBean;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ChannelDataItemBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChannelDataItemBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChannelDataItemBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ChannelDataItemBean[] newArray(int size) {
            return new ChannelDataItemBean[size];
        }
    }

    public ChannelDataItemBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    public final long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessAmount(long j6) {
        this.businessAmount = j6;
    }

    public final void setBusinessType(@Nullable String str) {
        this.businessType = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setReferenceId(@Nullable String str) {
        this.referenceId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.billerName);
        parcel.writeString(this.businessType);
        parcel.writeString(this.customerId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.memberId);
        parcel.writeString(this.paymentItemId);
        parcel.writeString(this.referenceId);
        parcel.writeString(this.paymentItemName);
        parcel.writeString(this.billerId);
        parcel.writeString(this.icon);
        parcel.writeLong(this.businessAmount);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelDataItemBean(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.billerName = parcel.readString();
        this.businessType = parcel.readString();
        this.customerId = parcel.readString();
        this.fullName = parcel.readString();
        this.memberId = parcel.readString();
        this.paymentItemId = parcel.readString();
        this.referenceId = parcel.readString();
        this.paymentItemName = parcel.readString();
        this.billerId = parcel.readString();
        this.icon = parcel.readString();
        this.businessAmount = parcel.readLong();
    }
}
