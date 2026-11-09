package D;

import Ae.n;
import E.AbstractC0198c;
import E.C0206k;
import androidx.camera.camera2.internal.C0936k;
import androidx.camera.camera2.internal.C0944o;
import androidx.camera.core.impl.utils.executor.i;
import androidx.camera.core.impl.utils.futures.j;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1570b;

    public /* synthetic */ a(d dVar, int i7) {
        this.f1569a = i7;
        this.f1570b = dVar;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(final k kVar) {
        switch (this.f1569a) {
            case 0:
                final d dVar = this.f1570b;
                dVar.getClass();
                final int i7 = 1;
                ((i) dVar.f1580d).execute(new Runnable() { // from class: D.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                d dVar2 = dVar;
                                dVar2.f1578b = true;
                                C0206k c0206k = new C0206k("Camera2CameraControl was updated with new options.");
                                k kVar2 = (k) dVar2.f1583g;
                                if (kVar2 != null) {
                                    kVar2.d(c0206k);
                                    dVar2.f1583g = null;
                                }
                                dVar2.f1583g = kVar;
                                if (dVar2.f1577a) {
                                    C0944o c0944o = (C0944o) dVar2.f1579c;
                                    c0944o.getClass();
                                    j.e(AbstractC0198c.y(new C0936k(c0944o, 0))).addListener(new n(dVar2, 8), (i) dVar2.f1580d);
                                    dVar2.f1578b = false;
                                }
                                break;
                            default:
                                d dVar3 = dVar;
                                dVar3.f1578b = true;
                                C0206k c0206k2 = new C0206k("Camera2CameraControl was updated with new options.");
                                k kVar3 = (k) dVar3.f1583g;
                                if (kVar3 != null) {
                                    kVar3.d(c0206k2);
                                    dVar3.f1583g = null;
                                }
                                dVar3.f1583g = kVar;
                                if (dVar3.f1577a) {
                                    C0944o c0944o2 = (C0944o) dVar3.f1579c;
                                    c0944o2.getClass();
                                    j.e(AbstractC0198c.y(new C0936k(c0944o2, 0))).addListener(new n(dVar3, 8), (i) dVar3.f1580d);
                                    dVar3.f1578b = false;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final d dVar2 = this.f1570b;
                dVar2.getClass();
                final int i10 = 0;
                ((i) dVar2.f1580d).execute(new Runnable() { // from class: D.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                d dVar3 = dVar2;
                                dVar3.f1578b = true;
                                C0206k c0206k = new C0206k("Camera2CameraControl was updated with new options.");
                                k kVar2 = (k) dVar3.f1583g;
                                if (kVar2 != null) {
                                    kVar2.d(c0206k);
                                    dVar3.f1583g = null;
                                }
                                dVar3.f1583g = kVar;
                                if (dVar3.f1577a) {
                                    C0944o c0944o = (C0944o) dVar3.f1579c;
                                    c0944o.getClass();
                                    j.e(AbstractC0198c.y(new C0936k(c0944o, 0))).addListener(new n(dVar3, 8), (i) dVar3.f1580d);
                                    dVar3.f1578b = false;
                                }
                                break;
                            default:
                                d dVar4 = dVar2;
                                dVar4.f1578b = true;
                                C0206k c0206k2 = new C0206k("Camera2CameraControl was updated with new options.");
                                k kVar3 = (k) dVar4.f1583g;
                                if (kVar3 != null) {
                                    kVar3.d(c0206k2);
                                    dVar4.f1583g = null;
                                }
                                dVar4.f1583g = kVar;
                                if (dVar4.f1577a) {
                                    C0944o c0944o2 = (C0944o) dVar4.f1579c;
                                    c0944o2.getClass();
                                    j.e(AbstractC0198c.y(new C0936k(c0944o2, 0))).addListener(new n(dVar4, 8), (i) dVar4.f1580d);
                                    dVar4.f1578b = false;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
