package androidx.appcompat.view.menu;

import androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0;
import androidx.appcompat.widget.C0854e;
import androidx.appcompat.widget.C0856f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractViewOnTouchListenerC0875o0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f12377o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f12377o = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final ShowableListMenu b() {
        C0854e c0854e;
        c cVar = this.f12377o.f12336f;
        if (cVar == null || (c0854e = ((C0856f) cVar).f12900a.f12948Q) == null) {
            return null;
        }
        return c0854e.a();
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final boolean c() {
        ShowableListMenu showableListMenuB;
        ActionMenuItemView actionMenuItemView = this.f12377o;
        MenuBuilder$ItemInvoker menuBuilder$ItemInvoker = actionMenuItemView.f12334d;
        return menuBuilder$ItemInvoker != null && menuBuilder$ItemInvoker.invokeItem(actionMenuItemView.f12331a) && (showableListMenuB = b()) != null && showableListMenuB.isShowing();
    }
}
