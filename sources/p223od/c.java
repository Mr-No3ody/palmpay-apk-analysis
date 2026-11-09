package p223od;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsCheckBox f40310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f40311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f40312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioGroup f40313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f40314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f40315g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f40316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f40317j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f40318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f40319p;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f40320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f40321w;

    public c(ConstraintLayout constraintLayout, IconicsCheckBox iconicsCheckBox, ImageView imageView, ImageView imageView2, RadioGroup radioGroup, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view) {
        this.f40309a = constraintLayout;
        this.f40310b = iconicsCheckBox;
        this.f40311c = imageView;
        this.f40312d = imageView2;
        this.f40313e = radioGroup;
        this.f40314f = recyclerView;
        this.f40315g = textView;
        this.f40316i = textView2;
        this.f40317j = textView3;
        this.f40318o = textView4;
        this.f40319p = textView5;
        this.t = textView6;
        this.f40320v = textView7;
        this.f40321w = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40309a;
    }
}
