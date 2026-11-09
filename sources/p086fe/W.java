package p086fe;

import Ff.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(String str, F f10, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f36597c = str;
        this.f36598d = f10;
        this.f36599e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ArrayList arrayList = this.f36599e;
        W w3 = new W(this.f36597c, this.f36598d, continuation, arrayList);
        w3.f36596b = obj;
        return w3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
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
        throw new UnsupportedOperationException("Method not decompiled: p086fe.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
