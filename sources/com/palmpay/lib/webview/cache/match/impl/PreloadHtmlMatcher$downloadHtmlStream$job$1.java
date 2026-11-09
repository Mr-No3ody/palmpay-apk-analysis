package com.palmpay.lib.webview.cache.match.impl;

import Ff.h;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlStream$job$1", f = "PreloadHtmlMatcher.kt", i = {1}, l = {79, HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG}, m = "invokeSuspend", n = {"stream"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nPreloadHtmlMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$downloadHtmlStream$job$1\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,240:1\n9#2,4:241\n9#2,4:245\n9#2,4:249\n*S KotlinDebug\n*F\n+ 1 PreloadHtmlMatcher.kt\ncom/palmpay/lib/webview/cache/match/impl/PreloadHtmlMatcher$downloadHtmlStream$job$1\n*L\n78#1:241,4\n84#1:245,4\n95#1:249,4\n*E\n"})
public final class PreloadHtmlMatcher$downloadHtmlStream$job$1 extends h implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $header;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ PreloadHtmlMatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadHtmlMatcher$downloadHtmlStream$job$1(Map<String, String> map, String str, PreloadHtmlMatcher preloadHtmlMatcher, Continuation<? super PreloadHtmlMatcher$downloadHtmlStream$job$1> continuation) {
        super(1, continuation);
        this.$header = map;
        this.$url = str;
        this.this$0 = preloadHtmlMatcher;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PreloadHtmlMatcher$downloadHtmlStream$job$1(this.$header, this.$url, this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r2 == r1) goto L46;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00b0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0132, please report this as an issue */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlStream$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((PreloadHtmlMatcher$downloadHtmlStream$job$1) create(continuation)).invokeSuspend(Unit.f38893a);
    }
}
