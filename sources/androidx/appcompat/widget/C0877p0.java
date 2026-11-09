package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.widget.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877p0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12994b;

    public /* synthetic */ C0877p0(Object obj, int i7) {
        this.f12993a = i7;
        this.f12994b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j6) {
        DropDownListView dropDownListView;
        switch (this.f12993a) {
            case 0:
                if (i7 != -1 && (dropDownListView = ((ListPopupWindow) this.f12994b).f12714c) != null) {
                    dropDownListView.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f12994b).f(i7);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f12993a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
