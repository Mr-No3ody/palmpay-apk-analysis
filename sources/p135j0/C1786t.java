package p135j0;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: j0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1786t extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1769b f38138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f38141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786t(O o10, Continuation continuation) {
        super(2, continuation);
        this.f38141d = o10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1786t c1786t = new C1786t(this.f38141d, continuation);
        c1786t.f38140c = obj;
        return c1786t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1786t) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (r10 == r0) goto L36;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.C1786t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
