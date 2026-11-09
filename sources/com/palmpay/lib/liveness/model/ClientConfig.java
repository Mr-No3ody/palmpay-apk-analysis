package com.palmpay.lib.liveness.model;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import androidx.databinding.g;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003JÖ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\u0006J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\u0006HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b%\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b,\u0010\u001eR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006O"}, d2 = {"Lcom/palmpay/lib/liveness/model/ClientConfig;", "Landroid/os/Parcelable;", "uploadUrl", "", "uploadVideoUrl", "serviceLevel", "", "secureLevel", "facialRecognitionAccuracy", "thresholdMap", "", "photoResolution", "livenessPhotosNumber", "livenessTimeOut", "", "fileType", "fileTypeSwitch", "videoFrames", "actionList", "", "Lcom/palmpay/lib/liveness/model/LivenessAction;", "actionListV2", "extendFeature", "Lcom/palmpay/lib/liveness/model/ExtendFeature;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/palmpay/lib/liveness/model/ExtendFeature;)V", "getUploadUrl", "()Ljava/lang/String;", "getUploadVideoUrl", "getServiceLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSecureLevel", "getFacialRecognitionAccuracy", "getThresholdMap", "()Ljava/util/Map;", "getPhotoResolution", "getLivenessPhotosNumber", "getLivenessTimeOut", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFileType", "()I", "getFileTypeSwitch", "getVideoFrames", "getActionList", "()Ljava/util/List;", "getActionListV2", "getExtendFeature", "()Lcom/palmpay/lib/liveness/model/ExtendFeature;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;IILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/palmpay/lib/liveness/model/ExtendFeature;)Lcom/palmpay/lib/liveness/model/ClientConfig;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClientConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ClientConfig> CREATOR = new g(23);

    @Nullable
    private final List<LivenessAction> actionList;

    @Nullable
    private final List<LivenessAction> actionListV2;

    @Nullable
    private final ExtendFeature extendFeature;

    @Nullable
    private final String facialRecognitionAccuracy;
    private final int fileType;
    private final int fileTypeSwitch;

    @Nullable
    private final Integer livenessPhotosNumber;

    @Nullable
    private final Long livenessTimeOut;

    @Nullable
    private final String photoResolution;

    @Nullable
    private final String secureLevel;

    @Nullable
    private final Integer serviceLevel;

    @Nullable
    private final Map<String, String> thresholdMap;

    @Nullable
    private final String uploadUrl;

    @Nullable
    private final String uploadVideoUrl;

    @Nullable
    private final Integer videoFrames;

    public ClientConfig() {
        this(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, 32767, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFileType() {
        return this.fileType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFileTypeSwitch() {
        return this.fileTypeSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getVideoFrames() {
        return this.videoFrames;
    }

    @Nullable
    public final List<LivenessAction> component13() {
        return this.actionList;
    }

    @Nullable
    public final List<LivenessAction> component14() {
        return this.actionListV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final ExtendFeature getExtendFeature() {
        return this.extendFeature;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUploadVideoUrl() {
        return this.uploadVideoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getServiceLevel() {
        return this.serviceLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecureLevel() {
        return this.secureLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFacialRecognitionAccuracy() {
        return this.facialRecognitionAccuracy;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.thresholdMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhotoResolution() {
        return this.photoResolution;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getLivenessPhotosNumber() {
        return this.livenessPhotosNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getLivenessTimeOut() {
        return this.livenessTimeOut;
    }

    @NotNull
    public final ClientConfig copy(@Nullable String uploadUrl, @Nullable String uploadVideoUrl, @Nullable Integer serviceLevel, @Nullable String secureLevel, @Nullable String facialRecognitionAccuracy, @Nullable Map<String, String> thresholdMap, @Nullable String photoResolution, @Nullable Integer livenessPhotosNumber, @Nullable Long livenessTimeOut, int fileType, int fileTypeSwitch, @Nullable Integer videoFrames, @Nullable List<LivenessAction> actionList, @Nullable List<LivenessAction> actionListV2, @Nullable ExtendFeature extendFeature) {
        return new ClientConfig(uploadUrl, uploadVideoUrl, serviceLevel, secureLevel, facialRecognitionAccuracy, thresholdMap, photoResolution, livenessPhotosNumber, livenessTimeOut, fileType, fileTypeSwitch, videoFrames, actionList, actionListV2, extendFeature);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) other;
        return Intrinsics.c(this.uploadUrl, clientConfig.uploadUrl) && Intrinsics.c(this.uploadVideoUrl, clientConfig.uploadVideoUrl) && Intrinsics.c(this.serviceLevel, clientConfig.serviceLevel) && Intrinsics.c(this.secureLevel, clientConfig.secureLevel) && Intrinsics.c(this.facialRecognitionAccuracy, clientConfig.facialRecognitionAccuracy) && Intrinsics.c(this.thresholdMap, clientConfig.thresholdMap) && Intrinsics.c(this.photoResolution, clientConfig.photoResolution) && Intrinsics.c(this.livenessPhotosNumber, clientConfig.livenessPhotosNumber) && Intrinsics.c(this.livenessTimeOut, clientConfig.livenessTimeOut) && this.fileType == clientConfig.fileType && this.fileTypeSwitch == clientConfig.fileTypeSwitch && Intrinsics.c(this.videoFrames, clientConfig.videoFrames) && Intrinsics.c(this.actionList, clientConfig.actionList) && Intrinsics.c(this.actionListV2, clientConfig.actionListV2) && Intrinsics.c(this.extendFeature, clientConfig.extendFeature);
    }

    @Nullable
    public final List<LivenessAction> getActionList() {
        return this.actionList;
    }

    @Nullable
    public final List<LivenessAction> getActionListV2() {
        return this.actionListV2;
    }

    @Nullable
    public final ExtendFeature getExtendFeature() {
        return this.extendFeature;
    }

    @Nullable
    public final String getFacialRecognitionAccuracy() {
        return this.facialRecognitionAccuracy;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final int getFileTypeSwitch() {
        return this.fileTypeSwitch;
    }

    @Nullable
    public final Integer getLivenessPhotosNumber() {
        return this.livenessPhotosNumber;
    }

    @Nullable
    public final Long getLivenessTimeOut() {
        return this.livenessTimeOut;
    }

    @Nullable
    public final String getPhotoResolution() {
        return this.photoResolution;
    }

    @Nullable
    public final String getSecureLevel() {
        return this.secureLevel;
    }

    @Nullable
    public final Integer getServiceLevel() {
        return this.serviceLevel;
    }

    @Nullable
    public final Map<String, String> getThresholdMap() {
        return this.thresholdMap;
    }

    @Nullable
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    @Nullable
    public final String getUploadVideoUrl() {
        return this.uploadVideoUrl;
    }

    @Nullable
    public final Integer getVideoFrames() {
        return this.videoFrames;
    }

    public int hashCode() {
        String str = this.uploadUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uploadVideoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.serviceLevel;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.secureLevel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.facialRecognitionAccuracy;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.thresholdMap;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.photoResolution;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.livenessPhotosNumber;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.livenessTimeOut;
        int iB = u.b(this.fileTypeSwitch, u.b(this.fileType, (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31, 31), 31);
        Integer num3 = this.videoFrames;
        int iHashCode9 = (iB + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<LivenessAction> list = this.actionList;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<LivenessAction> list2 = this.actionListV2;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ExtendFeature extendFeature = this.extendFeature;
        return iHashCode11 + (extendFeature != null ? extendFeature.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uploadUrl;
        String str2 = this.uploadVideoUrl;
        Integer num = this.serviceLevel;
        String str3 = this.secureLevel;
        String str4 = this.facialRecognitionAccuracy;
        Map<String, String> map = this.thresholdMap;
        String str5 = this.photoResolution;
        Integer num2 = this.livenessPhotosNumber;
        Long l5 = this.livenessTimeOut;
        int i7 = this.fileType;
        int i10 = this.fileTypeSwitch;
        Integer num3 = this.videoFrames;
        List<LivenessAction> list = this.actionList;
        List<LivenessAction> list2 = this.actionListV2;
        ExtendFeature extendFeature = this.extendFeature;
        StringBuilder sbF = F.f("ClientConfig(uploadUrl=", str, ", uploadVideoUrl=", str2, ", serviceLevel=");
        sbF.append(num);
        sbF.append(", secureLevel=");
        sbF.append(str3);
        sbF.append(", facialRecognitionAccuracy=");
        sbF.append(str4);
        sbF.append(", thresholdMap=");
        sbF.append(map);
        sbF.append(", photoResolution=");
        sbF.append(str5);
        sbF.append(", livenessPhotosNumber=");
        sbF.append(num2);
        sbF.append(", livenessTimeOut=");
        sbF.append(l5);
        sbF.append(", fileType=");
        sbF.append(i7);
        sbF.append(", fileTypeSwitch=");
        sbF.append(i10);
        sbF.append(", videoFrames=");
        sbF.append(num3);
        sbF.append(", actionList=");
        sbF.append(list);
        sbF.append(", actionListV2=");
        sbF.append(list2);
        sbF.append(", extendFeature=");
        sbF.append(extendFeature);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.uploadUrl);
        dest.writeString(this.uploadVideoUrl);
        Integer num = this.serviceLevel;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        dest.writeString(this.secureLevel);
        dest.writeString(this.facialRecognitionAccuracy);
        Map<String, String> map = this.thresholdMap;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        dest.writeString(this.photoResolution);
        Integer num2 = this.livenessPhotosNumber;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Long l5 = this.livenessTimeOut;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        dest.writeInt(this.fileType);
        dest.writeInt(this.fileTypeSwitch);
        Integer num3 = this.videoFrames;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num3);
        }
        List<LivenessAction> list = this.actionList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LivenessAction> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<LivenessAction> list2 = this.actionListV2;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<LivenessAction> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        ExtendFeature extendFeature = this.extendFeature;
        if (extendFeature == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            extendFeature.writeToParcel(dest, flags);
        }
    }

    public ClientConfig(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map, @Nullable String str5, @Nullable Integer num2, @Nullable Long l5, int i7, int i10, @Nullable Integer num3, @Nullable List<LivenessAction> list, @Nullable List<LivenessAction> list2, @Nullable ExtendFeature extendFeature) {
        this.uploadUrl = str;
        this.uploadVideoUrl = str2;
        this.serviceLevel = num;
        this.secureLevel = str3;
        this.facialRecognitionAccuracy = str4;
        this.thresholdMap = map;
        this.photoResolution = str5;
        this.livenessPhotosNumber = num2;
        this.livenessTimeOut = l5;
        this.fileType = i7;
        this.fileTypeSwitch = i10;
        this.videoFrames = num3;
        this.actionList = list;
        this.actionListV2 = list2;
        this.extendFeature = extendFeature;
    }

    public /* synthetic */ ClientConfig(String str, String str2, Integer num, String str3, String str4, Map map, String str5, Integer num2, Long l5, int i7, int i10, Integer num3, List list, List list2, ExtendFeature extendFeature, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : num2, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : l5, (i11 & 512) != 0 ? 0 : i7, (i11 & 1024) != 0 ? 2 : i10, (i11 & 2048) != 0 ? null : num3, (i11 & 4096) != 0 ? null : list, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : list2, (i11 & 16384) != 0 ? null : extendFeature);
    }
}
