package com.palmpay.lib.webview.cache.service.base;

import C0.G;
import N8.q0;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileState;", "", "<init>", "()V", "toString", "", "OnStart", "OnProgress", "Error", "Complete", "Lcom/palmpay/lib/webview/cache/service/base/FileState$Complete;", "Lcom/palmpay/lib/webview/cache/service/base/FileState$Error;", "Lcom/palmpay/lib/webview/cache/service/base/FileState$OnProgress;", "Lcom/palmpay/lib/webview/cache/service/base/FileState$OnStart;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FileState {

    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J!\u0010\u0018\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R)\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileState$Complete;", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", "code", "", "length", "", "headers", "", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/io/File;", "<init>", "(IJLjava/util/Map;Ljava/io/File;)V", "getCode", "()I", "getLength", "()J", "getHeaders", "()Ljava/util/Map;", "getData", "()Ljava/io/File;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Complete extends FileState {
        private final int code;

        @NotNull
        private final File data;

        @Nullable
        private final Map<String, List<String>> headers;
        private final long length;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(int i7, long j6, @Nullable Map<String, ? extends List<String>> map, @NotNull File data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.code = i7;
            this.length = j6;
            this.headers = map;
            this.data = data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, int i7, long j6, Map map, File file, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = complete.code;
            }
            if ((i10 & 2) != 0) {
                j6 = complete.length;
            }
            if ((i10 & 4) != 0) {
                map = complete.headers;
            }
            if ((i10 & 8) != 0) {
                file = complete.data;
            }
            return complete.copy(i7, j6, map, file);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getLength() {
            return this.length;
        }

        @Nullable
        public final Map<String, List<String>> component3() {
            return this.headers;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final File getData() {
            return this.data;
        }

        @NotNull
        public final Complete copy(int code, long length, @Nullable Map<String, ? extends List<String>> headers, @NotNull File data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Complete(code, length, headers, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return this.code == complete.code && this.length == complete.length && Intrinsics.c(this.headers, complete.headers) && Intrinsics.c(this.data, complete.data);
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final File getData() {
            return this.data;
        }

        @Nullable
        public final Map<String, List<String>> getHeaders() {
            return this.headers;
        }

        public final long getLength() {
            return this.length;
        }

        public int hashCode() {
            int iB = q0.b(Integer.hashCode(this.code) * 31, 31, this.length);
            Map<String, List<String>> map = this.headers;
            return this.data.hashCode() + ((iB + (map == null ? 0 : map.hashCode())) * 31);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.FileState
        @NotNull
        public String toString() {
            return "Complete(code=" + this.code + ", length=" + this.length + ", headers=" + this.headers + ", data=" + this.data + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileState$Error;", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", "code", "", "throwable", "", "<init>", "(ILjava/lang/Throwable;)V", "getCode", "()I", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends FileState {
        private final int code;

        @Nullable
        private final Throwable throwable;

        public Error(int i7, @Nullable Throwable th) {
            super(null);
            this.code = i7;
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, int i7, Throwable th, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = error.code;
            }
            if ((i10 & 2) != 0) {
                th = error.throwable;
            }
            return error.copy(i7, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public final Error copy(int code, @Nullable Throwable throwable) {
            return new Error(code, throwable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.c(this.throwable, error.throwable);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            Throwable th = this.throwable;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // com.palmpay.lib.webview.cache.service.base.FileState
        @NotNull
        public String toString() {
            return "Error(code=" + this.code + ", throwable=" + this.throwable + ")";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileState$OnProgress;", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", ReactProgressBarViewManager.PROP_PROGRESS, "", "max", "<init>", "(JJ)V", "getProgress", "()J", "getMax", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProgress extends FileState {
        private final long max;
        private final long progress;

        public OnProgress(long j6, long j10) {
            super(null);
            this.progress = j6;
            this.max = j10;
        }

        public static /* synthetic */ OnProgress copy$default(OnProgress onProgress, long j6, long j10, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j6 = onProgress.progress;
            }
            if ((i7 & 2) != 0) {
                j10 = onProgress.max;
            }
            return onProgress.copy(j6, j10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getProgress() {
            return this.progress;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getMax() {
            return this.max;
        }

        @NotNull
        public final OnProgress copy(long progress, long max) {
            return new OnProgress(progress, max);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProgress)) {
                return false;
            }
            OnProgress onProgress = (OnProgress) other;
            return this.progress == onProgress.progress && this.max == onProgress.max;
        }

        public final long getMax() {
            return this.max;
        }

        public final long getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Long.hashCode(this.max) + (Long.hashCode(this.progress) * 31);
        }

        @Override // com.palmpay.lib.webview.cache.service.base.FileState
        @NotNull
        public String toString() {
            long j6 = this.progress;
            return q0.n(u.r(j6, "OnProgress(progress=", ", max="), ")", this.max);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileState$OnStart;", "Lcom/palmpay/lib/webview/cache/service/base/FileState;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStart extends FileState {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnStart(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ OnStart copy$default(OnStart onStart, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = onStart.url;
            }
            return onStart.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final OnStart copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OnStart(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStart) && Intrinsics.c(this.url, ((OnStart) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @Override // com.palmpay.lib.webview.cache.service.base.FileState
        @NotNull
        public String toString() {
            return q0.k("OnStart(url=", this.url, ")");
        }
    }

    public /* synthetic */ FileState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof OnStart) {
            return G.o("FileState[OnStart] url: ", ((OnStart) this).getUrl());
        }
        if (this instanceof OnProgress) {
            OnProgress onProgress = (OnProgress) this;
            long progress = onProgress.getProgress();
            long max = onProgress.getMax();
            StringBuilder sbR = u.r(progress, "FileState[OnProgress] ", "/");
            sbR.append(max);
            return sbR.toString();
        }
        if (this instanceof Complete) {
            Complete complete = (Complete) this;
            return d.j("FileState[Complete, code=", complete.getCode(), "] path: ", complete.getData().getPath());
        }
        if (!(this instanceof Error)) {
            throw new l();
        }
        Error error = (Error) this;
        int code = error.getCode();
        Throwable throwable = error.getThrowable();
        return "FileState[Error, code=" + code + "] exception: " + (throwable != null ? throwable.getMessage() : null) + "]";
    }

    private FileState() {
    }
}
