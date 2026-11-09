package com.palmpay.lib.liveness.model;

import androidx.annotation.Keep;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/liveness/model/UploadRequestV2;", "", "image", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getImage", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadRequestV2 {

    @NotNull
    private final File image;

    public UploadRequestV2(@NotNull File image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
    }

    public static /* synthetic */ UploadRequestV2 copy$default(UploadRequestV2 uploadRequestV2, File file, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            file = uploadRequestV2.image;
        }
        return uploadRequestV2.copy(file);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getImage() {
        return this.image;
    }

    @NotNull
    public final UploadRequestV2 copy(@NotNull File image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new UploadRequestV2(image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UploadRequestV2) && Intrinsics.c(this.image, ((UploadRequestV2) other).image);
    }

    @NotNull
    public final File getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadRequestV2(image=" + this.image + ")";
    }
}
