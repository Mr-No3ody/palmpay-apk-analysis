package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView.TabView;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f12675a;

    public E0(ScrollingTabContainerView scrollingTabContainerView) {
        this.f12675a = scrollingTabContainerView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12675a.f12756b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        ((ScrollingTabContainerView.TabView) this.f12675a.f12756b.getChildAt(i7)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i7);
            throw null;
        }
        getItem(i7);
        ScrollingTabContainerView scrollingTabContainerView = this.f12675a;
        scrollingTabContainerView.new TabView(scrollingTabContainerView.getContext());
        throw null;
    }
}
