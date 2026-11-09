package androidx.databinding;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient h f16422a;

    @Override // androidx.databinding.Observable
    public final void addOnPropertyChangedCallback(d dVar) {
        synchronized (this) {
            try {
                if (this.f16422a == null) {
                    h hVar = new h();
                    hVar.f16425a = new ArrayList();
                    hVar.f16426b = 0L;
                    this.f16422a = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f16422a) {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    @Override // androidx.databinding.Observable
    public final void removeOnPropertyChangedCallback(d dVar) {
        synchronized (this) {
            try {
                h hVar = this.f16422a;
                if (hVar == null) {
                    return;
                }
                synchronized (hVar) {
                    hVar.f16425a.remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
