package p364y6;

import Da.h;
import E.AbstractC0198c;
import E.P;
import Gb.L;
import android.os.Looper;
import android.view.View;
import androidx.camera.video.internal.c;
import androidx.camera.view.C1027h;
import androidx.core.content.d;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import p051d9.C1605b;
import p118hf.a;
import p140j8.f;
import p232p6.p;
import p320v6.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieCaptureActivity f44108b;

    public /* synthetic */ t(SelfieCaptureActivity selfieCaptureActivity, int i7) {
        this.f44107a = i7;
        this.f44108b = selfieCaptureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        int i7 = 1;
        SelfieCaptureActivity selfieCaptureActivity = this.f44108b;
        switch (this.f44107a) {
            case 0:
                int i10 = SelfieCaptureActivity.f23859v;
                selfieCaptureActivity.k();
                return;
            case 1:
                int i11 = SelfieCaptureActivity.f23859v;
                selfieCaptureActivity.finish();
                return;
            case 2:
                int i12 = SelfieCaptureActivity.f23859v;
                selfieCaptureActivity.j();
                return;
            case 3:
                C1027h c1027h = selfieCaptureActivity.f23860a;
                if (c1027h == null) {
                    return;
                }
                selfieCaptureActivity.i();
                File fileK = 2 == selfieCaptureActivity.f23868j ? AbstractC0198c.k() : AbstractC0198c.j("selfie");
                C1605b c1605b = new C1605b(17, selfieCaptureActivity, fileK);
                L l5 = selfieCaptureActivity.f23870p;
                if (l5 != null) {
                    l5.cancel();
                }
                Executor executorD = d.d(selfieCaptureActivity);
                c cVar = new c(selfieCaptureActivity, 26, fileK, c1605b);
                f.b();
                a.k(c1027h.i(), "Camera not initialized.");
                f.b();
                a.k((c1027h.f14925b & 1) != 0, "ImageCapture disabled.");
                f.b();
                if (c1027h.f14927d.F() == 3 && (c1027h.f() == null || c1027h.f().f14978b == null)) {
                    throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
                }
                P p3 = c1027h.f14927d;
                p3.getClass();
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    b.S().execute(new h(p3, i7, executorD, cVar));
                } else {
                    p3.J(executorD, cVar, null, null);
                }
                r6.a aVar = p.f41237d;
                if (aVar == null || (liveID$ILiveIDMonitor = aVar.f41573e) == null) {
                    return;
                }
                p320v6.d dVar = e.f43081i;
                String str = dVar.f43071a;
                Pair pair = new Pair("event_desc", dVar.f43072b);
                Integer num = p.f41243j;
                Pair pair2 = new Pair("scene", Integer.valueOf(num != null ? num.intValue() : -1));
                String str2 = selfieCaptureActivity.f23866g;
                if (str2 == null) {
                    Intrinsics.n("transactionId");
                    throw null;
                }
                Pair pair3 = new Pair("transactionId", str2);
                String str3 = p.f41242i;
                if (str3 == null) {
                    str3 = "";
                }
                liveID$ILiveIDMonitor.report(str, G.h(pair, pair2, pair3, new Pair("uuid", str3)));
                return;
            default:
                int i13 = SelfieCaptureActivity.f23859v;
                selfieCaptureActivity.k();
                return;
        }
    }
}
