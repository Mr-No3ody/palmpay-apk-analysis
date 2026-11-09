package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1866e f39013a = new C1866e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1867f f39014b;

    static {
        Intrinsics.checkNotNullParameter("  ", "groupSeparator");
        Intrinsics.checkNotNullParameter("", "byteSeparator");
        Intrinsics.checkNotNullParameter("", "bytePrefix");
        Intrinsics.checkNotNullParameter("", "byteSuffix");
        C1867f c1867f = new C1867f();
        if (!G.a("  ") && !G.a("") && !G.a("")) {
            G.a("");
        }
        f39014b = c1867f;
    }

    public final void a(String indent, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(indent, "indent");
        sb2.append(indent);
        sb2.append("bytesPerLine = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("bytesPerGroup = ");
        sb2.append(Integer.MAX_VALUE);
        sb2.append(",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("groupSeparator = \"");
        sb2.append("  ");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("byteSeparator = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(indent);
        sb2.append("bytePrefix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        androidx.camera.video.u.x(sb2, indent, "byteSuffix = \"", "", "\"");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BytesHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
