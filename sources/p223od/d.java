package p223od;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f40323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f40324c;

    public d(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.f40322a = linearLayout;
        this.f40323b = recyclerView;
        this.f40324c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40322a;
    }
}
