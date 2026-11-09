package androidx.databinding;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f16425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f16427c;

    public final boolean a(int i7) {
        int i10;
        if (i7 < 64) {
            return ((1 << i7) & this.f16426b) != 0;
        }
        long[] jArr = this.f16427c;
        if (jArr != null && (i10 = (i7 / 64) - 1) < jArr.length) {
            return ((1 << (i7 % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    public final Object clone() {
        h hVar;
        CloneNotSupportedException e10;
        synchronized (this) {
            try {
                hVar = (h) super.clone();
                try {
                    hVar.f16426b = 0L;
                    hVar.f16427c = null;
                    hVar.f16425a = new ArrayList();
                    int size = this.f16425a.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (!a(i7)) {
                            hVar.f16425a.add(this.f16425a.get(i7));
                        }
                    }
                } catch (CloneNotSupportedException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                }
            } catch (CloneNotSupportedException e12) {
                hVar = null;
                e10 = e12;
            }
        }
        return hVar;
    }
}
