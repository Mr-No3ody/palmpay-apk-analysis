package Re;

import android.animation.ValueAnimator;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.wang.avi.indicators.BallGridBeatIndicator;
import com.wang.avi.indicators.BallPulseIndicator;
import com.wang.avi.indicators.BallPulseSyncIndicator;
import com.wang.avi.indicators.LineScaleIndicator;
import com.wang.avi.indicators.LineScalePartyIndicator;
import com.wang.avi.indicators.LineScalePulseOutIndicator;
import com.wang.avi.indicators.LineScalePulseOutRapidIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8568c;

    public /* synthetic */ e(Object obj, int i7, int i10) {
        this.f8566a = i10;
        this.f8568c = obj;
        this.f8567b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8566a) {
            case 0:
                BallGridBeatIndicator ballGridBeatIndicator = (BallGridBeatIndicator) this.f8568c;
                ballGridBeatIndicator.f35443i[this.f8567b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballGridBeatIndicator.postInvalidate();
                break;
            case 1:
                BallPulseIndicator ballPulseIndicator = (BallPulseIndicator) this.f8568c;
                ballPulseIndicator.f35446i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballPulseIndicator.postInvalidate();
                break;
            case 2:
                BallPulseSyncIndicator ballPulseSyncIndicator = (BallPulseSyncIndicator) this.f8568c;
                ballPulseSyncIndicator.f35450i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballPulseSyncIndicator.postInvalidate();
                break;
            case 3:
                LineScaleIndicator lineScaleIndicator = (LineScaleIndicator) this.f8568c;
                lineScaleIndicator.f35467i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lineScaleIndicator.postInvalidate();
                break;
            case 4:
                LineScalePartyIndicator lineScalePartyIndicator = (LineScalePartyIndicator) this.f8568c;
                lineScalePartyIndicator.f35468i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lineScalePartyIndicator.postInvalidate();
                break;
            case 5:
                LineScalePulseOutIndicator lineScalePulseOutIndicator = (LineScalePulseOutIndicator) this.f8568c;
                lineScalePulseOutIndicator.f35467i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lineScalePulseOutIndicator.postInvalidate();
                break;
            case 6:
                LineScalePulseOutRapidIndicator lineScalePulseOutRapidIndicator = (LineScalePulseOutRapidIndicator) this.f8568c;
                lineScalePulseOutRapidIndicator.f35467i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lineScalePulseOutRapidIndicator.postInvalidate();
                break;
            case 7:
                oh.a aVar = (oh.a) this.f8568c;
                aVar.f40545i[this.f8567b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.postInvalidate();
                break;
            default:
                AlgorithmScheduleProgressBar algorithmScheduleProgressBar = (AlgorithmScheduleProgressBar) this.f8568c;
                ValueAnimator valueAnimator2 = algorithmScheduleProgressBar.f23879c;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    algorithmScheduleProgressBar.f23880d = Integer.parseInt(algorithmScheduleProgressBar.f23879c.getAnimatedValue() + "");
                    algorithmScheduleProgressBar.setProgress(algorithmScheduleProgressBar.f23880d);
                    if (this.f8567b == algorithmScheduleProgressBar.f23880d) {
                        algorithmScheduleProgressBar.f23878b = false;
                        algorithmScheduleProgressBar.f23879c.cancel();
                        algorithmScheduleProgressBar.f23879c = null;
                    }
                    break;
                }
                break;
        }
    }
}
