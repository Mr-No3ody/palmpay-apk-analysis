package p223od;

import Rd.k0;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f40424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f40425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f40426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f40427e;

    public m(LinearLayout linearLayout, FlexboxLayout flexboxLayout, k0 k0Var, TextView textView, TextView textView2) {
        this.f40423a = linearLayout;
        this.f40424b = flexboxLayout;
        this.f40425c = k0Var;
        this.f40426d = textView;
        this.f40427e = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40423a;
    }
}
