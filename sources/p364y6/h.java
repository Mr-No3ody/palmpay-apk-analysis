package p364y6;

import android.view.View;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import kotlin.jvm.internal.Intrinsics;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivity f44078b;

    public /* synthetic */ h(LivenessActivity livenessActivity, int i7) {
        this.f44077a = i7;
        this.f44078b = livenessActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        LivenessActivity livenessActivity = this.f44078b;
        switch (this.f44077a) {
            case 0:
                if (0.0f == livenessActivity.t) {
                    livenessActivity.k();
                }
                livenessActivity.t = -1.0f;
                livenessActivity.g().e();
                return;
            case 1:
                int i7 = LivenessActivity.f23837Y;
                livenessActivity.g().f1606A = true;
                CountdownProgressViewV2 countdownProgressViewV2 = livenessActivity.f23845X;
                if (countdownProgressViewV2 == null) {
                    Intrinsics.n("countdownProgressView");
                    throw null;
                }
                countdownProgressViewV2.post(new i(livenessActivity, 0));
                String str = livenessActivity.f23844Q;
                if (str != null && (aVar = livenessActivity.f23843M) != null) {
                    aVar.o(str);
                }
                livenessActivity.f23857v = false;
                return;
            case 2:
                int i10 = LivenessActivity.f23837Y;
                livenessActivity.finish();
                return;
            case 3:
                int i11 = LivenessActivity.f23837Y;
                livenessActivity.j();
                return;
            default:
                livenessActivity.t = -1.0f;
                livenessActivity.g().e();
                livenessActivity.f23857v = false;
                return;
        }
    }
}
