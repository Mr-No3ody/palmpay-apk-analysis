package Zb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f11606a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11607b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11608c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11609d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11610e = -1;

    public abstract View a(int i7, View view, ViewGroup viewGroup);

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f11609d;
    }

    public final void b(boolean z3) {
        if (z3 != this.f11609d) {
            this.f11609d = z3;
            super.notifyDataSetChanged();
        }
    }

    public final void c(List list) {
        this.f11606a = list;
        super.notifyDataSetChanged();
    }

    public final void d(boolean z3) {
        if (z3 != this.f11607b) {
            this.f11607b = z3;
            super.notifyDataSetChanged();
        }
    }

    public final void e(int i7) {
        this.f11608c = i7;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f11607b) {
            return Integer.MAX_VALUE;
        }
        if (G8.a.H(this.f11606a)) {
            return 0;
        }
        return (this.f11606a.size() + this.f11608c) - 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        if (G8.a.H(this.f11606a)) {
            return null;
        }
        List list = this.f11606a;
        return list.get(i7 % list.size());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return !G8.a.H(this.f11606a) ? i7 % this.f11606a.size() : i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int size;
        if (this.f11607b) {
            size = i7 % this.f11606a.size();
        } else {
            int i10 = this.f11608c / 2;
            size = (i7 >= i10 && i7 < this.f11606a.size() + i10) ? i7 - (this.f11608c / 2) : -1;
        }
        View viewA = size == -1 ? a(0, view, viewGroup) : a(size, view, viewGroup);
        if (!this.f11607b) {
            if (size == -1) {
                viewA.setVisibility(4);
                return viewA;
            }
            viewA.setVisibility(0);
        }
        return viewA;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i7) {
        if (!this.f11609d) {
            return false;
        }
        if (this.f11607b) {
            return i7 % this.f11606a.size() == this.f11610e;
        }
        return i7 == (this.f11608c / 2) + this.f11610e;
    }
}
