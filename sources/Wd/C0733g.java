package Wd;

import com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Wd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0733g extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentHomeActivity f10759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0733g(BillPaymentHomeActivity billPaymentHomeActivity, int i7) {
        super(0);
        this.f10758a = i7;
        this.f10759b = billPaymentHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10758a) {
            case 0:
                return this.f10759b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f10759b.getViewModelStore();
            default:
                return this.f10759b.getDefaultViewModelCreationExtras();
        }
    }
}
