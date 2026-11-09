package com.transsnet.adsdk.widgets.snackbar;

import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnackBarAdView f25663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdShowCallback f25665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdShowCallback adShowCallback, SnackBarAdView snackBarAdView, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.f25663c = snackBarAdView;
        this.f25664d = weakReference;
        this.f25665e = adShowCallback;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f25665e, this.f25663c, this.f25664d, continuation);
        dVar.f25662b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0107 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:8:0x0018, B:48:0x0137, B:51:0x013d, B:15:0x002d, B:38:0x0103, B:40:0x0107, B:42:0x0119, B:44:0x011f, B:47:0x0134, B:16:0x0032, B:33:0x00d9, B:19:0x003f, B:20:0x007f, B:22:0x0085, B:24:0x0091, B:25:0x00a0, B:27:0x00a6, B:30:0x00c5, B:35:0x00dc, B:28:0x00ab), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:8:0x0018, B:48:0x0137, B:51:0x013d, B:15:0x002d, B:38:0x0103, B:40:0x0107, B:42:0x0119, B:44:0x011f, B:47:0x0134, B:16:0x0032, B:33:0x00d9, B:19:0x003f, B:20:0x007f, B:22:0x0085, B:24:0x0091, B:25:0x00a0, B:27:0x00a6, B:30:0x00c5, B:35:0x00dc, B:28:0x00ab), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x011f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:8:0x0018, B:48:0x0137, B:51:0x013d, B:15:0x002d, B:38:0x0103, B:40:0x0107, B:42:0x0119, B:44:0x011f, B:47:0x0134, B:16:0x0032, B:33:0x00d9, B:19:0x003f, B:20:0x007f, B:22:0x0085, B:24:0x0091, B:25:0x00a0, B:27:0x00a6, B:30:0x00c5, B:35:0x00dc, B:28:0x00ab), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0134 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:8:0x0018, B:48:0x0137, B:51:0x013d, B:15:0x002d, B:38:0x0103, B:40:0x0107, B:42:0x0119, B:44:0x011f, B:47:0x0134, B:16:0x0032, B:33:0x00d9, B:19:0x003f, B:20:0x007f, B:22:0x0085, B:24:0x0091, B:25:0x00a0, B:27:0x00a6, B:30:0x00c5, B:35:0x00dc, B:28:0x00ab), top: B:56:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d A[Catch: Exception -> 0x001d, TRY_LEAVE, TryCatch #0 {Exception -> 0x001d, blocks: (B:8:0x0018, B:48:0x0137, B:51:0x013d, B:15:0x002d, B:38:0x0103, B:40:0x0107, B:42:0x0119, B:44:0x011f, B:47:0x0134, B:16:0x0032, B:33:0x00d9, B:19:0x003f, B:20:0x007f, B:22:0x0085, B:24:0x0091, B:25:0x00a0, B:27:0x00a6, B:30:0x00c5, B:35:0x00dc, B:28:0x00ab), top: B:56:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
    
        if (Wf.AbstractC0780y.s(r13, r2, r12) == r0) goto L46;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.adsdk.widgets.snackbar.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
