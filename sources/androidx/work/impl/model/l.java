package androidx.work.impl.model;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18636b;

    public /* synthetic */ l(n nVar, int i7) {
        this.f18635a = i7;
        this.f18636b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HashMap map = (HashMap) obj;
        switch (this.f18635a) {
            case 0:
                this.f18636b.b(map);
                break;
            default:
                this.f18636b.a(map);
                break;
        }
        return Unit.f38893a;
    }
}
