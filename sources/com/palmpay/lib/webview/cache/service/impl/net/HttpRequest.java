package com.palmpay.lib.webview.cache.service.impl.net;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.webview.cache.service.base.NetState;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0094@¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0002X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/HttpRequest;", "Lcom/palmpay/lib/webview/cache/service/impl/net/BaseRequest;", "", "url", "<init>", "(Ljava/lang/String;)V", "TAG", "getTAG", "()Ljava/lang/String;", "parseData", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "responseCode", "", "responseHeaders", "", "", "contentLength", "", "inputStream", "Ljava/io/InputStream;", "(ILjava/util/Map;JLjava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/HttpRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,61:1\n1#2:62\n9#3,4:63\n*S KotlinDebug\n*F\n+ 1 HttpRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/HttpRequest\n*L\n55#1:63,4\n*E\n"})
public final class HttpRequest extends BaseRequest<String> {

    @NotNull
    private final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String url) {
        super(url, null, null, null, null, null, null, false, null, 0, 0, 2046, null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.TAG = "HttpRequest";
    }

    @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
    @Nullable
    public Object parseData(int i7, @Nullable Map<String, ? extends List<String>> map, long j6, @Nullable InputStream inputStream, @NotNull Continuation<? super NetState<String>> continuation) {
        StringBuilder sb2;
        BufferedReader bufferedReader;
        Object error;
        String string;
        String string2;
        if (Intrinsics.c(getMethod(), "HEAD") || inputStream == null) {
            sb2 = null;
            bufferedReader = null;
        } else {
            sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e10) {
                    return new NetState.Error(-1, e10);
                }
            }
        }
        String str = "";
        if (i7 == 200) {
            error = new NetState.Complete(i7, map, j6, (sb2 == null || (string2 = sb2.toString()) == null) ? "" : string2);
        } else {
            if (bufferedReader != null && (string = bufferedReader.toString()) != null) {
                str = string;
            }
            error = new NetState.Error(i7, new Exception(str));
        }
        try {
            if (bufferedReader == null) {
                if (inputStream != null) {
                    inputStream.close();
                }
                disconnect();
                return error;
            }
            bufferedReader.close();
        } catch (IOException e11) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(getTAG(), e11);
            }
        }
        disconnect();
        return error;
    }
}
