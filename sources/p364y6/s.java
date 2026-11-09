package p364y6;

import androidx.lifecycle.i0;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import z0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(LivenessActivity livenessActivity, int i7) {
        super(0);
        this.f44105a = i7;
        this.f44106b = livenessActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44105a) {
            case 0:
                i0 viewModelStore = this.f44106b.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            default:
                b defaultViewModelCreationExtras = this.f44106b.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}
