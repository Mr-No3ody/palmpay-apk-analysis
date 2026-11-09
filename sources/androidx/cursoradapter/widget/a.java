package androidx.cursoradapter.widget;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import androidx.appcompat.widget.T0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T0 f16373a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(T0 t1) {
        super(new Handler());
        this.f16373a = t1;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        T0 t1 = this.f16373a;
        if (!t1.f16375b || (cursor = t1.f16376c) == null || cursor.isClosed()) {
            return;
        }
        t1.f16374a = t1.f16376c.requery();
    }
}
