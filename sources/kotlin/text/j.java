package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1868g f39018d = new C1868g(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f39019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f39020f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1867f f39022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f39023c;

    static {
        C1866e c1866e = C1867f.f39013a;
        C1867f default$kotlin_stdlib = c1866e.getDefault$kotlin_stdlib();
        h hVar = i.f39015b;
        f39019e = new j(false, default$kotlin_stdlib, hVar.getDefault$kotlin_stdlib());
        f39020f = new j(true, c1866e.getDefault$kotlin_stdlib(), hVar.getDefault$kotlin_stdlib());
    }

    public j(boolean z3, C1867f bytes, i number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f39021a = z3;
        this.f39022b = bytes;
        this.f39023c = number;
    }

    public final String toString() {
        StringBuilder sbS = androidx.camera.video.u.s("HexFormat(\n    upperCase = ");
        sbS.append(this.f39021a);
        sbS.append(",\n    bytes = BytesHexFormat(\n");
        this.f39022b.a("        ", sbS);
        sbS.append('\n');
        sbS.append("    ),");
        sbS.append('\n');
        sbS.append("    number = NumberHexFormat(");
        sbS.append('\n');
        this.f39023c.a("        ", sbS);
        sbS.append('\n');
        sbS.append("    )");
        sbS.append('\n');
        sbS.append(")");
        return sbS.toString();
    }
}
