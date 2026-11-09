package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f8265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f8267d;

    public e0(LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f8264a = linearLayout;
        this.f8265b = circularProgressIndicator;
        this.f8266c = recyclerView;
        this.f8267d = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8264a;
    }
}
