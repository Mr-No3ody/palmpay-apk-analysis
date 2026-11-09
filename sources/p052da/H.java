package p052da;

import Kb.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final LinearLayout f35684A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinearLayout f35685B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final LinearLayout f35686C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f35687H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextView f35688L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final /* synthetic */ I f35689M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f35690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f35692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f35693g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f35694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f35695j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f35696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f35697p;
    public final IconicsImageView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f35698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RelativeLayout f35699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i7, View view) {
        super(i7, view);
        this.f35689M = i7;
        this.f35690d = (ImageView) view.findViewById(e.icii_coupon_icon);
        this.f35691e = (TextView) view.findViewById(e.icil_amount_tv);
        this.f35692f = (TextView) view.findViewById(e.icil_title_tv);
        this.f35693g = (TextView) view.findViewById(e.icil_text_tv);
        this.f35694i = (TextView) view.findViewById(e.icil_text_tv1);
        TextView textView = (TextView) view.findViewById(e.icil_text_tv2);
        this.f35695j = textView;
        TextView textView2 = (TextView) view.findViewById(e.icil_use_tv);
        this.f35696o = textView2;
        this.t = (IconicsImageView) view.findViewById(e.icii_iv_expand);
        ImageView imageView = (ImageView) view.findViewById(e.imageViewCheck);
        this.f35698v = imageView;
        this.f35697p = (TextView) view.findViewById(e.icil_coupon_amount);
        this.f35699w = (RelativeLayout) view.findViewById(e.rl_left);
        this.f35684A = (LinearLayout) view.findViewById(e.ll_right);
        this.f35686C = (LinearLayout) view.findViewById(e.ll_expand);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(e.llDetailArrow);
        this.f35685B = linearLayout;
        this.f35688L = (TextView) view.findViewById(e.tvUnavailableReason);
        this.f35687H = (ConstraintLayout) view.findViewById(e.cl_expand);
        a(textView2);
        a(linearLayout);
        a(imageView);
        if (i7.f35700e) {
            textView.setVisibility(8);
        }
    }
}
