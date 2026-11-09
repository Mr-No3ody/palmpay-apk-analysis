package Pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Pe.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0546s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f7300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0546s(String str, kotlin.jvm.internal.F f10, Continuation continuation) {
        super(2, continuation);
        this.f7299c = str;
        this.f7300d = f10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0546s c0546s = new C0546s(this.f7299c, this.f7300d, continuation);
        c0546s.f7298b = obj;
        return c0546s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0546s) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
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
        throw new UnsupportedOperationException("Method not decompiled: Pe.C0546s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
