package qh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f41526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41530e;

    public abstract View a(int i7, View view);

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f41529d;
    }

    public final void b(int i7) {
        this.f41528c = i7;
        super.notifyDataSetChanged();
    }

    public final void c(List list) {
        this.f41526a = list;
        super.notifyDataSetChanged();
    }

    public final void d(boolean z3) {
        if (z3 != this.f41529d) {
            this.f41529d = z3;
            super.notifyDataSetChanged();
        }
    }

    public final void e(boolean z3) {
        if (z3 != this.f41527b) {
            this.f41527b = z3;
            super.notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f41527b) {
            return Integer.MAX_VALUE;
        }
        if (p002a.a.c(this.f41526a)) {
            return 0;
        }
        return (this.f41526a.size() + this.f41528c) - 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        if (p002a.a.c(this.f41526a)) {
            return null;
        }
        List list = this.f41526a;
        return list.get(i7 % list.size());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return !p002a.a.c(this.f41526a) ? i7 % this.f41526a.size() : i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int size;
        if (this.f41527b) {
            size = i7 % this.f41526a.size();
        } else {
            int i10 = this.f41528c / 2;
            size = (i7 >= i10 && i7 < this.f41526a.size() + i10) ? i7 - (this.f41528c / 2) : -1;
        }
        View viewA = size == -1 ? a(0, view) : a(size, view);
        if (!this.f41527b) {
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
        if (!this.f41529d) {
            return false;
        }
        if (this.f41527b) {
            return i7 % this.f41526a.size() == this.f41530e;
        }
        return i7 == (this.f41528c / 2) + this.f41530e;
    }
}
