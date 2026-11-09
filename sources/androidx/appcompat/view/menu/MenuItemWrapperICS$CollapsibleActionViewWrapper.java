package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;

/* JADX INFO: loaded from: classes.dex */
class MenuItemWrapperICS$CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.CollapsibleActionView f12360a;

    /* JADX WARN: Multi-variable type inference failed */
    public MenuItemWrapperICS$CollapsibleActionViewWrapper(View view) {
        super(view.getContext());
        this.f12360a = (android.view.CollapsibleActionView) view;
        addView(view);
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        this.f12360a.onActionViewCollapsed();
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        this.f12360a.onActionViewExpanded();
    }
}
