package p185ma;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f39590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f39591c;

    public /* synthetic */ a(View view, b bVar, int i7) {
        this.f39589a = i7;
        this.f39590b = view;
        this.f39591c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f39589a) {
            case 0:
                int screenHeight = (int) (ScreenUtils.getScreenHeight() * 0.75f);
                View view = this.f39590b;
                if (view.getHeight() > screenHeight) {
                    CashierPayMethodRetryDialog cashierPayMethodRetryDialog = (CashierPayMethodRetryDialog) this.f39591c;
                    Window window = cashierPayMethodRetryDialog.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.height = screenHeight;
                    }
                    Window window2 = cashierPayMethodRetryDialog.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                break;
            default:
                int screenHeight2 = (int) (ScreenUtils.getScreenHeight() * 0.88f);
                LinearLayout linearLayout = (LinearLayout) this.f39590b;
                if (linearLayout.getHeight() > screenHeight2) {
                    CashierSelectPayMethodDialog cashierSelectPayMethodDialog = (CashierSelectPayMethodDialog) this.f39591c;
                    Window window3 = cashierSelectPayMethodDialog.getWindow();
                    WindowManager.LayoutParams attributes2 = window3 != null ? window3.getAttributes() : null;
                    if (attributes2 != null) {
                        attributes2.height = screenHeight2;
                    }
                    Window window4 = cashierSelectPayMethodDialog.getWindow();
                    if (window4 != null) {
                        window4.setAttributes(attributes2);
                    }
                }
                ViewTreeObserver viewTreeObserver = linearLayout.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
        }
    }
}
