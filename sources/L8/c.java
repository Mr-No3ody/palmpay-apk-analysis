package L8;

import android.graphics.Color;
import android.text.TextUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f5562c;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        Color.parseColor("#FFF44E4E");
        c cVar = new c("WEAK", 0);
        Color.parseColor("#FFF5A623");
        c cVar2 = new c("MEDIUM", 1);
        Color.parseColor("#FF23D184");
        c cVar3 = new c("STRONG", 2);
        Color.parseColor("#FF23D184");
        f5562c = new c[]{cVar, cVar2, cVar3, new c("VERY_STRONG", 3)};
        f5560a = 4;
        f5561b = 6;
    }

    public static int a(int i7, String str, boolean z3) {
        int i10 = 0;
        char c6 = 0;
        int i11 = 1;
        int i12 = 1;
        while (i10 < str.length()) {
            int i13 = i10 + 1;
            char cCharAt = str.substring(i10, i13).charAt(0);
            if (i10 == 0) {
                c6 = cCharAt;
            }
            if (!z3 ? cCharAt - i7 == c6 : cCharAt + i7 == c6) {
                if (i11 <= i12) {
                    i11 = i12;
                }
                i12 = i11;
                i11 = 1;
            } else {
                i11++;
            }
            i10 = i13;
            c6 = cCharAt;
        }
        return i11 > i12 ? i11 : i12;
    }

    public static int b(String str) {
        int i7 = 0;
        int i10 = 0;
        while (i7 < str.length()) {
            int i11 = i7 + 1;
            String strSubstring = str.substring(i7, i11);
            int i12 = 0;
            int i13 = 0;
            while (i12 < str.length()) {
                int i14 = i12 + 1;
                if (strSubstring.equals(str.substring(i12, i14))) {
                    i13++;
                }
                i12 = i14;
            }
            if (i13 > i10) {
                i10 = i13;
            }
            i7 = i11;
        }
        return i10;
    }

    public static int c(String str) {
        int length;
        int i7;
        if (TextUtils.isEmpty(str) || (length = str.length()) < f5560a) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            i7 = 0;
        } else {
            char[] charArray = str.toCharArray();
            char[] cArr = new char[charArray.length];
            cArr[0] = charArray[0];
            i7 = 1;
            for (int i10 = 1; i10 < charArray.length; i10++) {
                char c6 = charArray[i10];
                int i11 = 0;
                while (true) {
                    if (i11 >= i7) {
                        cArr[i7] = c6;
                        i7++;
                        break;
                    }
                    if (c6 == cArr[i11]) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (i7 <= str.length() / 2) {
            return 0;
        }
        int iB = b(str);
        int iMax = Math.max(Math.max(a(1, str, false), a(1, str, true)), Math.max(a(2, str, false), a(2, str, true)));
        if (iMax >= length) {
            return 0;
        }
        int i12 = length - 1;
        if (iMax >= i12) {
            return 1;
        }
        int i13 = iB < length ? (iB < i12 && iB == 1) ? 2 : 1 : 0;
        if (iB == 1 && iMax == 1) {
            return 3;
        }
        return i13;
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && Math.max(a(1, str, false), a(1, str, true)) == str.length();
    }

    public static boolean e(String str) {
        return !TextUtils.isEmpty(str) && b(str) == str.length();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5562c.clone();
    }
}
