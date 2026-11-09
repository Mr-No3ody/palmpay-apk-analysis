package p179m1;

import androidx.core.view.N;
import com.airbnb.lottie.EnumC1317i;
import com.airbnb.lottie.LottieAnimationView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f39435b;

    public /* synthetic */ c(LottieAnimationView lottieAnimationView, int i7) {
        this.f39434a = i7;
        this.f39435b = lottieAnimationView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LottieAnimationView lottieAnimationView = this.f39435b;
        switch (this.f39434a) {
            case 0:
                WeakHashMap weakHashMap = N.f16168a;
                if (lottieAnimationView.isAttachedToWindow()) {
                    lottieAnimationView.a();
                    lottieAnimationView.setProgress(0.0f);
                }
                break;
            case 1:
                WeakHashMap weakHashMap2 = N.f16168a;
                if (lottieAnimationView.isAttachedToWindow()) {
                    lottieAnimationView.f19585p.add(EnumC1317i.f19870f);
                    lottieAnimationView.f19579e.o();
                }
                break;
            default:
                WeakHashMap weakHashMap3 = N.f16168a;
                if (lottieAnimationView.isAttachedToWindow()) {
                    lottieAnimationView.f19583j = false;
                    lottieAnimationView.f19579e.l();
                }
                break;
        }
    }
}
