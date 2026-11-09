package com.palmpay.lib.liveness.model;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import androidx.databinding.g;
import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068ec.d;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR#\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/palmpay/lib/liveness/model/ExtendFeature;", "Landroid/os/Parcelable;", "timeOutOpt", "", "businessTxt", "holdOnFacingDetect", "facingDetectThreshold", "deviceFingerprintThreshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTimeOutOpt", "()Ljava/lang/String;", "getBusinessTxt", "getHoldOnFacingDetect", "getFacingDetectThreshold", "getDeviceFingerprintThreshold", "facingDetectThresholdObj", "Lcom/palmpay/lib/liveness/model/FacingDetectThreshold;", "getFacingDetectThresholdObj$annotations", "()V", "getFacingDetectThresholdObj", "()Lcom/palmpay/lib/liveness/model/FacingDetectThreshold;", "facingDetectThresholdObj$delegate", "Lkotlin/Lazy;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExtendFeature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExtendFeature> CREATOR = new g(24);

    @Nullable
    private final String businessTxt;

    @Nullable
    private final String deviceFingerprintThreshold;

    @Nullable
    private final String facingDetectThreshold;

    /* JADX INFO: renamed from: facingDetectThresholdObj$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy facingDetectThresholdObj;

    @Nullable
    private final String holdOnFacingDetect;

    @Nullable
    private final String timeOutOpt;

    public ExtendFeature() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ExtendFeature copy$default(ExtendFeature extendFeature, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = extendFeature.timeOutOpt;
        }
        if ((i7 & 2) != 0) {
            str2 = extendFeature.businessTxt;
        }
        if ((i7 & 4) != 0) {
            str3 = extendFeature.holdOnFacingDetect;
        }
        if ((i7 & 8) != 0) {
            str4 = extendFeature.facingDetectThreshold;
        }
        if ((i7 & 16) != 0) {
            str5 = extendFeature.deviceFingerprintThreshold;
        }
        String str6 = str5;
        String str7 = str3;
        return extendFeature.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FacingDetectThreshold facingDetectThresholdObj_delegate$lambda$1(ExtendFeature extendFeature) {
        try {
            String str = extendFeature.facingDetectThreshold;
            if (str != null) {
                return (FacingDetectThreshold) new Gson().fromJson(str, FacingDetectThreshold.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static /* synthetic */ void getFacingDetectThresholdObj$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimeOutOpt() {
        return this.timeOutOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBusinessTxt() {
        return this.businessTxt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHoldOnFacingDetect() {
        return this.holdOnFacingDetect;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFacingDetectThreshold() {
        return this.facingDetectThreshold;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceFingerprintThreshold() {
        return this.deviceFingerprintThreshold;
    }

    @NotNull
    public final ExtendFeature copy(@Nullable String timeOutOpt, @Nullable String businessTxt, @Nullable String holdOnFacingDetect, @Nullable String facingDetectThreshold, @Nullable String deviceFingerprintThreshold) {
        return new ExtendFeature(timeOutOpt, businessTxt, holdOnFacingDetect, facingDetectThreshold, deviceFingerprintThreshold);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendFeature)) {
            return false;
        }
        ExtendFeature extendFeature = (ExtendFeature) other;
        return Intrinsics.c(this.timeOutOpt, extendFeature.timeOutOpt) && Intrinsics.c(this.businessTxt, extendFeature.businessTxt) && Intrinsics.c(this.holdOnFacingDetect, extendFeature.holdOnFacingDetect) && Intrinsics.c(this.facingDetectThreshold, extendFeature.facingDetectThreshold) && Intrinsics.c(this.deviceFingerprintThreshold, extendFeature.deviceFingerprintThreshold);
    }

    @Nullable
    public final String getBusinessTxt() {
        return this.businessTxt;
    }

    @Nullable
    public final String getDeviceFingerprintThreshold() {
        return this.deviceFingerprintThreshold;
    }

    @Nullable
    public final String getFacingDetectThreshold() {
        return this.facingDetectThreshold;
    }

    @Nullable
    public final FacingDetectThreshold getFacingDetectThresholdObj() {
        return (FacingDetectThreshold) this.facingDetectThresholdObj.getValue();
    }

    @Nullable
    public final String getHoldOnFacingDetect() {
        return this.holdOnFacingDetect;
    }

    @Nullable
    public final String getTimeOutOpt() {
        return this.timeOutOpt;
    }

    public int hashCode() {
        String str = this.timeOutOpt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessTxt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.holdOnFacingDetect;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.facingDetectThreshold;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceFingerprintThreshold;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.timeOutOpt;
        String str2 = this.businessTxt;
        String str3 = this.holdOnFacingDetect;
        String str4 = this.facingDetectThreshold;
        String str5 = this.deviceFingerprintThreshold;
        StringBuilder sbF = F.f("ExtendFeature(timeOutOpt=", str, ", businessTxt=", str2, ", holdOnFacingDetect=");
        u.x(sbF, str3, ", facingDetectThreshold=", str4, ", deviceFingerprintThreshold=");
        return G.r(sbF, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.timeOutOpt);
        dest.writeString(this.businessTxt);
        dest.writeString(this.holdOnFacingDetect);
        dest.writeString(this.facingDetectThreshold);
        dest.writeString(this.deviceFingerprintThreshold);
    }

    public ExtendFeature(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.timeOutOpt = str;
        this.businessTxt = str2;
        this.holdOnFacingDetect = str3;
        this.facingDetectThreshold = str4;
        this.deviceFingerprintThreshold = str5;
        this.facingDetectThresholdObj = C2131j.a(EnumC2132k.f43971c, new d(this, 22));
    }

    public /* synthetic */ ExtendFeature(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }
}
