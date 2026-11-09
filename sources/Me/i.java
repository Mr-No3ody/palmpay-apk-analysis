package Me;

import Pa.F;
import Pa.i0;
import Pa.n0;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthProductRsp;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.ActivityUtils;
import java.lang.ref.WeakReference;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.p f5973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f5974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeWealthProductRsp f5975d;

    public i(ViewStub viewStub, HomeFragmentHomeTab homeFragmentHomeTab) {
        p355xf.t tVarB = C2131j.b(new M3.f(this, 1));
        this.f5974c = tVarB;
        new WeakReference(homeFragmentHomeTab);
        View viewInflate = viewStub != null ? viewStub.inflate() : null;
        this.f5972a = viewInflate;
        if (viewInflate != null) {
            int i7 = Ac.e.itvArrow;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = Ac.e.itvMore;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = Ac.e.wealthList;
                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                    if (recyclerView != null) {
                        this.f5973b = new Bc.p(textView, (ConstraintLayout) viewInflate, recyclerView, iconicsImageView);
                        recyclerView.setLayoutManager(new GridLayoutManager(viewInflate.getContext(), 2));
                        recyclerView.addItemDecoration(new g());
                        recyclerView.setAdapter((h) tVarB.getValue());
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
    }

    public final void a(HomeWealthProductRsp homeWealthProductRsp) {
        String str;
        ClickEvent clickEvent = new ClickEvent("Home_ProductRecommed_Click");
        clickEvent.add("memberid", !BaseApplication.hasLogin() ? "Tourist" : BaseApplication.getInstance().getUser().getMemberId());
        n0.g().q(clickEvent);
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
        } else {
            if (homeWealthProductRsp == null || (str = homeWealthProductRsp.jumpAndroidUrl) == null) {
                return;
            }
            View view = this.f5972a;
            ActivityUtils.startActivity(F.a(view != null ? view.getContext() : null, str));
        }
    }
}
