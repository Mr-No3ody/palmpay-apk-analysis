package com.palmpay.lib.liveness.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/liveness/model/UploadImageInfo;", "", "imageTypeId", "Lcom/palmpay/lib/liveness/model/ImageType;", "image", "Ljava/io/File;", "<init>", "(Lcom/palmpay/lib/liveness/model/ImageType;Ljava/io/File;)V", "getImageTypeId", "()Lcom/palmpay/lib/liveness/model/ImageType;", "getImage", "()Ljava/io/File;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadImageInfo {

    @SerializedName("file_name")
    @NotNull
    private final File image;

    @SerializedName("image_type_id")
    @NotNull
    private final ImageType imageTypeId;

    public UploadImageInfo(@NotNull ImageType imageTypeId, @NotNull File image) {
        Intrinsics.checkNotNullParameter(imageTypeId, "imageTypeId");
        Intrinsics.checkNotNullParameter(image, "image");
        this.imageTypeId = imageTypeId;
        this.image = image;
    }

    public static /* synthetic */ UploadImageInfo copy$default(UploadImageInfo uploadImageInfo, ImageType imageType, File file, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            imageType = uploadImageInfo.imageTypeId;
        }
        if ((i7 & 2) != 0) {
            file = uploadImageInfo.image;
        }
        return uploadImageInfo.copy(imageType, file);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageType getImageTypeId() {
        return this.imageTypeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getImage() {
        return this.image;
    }

    @NotNull
    public final UploadImageInfo copy(@NotNull ImageType imageTypeId, @NotNull File image) {
        Intrinsics.checkNotNullParameter(imageTypeId, "imageTypeId");
        Intrinsics.checkNotNullParameter(image, "image");
        return new UploadImageInfo(imageTypeId, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadImageInfo)) {
            return false;
        }
        UploadImageInfo uploadImageInfo = (UploadImageInfo) other;
        return this.imageTypeId == uploadImageInfo.imageTypeId && Intrinsics.c(this.image, uploadImageInfo.image);
    }

    @NotNull
    public final File getImage() {
        return this.image;
    }

    @NotNull
    public final ImageType getImageTypeId() {
        return this.imageTypeId;
    }

    public int hashCode() {
        return this.image.hashCode() + (this.imageTypeId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UploadImageInfo(imageTypeId=" + this.imageTypeId + ", image=" + this.image + ")";
    }
}
