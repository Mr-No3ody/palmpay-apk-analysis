package Ja;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckSafetyAssessmentQAFragment f4689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment, int i7) {
        super(0);
        this.f4688a = i7;
        this.f4689b = checkSafetyAssessmentQAFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4688a) {
            case 0:
                i0 viewModelStore = this.f4689b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                z0.b defaultViewModelCreationExtras = this.f4689b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            default:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f4689b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
        }
    }
}
