package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f8121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f8123d;

    public O(LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f8120a = linearLayout;
        this.f8121b = circularProgressIndicator;
        this.f8122c = recyclerView;
        this.f8123d = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8120a;
    }
}
