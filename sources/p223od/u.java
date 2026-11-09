package p223od;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.send_money.ui.view.kkcar.KkCarQrView;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f40512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f40513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f40514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f40515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f40516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f40517g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final KkCarQrView f40518i;

    public u(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, PpTitleBar ppTitleBar, KkCarQrView kkCarQrView) {
        this.f40511a = constraintLayout;
        this.f40512b = frameLayout;
        this.f40513c = imageView;
        this.f40514d = imageView2;
        this.f40515e = linearLayout;
        this.f40516f = linearLayout2;
        this.f40517g = ppTitleBar;
        this.f40518i = kkCarQrView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40511a;
    }
}
