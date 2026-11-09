package p035c7;

import com.palmpay.lib.ui.picker.wheel.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18867a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18868b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WheelView f18870d;

    public b(WheelView wheelView, int i7) {
        this.f18870d = wheelView;
        this.f18869c = i7;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f18867a == Integer.MAX_VALUE) {
            this.f18867a = this.f18869c;
        }
        int i7 = this.f18867a;
        int i10 = (int) (i7 * 0.1f);
        this.f18868b = i10;
        if (i10 == 0) {
            if (i7 < 0) {
                this.f18868b = -1;
            } else {
                this.f18868b = 1;
            }
        }
        int iAbs = Math.abs(i7);
        WheelView wheelView = this.f18870d;
        if (iAbs <= 1) {
            wheelView.a();
            wheelView.getHandler().sendEmptyMessage(3000);
            return;
        }
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f18868b);
        if (!wheelView.f24586r0) {
            float itemHeight = wheelView.getItemHeight();
            float f10 = (-wheelView.getInitPosition()) * itemHeight;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            if (wheelView.getTotalScrollY() <= f10 || wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY(wheelView.getTotalScrollY() - this.f18868b);
                wheelView.a();
                wheelView.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        wheelView.getHandler().sendEmptyMessage(1000);
        this.f18867a -= this.f18868b;
    }
}
