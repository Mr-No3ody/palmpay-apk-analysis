package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: renamed from: androidx.room.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1226e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ChannelIterator f17745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f17747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1227f f17748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Yf.n f17749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f17750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Yf.n f17751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226e(G g7, C1227f c1227f, Yf.n nVar, Callable callable, Yf.n nVar2, Continuation continuation) {
        super(2, continuation);
        this.f17747c = g7;
        this.f17748d = c1227f;
        this.f17749e = nVar;
        this.f17750f = callable;
        this.f17751g = nVar2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Yf.n nVar = this.f17751g;
        return new C1226e(this.f17747c, this.f17748d, this.f17749e, this.f17750f, nVar, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1226e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[Catch: all -> 0x0016, PHI: r1
      0x0037: PHI (r1v3 kotlinx.coroutines.channels.ChannelIterator) = 
      (r1v1 kotlinx.coroutines.channels.ChannelIterator)
      (r1v2 kotlinx.coroutines.channels.ChannelIterator)
      (r1v5 kotlinx.coroutines.channels.ChannelIterator)
     binds: [B:17:0x0030, B:24:0x005d, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:18:0x0037, B:21:0x0042, B:23:0x004a, B:14:0x0022, B:17:0x0030), top: B:30:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0016, PHI: r1 r8
      0x0042: PHI (r1v2 kotlinx.coroutines.channels.ChannelIterator) = (r1v3 kotlinx.coroutines.channels.ChannelIterator), (r1v4 kotlinx.coroutines.channels.ChannelIterator) binds: [B:19:0x003f, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r8v4 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:19:0x003f, B:14:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:18:0x0037, B:21:0x0042, B:23:0x004a, B:14:0x0022, B:17:0x0030), top: B:30:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:18:0x0037, B:21:0x0042, B:23:0x004a, B:14:0x0022, B:17:0x0030), top: B:30:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:18:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f17746b
            androidx.room.f r2 = r7.f17748d
            r3 = 2
            r4 = 1
            androidx.room.G r5 = r7.f17747c
            if (r1 == 0) goto L26
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.f17745a
            androidx.camera.core.impl.utils.executor.g.M(r8)     // Catch: java.lang.Throwable -> L16
            goto L37
        L16:
            r8 = move-exception
            goto L6a
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlinx.coroutines.channels.ChannelIterator r1 = r7.f17745a
            androidx.camera.core.impl.utils.executor.g.M(r8)     // Catch: java.lang.Throwable -> L16
            goto L42
        L26:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            androidx.room.z r8 = r5.getInvalidationTracker()
            r8.a(r2)
            Yf.n r8 = r7.f17749e     // Catch: java.lang.Throwable -> L16
            Yf.c r1 = new Yf.c     // Catch: java.lang.Throwable -> L16
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L16
        L37:
            r7.f17745a = r1     // Catch: java.lang.Throwable -> L16
            r7.f17746b = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L42
            goto L5f
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L60
            r1.next()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Callable r8 = r7.f17750f     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L16
            Yf.n r6 = r7.f17751g     // Catch: java.lang.Throwable -> L16
            r7.f17745a = r1     // Catch: java.lang.Throwable -> L16
            r7.f17746b = r3     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r6.send(r8, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L37
        L5f:
            return r0
        L60:
            androidx.room.z r8 = r5.getInvalidationTracker()
            r8.d(r2)
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        L6a:
            androidx.room.z r0 = r5.getInvalidationTracker()
            r0.d(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1226e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
