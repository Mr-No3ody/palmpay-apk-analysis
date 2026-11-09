package p100gc;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import z0.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataBundleWalletFragment f37178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DataBundleWalletFragment dataBundleWalletFragment, int i7) {
        super(0);
        this.f37177a = i7;
        this.f37178b = dataBundleWalletFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37177a) {
            case 0:
                i0 viewModelStore = this.f37178b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            case 1:
                b defaultViewModelCreationExtras = this.f37178b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            case 2:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f37178b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 3:
                i0 viewModelStore2 = this.f37178b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore2, "requireActivity().viewModelStore");
                return viewModelStore2;
            case 4:
                b defaultViewModelCreationExtras2 = this.f37178b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras2;
            case 5:
                ViewModelProvider$Factory defaultViewModelProviderFactory2 = this.f37178b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            case 6:
                i0 viewModelStore3 = this.f37178b.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore3, "requireActivity().viewModelStore");
                return viewModelStore3;
            case 7:
                b defaultViewModelCreationExtras3 = this.f37178b.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras3, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras3;
            default:
                ViewModelProvider$Factory defaultViewModelProviderFactory3 = this.f37178b.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory3, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory3;
        }
    }
}
