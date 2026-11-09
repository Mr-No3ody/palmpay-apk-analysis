package p278s4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f42013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42017e;

    public abstract View a(int i7, View view);

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f42016d;
    }

    public final void b(boolean z3) {
        if (z3 != this.f42016d) {
            this.f42016d = z3;
            super.notifyDataSetChanged();
        }
    }

    public final void c(List list) {
        this.f42013a = list;
        super.notifyDataSetChanged();
    }

    public final void d(boolean z3) {
        if (z3 != this.f42014b) {
            this.f42014b = z3;
            super.notifyDataSetChanged();
        }
    }

    public final void e(int i7) {
        this.f42015c = i7;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f42014b) {
            return Integer.MAX_VALUE;
        }
        List list = this.f42013a;
        if (list == null || list.size() == 0) {
            return 0;
        }
        List list2 = this.f42013a;
        Intrinsics.e(list2);
        return (list2.size() + this.f42015c) - 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        List list = this.f42013a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List list2 = this.f42013a;
        Intrinsics.e(list2);
        List list3 = this.f42013a;
        Intrinsics.e(list3);
        return list2.get(i7 % list3.size());
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        List list = this.f42013a;
        if (!(list == null || list.size() == 0)) {
            List list2 = this.f42013a;
            Intrinsics.e(list2);
            i7 %= list2.size();
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int size;
        if (this.f42014b) {
            List list = this.f42013a;
            Intrinsics.e(list);
            size = i7 % list.size();
        } else {
            int i10 = this.f42015c / 2;
            if (i7 < i10) {
                size = -1;
            } else {
                List list2 = this.f42013a;
                Intrinsics.e(list2);
                if (i7 >= list2.size() + i10) {
                    size = -1;
                } else {
                    size = i7 - (this.f42015c / 2);
                }
            }
        }
        View viewA = size == -1 ? a(0, view) : a(size, view);
        if (!this.f42014b) {
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
        if (!this.f42016d) {
            return false;
        }
        if (!this.f42014b) {
            return i7 == (this.f42015c / 2) + this.f42017e;
        }
        List list = this.f42013a;
        Intrinsics.e(list);
        return i7 % list.size() == this.f42017e;
    }
}
