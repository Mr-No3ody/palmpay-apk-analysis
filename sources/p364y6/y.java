package p364y6;

import androidx.lifecycle.i0;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import z0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieCaptureActivity f44118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(SelfieCaptureActivity selfieCaptureActivity, int i7) {
        super(0);
        this.f44117a = i7;
        this.f44118b = selfieCaptureActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44117a) {
            case 0:
                i0 viewModelStore = this.f44118b.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            default:
                b defaultViewModelCreationExtras = this.f44118b.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}
