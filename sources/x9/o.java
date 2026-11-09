package x9;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f43693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, F f10, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f43692c = str;
        this.f43693d = f10;
        this.f43694e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ArrayList arrayList = this.f43694e;
        o oVar = new o(this.f43692c, this.f43693d, continuation, arrayList);
        oVar.f43691b = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
