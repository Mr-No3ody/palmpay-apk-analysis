package G7;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.F;
import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Balloon f3059b;

    public /* synthetic */ e(Balloon balloon, int i7) {
        this.f3058a = i7;
        this.f3059b = balloon;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animation animationLoadAnimation;
        switch (this.f3058a) {
            case 0:
                Balloon this$0 = this.f3059b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Handler handler = new Handler(Looper.getMainLooper());
                e eVar = new e(this$0, 1);
                this$0.f25223b.getClass();
                handler.postDelayed(eVar, 0L);
                return;
            default:
                Balloon this$1 = this.f3059b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                g gVar = this$1.f25223b;
                int i7 = gVar.f3081T;
                if (i7 != Integer.MIN_VALUE) {
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$1.f25222a, i7);
                } else {
                    int i10 = F.i(gVar.b0);
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int iOrdinal = gVar.f3104p.ordinal();
                            if (iOrdinal == 0) {
                                i7 = p234p9.a.balloon_shake_top;
                            } else if (iOrdinal == 1) {
                                i7 = p234p9.a.balloon_shake_bottom;
                            } else if (iOrdinal == 2) {
                                i7 = p234p9.a.balloon_shake_right;
                            } else {
                                if (iOrdinal != 3) {
                                    throw new p355xf.l();
                                }
                                i7 = p234p9.a.balloon_shake_left;
                            }
                        } else if (i10 != 3) {
                            animationLoadAnimation = null;
                        } else {
                            i7 = p234p9.a.balloon_fade;
                        }
                    } else if (gVar.f3099k) {
                        int iOrdinal2 = gVar.f3104p.ordinal();
                        if (iOrdinal2 == 0) {
                            i7 = p234p9.a.balloon_heartbeat_top;
                        } else if (iOrdinal2 == 1) {
                            i7 = p234p9.a.balloon_heartbeat_bottom;
                        } else if (iOrdinal2 == 2) {
                            i7 = p234p9.a.balloon_heartbeat_right;
                        } else {
                            if (iOrdinal2 != 3) {
                                throw new p355xf.l();
                            }
                            i7 = p234p9.a.balloon_heartbeat_left;
                        }
                    } else {
                        i7 = p234p9.a.balloon_heartbeat_center;
                    }
                    animationLoadAnimation = AnimationUtils.loadAnimation(this$1.f25222a, i7);
                }
                if (animationLoadAnimation == null) {
                    return;
                }
                ((FrameLayout) this$1.f25224c.f726d).startAnimation(animationLoadAnimation);
                return;
        }
    }
}
