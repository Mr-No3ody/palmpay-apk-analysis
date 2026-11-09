package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: fe.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1679m0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f36695g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f36696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679m0(String str, F f10, Continuation continuation, String str2, String str3, String str4, String str5) {
        super(2, continuation);
        this.f36691c = str;
        this.f36692d = f10;
        this.f36693e = str2;
        this.f36694f = str3;
        this.f36695g = str4;
        this.f36696i = str5;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f36696i;
        C1679m0 c1679m0 = new C1679m0(this.f36691c, this.f36692d, continuation, this.f36693e, this.f36694f, this.f36695g, str);
        c1679m0.f36690b = obj;
        return c1679m0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1679m0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L38;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1679m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
