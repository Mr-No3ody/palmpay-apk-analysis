package androidx.appcompat.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0881s extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f13000a;

    public C0881s(ActivityChooserView activityChooserView) {
        this.f13000a = activityChooserView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        ActivityChooserView activityChooserView = this.f13000a;
        if (view == null || view.getId() != p241q.f.list_item) {
            view = LayoutInflater.from(activityChooserView.getContext()).inflate(p241q.g.abc_activity_chooser_view_list_item, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }
}
