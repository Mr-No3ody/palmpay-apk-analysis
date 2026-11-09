package com.google.common.base;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i7, int i10, String str) {
        if (i7 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.g(26, i10, "negative size: "));
    }

    private static String badPositionIndex(int i7, int i10, String str) {
        if (i7 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.g(26, i10, "negative size: "));
    }

    private static String badPositionIndexes(int i7, int i10, int i11) {
        if (i7 < 0 || i7 > i11) {
            return badPositionIndex(i7, i11, "start index");
        }
        return (i10 < 0 || i10 > i11) ? badPositionIndex(i10, i11, "end index") : Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
    }

    public static void checkArgument(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i7, int i10) {
        return checkElementIndex(i7, i10, FirebaseAnalytics.Param.INDEX);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t) {
        t.getClass();
        return t;
    }

    @CanIgnoreReturnValue
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

    public static void checkArgument(boolean z3, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @CanIgnoreReturnValue
    public static int checkElementIndex(int i7, int i10, String str) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(badElementIndex(i7, i10, str));
        }
        return i7;
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int checkPositionIndex(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(badPositionIndex(i7, i10, str));
        }
        return i7;
    }

    public static void checkState(boolean z3, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object... objArr) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z3, @CheckForNull String str, @CheckForNull Object... objArr) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z3, String str, char c6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c6)));
    }

    public static void checkState(boolean z3, String str, char c6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c6)));
        }
    }

    public static void checkArgument(boolean z3, String str, int i7) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i7)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i7) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i7)));
    }

    public static void checkState(boolean z3, String str, int i7) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i7)));
        }
    }

    public static void checkArgument(boolean z3, String str, long j6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j6)));
    }

    public static void checkState(boolean z3, String str, long j6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j6)));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z3, String str, char c6, char c10) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c6), Character.valueOf(c10)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c6, char c10) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c6), Character.valueOf(c10)));
    }

    public static void checkState(boolean z3, String str, char c6, char c10) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c6), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z3, String str, char c6, int i7) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c6), Integer.valueOf(i7)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c6, int i7) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c6), Integer.valueOf(i7)));
    }

    public static void checkState(boolean z3, String str, char c6, int i7) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c6), Integer.valueOf(i7)));
        }
    }

    public static void checkArgument(boolean z3, String str, char c6, long j6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c6), Long.valueOf(j6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c6, long j6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c6), Long.valueOf(j6)));
    }

    public static void checkState(boolean z3, String str, char c6, long j6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c6), Long.valueOf(j6)));
        }
    }

    public static void checkArgument(boolean z3, String str, char c6, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c6), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, char c6, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c6), obj));
    }

    public static void checkState(boolean z3, String str, char c6, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c6), obj));
        }
    }

    public static void checkArgument(boolean z3, String str, int i7, char c6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i7), Character.valueOf(c6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i7, char c6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i7), Character.valueOf(c6)));
    }

    public static void checkState(boolean z3, String str, int i7, char c6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i7), Character.valueOf(c6)));
        }
    }

    public static void checkArgument(boolean z3, String str, int i7, int i10) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i7), Integer.valueOf(i10)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i7, int i10) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i7), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z3, String str, int i7, int i10) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i7), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z3, String str, int i7, long j6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i7), Long.valueOf(j6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i7, long j6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i7), Long.valueOf(j6)));
    }

    public static void checkState(boolean z3, String str, int i7, long j6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i7), Long.valueOf(j6)));
        }
    }

    public static void checkArgument(boolean z3, String str, int i7, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i7), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, int i7, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i7), obj));
    }

    public static void checkState(boolean z3, String str, int i7, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i7), obj));
        }
    }

    public static void checkArgument(boolean z3, String str, long j6, char c6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j6), Character.valueOf(c6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j6, char c6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j6), Character.valueOf(c6)));
    }

    public static void checkState(boolean z3, String str, long j6, char c6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j6), Character.valueOf(c6)));
        }
    }

    public static void checkArgument(boolean z3, String str, long j6, int i7) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j6), Integer.valueOf(i7)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j6, int i7) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j6), Integer.valueOf(i7)));
    }

    public static void checkState(boolean z3, String str, long j6, int i7) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j6), Integer.valueOf(i7)));
        }
    }

    public static void checkArgument(boolean z3, String str, long j6, long j10) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j6), Long.valueOf(j10)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j6, long j10) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j6), Long.valueOf(j10)));
    }

    public static void checkState(boolean z3, String str, long j6, long j10) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j6), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z3, String str, long j6, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j6), obj));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, long j6, @CheckForNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j6), obj));
    }

    public static void checkState(boolean z3, String str, long j6, @CheckForNull Object obj) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j6), obj));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, char c6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Character.valueOf(c6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, char c6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Character.valueOf(c6)));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, char c6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Character.valueOf(c6)));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, int i7) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Integer.valueOf(i7)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, int i7) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Integer.valueOf(i7)));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, int i7) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Integer.valueOf(i7)));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, long j6) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Long.valueOf(j6)));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, long j6) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Long.valueOf(j6)));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, long j6) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Long.valueOf(j6)));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z3) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(@CheckForNull T t, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z3) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
