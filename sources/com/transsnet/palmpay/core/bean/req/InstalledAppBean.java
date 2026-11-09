package com.transsnet.palmpay.core.bean.req;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/InstalledAppBean;", "Landroid/os/Parcelable;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "updateTime", "", "createTime", "<init>", "(Ljava/lang/String;JJ)V", "getPackageName", "()Ljava/lang/String;", "getUpdateTime", "()J", "getCreateTime", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InstalledAppBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InstalledAppBean> CREATOR = new Creator();
    private final long createTime;

    @NotNull
    private final String packageName;
    private final long updateTime;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstalledAppBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstalledAppBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstalledAppBean(parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InstalledAppBean[] newArray(int i7) {
            return new InstalledAppBean[i7];
        }
    }

    public InstalledAppBean(@NotNull String packageName, long j6, long j10) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.updateTime = j6;
        this.createTime = j10;
    }

    public static /* synthetic */ InstalledAppBean copy$default(InstalledAppBean installedAppBean, String str, long j6, long j10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = installedAppBean.packageName;
        }
        if ((i7 & 2) != 0) {
            j6 = installedAppBean.updateTime;
        }
        if ((i7 & 4) != 0) {
            j10 = installedAppBean.createTime;
        }
        return installedAppBean.copy(str, j6, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final InstalledAppBean copy(@NotNull String packageName, long updateTime, long createTime) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new InstalledAppBean(packageName, updateTime, createTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstalledAppBean)) {
            return false;
        }
        InstalledAppBean installedAppBean = (InstalledAppBean) other;
        return Intrinsics.c(this.packageName, installedAppBean.packageName) && this.updateTime == installedAppBean.updateTime && this.createTime == installedAppBean.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + q0.b(this.packageName.hashCode() * 31, 31, this.updateTime);
    }

    @NotNull
    public String toString() {
        return "InstalledAppBean(packageName=" + this.packageName + ", updateTime=" + this.updateTime + ", createTime=" + this.createTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.packageName);
        dest.writeLong(this.updateTime);
        dest.writeLong(this.createTime);
    }

    public /* synthetic */ InstalledAppBean(String str, long j6, long j10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0L : j6, (i7 & 4) != 0 ? 0L : j10);
    }
}
