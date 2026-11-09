package Ob;

import com.transsnet.palmpay.custom_view.countdown.CountdownTime$OnCountdownTimeListener;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ top.zibin.luban.io.a f6719a;

    public b(top.zibin.luban.io.a aVar) {
        this.f6719a = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        a aVar = (a) this.f6719a.f42647d;
        if (aVar != null) {
            int i7 = aVar.f6717h - 1;
            aVar.f6717h = i7;
            CountdownTime$OnCountdownTimeListener countdownTime$OnCountdownTimeListener = aVar.f6718i;
            if (i7 > 0) {
                if (countdownTime$OnCountdownTimeListener != null) {
                    countdownTime$OnCountdownTimeListener.onCountdownTimeDraw(aVar);
                }
            } else if (countdownTime$OnCountdownTimeListener != null) {
                countdownTime$OnCountdownTimeListener.onCountdownTimeDraw(aVar);
                countdownTime$OnCountdownTimeListener.onCountdownFinish();
            }
        }
    }
}
