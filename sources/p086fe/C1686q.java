package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: fe.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1686q extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f36726g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f36727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f36728j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686q(String str, F f10, Continuation continuation, String str2, String str3, String str4, String str5, String str6) {
        super(2, continuation);
        this.f36722c = str;
        this.f36723d = f10;
        this.f36724e = str2;
        this.f36725f = str3;
        this.f36726g = str4;
        this.f36727i = str5;
        this.f36728j = str6;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1686q c1686q = new C1686q(this.f36722c, this.f36723d, continuation, this.f36724e, this.f36725f, this.f36726g, this.f36727i, this.f36728j);
        c1686q.f36721b = obj;
        return c1686q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1686q) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L46;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1686q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
