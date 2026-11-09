package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: fe.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1665f0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1665f0(String str, F f10, Continuation continuation) {
        super(2, continuation);
        this.f36646c = str;
        this.f36647d = f10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1665f0 c1665f0 = new C1665f0(this.f36646c, this.f36647d, continuation);
        c1665f0.f36645b = obj;
        return c1665f0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1665f0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1665f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
