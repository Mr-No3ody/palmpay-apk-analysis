package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14150a;

    public d(boolean z3) {
        this.f14150a = z3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f14150a ? iSignum * (-1) : iSignum;
    }
}
