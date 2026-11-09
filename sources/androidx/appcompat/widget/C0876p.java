package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876p extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityChooserView f12992b;

    public /* synthetic */ C0876p(ActivityChooserView activityChooserView, int i7) {
        this.f12991a = i7;
        this.f12992b = activityChooserView;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f12991a) {
            case 0:
                super.onChanged();
                this.f12992b.f12590a.notifyDataSetChanged();
                return;
            default:
                super.onChanged();
                this.f12992b.f12590a.getClass();
                throw null;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.f12991a) {
            case 0:
                super.onInvalidated();
                this.f12992b.f12590a.notifyDataSetInvalidated();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
