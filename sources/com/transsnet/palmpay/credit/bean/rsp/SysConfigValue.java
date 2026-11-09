package com.transsnet.palmpay.credit.bean.rsp;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "Landroid/os/Parcelable;", "keyValue", "", "keyName", "keyType", "system", "keyText", "keyValueType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getKeyValue", "()Ljava/lang/String;", "getKeyName", "getKeyType", "getSystem", "getKeyText", "getKeyValueType", "writeToParcel", "", "flags", "", "describeContents", "equals", "", "other", "", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "toString", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SysConfigValue implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String keyName;

    @Nullable
    private final String keyText;

    @Nullable
    private final String keyType;

    @Nullable
    private final String keyValue;

    @Nullable
    private final String keyValueType;

    @Nullable
    private final String system;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.rsp.SysConfigValue$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SysConfigValue> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SysConfigValue createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SysConfigValue(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SysConfigValue[] newArray(int size) {
            return new SysConfigValue[size];
        }
    }

    public SysConfigValue(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.keyValue = str;
        this.keyName = str2;
        this.keyType = str3;
        this.system = str4;
        this.keyText = str5;
        this.keyValueType = str6;
    }

    public static /* synthetic */ SysConfigValue copy$default(SysConfigValue sysConfigValue, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = sysConfigValue.keyValue;
        }
        if ((i7 & 2) != 0) {
            str2 = sysConfigValue.keyName;
        }
        if ((i7 & 4) != 0) {
            str3 = sysConfigValue.keyType;
        }
        if ((i7 & 8) != 0) {
            str4 = sysConfigValue.system;
        }
        if ((i7 & 16) != 0) {
            str5 = sysConfigValue.keyText;
        }
        if ((i7 & 32) != 0) {
            str6 = sysConfigValue.keyValueType;
        }
        String str7 = str5;
        String str8 = str6;
        return sysConfigValue.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyValue() {
        return this.keyValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKeyText() {
        return this.keyText;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKeyValueType() {
        return this.keyValueType;
    }

    @NotNull
    public final SysConfigValue copy(@Nullable String keyValue, @Nullable String keyName, @Nullable String keyType, @Nullable String system, @Nullable String keyText, @Nullable String keyValueType) {
        return new SysConfigValue(keyValue, keyName, keyType, system, keyText, keyValueType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!SysConfigValue.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.credit.bean.rsp.SysConfigValue");
        SysConfigValue sysConfigValue = (SysConfigValue) other;
        return Intrinsics.c(this.keyValue, sysConfigValue.keyValue) && Intrinsics.c(this.keyName, sysConfigValue.keyName) && Intrinsics.c(this.keyType, sysConfigValue.keyType) && Intrinsics.c(this.system, sysConfigValue.system) && Intrinsics.c(this.keyText, sysConfigValue.keyText) && Intrinsics.c(this.keyValueType, sysConfigValue.keyValueType);
    }

    @Nullable
    public final String getKeyName() {
        return this.keyName;
    }

    @Nullable
    public final String getKeyText() {
        return this.keyText;
    }

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final String getKeyValue() {
        return this.keyValue;
    }

    @Nullable
    public final String getKeyValueType() {
        return this.keyValueType;
    }

    @Nullable
    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        String str = this.keyValue;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.keyName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.keyType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.system;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.keyText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.keyValueType;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.keyValue;
        String str2 = this.keyName;
        String str3 = this.keyType;
        String str4 = this.system;
        String str5 = this.keyText;
        String str6 = this.keyValueType;
        StringBuilder sbF = F.f("SysConfigValue(keyValue=", str, ", keyName=", str2, ", keyType=");
        u.x(sbF, str3, ", system=", str4, ", keyText=");
        return G.s(sbF, str5, ", keyValueType=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.keyValue);
        parcel.writeString(this.keyName);
        parcel.writeString(this.keyType);
        parcel.writeString(this.system);
        parcel.writeString(this.keyText);
        parcel.writeString(this.keyValueType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SysConfigValue(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
