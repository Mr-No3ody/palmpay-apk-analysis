package Zd;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentHomeNGFragment f11683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(BillPaymentHomeNGFragment billPaymentHomeNGFragment, int i7) {
        super(0);
        this.f11682a = i7;
        this.f11683b = billPaymentHomeNGFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11682a) {
            case 0:
                i0 viewModelStore = this.f11683b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                z0.b defaultViewModelCreationExtras = this.f11683b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            default:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f11683b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
        }
    }
}
