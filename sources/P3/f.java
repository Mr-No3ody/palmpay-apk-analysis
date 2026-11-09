package P3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6892b;

    public /* synthetic */ f(com.flexibank.sdk.cashier.ui.activity.a aVar, int i7) {
        this.f6891a = i7;
        this.f6892b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6891a) {
            case 0:
                return Long.valueOf(this.f6892b.f6882M);
            case 1:
                M3.g gVar = new M3.g();
                com.flexibank.sdk.cashier.ui.activity.a listener = this.f6892b;
                Intrinsics.checkNotNullParameter(listener, "listener");
                gVar.f5763b = listener;
                return gVar;
            case 2:
                com.flexibank.sdk.cashier.ui.activity.a aVar = this.f6892b;
                Q3.c cVar = new Q3.c(aVar);
                cVar.f7599w = aVar;
                return cVar;
            default:
                com.flexibank.sdk.cashier.ui.activity.a aVar2 = this.f6892b;
                Q3.i iVar = new Q3.i(aVar2);
                iVar.f7615w = aVar2;
                return iVar;
        }
    }
}
