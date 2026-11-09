package p099gb;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f37169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewStub f37170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f37171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f37172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SwipeRefreshLayout f37173e;

    public j(ConstraintLayout constraintLayout, ViewStub viewStub, View view, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f37169a = constraintLayout;
        this.f37170b = viewStub;
        this.f37171c = view;
        this.f37172d = recyclerView;
        this.f37173e = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f37169a;
    }
}
