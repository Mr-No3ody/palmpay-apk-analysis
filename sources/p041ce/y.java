package p041ce;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f18980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, F f10, Continuation continuation, String str2) {
        super(2, continuation);
        this.f18979c = str;
        this.f18980d = f10;
        this.f18981e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f18981e;
        y yVar = new y(this.f18979c, this.f18980d, continuation, str);
        yVar.f18978b = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L33;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
