package kotlin.text;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER, xs = "kotlin/text/StringsKt")
public class StringsKt__StringNumberConversionsKt extends x {
    public static final void f(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(C0.G.l('\'', "Invalid number format: '", input));
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static Integer toIntOrNull(@NotNull String str) {
        boolean z3;
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (Intrinsics.h(cCharAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z3 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z3 = true;
            }
        } else {
            z3 = false;
            i7 = 0;
        }
        int i13 = -59652323;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i7++;
        }
        return z3 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
