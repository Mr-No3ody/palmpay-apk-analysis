package androidx.appcompat.widget;

import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
