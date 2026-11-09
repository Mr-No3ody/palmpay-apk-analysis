package Da;

import com.facebook.react.bridge.Promise;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f1738b;

    public /* synthetic */ c(int i7, Promise promise) {
        this.f1737a = i7;
        this.f1738b = promise;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long l5 = (Long) obj;
        switch (this.f1737a) {
            case 0:
                return PPRNBridge.showDatePickerByMode$lambda$31$lambda$30$lambda$29$lambda$28(this.f1738b, l5.longValue(), (Long) obj2);
            default:
                return PPRNBridge.showDatePicker$lambda$27$lambda$26$lambda$25$lambda$24(this.f1738b, l5.longValue(), (Long) obj2);
        }
    }
}
