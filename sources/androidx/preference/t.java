package androidx.preference;

import androidx.core.view.C1050b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class t extends RecyclerViewAccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f17669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050b f17670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f17671c;

    public t(RecyclerView recyclerView) {
        super(recyclerView);
        this.f17670b = super.getItemDelegate();
        this.f17671c = new s(this);
        this.f17669a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public final C1050b getItemDelegate() {
        return this.f17671c;
    }
}
