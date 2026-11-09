package m9;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment, int i7) {
        super(0);
        this.f39580a = i7;
        this.f39581b = scheduleTopUpEditTaskFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39580a) {
            case 0:
                i0 viewModelStore = this.f39581b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                z0.b defaultViewModelCreationExtras = this.f39581b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            case 2:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f39581b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 3:
                i0 viewModelStore2 = this.f39581b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore2, "requireActivity().viewModelStore");
                return viewModelStore2;
            case 4:
                z0.b defaultViewModelCreationExtras2 = this.f39581b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras2;
            default:
                ViewModelProvider$Factory defaultViewModelProviderFactory2 = this.f39581b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
        }
    }
}
