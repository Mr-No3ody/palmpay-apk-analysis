package androidx.appcompat.widget;

import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.appcompat.widget.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0871m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12970b;

    public /* synthetic */ RunnableC0871m0(ViewGroup viewGroup, int i7) {
        this.f12969a = i7;
        this.f12970b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12969a) {
            case 0:
                DropDownListView dropDownListView = (DropDownListView) this.f12970b;
                dropDownListView.t = null;
                dropDownListView.drawableStateChanged();
                break;
            default:
                ((Toolbar) this.f12970b).showOverflowMenu();
                break;
        }
    }
}
