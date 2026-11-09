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
import com.transsnet.palmpay.custom_view.footerView.EmptyFooterView;

/* JADX INFO: loaded from: classes4.dex */
public class ReverseRecyclerView extends FrameLayout implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f31108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseFooterView f31109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f31110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView.LayoutManager f31111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnLoadListener f31112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GridLayoutManager.SpanSizeLookup f31113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f31114g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C f31115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31116j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f31118p;
    public int t;

    public interface OnLoadListener {
        void onLoadMore();

        void onRefresh();
    }

    public ReverseRecyclerView(Context context) {
        this(context, null);
    }

    public View getEmptyView() {
        return this.f31108a;
    }

    public boolean getLoadMoreEnable() {
        return this.f31117o;
    }

    public RecyclerView getRecyclerView() {
        return this.f31110c;
    }

    public boolean getRefreshEnable() {
        return this.f31118p;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        if (this.f31112e != null) {
            BaseFooterView baseFooterView = this.f31109b;
            if (baseFooterView != null) {
                baseFooterView.onLoadingMore();
            }
            this.f31112e.onRefresh();
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            if (this.f31114g == null) {
                this.f31114g = new z(this);
            }
            C c6 = new C(this, adapter);
            this.f31115i = c6;
            this.f31110c.setAdapter(c6);
            adapter.registerAdapterDataObserver(this.f31114g);
            this.f31114g.onChanged();
        }
    }

    public void setEmptyView(View view) {
        View view2 = this.f31108a;
        if (view2 != null) {
            removeView(view2);
        }
        this.f31108a = view;
        z zVar = this.f31114g;
        if (zVar != null) {
            zVar.onChanged();
        }
    }

    public void setFooterView(BaseFooterView baseFooterView) {
        if (baseFooterView != null) {
            this.f31109b = baseFooterView;
        }
    }

    public void setLoadMoreEnable(boolean z3) {
        if (!z3) {
            this.f31116j = false;
            BaseFooterView baseFooterView = this.f31109b;
            if (baseFooterView != null) {
                baseFooterView.onStopLoadingMore();
            }
            C c6 = this.f31115i;
            if (c6 != null) {
                c6.notifyItemRemoved(c6.getItemCount());
            }
        }
        this.f31117o = z3;
    }

    public void setOnLoadListener(OnLoadListener onLoadListener) {
        this.f31112e = onLoadListener;
    }

    public void setRefreshEnable(boolean z3) {
        this.f31118p = z3;
    }

    public void setRefreshing(boolean z3) {
        OnLoadListener onLoadListener;
        if (!z3 || this.f31116j || (onLoadListener = this.f31112e) == null) {
            return;
        }
        onLoadListener.onRefresh();
    }

    public void setSpanSizeLookup(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f31113f = spanSizeLookup;
    }

    public ReverseRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReverseRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.t = 0;
        this.f31118p = true;
        this.f31116j = false;
        this.f31117o = true;
        this.f31109b = new EmptyFooterView(getContext());
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(getContext()).inflate(t.cv_layout_reverse_recyclerview, this).findViewById(s.RecyclerView);
        this.f31110c = recyclerView;
        this.f31111d = recyclerView.getLayoutManager();
        this.f31110c.setOnScrollListener(new y(this));
    }
}
