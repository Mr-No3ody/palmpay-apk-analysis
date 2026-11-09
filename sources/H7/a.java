package H7;

import android.animation.Animator;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.provider.IAccountModule;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f3741c;

    public /* synthetic */ a(int i7, long j6, KeyEvent.Callback callback) {
        this.f3739a = i7;
        this.f3741c = callback;
        this.f3740b = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6 = this.f3740b;
        KeyEvent.Callback callback = this.f3741c;
        switch (this.f3739a) {
            case 0:
                View this_circularRevealed = (View) callback;
                Intrinsics.checkNotNullParameter(this_circularRevealed, "$this_circularRevealed");
                if (this_circularRevealed.isAttachedToWindow()) {
                    this_circularRevealed.setVisibility(0);
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this_circularRevealed, (this_circularRevealed.getRight() + this_circularRevealed.getLeft()) / 2, (this_circularRevealed.getBottom() + this_circularRevealed.getTop()) / 2, 0.0f, Math.max(this_circularRevealed.getWidth(), this_circularRevealed.getHeight()));
                    animatorCreateCircularReveal.setDuration(j6);
                    animatorCreateCircularReveal.start();
                }
                break;
            default:
                HomeActivity.a aVar = HomeActivity.f34463H;
                IAccountModule iAccountModule = (IAccountModule) ARouter.getInstance().navigation(IAccountModule.class);
                HomeActivity homeActivity = (HomeActivity) callback;
                Dialog dialogBuildAutoLogoutOptionsDialog = iAccountModule != null ? iAccountModule.buildAutoLogoutOptionsDialog(homeActivity) : null;
                if (dialogBuildAutoLogoutOptionsDialog != null && homeActivity.p().showDialog(dialogBuildAutoLogoutOptionsDialog, 99)) {
                    p059e1.a.Y(j6, "main_sp_check_auto_logout");
                    break;
                }
                break;
        }
    }
}
