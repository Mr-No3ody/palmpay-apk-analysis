package B6;

import android.view.View;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: renamed from: B6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0082d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivenessActivityV2 f470b;

    public /* synthetic */ ViewOnClickListenerC0082d(LivenessActivityV2 livenessActivityV2, int i7) {
        this.f469a = i7;
        this.f470b = livenessActivityV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g0 g0Var;
        Object value;
        top.zibin.luban.io.a aVar;
        LivenessActivityV2 livenessActivityV2 = this.f470b;
        switch (this.f469a) {
            case 0:
                int i7 = LivenessActivityV2.f23926Z;
                livenessActivityV2.h();
                return;
            case 1:
                int i10 = LivenessActivityV2.f23926Z;
                b0 b0VarG = livenessActivityV2.g();
                b0VarG.f453B = -1.0f;
                do {
                    g0Var = b0VarG.f459j;
                    value = g0Var.getValue();
                    ((O) value).getClass();
                } while (!g0Var.compareAndSet(value, new O(null, 0.0f, false, null, null)));
                N n10 = b0VarG.f458i;
                n10.f407h = false;
                n10.f404e = 0;
                n10.f405f = -1;
                return;
            case 2:
                int i11 = LivenessActivityV2.f23926Z;
                livenessActivityV2.finish();
                return;
            default:
                int i12 = LivenessActivityV2.f23926Z;
                livenessActivityV2.g().f458i.f407h = false;
                CountdownProgressViewV2 countdownProgressViewV2 = livenessActivityV2.f23935Y;
                if (countdownProgressViewV2 == null) {
                    Intrinsics.n("countdownProgressView");
                    throw null;
                }
                countdownProgressViewV2.post(new RunnableC0083e(livenessActivityV2, 0));
                String str = livenessActivityV2.f23934X;
                if (str != null && (aVar = livenessActivityV2.f23933Q) != null) {
                    aVar.o(str);
                }
                livenessActivityV2.f23948w = false;
                return;
        }
    }
}
