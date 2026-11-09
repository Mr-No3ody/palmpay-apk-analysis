package Va;

import android.view.View;
import android.view.ViewTreeObserver;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.palmpay.lib.webview.container.PPWebView;
import com.transsnet.palmpay.core.web.PWebActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PWebActivity f10233a;

    public c(PWebActivity pWebActivity) {
        this.f10233a = pWebActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        PWebActivity pWebActivity = this.f10233a;
        PPWebView pPWebView = pWebActivity.f28607p;
        if (pPWebView == null || pPWebView.getVisibility() != 0) {
            return;
        }
        PPWebView pPWebView2 = pWebActivity.f28607p;
        if ((pPWebView2 != null ? pPWebView2.getWidth() : 0) > 0) {
            PPWebView pPWebView3 = pWebActivity.f28607p;
            if ((pPWebView3 != null ? pPWebView3.getHeight() : 0) > 0) {
                pWebActivity.showLoadingDialog(false);
                if (pWebActivity.isHideTitleBar()) {
                    PpTitleBar titleBar = pWebActivity.getTitleBar();
                    if (titleBar != null) {
                        p220oa.h.s(titleBar, false);
                    }
                    View view = pWebActivity.f28608v;
                    if (view != null) {
                        p220oa.h.s(view, false);
                    }
                }
                PPWebView pPWebView4 = pWebActivity.f28607p;
                if (pPWebView4 == null || (viewTreeObserver = pPWebView4.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }
}
