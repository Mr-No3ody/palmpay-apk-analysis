package androidx.appcompat.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f12082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q f12083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I f12087f;

    public D(I i7, Window.Callback callback) {
        this.f12087f = i7;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f12082a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12084c = true;
            callback.onContentChanged();
        } finally {
            this.f12084c = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f12082a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f12082a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        p343x.i.a(this.f12082a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12082a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f12085d;
        Window.Callback callback = this.f12082a;
        if (z3) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f12087f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f12082a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            I i7 = this.f12087f;
            i7.C();
            AbstractC0824b abstractC0824b = i7.f12110A;
            if (abstractC0824b == null || !abstractC0824b.l(keyCode, keyEvent)) {
                G g7 = i7.f12115C0;
                if (g7 == null || !i7.H(g7, keyEvent.getKeyCode(), keyEvent)) {
                    if (i7.f12115C0 == null) {
                        G gB = i7.B(0);
                        i7.I(gB, keyEvent);
                        boolean zH = i7.H(gB, keyEvent.getKeyCode(), keyEvent);
                        gB.f12101k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                G g10 = i7.f12115C0;
                if (g10 != null) {
                    g10.f12102l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12082a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12082a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12082a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12082a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12082a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f12082a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f12084c) {
            this.f12082a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof androidx.appcompat.view.menu.k)) {
            return this.f12082a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        View viewOnCreatePanelView;
        Q q10 = this.f12083b;
        return (q10 == null || (viewOnCreatePanelView = q10.onCreatePanelView(i7)) == null) ? this.f12082a.onCreatePanelView(i7) : viewOnCreatePanelView;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f12082a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f12082a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        I i10 = this.f12087f;
        if (i7 == 108) {
            i10.C();
            AbstractC0824b abstractC0824b = i10.f12110A;
            if (abstractC0824b != null) {
                abstractC0824b.c(true);
            }
        } else {
            i10.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f12086e) {
            this.f12082a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        I i10 = this.f12087f;
        if (i7 == 108) {
            i10.C();
            AbstractC0824b abstractC0824b = i10.f12110A;
            if (abstractC0824b != null) {
                abstractC0824b.c(false);
                return;
            }
            return;
        }
        if (i7 != 0) {
            i10.getClass();
            return;
        }
        G gB = i10.B(i7);
        if (gB.f12103m) {
            i10.t(gB, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        p343x.j.a(this.f12082a, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        androidx.appcompat.view.menu.k kVar = menu instanceof androidx.appcompat.view.menu.k ? (androidx.appcompat.view.menu.k) menu : null;
        if (i7 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.setOverrideVisibleItems(true);
        }
        Q q10 = this.f12083b;
        if (q10 != null) {
            q10.onPreparePanel(i7);
        }
        boolean zOnPreparePanel = this.f12082a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.setOverrideVisibleItems(false);
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        androidx.appcompat.view.menu.k kVar = this.f12087f.B(0).f12098h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return p343x.h.a(this.f12082a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12082a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f12082a.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f12082a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        I i10 = this.f12087f;
        i10.getClass();
        if (i7 != 0) {
            return p343x.h.b(this.f12082a, callback, i7);
        }
        Context context = i10.f12144p;
        O2.a aVar = new O2.a();
        aVar.f6554b = context;
        aVar.f6553a = callback;
        aVar.f6555c = new ArrayList();
        aVar.f6556d = new M.n(0);
        p343x.a aVarN = i10.n(aVar);
        if (aVarN != null) {
            return aVar.e(aVarN);
        }
        return null;
    }
}
