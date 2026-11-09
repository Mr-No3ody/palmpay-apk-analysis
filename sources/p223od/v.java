package p223od;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f40520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f40521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f40522d;

    public v(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.f40519a = linearLayout;
        this.f40520b = linearLayout2;
        this.f40521c = linearLayout3;
        this.f40522d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40519a;
    }
}
