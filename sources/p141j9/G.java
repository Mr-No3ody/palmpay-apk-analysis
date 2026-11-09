package p141j9;

import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(TopupAirtimeActivity topupAirtimeActivity, int i7) {
        super(0);
        this.f38371a = i7;
        this.f38372b = topupAirtimeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38371a) {
            case 0:
                return this.f38372b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f38372b.getViewModelStore();
            default:
                return this.f38372b.getDefaultViewModelCreationExtras();
        }
    }
}
