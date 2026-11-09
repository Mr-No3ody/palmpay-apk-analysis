package Zf;

import B6.V;
import C0.C0127t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f11783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Flow[] f11789g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0127t f11790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V f11791j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f11792o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Flow[] flowArr, C0127t c0127t, V v3, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f11789g = flowArr;
        this.f11790i = c0127t;
        this.f11791j = v3;
        this.f11792o = flowCollector;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        V v3 = this.f11791j;
        t tVar = new t(this.f11789g, this.f11790i, v3, this.f11792o, continuation);
        tVar.f11788f = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[DONT_INVERT, EDGE_INSN: B:43:0x00bd->B:21:0x0078 BREAK  A[LOOP:0: B:32:0x009c->B:49:?]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[LOOP:0: B:32:0x009c->B:49:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e1 -> B:21:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zf.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
