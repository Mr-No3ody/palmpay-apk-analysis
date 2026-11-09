package com.palmpay.lib.webview.cache.util;

import Ef.a;
import N8.q0;
import Pf.d;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0005"}, d2 = {"getString", "", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateFileName", "lib_webview_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FileHelperKt {
    @NotNull
    public static final String generateFileName(@Nullable String str) {
        String fileNameFromUrl = str != null ? UrlHelper.INSTANCE.getFileNameFromUrl(str) : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        d.f7329a.getClass();
        int iC = d.f7330b.c(900) + 100;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jCurrentTimeMillis);
        sb2.append(iC);
        String string = sb2.toString();
        return (fileNameFromUrl == null || fileNameFromUrl.length() == 0) ? string : q0.y(fileNameFromUrl, "_", string);
    }

    @Nullable
    public static final Object getString(@Nullable File file, @NotNull Continuation<? super String> continuation) {
        if (file == null || !file.exists() || !file.isFile()) {
            return null;
        }
        Object objRunOnIo$default = CoroutineHelper.runOnIo$default(CoroutineHelper.INSTANCE, file, null, new FileHelperKt$getString$2$1(file, null), continuation, 1, null);
        return objRunOnIo$default == a.f2423a ? objRunOnIo$default : (String) objRunOnIo$default;
    }
}
