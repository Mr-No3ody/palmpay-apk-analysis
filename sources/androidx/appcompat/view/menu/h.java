package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12420a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12421b;

    public h(i iVar) {
        this.f12421b = iVar;
        a();
    }

    public final void a() {
        i iVar = this.f12421b;
        m expandedItem = iVar.f12424c.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<m> nonActionItems = iVar.f12424c.getNonActionItems();
            int size = nonActionItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (nonActionItems.get(i7) == expandedItem) {
                    this.f12420a = i7;
                    return;
                }
            }
        }
        this.f12420a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        i iVar = this.f12421b;
        ArrayList<m> nonActionItems = iVar.f12424c.getNonActionItems();
        iVar.getClass();
        int i10 = this.f12420a;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return nonActionItems.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f12421b;
        int size = iVar.f12424c.getNonActionItems().size();
        iVar.getClass();
        return this.f12420a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            i iVar = this.f12421b;
            view = iVar.f12423b.inflate(iVar.f12426e, viewGroup, false);
        }
        ((MenuView.ItemView) view).initialize(getItem(i7), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
