package com.palmpay.lib.webview.cache.util;

import Ef.a;
import Ff.h;
import Kf.m;
import androidx.camera.core.impl.utils.executor.g;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.cache.util.FileHelperKt$getString$2$1", f = "FileHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFileHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHelper.kt\ncom/palmpay/lib/webview/cache/util/FileHelperKt$getString$2$1\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,40:1\n9#2,4:41\n*S KotlinDebug\n*F\n+ 1 FileHelper.kt\ncom/palmpay/lib/webview/cache/util/FileHelperKt$getString$2$1\n*L\n20#1:41,4\n*E\n"})
public final class FileHelperKt$getString$2$1 extends h implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ File $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileHelperKt$getString$2$1(File file, Continuation<? super FileHelperKt$getString$2$1> continuation) {
        super(1, continuation);
        this.$it = file;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FileHelperKt$getString$2$1(this.$it, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        try {
            return m.b(this.$it);
        } catch (FileNotFoundException e10) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e("FileHelper", e10);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((FileHelperKt$getString$2$1) create(continuation)).invokeSuspend(Unit.f38893a);
    }
}
