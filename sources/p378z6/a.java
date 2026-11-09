package p378z6;

import android.os.SystemClock;
import android.view.Choreographer;
import com.palmpay.lib.liveness.ui.widget.CountdownProgressViewV2;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountdownProgressViewV2 f44489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f44490b;

    public a(CountdownProgressViewV2 countdownProgressViewV2, Function0 function0) {
        this.f44489a = countdownProgressViewV2;
        this.f44490b = function0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        CountdownProgressViewV2 countdownProgressViewV2 = this.f44489a;
        if (countdownProgressViewV2.f23904g) {
            long jUptimeMillis = SystemClock.uptimeMillis() - countdownProgressViewV2.f23902e;
            float fB = b.b(jUptimeMillis / countdownProgressViewV2.f23903f, 0.0f, 1.0f);
            countdownProgressViewV2.f23900c = fB;
            long j10 = countdownProgressViewV2.f23903f - jUptimeMillis;
            if (j10 < 0) {
                j10 = 0;
            }
            countdownProgressViewV2.f23899b = ((int) ((j10 - 1) / 1000)) + 1;
            countdownProgressViewV2.invalidate();
            if (fB < 1.0f) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            countdownProgressViewV2.f23904g = false;
            countdownProgressViewV2.f23899b = 0;
            countdownProgressViewV2.f23900c = 1.0f;
            this.f44490b.invoke();
        }
    }
}
