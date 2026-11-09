package U;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionLabel f9106b;

    public /* synthetic */ e(MotionLabel motionLabel, int i7) {
        this.f9105a = i7;
        this.f9106b = motionLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f9105a) {
            case 0:
                MotionLabel motionLabel = this.f9106b;
                int width = motionLabel.getWidth();
                int height = motionLabel.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f15573f) / 2.0f);
                break;
            default:
                MotionLabel motionLabel2 = this.f9106b;
                outline.setRoundRect(0, 0, motionLabel2.getWidth(), motionLabel2.getHeight(), motionLabel2.f15574g);
                break;
        }
    }
}
