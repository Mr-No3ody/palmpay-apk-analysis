package com.flexibank.sdk.cashier.bean;

import N8.q0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/flexibank/sdk/cashier/bean/FlexiBankCoreCashierPaymentExtra;", "Landroid/os/Parcelable;", "", "key", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "value", "g", "", "style", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "subValue", "e", "Landroid/net/Uri;", "tagIvValue", "Landroid/net/Uri;", "f", "()Landroid/net/Uri;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FlexiBankCoreCashierPaymentExtra implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlexiBankCoreCashierPaymentExtra> CREATOR = new a();

    @Nullable
    private final CharSequence key;

    @Nullable
    private final Integer style;

    @Nullable
    private final CharSequence subValue;

    @Nullable
    private final Uri tagIvValue;

    @Nullable
    private final CharSequence value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexiBankCoreCashierPaymentExtra> {
        @Override // android.os.Parcelable.Creator
        public final FlexiBankCoreCashierPaymentExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            return new FlexiBankCoreCashierPaymentExtra((CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (CharSequence) creator.createFromParcel(parcel), (Uri) parcel.readParcelable(FlexiBankCoreCashierPaymentExtra.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FlexiBankCoreCashierPaymentExtra[] newArray(int i7) {
            return new FlexiBankCoreCashierPaymentExtra[i7];
        }
    }

    public FlexiBankCoreCashierPaymentExtra(CharSequence charSequence, CharSequence charSequence2, Integer num, CharSequence charSequence3, Uri uri) {
        this.key = charSequence;
        this.value = charSequence2;
        this.style = num;
        this.subValue = charSequence3;
        this.tagIvValue = uri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CharSequence getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getStyle() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CharSequence getSubValue() {
        return this.subValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexiBankCoreCashierPaymentExtra)) {
            return false;
        }
        FlexiBankCoreCashierPaymentExtra flexiBankCoreCashierPaymentExtra = (FlexiBankCoreCashierPaymentExtra) obj;
        return Intrinsics.c(this.key, flexiBankCoreCashierPaymentExtra.key) && Intrinsics.c(this.value, flexiBankCoreCashierPaymentExtra.value) && Intrinsics.c(this.style, flexiBankCoreCashierPaymentExtra.style) && Intrinsics.c(this.subValue, flexiBankCoreCashierPaymentExtra.subValue) && Intrinsics.c(this.tagIvValue, flexiBankCoreCashierPaymentExtra.tagIvValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Uri getTagIvValue() {
        return this.tagIvValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CharSequence getValue() {
        return this.value;
    }

    public final int hashCode() {
        CharSequence charSequence = this.key;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.value;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CharSequence charSequence3 = this.subValue;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.tagIvValue;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        CharSequence charSequence = this.key;
        CharSequence charSequence2 = this.value;
        Integer num = this.style;
        CharSequence charSequence3 = this.subValue;
        return "FlexiBankCoreCashierPaymentExtra(key=" + ((Object) charSequence) + ", value=" + ((Object) charSequence2) + ", style=" + num + ", subValue=" + ((Object) charSequence3) + ", tagIvValue=" + this.tagIvValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TextUtils.writeToParcel(this.key, dest, i7);
        TextUtils.writeToParcel(this.value, dest, i7);
        Integer num = this.style;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        TextUtils.writeToParcel(this.subValue, dest, i7);
        dest.writeParcelable(this.tagIvValue, i7);
    }
}
