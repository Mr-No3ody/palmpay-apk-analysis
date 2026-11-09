package com.palmpay.lib.webview.cache;

import Wf.AbstractC0774s;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.p0;
import Xf.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p041ce.o;
import p042cg.e;
import p042cg.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/cache/WebCacheConstant;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope$delegate", "Lkotlin/Lazy;", "getApplicationScope$lib_webview_release", "()Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "LWf/s;", "ioDispatcher$delegate", "getIoDispatcher$lib_webview_release", "()LWf/s;", "ioDispatcher", "LWf/p0;", "mainDispatcher$delegate", "getMainDispatcher$lib_webview_release", "()LWf/p0;", "mainDispatcher", "", "NET_READ_BUFFER_SIZE", "I", "LOCAL_READ_BUFFER_SIZE", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebCacheConstant {
    public static final int LOCAL_READ_BUFFER_SIZE = 2048;
    public static final int NET_READ_BUFFER_SIZE = 10240;

    @NotNull
    public static final WebCacheConstant INSTANCE = new WebCacheConstant();

    /* JADX INFO: renamed from: applicationScope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy applicationScope = C2131j.b(new o(11));

    /* JADX INFO: renamed from: ioDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy ioDispatcher = C2131j.b(new o(12));

    /* JADX INFO: renamed from: mainDispatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mainDispatcher = C2131j.b(new o(13));

    private WebCacheConstant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope applicationScope_delegate$lambda$0() {
        return AbstractC0777v.a(AbstractC0780y.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0774s ioDispatcher_delegate$lambda$1() {
        f fVar = I.f10809a;
        return e.f19009c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 mainDispatcher_delegate$lambda$2() {
        f fVar = I.f10809a;
        return ((d) p015ag.o.f11960a).f11224e;
    }

    @NotNull
    public final CoroutineScope getApplicationScope$lib_webview_release() {
        return (CoroutineScope) applicationScope.getValue();
    }

    @NotNull
    public final AbstractC0774s getIoDispatcher$lib_webview_release() {
        return (AbstractC0774s) ioDispatcher.getValue();
    }

    @NotNull
    public final p0 getMainDispatcher$lib_webview_release() {
        return (p0) mainDispatcher.getValue();
    }
}
