package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: androidx.appcompat.widget.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884t0 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13005b;

    public /* synthetic */ C0884t0(Object obj, int i7) {
        this.f13004a = i7;
        this.f13005b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f13004a) {
            case 0:
                ListPopupWindow listPopupWindow = (ListPopupWindow) this.f13005b;
                if (listPopupWindow.f12724p0.isShowing()) {
                    listPopupWindow.show();
                }
                break;
            default:
                T0 t1 = (T0) this.f13005b;
                t1.f16374a = true;
                t1.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f13004a) {
            case 0:
                ((ListPopupWindow) this.f13005b).dismiss();
                break;
            default:
                T0 t1 = (T0) this.f13005b;
                t1.f16374a = false;
                t1.notifyDataSetInvalidated();
                break;
        }
    }
}
