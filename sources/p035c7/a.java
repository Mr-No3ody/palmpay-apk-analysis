package p035c7;

import com.google.firebase.perf.util.Constants;
import com.palmpay.lib.ui.picker.wheel.view.WheelView;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18864a = 2.1474836E9f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WheelView f18866c;

    public a(WheelView wheelView, float f10) {
        this.f18866c = wheelView;
        this.f18865b = f10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f18864a == 2.1474836E9f) {
            float f10 = this.f18865b;
            if (Math.abs(f10) > 2000.0f) {
                this.f18864a = f10 <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f18864a = f10;
            }
        }
        float fAbs = Math.abs(this.f18864a);
        WheelView wheelView = this.f18866c;
        if (fAbs >= 0.0f && Math.abs(this.f18864a) <= 20.0f) {
            wheelView.a();
            wheelView.getHandler().sendEmptyMessage(Constants.MAX_URL_LENGTH);
            return;
        }
        float f11 = (int) (this.f18864a / 100.0f);
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f11);
        if (!wheelView.f24586r0) {
            float itemHeight = wheelView.getItemHeight();
            float totalScrollY = (-wheelView.getInitPosition()) * itemHeight;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            double d2 = ((double) itemHeight) * 0.25d;
            if (((double) wheelView.getTotalScrollY()) - d2 < totalScrollY) {
                totalScrollY = wheelView.getTotalScrollY() + f11;
            } else if (((double) wheelView.getTotalScrollY()) + d2 > itemsCount) {
                itemsCount = wheelView.getTotalScrollY() + f11;
            }
            if (wheelView.getTotalScrollY() <= totalScrollY) {
                this.f18864a = 40.0f;
                wheelView.setTotalScrollY((int) totalScrollY);
            } else if (wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY((int) itemsCount);
                this.f18864a = -40.0f;
            }
        }
        float f12 = this.f18864a;
        if (f12 < 0.0f) {
            this.f18864a = f12 + 20.0f;
        } else {
            this.f18864a = f12 - 20.0f;
        }
        wheelView.getHandler().sendEmptyMessage(1000);
    }
}
