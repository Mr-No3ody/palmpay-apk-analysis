package com.palmpay.lib.webview.cache.entity;

import N8.q0;
import androidx.annotation.Keep;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006\""}, d2 = {"Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;", "", "path", "", "lastModified", "", "totalSpace", "<init>", "(Ljava/lang/String;JJ)V", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "getLastModified", "()J", "setLastModified", "(J)V", "getTotalSpace", "setTotalSpace", "exists", "", "hasChanged", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WebCacheFileDetail {
    private long lastModified;

    @NotNull
    private String path;
    private long totalSpace;

    public WebCacheFileDetail(@NotNull String path, long j6, long j10) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.lastModified = j6;
        this.totalSpace = j10;
    }

    public static /* synthetic */ WebCacheFileDetail copy$default(WebCacheFileDetail webCacheFileDetail, String str, long j6, long j10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = webCacheFileDetail.path;
        }
        if ((i7 & 2) != 0) {
            j6 = webCacheFileDetail.lastModified;
        }
        if ((i7 & 4) != 0) {
            j10 = webCacheFileDetail.totalSpace;
        }
        return webCacheFileDetail.copy(str, j6, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalSpace() {
        return this.totalSpace;
    }

    @NotNull
    public final WebCacheFileDetail copy(@NotNull String path, long lastModified, long totalSpace) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new WebCacheFileDetail(path, lastModified, totalSpace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebCacheFileDetail)) {
            return false;
        }
        WebCacheFileDetail webCacheFileDetail = (WebCacheFileDetail) other;
        return Intrinsics.c(this.path, webCacheFileDetail.path) && this.lastModified == webCacheFileDetail.lastModified && this.totalSpace == webCacheFileDetail.totalSpace;
    }

    public final boolean exists() {
        return new File(this.path).exists();
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final long getTotalSpace() {
        return this.totalSpace;
    }

    public final boolean hasChanged() {
        File file = new File(this.path);
        return (file.exists() && file.lastModified() == this.lastModified) ? false : true;
    }

    public int hashCode() {
        return Long.hashCode(this.totalSpace) + q0.b(this.path.hashCode() * 31, 31, this.lastModified);
    }

    public final void setLastModified(long j6) {
        this.lastModified = j6;
    }

    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final void setTotalSpace(long j6) {
        this.totalSpace = j6;
    }

    @NotNull
    public String toString() {
        return "WebCacheFileDetail(path=" + this.path + ", lastModified=" + this.lastModified + ", totalSpace=" + this.totalSpace + ")";
    }

    public /* synthetic */ WebCacheFileDetail(String str, long j6, long j10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0L : j6, (i7 & 4) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebCacheFileDetail(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this(absolutePath, file.lastModified(), file.getTotalSpace());
    }
}
