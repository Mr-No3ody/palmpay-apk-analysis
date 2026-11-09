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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/base/FileSaveOption;", "Lcom/palmpay/lib/webview/cache/service/base/FileRequestOption;", FirebaseAnalytics.Param.METHOD, "", "header", "", "userAgent", "cookie", "needUnzip", "", "unzipDir", "split", "mergeWithFile", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V", "getNeedUnzip", "()Z", "getUnzipDir", "()Ljava/lang/String;", "getSplit", "getMergeWithFile", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FileSaveOption extends FileRequestOption {

    @Nullable
    private final String mergeWithFile;
    private final boolean needUnzip;
    private final boolean split;

    @Nullable
    private final String unzipDir;

    public FileSaveOption() {
        this(null, null, null, null, false, null, false, null, 255, null);
    }

    @Nullable
    public final String getMergeWithFile() {
        return this.mergeWithFile;
    }

    public final boolean getNeedUnzip() {
        return this.needUnzip;
    }

    public final boolean getSplit() {
        return this.split;
    }

    @Nullable
    public final String getUnzipDir() {
        return this.unzipDir;
    }

    public /* synthetic */ FileSaveOption(String str, Map map, String str2, String str3, boolean z3, String str4, boolean z8, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "GET" : str, (i7 & 2) != 0 ? null : map, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? false : z3, (i7 & 32) != 0 ? null : str4, (i7 & 64) != 0 ? false : z8, (i7 & 128) != 0 ? null : str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSaveOption(@NotNull String method, @Nullable Map<String, String> map, @Nullable String str, @Nullable String str2, boolean z3, @Nullable String str3, boolean z8, @Nullable String str4) {
        super(method, map, str, str2);
        Intrinsics.checkNotNullParameter(method, "method");
        this.needUnzip = z3;
        this.unzipDir = str3;
        this.split = z8;
        this.mergeWithFile = str4;
    }
}
