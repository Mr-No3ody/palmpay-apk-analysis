package K0;

import androidx.annotation.VisibleForTesting;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean containsSurroundingParenthesis(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            int i12 = i11 + 1;
            if (i11 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i10++;
            } else if (cCharAt == ')' && (i10 = i10 - 1) == 0 && i11 != str.length() - 1) {
                return false;
            }
            i7++;
            i11 = i12;
        }
        return i10 == 0;
    }

    @JvmStatic
    @VisibleForTesting
    public final boolean defaultValueEquals(@NotNull String current, @Nullable String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.c(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Intrinsics.c(StringsKt.V(strSubstring).toString(), str);
    }

    private a() {
    }
}
