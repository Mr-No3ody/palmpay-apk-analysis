package com.palmpay.lib.webview.cache.service.base;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR!\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileRequestOption;", "", FirebaseAnalytics.Param.METHOD, "", "header", "", "userAgent", "cookie", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getHeader", "()Ljava/util/Map;", "getUserAgent", "getCookie", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FileRequestOption {

    @Nullable
    private final String cookie;

    @Nullable
    private final Map<String, String> header;

    @NotNull
    private String method;

    @Nullable
    private final String userAgent;

    public FileRequestOption() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final String getCookie() {
        return this.cookie;
    }

    @Nullable
    public final Map<String, String> getHeader() {
        return this.header;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.method = str;
    }

    public FileRequestOption(@NotNull String method, @Nullable Map<String, String> map, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.header = map;
        this.userAgent = str;
        this.cookie = str2;
    }

    public /* synthetic */ FileRequestOption(String str, Map map, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "GET" : str, (i7 & 2) != 0 ? null : map, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
    }
}
