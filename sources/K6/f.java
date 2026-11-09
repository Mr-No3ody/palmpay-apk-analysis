package K6;

import com.palmpay.lib.scanplus.bean.CameraDataBean;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.callback.OnScanListener;
import com.palmpay.lib.scanplus.view.ScanView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScanView f4949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ScanView scanView, int i7) {
        super(1);
        this.f4948a = i7;
        this.f4949b = scanView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4948a) {
            case 0:
                CodeBean it = (CodeBean) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                OnScanListener onScanListener = this.f4949b.f24046e;
                if (onScanListener != null) {
                    onScanListener.onPointClick(it);
                }
                break;
            default:
                CameraDataBean data = (CameraDataBean) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                this.f4949b.setCameraData(data);
                break;
        }
        return Unit.f38893a;
    }
}
