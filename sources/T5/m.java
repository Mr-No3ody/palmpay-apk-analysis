package T5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z5.b f9014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z5.b f9015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z5.b f9016c;

    public m(Z5.b bVar, Z5.b bVar2, Z5.b bVar3) {
        if (bVar == null) {
            throw new IllegalArgumentException("The prime factor must not be null");
        }
        this.f9014a = bVar;
        if (bVar2 == null) {
            throw new IllegalArgumentException("The factor CRT exponent must not be null");
        }
        this.f9015b = bVar2;
        if (bVar3 == null) {
            throw new IllegalArgumentException("The factor CRT coefficient must not be null");
        }
        this.f9016c = bVar3;
    }
}
