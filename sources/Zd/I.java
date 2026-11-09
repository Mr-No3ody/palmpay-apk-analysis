package Zd;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.transsnet.palmpay.teller.ui.fragment.TvPaymentListFragment;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TvPaymentListFragment f11650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(TvPaymentListFragment tvPaymentListFragment, Lazy lazy, int i7) {
        super(0);
        this.f11649a = i7;
        this.f11650b = tvPaymentListFragment;
        this.f11651c = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewModelProvider$Factory defaultViewModelProviderFactory;
        ViewModelProvider$Factory defaultViewModelProviderFactory2;
        switch (this.f11649a) {
            case 0:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f11651c.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider$Factory defaultViewModelProviderFactory3 = this.f11650b.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory3, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory3;
            default:
                ViewModelStoreOwner viewModelStoreOwner2 = (ViewModelStoreOwner) this.f11651c.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2 = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner2 : null;
                if (hasDefaultViewModelProviderFactory2 != null && (defaultViewModelProviderFactory2 = hasDefaultViewModelProviderFactory2.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory2;
                }
                ViewModelProvider$Factory defaultViewModelProviderFactory4 = this.f11650b.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory4, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory4;
        }
    }
}
