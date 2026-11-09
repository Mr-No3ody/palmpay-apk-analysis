package B6;

import androidx.lifecycle.i0;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0099v extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0099v(LivenessActivityV2 livenessActivityV2, int i7) {
        super(0);
        this.f522a = i7;
        this.f523b = livenessActivityV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f522a) {
            case 0:
                i0 viewModelStore = this.f523b.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            default:
                z0.b defaultViewModelCreationExtras = this.f523b.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
        }
    }
}
