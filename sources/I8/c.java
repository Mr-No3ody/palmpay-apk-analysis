package I8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f4048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f4049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f4052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4053g;

    public c(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, View view) {
        this.f4047a = constraintLayout;
        this.f4048b = textView;
        this.f4049c = textView2;
        this.f4050d = textView3;
        this.f4051e = textView4;
        this.f4052f = linearLayout;
        this.f4053g = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4047a;
    }
}
