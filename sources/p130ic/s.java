package p130ic;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f37547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, F f10, Continuation continuation, String str2) {
        super(2, continuation);
        this.f37546c = str;
        this.f37547d = f10;
        this.f37548e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        s sVar = new s(this.f37546c, this.f37547d, continuation, this.f37548e);
        sVar.f37545b = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p130ic.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
