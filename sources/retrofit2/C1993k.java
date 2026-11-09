package retrofit2;

import java.util.Objects;
import okhttp3.e0;

/* JADX INFO: renamed from: retrofit2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1993k extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient K f41934c;

    public C1993k(K k2) {
        Objects.requireNonNull(k2, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        e0 e0Var = k2.f41873a;
        sb2.append(e0Var.f40731d);
        sb2.append(" ");
        sb2.append(e0Var.f40730c);
        super(sb2.toString());
        this.f41932a = e0Var.f40731d;
        this.f41933b = e0Var.f40730c;
        this.f41934c = k2;
    }
}
