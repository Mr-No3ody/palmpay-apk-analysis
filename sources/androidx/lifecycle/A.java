package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f17323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17325c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f17326d;

    public A(B b7, Observer observer) {
        this.f17326d = b7;
        this.f17323a = observer;
    }

    public final void a(boolean z3) {
        if (z3 == this.f17324b) {
            return;
        }
        this.f17324b = z3;
        int i7 = z3 ? 1 : -1;
        B b7 = this.f17326d;
        int i10 = b7.f17330c;
        b7.f17330c = i7 + i10;
        if (!b7.f17331d) {
            b7.f17331d = true;
            while (true) {
                try {
                    int i11 = b7.f17330c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z8 = i10 == 0 && i11 > 0;
                    boolean z10 = i10 > 0 && i11 == 0;
                    if (z8) {
                        b7.g();
                    } else if (z10) {
                        b7.h();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    b7.f17331d = false;
                    throw th;
                }
            }
            b7.f17331d = false;
        }
        if (this.f17324b) {
            b7.c(this);
        }
    }

    public void b() {
    }

    public boolean c(LifecycleOwner lifecycleOwner) {
        return false;
    }

    public abstract boolean d();
}
