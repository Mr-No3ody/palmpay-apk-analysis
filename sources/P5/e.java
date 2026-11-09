package P5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f6950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z5.b[] f6951b;

    public final Z5.b[] getParsedParts() {
        return this.f6951b;
    }

    public final String getParsedString() {
        if (this.f6951b == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Z5.b bVar : this.f6951b) {
            if (sb2.length() > 0) {
                sb2.append('.');
            }
            if (bVar != null) {
                sb2.append(bVar);
            }
        }
        return sb2.toString();
    }
}
