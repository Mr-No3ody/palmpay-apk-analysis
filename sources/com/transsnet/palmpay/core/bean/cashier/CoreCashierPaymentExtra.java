package com.transsnet.palmpay.core.bean.cashier;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0001'B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B'\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB1\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u000bB;\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0005\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0005\u0010\u0011J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CoreCashierPaymentExtra;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "style", "", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;)V", "subVaule", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;)V", "tagIvValue", "Landroid/net/Uri;", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Landroid/net/Uri;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getStyle", "()Ljava/lang/Integer;", "setStyle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getKey", "()Ljava/lang/CharSequence;", "setKey", "(Ljava/lang/CharSequence;)V", "getValue", "setValue", "getSubVaule", "setSubVaule", "getTagIvValue", "()Landroid/net/Uri;", "setTagIvValue", "(Landroid/net/Uri;)V", "writeToParcel", "", "flags", "describeContents", "CREATOR", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CoreCashierPaymentExtra implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private CharSequence key;

    @Nullable
    private Integer style;

    @Nullable
    private CharSequence subVaule;

    @Nullable
    private Uri tagIvValue;

    @Nullable
    private CharSequence value;

    /* JADX INFO: renamed from: com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/cashier/CoreCashierPaymentExtra$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/core/bean/cashier/CoreCashierPaymentExtra;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/core/bean/cashier/CoreCashierPaymentExtra;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CoreCashierPaymentExtra> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CoreCashierPaymentExtra createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoreCashierPaymentExtra(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CoreCashierPaymentExtra[] newArray(int size) {
            return new CoreCashierPaymentExtra[size];
        }
    }

    public CoreCashierPaymentExtra(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this.key = charSequence;
        this.value = charSequence2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final CharSequence getKey() {
        return this.key;
    }

    @Nullable
    public final Integer getStyle() {
        return this.style;
    }

    @Nullable
    public final CharSequence getSubVaule() {
        return this.subVaule;
    }

    @Nullable
    public final Uri getTagIvValue() {
        return this.tagIvValue;
    }

    @Nullable
    public final CharSequence getValue() {
        return this.value;
    }

    public final void setKey(@Nullable CharSequence charSequence) {
        this.key = charSequence;
    }

    public final void setStyle(@Nullable Integer num) {
        this.style = num;
    }

    public final void setSubVaule(@Nullable CharSequence charSequence) {
        this.subVaule = charSequence;
    }

    public final void setTagIvValue(@Nullable Uri uri) {
        this.tagIvValue = uri;
    }

    public final void setValue(@Nullable CharSequence charSequence) {
        this.value = charSequence;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        CharSequence charSequence = this.key;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.value;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeValue(this.style);
        CharSequence charSequence3 = this.subVaule;
        parcel.writeString(charSequence3 != null ? charSequence3.toString() : null);
        parcel.writeParcelable(this.tagIvValue, flags);
    }

    public CoreCashierPaymentExtra(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable Integer num) {
        this.key = charSequence;
        this.value = charSequence2;
        this.style = num;
    }

    public CoreCashierPaymentExtra(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable Integer num, @Nullable CharSequence charSequence3) {
        this.key = charSequence;
        this.value = charSequence2;
        this.style = num;
        this.subVaule = charSequence3;
    }

    public CoreCashierPaymentExtra(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable Integer num, @Nullable CharSequence charSequence3, @Nullable Uri uri) {
        this.key = charSequence;
        this.value = charSequence2;
        this.style = num;
        this.subVaule = charSequence3;
        this.tagIvValue = uri;
    }

    public CoreCashierPaymentExtra(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.key = parcel.readString();
        this.value = parcel.readString();
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        this.style = value instanceof Integer ? (Integer) value : null;
        this.subVaule = parcel.readString();
        this.tagIvValue = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
