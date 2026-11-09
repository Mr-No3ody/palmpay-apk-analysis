package Q8;

import Bc.f;
import Nc.x;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.l;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PinSafeWithPatternActivity f7639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f7640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PinSafeWithPatternActivity activity) {
        super(activity, w.CvFullscreenDialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7639a = activity;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewM;
        View viewM2;
        WindowManager.LayoutParams attributes;
        WindowManager.LayoutParams attributes2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(R.color.transparent);
        }
        setContentView(F8.e.ac_other_verify_methods_dialog);
        View viewFindViewById = findViewById(F8.d.rootView);
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        int i7 = F8.d.tv1;
        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewFindViewById);
        if (iconicsTextView != null) {
            i7 = F8.d.tv2;
            IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsTextView2 != null) {
                i7 = F8.d.tv3;
                IconicsTextView iconicsTextView3 = (IconicsTextView) p059e1.a.m(i7, viewFindViewById);
                if (iconicsTextView3 != null) {
                    i7 = F8.d.tvCancel;
                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
                    if (ppButton != null) {
                        i7 = F8.d.tvTitle;
                        TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                        if (textView != null && (viewM = p059e1.a.m((i7 = F8.d.viewLine1), viewFindViewById)) != null && (viewM2 = p059e1.a.m((i7 = F8.d.viewLine2), viewFindViewById)) != null) {
                            this.f7640b = new f(linearLayout, iconicsTextView, iconicsTextView2, iconicsTextView3, ppButton, textView, viewM, viewM2, 11);
                            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                            Window window3 = getWindow();
                            if (window3 != null) {
                                window3.setGravity(80);
                            }
                            Window window4 = getWindow();
                            if (window4 != null) {
                                window4.setWindowAnimations(l.dialog_bottom_in_out);
                            }
                            Window window5 = getWindow();
                            if (window5 != null && (attributes2 = window5.getAttributes()) != null) {
                                attributes2.width = ScreenUtils.getScreenWidth();
                            }
                            Window window6 = getWindow();
                            if (window6 != null && (attributes = window6.getAttributes()) != null) {
                                attributes.height = -2;
                            }
                            setCanceledOnTouchOutside(true);
                            setCancelable(true);
                            x xVar = new x(this, 17);
                            f fVar = this.f7640b;
                            h.q(xVar, fVar != null ? (PpButton) fVar.f701g : null, fVar != null ? (IconicsTextView) fVar.f698d : null, fVar != null ? (IconicsTextView) fVar.f699e : null, fVar != null ? (IconicsTextView) fVar.f700f : null);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }
}
