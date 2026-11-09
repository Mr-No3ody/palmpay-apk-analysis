package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12430b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f12433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12434f;

    public j(k kVar, LayoutInflater layoutInflater, boolean z3, int i7) {
        this.f12432d = z3;
        this.f12433e = layoutInflater;
        this.f12429a = kVar;
        this.f12434f = i7;
        a();
    }

    public final void a() {
        k kVar = this.f12429a;
        m expandedItem = kVar.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<m> nonActionItems = kVar.getNonActionItems();
            int size = nonActionItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (nonActionItems.get(i7) == expandedItem) {
                    this.f12430b = i7;
                    return;
                }
            }
        }
        this.f12430b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        k kVar = this.f12429a;
        ArrayList<m> nonActionItems = this.f12432d ? kVar.getNonActionItems() : kVar.getVisibleItems();
        int i10 = this.f12430b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return nonActionItems.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f12429a;
        ArrayList<m> nonActionItems = this.f12432d ? kVar.getNonActionItems() : kVar.getVisibleItems();
        return this.f12430b < 0 ? nonActionItems.size() : nonActionItems.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f12433e.inflate(this.f12434f, viewGroup, false);
        }
        int i10 = getItem(i7).f12443b;
        int i11 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f12429a.isGroupDividerEnabled() && i10 != (i11 >= 0 ? getItem(i11).f12443b : i10));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f12431c) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
