package p355xf;

import Hf.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2126e {
    public static void a(Throwable th, Throwable exception) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (th != exception) {
            c.f3924a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
