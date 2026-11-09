package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.footerView.BaseFooterView;
import com.transsnet.palmpay.custom_view.footerView.SimpleFooterView;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeRecyclerView extends FrameLayout implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f31139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseFooterView f31140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f31141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f31142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView.LayoutManager f31143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnLoadListener f31144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GridLayoutManager.SpanSizeLookup f31145g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f31146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J f31147j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31149p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31150v;

    public interface OnLoadListener {
        void onLoadMore();

        void onRefresh();
    }

    public SwipeRecyclerView(Context context) {
        this(context, null);
    }

    public final void a() {
        BaseFooterView baseFooterView = this.f31140b;
        if (baseFooterView != null) {
            baseFooterView.onLoadingMore();
        }
    }

    public final void b(String str) {
        BaseFooterView baseFooterView = this.f31140b;
        if (baseFooterView != null) {
            baseFooterView.onNoMore(str);
        }
    }

    public final void c() {
        this.f31148o = false;
        BaseFooterView baseFooterView = this.f31140b;
        if (baseFooterView != null) {
            baseFooterView.onStopLoadingMore();
        }
        J j6 = this.f31147j;
        if (j6 != null) {
            j6.notifyItemRemoved(j6.getItemCount());
        }
    }

    public View getEmptyView() {
        return this.f31139a;
    }

    public boolean getLoadMoreEnable() {
        return this.f31149p;
    }

    public RecyclerView getRecyclerView() {
        return this.f31141c;
    }

    public boolean getRefreshEnable() {
        return this.t;
    }

    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return this.f31142d;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        if (this.f31144f != null) {
            BaseFooterView baseFooterView = this.f31140b;
            if (baseFooterView != null) {
                baseFooterView.onLoadingMore();
            }
            this.f31144f.onRefresh();
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            if (this.f31146i == null) {
                this.f31146i = new G(this);
            }
            J j6 = new J(this, adapter);
            this.f31147j = j6;
            this.f31141c.setAdapter(j6);
            adapter.registerAdapterDataObserver(this.f31146i);
            this.f31146i.onChanged();
        }
    }

    public void setEmptyView(View view) {
        View view2 = this.f31139a;
        if (view2 != null) {
            removeView(view2);
        }
        this.f31139a = view;
        G g7 = this.f31146i;
        if (g7 != null) {
            g7.onChanged();
        }
    }

    public void setFooterView(BaseFooterView baseFooterView) {
        if (baseFooterView != null) {
            this.f31140b = baseFooterView;
        }
    }

    public void setLoadMoreEnable(boolean z3) {
        if (!z3) {
            c();
        }
        this.f31149p = z3;
    }

    public void setOnLoadListener(OnLoadListener onLoadListener) {
        this.f31144f = onLoadListener;
    }

    public void setRefreshEnable(boolean z3) {
        this.t = z3;
        this.f31142d.setEnabled(z3);
    }

    public void setRefreshing(boolean z3) {
        OnLoadListener onLoadListener;
        this.f31142d.setRefreshing(z3);
        if (!z3 || this.f31148o || (onLoadListener = this.f31144f) == null) {
            return;
        }
        onLoadListener.onRefresh();
    }

    public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f31145g = spanSizeLookup;
    }

    public SwipeRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31150v = 0;
        this.t = true;
        this.f31148o = false;
        this.f31149p = true;
        this.f31140b = new SimpleFooterView(getContext());
        View viewInflate = LayoutInflater.from(getContext()).inflate(t.cv_layout_swipe_recyclerview, this);
        this.f31142d = (SwipeRefreshLayout) viewInflate.findViewById(s.SwipeRefreshLayout);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(s.RecyclerView);
        this.f31141c = recyclerView;
        this.f31143e = recyclerView.getLayoutManager();
        this.f31142d.setColorSchemeResources(L6.b.ppColorPrimary);
        this.f31142d.setOnRefreshListener(this);
        this.f31141c.setOnScrollListener(new F(this));
    }
}
