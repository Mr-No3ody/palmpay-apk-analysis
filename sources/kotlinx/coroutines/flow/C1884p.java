package kotlinx.coroutines.flow;

import Fe.C0264l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884p extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.F f39200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.E f39201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f39203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0264l f39205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f39206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884p(C0264l c0264l, S s3, Continuation continuation) {
        super(3, continuation);
        this.f39205f = c0264l;
        this.f39206g = s3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1884p c1884p = new C1884p(this.f39205f, this.f39206g, (Continuation) obj3);
        c1884p.f39203d = (CoroutineScope) obj;
        c1884p.f39204e = (FlowCollector) obj2;
        return c1884p.invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    /* JADX WARN: Code duplicated, block: B:18:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4 A[PHI: r1 r5 r6 r7
      0x00a4: PHI (r1v3 kotlin.jvm.internal.E) = (r1v5 kotlin.jvm.internal.E), (r1v7 kotlin.jvm.internal.E), (r1v7 kotlin.jvm.internal.E) binds: [B:25:0x00a2, B:15:0x0072, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r5v2 kotlin.jvm.internal.F) = (r5v4 kotlin.jvm.internal.F), (r5v5 kotlin.jvm.internal.F), (r5v5 kotlin.jvm.internal.F) binds: [B:25:0x00a2, B:15:0x0072, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r6v3 ??) = (r6v16 ??), (r6v17 ??), (r6v18 ??) binds: [B:25:0x00a2, B:15:0x0072, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v3 kotlinx.coroutines.flow.FlowCollector) = 
      (r7v5 kotlinx.coroutines.flow.FlowCollector)
      (r7v6 kotlinx.coroutines.flow.FlowCollector)
      (r7v6 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:25:0x00a2, B:15:0x0072, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C1884p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
