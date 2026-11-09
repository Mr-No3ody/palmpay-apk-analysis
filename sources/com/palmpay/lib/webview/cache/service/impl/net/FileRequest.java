package com.palmpay.lib.webview.cache.service.impl.net;

import Ff.c;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JN\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0094@¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/impl/net/FileRequest;", "Lcom/palmpay/lib/webview/cache/service/impl/net/BaseRequest;", "Ljava/io/File;", "url", "", "targetPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTargetPath", "()Ljava/lang/String;", "TAG", "getTAG", "parseData", "Lcom/palmpay/lib/webview/cache/service/base/NetState;", "responseCode", "", "responseHeaders", "", "", "contentLength", "", "inputStream", "Ljava/io/InputStream;", "(ILjava/util/Map;JLjava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/FileRequest\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n9#2,4:72\n9#2,4:77\n9#2,4:81\n1#3:76\n*S KotlinDebug\n*F\n+ 1 FileRequest.kt\ncom/palmpay/lib/webview/cache/service/impl/net/FileRequest\n*L\n56#1:72,4\n50#1:77,4\n65#1:81,4\n*E\n"})
public final class FileRequest extends BaseRequest<File> {

    @NotNull
    private final String TAG;

    @NotNull
    private final String targetPath;

    /* JADX INFO: renamed from: com.palmpay.lib.webview.cache.service.impl.net.FileRequest$parseData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.webview.cache.service.impl.net.FileRequest", f = "FileRequest.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS, 40}, m = "parseData", n = {"responseHeaders", "inputStream", "responseCode", "contentLength", "responseHeaders", "inputStream", "bufferedOutputStream", "buffer", "hasRead", "responseCode", "contentLength", "currentSize"}, s = {"L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1"})
    public static final class AnonymousClass1 extends c {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileRequest.this.parseData(0, null, 0L, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileRequest(@NotNull String url, @NotNull String targetPath) {
        super(url, null, null, null, null, null, null, false, null, 0, 0, 2046, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        this.targetPath = targetPath;
        this.TAG = "FileRequest";
    }

    @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final String getTargetPath() {
        return this.targetPath;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x013a -> B:59:0x013f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5551. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.palmpay.lib.webview.cache.service.impl.net.BaseRequest
    @org.jetbrains.annotations.Nullable
    public java.lang.Object parseData(int r21, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r22, long r23, @org.jetbrains.annotations.Nullable java.io.InputStream r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.palmpay.lib.webview.cache.service.base.NetState<java.io.File>> r26) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.webview.cache.service.impl.net.FileRequest.parseData(int, java.util.Map, long, java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
