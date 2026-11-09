package okhttp3;

import java.util.Arrays;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class E {
    public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkName(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(Dg.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkValue(String str, String str2) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Dg.c.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i7), str2));
                sb2.append(Dg.c.q(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String get(String[] strArr, String str) {
        int length = strArr.length - 2;
        int iA = Hf.c.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!kotlin.text.y.h(str, strArr[length], true)) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
    @JvmName(name = "-deprecated_of")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
    public final F m129deprecated_of(@NotNull String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public final F of(@NotNull String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i10] = StringsKt.V(str).toString();
        }
        int iA = Hf.c.a(0, strArr.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str2 = strArr[i7];
                String str3 = strArr[i7 + 1];
                checkName(str2);
                checkValue(str3, str2);
                if (i7 == iA) {
                    break;
                }
                i7 += 2;
            }
        }
        return new F(strArr);
    }

    private E() {
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
    @JvmName(name = "-deprecated_of")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
    public final F m128deprecated_of(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return of(headers);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    public final F of(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i7 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = StringsKt.V(key).toString();
            String string2 = StringsKt.V(value).toString();
            checkName(string);
            checkValue(string2, string);
            strArr[i7] = string;
            strArr[i7 + 1] = string2;
            i7 += 2;
        }
        return new F(strArr);
    }
}
