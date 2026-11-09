package p228p0;

import android.widget.EditText;
import androidx.emoji2.text.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f41164a;

    public h(EditText editText) {
        this.f41164a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.g
    public final void b() {
        i.a((EditText) this.f41164a.get(), 1);
    }
}
