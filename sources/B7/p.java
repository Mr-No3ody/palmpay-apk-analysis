package B7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f556a;

    public p(q qVar) {
        this.f556a = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        super.onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        q qVar = this.f556a;
        r rVar = qVar.f558b;
        SmartRefreshLayout smartRefreshLayout = rVar.f561c;
        smartRefreshLayout.f25085w1 = false;
        if (rVar.f560b) {
            smartRefreshLayout.setNoMoreData(true);
        }
        SmartRefreshLayout smartRefreshLayout2 = qVar.f558b.f561c;
        if (smartRefreshLayout2.f25070p1 == RefreshState.LoadFinish) {
            smartRefreshLayout2.g(RefreshState.None);
        }
    }
}
