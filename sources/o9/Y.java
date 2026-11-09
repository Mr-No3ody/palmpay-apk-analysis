package o9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class Y extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f40150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f40151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, kotlin.jvm.internal.F f10, Continuation continuation, String str2) {
        super(2, continuation);
        this.f40149c = str;
        this.f40150d = f10;
        this.f40151e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f40151e;
        Y y8 = new Y(this.f40149c, this.f40150d, continuation, str);
        y8.f40148b = obj;
        return y8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
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
        throw new UnsupportedOperationException("Method not decompiled: o9.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
