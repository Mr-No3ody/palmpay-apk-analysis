package com.palmpay.lib.webview.container.fast.offline;

import Ff.h;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor$readResMapFromJsonFile$job$1", f = "LocalResourceInterceptor.kt", i = {}, l = {116, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLocalResourceInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor$readResMapFromJsonFile$job$1\n+ 2 CollectionHelper.kt\ncom/palmpay/lib/webview/cache/util/CollectionHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n11#2,3:176\n14#2,4:180\n18#2,3:185\n1855#3:179\n1856#3:184\n1#4:188\n*S KotlinDebug\n*F\n+ 1 LocalResourceInterceptor.kt\ncom/palmpay/lib/webview/container/fast/offline/LocalResourceInterceptor$readResMapFromJsonFile$job$1\n*L\n119#1:176,3\n119#1:180,4\n119#1:185,3\n119#1:179\n119#1:184\n*E\n"})
public final class LocalResourceInterceptor$readResMapFromJsonFile$job$1 extends h implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filePath;
    int label;
    final /* synthetic */ LocalResourceInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalResourceInterceptor$readResMapFromJsonFile$job$1(String str, LocalResourceInterceptor localResourceInterceptor, Continuation<? super LocalResourceInterceptor$readResMapFromJsonFile$job$1> continuation) {
        super(1, continuation);
        this.$filePath = str;
        this.this$0 = localResourceInterceptor;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LocalResourceInterceptor$readResMapFromJsonFile$job$1(this.$filePath, this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r1.send(r8, r7) == r0) goto L37;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto La8
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L31
        L1d:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r1 = r7.$filePath
            r8.<init>(r1)
            r7.label = r3
            java.lang.Object r8 = com.palmpay.lib.webview.cache.util.FileHelperKt.getString(r8, r7)
            if (r8 != r0) goto L31
            goto La7
        L31:
            java.lang.String r8 = (java.lang.String) r8
            com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor r1 = r7.this$0
            com.palmpay.lib.webview.cache.entity.WebCacheDataSource r1 = com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor.access$getDataSource$p(r1)
            if (r1 == 0) goto L89
            java.util.List r8 = com.palmpay.lib.webview.cache.entity.WebCacheLocalRespKt.jsonArrayParse(r8)
            r4 = 0
            if (r8 == 0) goto L86
            java.util.Collection r8 = (java.util.Collection) r8
            r5 = 0
            java.util.Collection r8 = com.palmpay.lib.webview.cache.util.IUsefulCheckKt.useful$default(r8, r5, r3, r4)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L86
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L84
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r3 = java.util.concurrent.ConcurrentHashMap.class
            java.lang.Object r3 = r3.newInstance()
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L64:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r8.next()
            r5 = r3
            com.palmpay.lib.webview.cache.entity.WebCacheLocalResp r5 = (com.palmpay.lib.webview.cache.entity.WebCacheLocalResp) r5
            com.palmpay.lib.webview.cache.util.UrlHelper r6 = com.palmpay.lib.webview.cache.util.UrlHelper.INSTANCE
            java.lang.String r5 = r5.getUrl()
            java.lang.String r5 = r6.urlToKey(r5)
            if (r5 == 0) goto L64
            kotlin.jvm.internal.Intrinsics.e(r4)
            r4.put(r5, r3)
            goto L64
        L84:
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
        L86:
            r1.setLocalFileMap(r4)
        L89:
            com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor r8 = r7.this$0
            com.palmpay.lib.webview.cache.entity.WebCacheDataSource r8 = com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor.access$getDataSource$p(r8)
            if (r8 == 0) goto La8
            java.util.concurrent.ConcurrentHashMap r8 = r8.getLocalFileMap()
            if (r8 == 0) goto La8
            com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor r1 = r7.this$0
            kotlinx.coroutines.channels.Channel r1 = com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor.access$getWaitingChannel$p(r1)
            if (r1 == 0) goto La8
            r7.label = r2
            java.lang.Object r8 = r1.send(r8, r7)
            if (r8 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.webview.container.fast.offline.LocalResourceInterceptor$readResMapFromJsonFile$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((LocalResourceInterceptor$readResMapFromJsonFile$job$1) create(continuation)).invokeSuspend(Unit.f38893a);
    }
}
