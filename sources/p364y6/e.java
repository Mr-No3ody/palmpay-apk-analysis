package p364y6;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.i0;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import z0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FaceCaptureActivity f44074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(FaceCaptureActivity faceCaptureActivity, int i7) {
        super(0);
        this.f44073a = i7;
        this.f44074b = faceCaptureActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44073a) {
            case 0:
                ViewModelProvider$Factory defaultViewModelProviderFactory = this.f44074b.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 1:
                i0 viewModelStore = this.f44074b.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            default:
                b defaultViewModelCreationExtras = this.f44074b.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}
