package Ae;

import Ce.C0170l;
import Ja.C0328a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.wang.avi.AVLoadingIndicatorView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends O6.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f293o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0170l f294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f297g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f299j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(E e10, C0170l callback) {
        super(e10, Ac.f.main_dialog_pre_install_build_privacy);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f294d = callback;
        final int i7 = 0;
        this.f295e = C2131j.b(new Function0(this) { // from class: Ae.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f288b;

            {
                this.f288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return (TextView) this.f288b.findViewById(Ac.e.tvYes);
                    case 1:
                        return (TextView) this.f288b.findViewById(Ac.e.tvNo);
                    case 2:
                        return (AVLoadingIndicatorView) this.f288b.findViewById(Ac.e.loadingView);
                    case 3:
                        return (LinearLayout) this.f288b.findViewById(Ac.e.ll_web);
                    default:
                        return (ImageView) this.f288b.findViewById(Ac.e.imageViewClose);
                }
            }
        });
        final int i10 = 1;
        this.f296f = C2131j.b(new Function0(this) { // from class: Ae.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f288b;

            {
                this.f288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return (TextView) this.f288b.findViewById(Ac.e.tvYes);
                    case 1:
                        return (TextView) this.f288b.findViewById(Ac.e.tvNo);
                    case 2:
                        return (AVLoadingIndicatorView) this.f288b.findViewById(Ac.e.loadingView);
                    case 3:
                        return (LinearLayout) this.f288b.findViewById(Ac.e.ll_web);
                    default:
                        return (ImageView) this.f288b.findViewById(Ac.e.imageViewClose);
                }
            }
        });
        final int i11 = 2;
        this.f297g = C2131j.b(new Function0(this) { // from class: Ae.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f288b;

            {
                this.f288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (TextView) this.f288b.findViewById(Ac.e.tvYes);
                    case 1:
                        return (TextView) this.f288b.findViewById(Ac.e.tvNo);
                    case 2:
                        return (AVLoadingIndicatorView) this.f288b.findViewById(Ac.e.loadingView);
                    case 3:
                        return (LinearLayout) this.f288b.findViewById(Ac.e.ll_web);
                    default:
                        return (ImageView) this.f288b.findViewById(Ac.e.imageViewClose);
                }
            }
        });
        final int i12 = 3;
        this.f298i = C2131j.b(new Function0(this) { // from class: Ae.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f288b;

            {
                this.f288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (TextView) this.f288b.findViewById(Ac.e.tvYes);
                    case 1:
                        return (TextView) this.f288b.findViewById(Ac.e.tvNo);
                    case 2:
                        return (AVLoadingIndicatorView) this.f288b.findViewById(Ac.e.loadingView);
                    case 3:
                        return (LinearLayout) this.f288b.findViewById(Ac.e.ll_web);
                    default:
                        return (ImageView) this.f288b.findViewById(Ac.e.imageViewClose);
                }
            }
        });
        final int i13 = 4;
        this.f299j = C2131j.b(new Function0(this) { // from class: Ae.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f288b;

            {
                this.f288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return (TextView) this.f288b.findViewById(Ac.e.tvYes);
                    case 1:
                        return (TextView) this.f288b.findViewById(Ac.e.tvNo);
                    case 2:
                        return (AVLoadingIndicatorView) this.f288b.findViewById(Ac.e.loadingView);
                    case 3:
                        return (LinearLayout) this.f288b.findViewById(Ac.e.ll_web);
                    default:
                        return (ImageView) this.f288b.findViewById(Ac.e.imageViewClose);
                }
            }
        });
    }

    public static void b(p pVar, View view) {
        int id2 = view.getId();
        if (id2 == Ac.e.imageViewClose || id2 == Ac.e.tvNo) {
            pVar.f294d.onComplete(new Boolean[]{Boolean.FALSE});
            super.dismiss();
        } else if (id2 == Ac.e.tvYes) {
            pVar.f294d.onComplete(new Boolean[]{Boolean.TRUE});
            super.dismiss();
        }
    }

    @Override // O6.a
    public final void a(Context context) {
        int i7 = 0;
        this.f6590a = context;
        showAtBottom(getWindow());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        A8.b bVar = new A8.b(this, 11);
        ImageView imageView = (ImageView) this.f299j.getValue();
        TextView textView = (TextView) this.f296f.getValue();
        p355xf.t tVar = this.f295e;
        p220oa.h.q(bVar, imageView, textView, (TextView) tVar.getValue());
        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) this.f297g.getValue();
        if (aVLoadingIndicatorView != null) {
            aVLoadingIndicatorView.setVisibility(0);
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        ActivityWebView activityWebView = new ActivityWebView(getContext());
        activityWebView.setWebChromeClient(new o(this, i7));
        LinearLayout linearLayout = (LinearLayout) this.f298i.getValue();
        if (linearLayout != null) {
            linearLayout.addView(activityWebView);
        }
        String strG = com.transsnet.palmpay.core.config.d.g("/h5/policy/ng/permission");
        activityWebView.setWebViewClient(new C0328a(strG));
        activityWebView.loadUrl(strG);
    }
}
