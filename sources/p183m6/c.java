package p183m6;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f39484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f39485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f39486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f39487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E e10, f fVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f39485d = e10;
        this.f39486e = fVar;
        this.f39487f = eVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f39485d, this.f39486e, this.f39487f, continuation);
        cVar.f39484c = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f A[LOOP:0: B:17:0x0054->B:24:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: all -> 0x008a, PHI: r2 r9 r11
      0x0083: PHI (r2v5 kotlinx.coroutines.CoroutineScope) = (r2v6 kotlinx.coroutines.CoroutineScope), (r2v11 kotlinx.coroutines.CoroutineScope) binds: [B:26:0x0080, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r9v7 long) = (r9v8 long), (r9v16 long) binds: [B:26:0x0080, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r11v7 java.lang.Object) = (r11v13 java.lang.Object), (r11v18 java.lang.Object) binds: [B:26:0x0080, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x008a, blocks: (B:25:0x0074, B:28:0x0083, B:13:0x003b), top: B:58:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[PHI: r2 r9
      PHI (r2v6 kotlinx.coroutines.CoroutineScope) = 
      (r2v2 kotlinx.coroutines.CoroutineScope)
      (r2v4 kotlinx.coroutines.CoroutineScope)
      (r2v7 kotlinx.coroutines.CoroutineScope)
      (r2v7 kotlinx.coroutines.CoroutineScope)
      (r2v9 kotlinx.coroutines.CoroutineScope)
      (r2v13 kotlinx.coroutines.CoroutineScope)
     binds: [B:16:0x004b, B:41:0x00c0, B:53:0x00e9, B:48:0x00dc, B:60:0x0054, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      PHI (r9v8 long) = (r9v0 long), (r9v6 long), (r9v12 long), (r9v14 long), (r9v15 long), (r9v17 long) binds: [B:16:0x004b, B:41:0x00c0, B:53:0x00e9, B:48:0x00dc, B:60:0x0054, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c0 -> B:17:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d3 -> B:46:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p183m6.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
