package p228p0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.p;
import org.sufficientlysecure.htmltextview.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f41158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f41159b;

    public e(KeyListener keyListener) {
        i iVar = new i(10);
        this.f41158a = keyListener;
        this.f41159b = iVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f41158a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f41158a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean zA;
        boolean z3;
        this.f41159b.getClass();
        if (i7 != 67) {
            zA = i7 != 112 ? false : p.a(editable, keyEvent, true);
        } else {
            zA = p.a(editable, keyEvent, false);
        }
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 || this.f41158a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f41158a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f41158a.onKeyUp(view, editable, i7, keyEvent);
    }
}
