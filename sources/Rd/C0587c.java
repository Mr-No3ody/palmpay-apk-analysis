package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;

/* JADX INFO: renamed from: Rd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0587c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpButton f8216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ModelMobileWithIconInputLayout f8217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PpAmountEditText f8218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f8219g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f8220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f8221j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f8222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinearLayout f8223p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PpTitleBar f8224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f8225w;

    public C0587c(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, PpButton ppButton, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, PpAmountEditText ppAmountEditText, LinearLayout linearLayout3, ImageView imageView, LinearLayout linearLayout4, ImageView imageView2, LinearLayout linearLayout5, TextView textView, PpTitleBar ppTitleBar, TextView textView2) {
        this.f8213a = linearLayout;
        this.f8214b = linearLayout2;
        this.f8215c = recyclerView;
        this.f8216d = ppButton;
        this.f8217e = modelMobileWithIconInputLayout;
        this.f8218f = ppAmountEditText;
        this.f8219g = linearLayout3;
        this.f8220i = imageView;
        this.f8221j = linearLayout4;
        this.f8222o = imageView2;
        this.f8223p = linearLayout5;
        this.t = textView;
        this.f8224v = ppTitleBar;
        this.f8225w = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8213a;
    }
}
