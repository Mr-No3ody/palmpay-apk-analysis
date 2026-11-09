package m9;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        super(0);
        this.f39566a = i7;
        this.f39567b = scheduleTopUpAddTaskFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39566a) {
            case 0:
                i0 viewModelStore = this.f39567b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                z0.b defaultViewModelCreationExtras = this.f39567b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            case 2:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f39567b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 3:
                i0 viewModelStore2 = this.f39567b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore2, "requireActivity().viewModelStore");
                return viewModelStore2;
            case 4:
                z0.b defaultViewModelCreationExtras2 = this.f39567b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras2;
            case 5:
                ViewModelProvider$Factory defaultViewModelProviderFactory2 = this.f39567b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            default:
                return this.f39567b;
        }
    }
}
