package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;

/* JADX INFO: renamed from: Rd.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0606w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f8532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f8533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f8534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f8535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TransactionResultHeaderModel f8536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8538g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8540j;

    public C0606w(RelativeLayout relativeLayout, SingleAdView singleAdView, LinearLayout linearLayout, LinearLayout linearLayout2, TransactionResultHeaderModel transactionResultHeaderModel, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f8532a = relativeLayout;
        this.f8533b = singleAdView;
        this.f8534c = linearLayout;
        this.f8535d = linearLayout2;
        this.f8536e = transactionResultHeaderModel;
        this.f8537f = textView;
        this.f8538g = textView2;
        this.f8539i = textView3;
        this.f8540j = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8532a;
    }
}
