package com.transsnet.palmpay.managemoney.bean;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u0005H\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0017¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "Landroid/os/Parcelable;", "icon", "", "type", "", "name", "selected", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getIcon", "()Ljava/lang/String;", "getType", "()I", "setType", "(I)V", "getName", "setName", "(Ljava/lang/String;)V", "getSelected", "()Z", "setSelected", "(Z)V", "getContent", "setContent", "writeToParcel", "", "flags", "describeContents", "equals", "other", "", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "CREATOR", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PayoutOption implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String content;

    @Nullable
    private final String icon;

    @Nullable
    private String name;
    private boolean selected;
    private int type;

    /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.bean.PayoutOption$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/PayoutOption$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<PayoutOption> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PayoutOption createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayoutOption(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public PayoutOption[] newArray(int size) {
            return new PayoutOption[size];
        }
    }

    public PayoutOption(@Nullable String str, int i7, @Nullable String str2, boolean z3, @Nullable String str3) {
        this.icon = str;
        this.type = i7;
        this.name = str2;
        this.selected = z3;
        this.content = str3;
    }

    public static /* synthetic */ PayoutOption copy$default(PayoutOption payoutOption, String str, int i7, String str2, boolean z3, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = payoutOption.icon;
        }
        if ((i10 & 2) != 0) {
            i7 = payoutOption.type;
        }
        if ((i10 & 4) != 0) {
            str2 = payoutOption.name;
        }
        if ((i10 & 8) != 0) {
            z3 = payoutOption.selected;
        }
        if ((i10 & 16) != 0) {
            str3 = payoutOption.content;
        }
        String str4 = str3;
        String str5 = str2;
        return payoutOption.copy(str, i7, str5, z3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final PayoutOption copy(@Nullable String icon, int type, @Nullable String name, boolean selected, @Nullable String content) {
        return new PayoutOption(icon, type, name, selected, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!PayoutOption.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.bean.PayoutOption");
        return this.type == ((PayoutOption) other).type;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(boolean z3) {
        this.selected = z3;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        int i7 = this.type;
        String str2 = this.name;
        boolean z3 = this.selected;
        String str3 = this.content;
        StringBuilder sb2 = new StringBuilder("PayoutOption(icon=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(i7);
        sb2.append(", name=");
        sb2.append(str2);
        sb2.append(", selected=");
        sb2.append(z3);
        sb2.append(", content=");
        return G.r(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.icon);
        parcel.writeInt(this.type);
        parcel.writeString(this.name);
        parcel.writeByte(this.selected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.content);
    }

    public /* synthetic */ PayoutOption(String str, int i7, String str2, boolean z3, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 1 : i7, str2, (i10 & 8) != 0 ? false : z3, str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PayoutOption(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readByte() != 0, parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
