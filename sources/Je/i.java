package Je;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4807a;

    public i(j jVar) {
        this.f4807a = jVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewFlipper viewFlipper;
        Intrinsics.checkNotNullParameter(animation, "animation");
        j jVar = this.f4807a;
        int i7 = jVar.f4809b + 1;
        jVar.f4809b = i7;
        ArrayList arrayList = jVar.f4819v;
        Intrinsics.e(arrayList);
        if (i7 >= arrayList.size()) {
            jVar.f4809b = 0;
        }
        int i10 = jVar.f4809b;
        ArrayList arrayList2 = jVar.f4819v;
        Intrinsics.e(arrayList2);
        View viewB = jVar.b(i10, (GetMsgRsp.DataBean.ListBean) arrayList2.get(jVar.f4809b));
        if (viewB.getParent() == null && (viewFlipper = jVar.f4811d) != null) {
            viewFlipper.addView(viewB);
        }
        jVar.f4808a = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        j jVar = this.f4807a;
        if (jVar.f4808a) {
            animation.cancel();
        }
        jVar.f4808a = true;
    }
}
