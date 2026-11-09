package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Group f8251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f8252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f8253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8256g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f8258j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f8259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8260p;
    public final View t;

    public d0(LinearLayout linearLayout, Group group, AppCompatImageView appCompatImageView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view) {
        this.f8250a = linearLayout;
        this.f8251b = group;
        this.f8252c = appCompatImageView;
        this.f8253d = recyclerView;
        this.f8254e = textView;
        this.f8255f = textView2;
        this.f8256g = textView3;
        this.f8257i = textView4;
        this.f8258j = textView5;
        this.f8259o = textView6;
        this.f8260p = textView7;
        this.t = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8250a;
    }
}
