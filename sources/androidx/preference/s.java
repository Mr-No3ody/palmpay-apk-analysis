package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C1050b;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class s extends C1050b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f17668a;

    public s(t tVar) {
        this.f17668a = tVar;
    }

    @Override // androidx.core.view.C1050b
    public final void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
        Preference preferenceC;
        t tVar = this.f17668a;
        tVar.f17670b.onInitializeAccessibilityNodeInfo(view, dVar);
        RecyclerView recyclerView = tVar.f17669a;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if ((adapter instanceof p) && (preferenceC = ((p) adapter).c(childAdapterPosition)) != null) {
            preferenceC.o(dVar);
        }
    }

    @Override // androidx.core.view.C1050b
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        return this.f17668a.f17670b.performAccessibilityAction(view, i7, bundle);
    }
}
