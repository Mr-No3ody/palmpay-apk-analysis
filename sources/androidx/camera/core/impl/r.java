package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14127a = new ArrayList();

    public r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0999q abstractC0999q = (AbstractC0999q) it.next();
            if (!(abstractC0999q instanceof C1002s)) {
                this.f14127a.add(abstractC0999q);
            }
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void a(int i7) {
        Iterator it = this.f14127a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).a(i7);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void b(int i7, CameraCaptureResult cameraCaptureResult) {
        Iterator it = this.f14127a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).b(i7, cameraCaptureResult);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void c(int i7, C1004t c1004t) {
        Iterator it = this.f14127a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).c(i7, c1004t);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void d(int i7, int i10) {
        Iterator it = this.f14127a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).d(i7, i10);
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void e(int i7) {
        Iterator it = this.f14127a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).e(i7);
        }
    }
}
