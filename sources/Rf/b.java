package Rf;

import java.util.NoSuchElementException;
import kotlin.collections.C;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8614d;

    public b(int i7, int i10, int i11) {
        this.f8611a = i11;
        this.f8612b = i10;
        boolean z3 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z3 = true;
        }
        this.f8613c = z3;
        this.f8614d = z3 ? i7 : i10;
    }

    @Override // kotlin.collections.C
    public final int a() {
        int i7 = this.f8614d;
        if (i7 != this.f8612b) {
            this.f8614d = this.f8611a + i7;
            return i7;
        }
        if (!this.f8613c) {
            throw new NoSuchElementException();
        }
        this.f8613c = false;
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8613c;
    }
}
