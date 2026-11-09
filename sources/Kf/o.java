package Kf;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public class o extends n {
    public static boolean e(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f38945b;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        i iVar = new i(new k(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z3 = true;
            while (iVar.hasNext()) {
                File file = (File) iVar.next();
                if (file.delete() || !file.exists()) {
                    if (z3) {
                    }
                }
                z3 = false;
            }
            return z3;
        }
    }

    public static String f(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.Q(name, "");
    }
}
