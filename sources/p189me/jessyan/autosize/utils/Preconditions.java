package p189me.jessyan.autosize.utils;

import android.os.Looper;
import com.airbnb.lottie.model.layer.d;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    private static String badElementIndex(int i7, int i10, String str) {
        if (i7 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.g(26, i10, "negative size: "));
    }

    private static String badPositionIndex(int i7, int i10, String str) {
        if (i7 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.g(26, i10, "negative size: "));
    }

    private static String badPositionIndexes(int i7, int i10, int i11) {
        if (i7 < 0 || i7 > i11) {
            return badPositionIndex(i7, i11, "start index");
        }
        return (i10 < 0 || i10 > i11) ? badPositionIndex(i10, i11, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
    }

    public static void checkArgument(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i7, int i10) {
        return checkElementIndex(i7, i10, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static int checkPositionIndex(int i7, int i10) {
        return checkPositionIndex(i7, i10, FirebaseAnalytics.Param.INDEX);
    }

    public static void checkPositionIndexes(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i7, i10, i11));
        }
    }

    public static void checkState(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static String format(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i7 = 0;
        int i10 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i10)) != -1) {
            sb2.append(strValueOf.substring(i10, iIndexOf));
            sb2.append(objArr[i7]);
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append(strValueOf.substring(i10));
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i11 = i7 + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void checkArgument(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i7, int i10, String str) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(badElementIndex(i7, i10, str));
        }
        return i7;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(badPositionIndex(i7, i10, str));
        }
        return i7;
    }

    public static void checkState(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z3, String str, Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z3, String str, Object... objArr) {
        if (!z3) {
            throw new IllegalStateException(format(str, objArr));
        }
    }
}
