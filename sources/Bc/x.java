package Bc;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.ui.view.TransHistoryFilterLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransHistoryFilterLayout f871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0105b f872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwipeRefreshLayout f874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PpTitleBar f875g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MarqueeViewV2 f876i;

    public x(LinearLayout linearLayout, SingleAdView singleAdView, TransHistoryFilterLayout transHistoryFilterLayout, C0105b c0105b, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, PpTitleBar ppTitleBar, MarqueeViewV2 marqueeViewV2) {
        this.f869a = linearLayout;
        this.f870b = singleAdView;
        this.f871c = transHistoryFilterLayout;
        this.f872d = c0105b;
        this.f873e = recyclerView;
        this.f874f = swipeRefreshLayout;
        this.f875g = ppTitleBar;
        this.f876i = marqueeViewV2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f869a;
    }
}
