package C0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: C0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122n extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0123o f1063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119k f1064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122n(C0123o c0123o, C0119k c0119k, boolean z3) {
        super(0);
        this.f1063a = c0123o;
        this.f1064b = c0119k;
        this.f1065c = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f1063a.e(this.f1064b, this.f1065c);
        return Unit.f38893a;
    }
}
