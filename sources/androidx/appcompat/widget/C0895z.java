package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0895z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f13032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.c f13033b;

    public C0895z(EditText editText) {
        this.f13032a = editText;
        this.f13033b = new p1.c(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((androidx.work.impl.model.b) this.f13033b.f41176b).getClass();
        if (keyListener instanceof p228p0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p228p0.e(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f13032a.getContext().obtainStyledAttributes(attributeSet, p241q.j.AppCompatTextView, i7, 0);
        try {
            boolean z3 = typedArrayObtainStyledAttributes.hasValue(p241q.j.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(p241q.j.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final p228p0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        p1.c cVar = this.f13033b;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            androidx.work.impl.model.b bVar = (androidx.work.impl.model.b) cVar.f41176b;
            bVar.getClass();
            if (!(inputConnection instanceof p228p0.b)) {
                inputConnection = new p228p0.b((EditText) bVar.f18580b, inputConnection, editorInfo);
            }
        }
        return (p228p0.b) inputConnection;
    }

    public final void d(boolean z3) {
        p228p0.i iVar = (p228p0.i) ((androidx.work.impl.model.b) this.f13033b.f41176b).f18581c;
        if (iVar.f41167c != z3) {
            if (iVar.f41166b != null) {
                androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
                p228p0.h hVar = iVar.f41166b;
                iVarA.getClass();
                p118hf.a.j(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = iVarA.f16889a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    iVarA.f16890b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f41167c = z3;
            if (z3) {
                p228p0.i.a(iVar.f41165a, androidx.emoji2.text.i.a().b());
            }
        }
    }
}
