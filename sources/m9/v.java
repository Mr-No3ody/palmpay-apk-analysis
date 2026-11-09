package m9;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpTaskListFragment f39588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment, int i7) {
        super(0);
        this.f39587a = i7;
        this.f39588b = scheduleTopUpTaskListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39587a) {
            case 0:
                i0 viewModelStore = this.f39588b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                z0.b defaultViewModelCreationExtras = this.f39588b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            default:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f39588b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
        }
    }
}
