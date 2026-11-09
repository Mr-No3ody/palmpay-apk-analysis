package p223od;

import Bc.j;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f40407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f40408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f40409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f40410e;

    public k(LinearLayout linearLayout, FlexboxLayout flexboxLayout, j jVar, TextView textView, TextView textView2) {
        this.f40406a = linearLayout;
        this.f40407b = flexboxLayout;
        this.f40408c = jVar;
        this.f40409d = textView;
        this.f40410e = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40406a;
    }
}
