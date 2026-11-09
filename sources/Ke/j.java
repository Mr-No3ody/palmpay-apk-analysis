package Ke;

import Pa.F;
import Pa.n0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewStub f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f5456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f5457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f5458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PpButton f5459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LottieAnimationView f5460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5461g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5462i;

    public j(ViewStub viewStub, ConstraintLayout constraintLayout) {
        this.f5455a = viewStub;
        this.f5456b = constraintLayout;
    }

    public final void a(boolean z3) {
        p220oa.h.k(this.f5456b, Integer.valueOf(z3 ? CommonViewExtKt.getDp(37) : 0), null, null, null, 14);
        View view = this.f5457c;
        if (view != null) {
            p220oa.h.s(view, z3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap map = new HashMap();
        String str = this.f5462i;
        if (str != null) {
            map.put("currentLevel", str);
        }
        n0.g().n("Me_KYCUpgrade_Click", map);
        if (TextUtils.isEmpty(this.f5461g)) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/account/palmpayLevel");
        } else {
            View view2 = this.f5457c;
            ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, this.f5461g));
        }
    }
}
