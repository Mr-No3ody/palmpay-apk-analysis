package Zd;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Lazy lazy, int i7) {
        super(0);
        this.f11641a = i7;
        this.f11642b = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11641a) {
            case 0:
                return ((ViewModelStoreOwner) this.f11642b.getValue()).getViewModelStore();
            case 1:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f11642b.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : z0.a.f44407b;
            case 2:
                return ((ViewModelStoreOwner) this.f11642b.getValue()).getViewModelStore();
            case 3:
                ViewModelStoreOwner viewModelStoreOwner2 = (ViewModelStoreOwner) this.f11642b.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2 = viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner2 : null;
                return hasDefaultViewModelProviderFactory2 != null ? hasDefaultViewModelProviderFactory2.getDefaultViewModelCreationExtras() : z0.a.f44407b;
            case 4:
                return ((ViewModelStoreOwner) this.f11642b.getValue()).getViewModelStore();
            case 5:
                ViewModelStoreOwner viewModelStoreOwner3 = (ViewModelStoreOwner) this.f11642b.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3 = viewModelStoreOwner3 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner3 : null;
                return hasDefaultViewModelProviderFactory3 != null ? hasDefaultViewModelProviderFactory3.getDefaultViewModelCreationExtras() : z0.a.f44407b;
            case 6:
                return ((ViewModelStoreOwner) this.f11642b.getValue()).getViewModelStore();
            case 7:
                ViewModelStoreOwner viewModelStoreOwner4 = (ViewModelStoreOwner) this.f11642b.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory4 = viewModelStoreOwner4 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner4 : null;
                return hasDefaultViewModelProviderFactory4 != null ? hasDefaultViewModelProviderFactory4.getDefaultViewModelCreationExtras() : z0.a.f44407b;
            case 8:
                return ((ViewModelStoreOwner) this.f11642b.getValue()).getViewModelStore();
            default:
                ViewModelStoreOwner viewModelStoreOwner5 = (ViewModelStoreOwner) this.f11642b.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory5 = viewModelStoreOwner5 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner5 : null;
                return hasDefaultViewModelProviderFactory5 != null ? hasDefaultViewModelProviderFactory5.getDefaultViewModelCreationExtras() : z0.a.f44407b;
        }
    }
}
