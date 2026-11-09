package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class r {
    public static void a(StringBuilder sb2, Object obj, Function1 function1) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (function1 != null) {
            sb2.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }
}
