package H9;

import Bc.y;
import Ce.ViewOnClickListenerC0159a;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.image.RoundImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3767e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f3770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewOnClickListenerC0159a f3771d;

    static {
        new a(null);
    }

    public b(View itemView, boolean z3) {
        View viewM;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f3768a = itemView;
        this.f3769b = z3;
        int i7 = p366y9.b.btnRight;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, itemView);
        if (ppButton != null && (viewM = p059e1.a.m((i7 = p366y9.b.btnRightClick), itemView)) != null) {
            i7 = p366y9.b.ivBg;
            RoundImageView roundImageView = (RoundImageView) p059e1.a.m(i7, itemView);
            if (roundImageView != null) {
                i7 = p366y9.b.ivIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, itemView);
                if (appCompatImageView != null) {
                    i7 = p366y9.b.tvDesc;
                    TextView textView = (TextView) p059e1.a.m(i7, itemView);
                    if (textView != null) {
                        i7 = p366y9.b.tvLabel;
                        RoundedTextView roundedTextView = (RoundedTextView) p059e1.a.m(i7, itemView);
                        if (roundedTextView != null) {
                            i7 = p366y9.b.tvTitle;
                            TextView textView2 = (TextView) p059e1.a.m(i7, itemView);
                            if (textView2 != null) {
                                y yVar = new y((ConstraintLayout) itemView, ppButton, viewM, roundImageView, appCompatImageView, textView, roundedTextView, textView2);
                                Intrinsics.checkNotNullExpressionValue(yVar, "bind(...)");
                                this.f3770c = yVar;
                                this.f3771d = new ViewOnClickListenerC0159a(this, 28);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i7)));
    }
}
