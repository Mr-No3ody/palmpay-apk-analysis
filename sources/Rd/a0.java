package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f8205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8206c;

    public a0(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f8204a = linearLayout;
        this.f8205b = recyclerView;
        this.f8206c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8204a;
    }
}
