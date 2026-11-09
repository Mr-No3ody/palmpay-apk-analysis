package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0834l;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f12435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0834l f12436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f12437c;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        i iVar = this.f12437c;
        if (iVar.f12428g == null) {
            iVar.f12428g = new h(iVar);
        }
        this.f12435a.performItemAction(iVar.f12428g.getItem(i7), 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(k kVar, boolean z3) {
        DialogInterfaceC0834l dialogInterfaceC0834l;
        if ((z3 || kVar == this.f12435a) && (dialogInterfaceC0834l = this.f12436b) != null) {
            dialogInterfaceC0834l.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f12437c.onCloseMenu(this.f12435a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        w wVar = this.f12435a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f12436b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f12436b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                wVar.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return wVar.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(k kVar) {
        return false;
    }
}
