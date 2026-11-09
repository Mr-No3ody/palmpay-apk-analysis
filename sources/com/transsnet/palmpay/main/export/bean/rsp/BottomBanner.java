package com.transsnet.palmpay.main.export.bean.rsp;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/BottomBanner;", "Landroid/os/Parcelable;", "picUrl", "", "jumpUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getPicUrl", "()Ljava/lang/String;", "getJumpUrl", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BottomBanner implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String jumpUrl;

    @Nullable
    private final String picUrl;

    /* JADX INFO: renamed from: com.transsnet.palmpay.main.export.bean.rsp.BottomBanner$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/BottomBanner$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/main/export/bean/rsp/BottomBanner;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/main/export/bean/rsp/BottomBanner;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<BottomBanner> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BottomBanner createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BottomBanner(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public BottomBanner[] newArray(int size) {
            return new BottomBanner[size];
        }
    }

    public BottomBanner(@Nullable String str, @Nullable String str2) {
        this.picUrl = str;
        this.jumpUrl = str2;
    }

    public static /* synthetic */ BottomBanner copy$default(BottomBanner bottomBanner, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bottomBanner.picUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = bottomBanner.jumpUrl;
        }
        return bottomBanner.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @NotNull
    public final BottomBanner copy(@Nullable String picUrl, @Nullable String jumpUrl) {
        return new BottomBanner(picUrl, jumpUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomBanner)) {
            return false;
        }
        BottomBanner bottomBanner = (BottomBanner) other;
        return Intrinsics.c(this.picUrl, bottomBanner.picUrl) && Intrinsics.c(this.jumpUrl, bottomBanner.jumpUrl);
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPicUrl() {
        return this.picUrl;
    }

    public int hashCode() {
        String str = this.picUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jumpUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return G.q("BottomBanner(picUrl=", this.picUrl, ", jumpUrl=", this.jumpUrl, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.picUrl);
        parcel.writeString(this.jumpUrl);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomBanner(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
