package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Verify {
    private Verify() {
    }

    public static void verify(boolean z3) {
        if (!z3) {
            throw new VerifyException();
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t) {
        return (T) verifyNotNull(t, "expected a non-null reference", new Object[0]);
    }

    public static void verify(boolean z3, String str, @CheckForNull Object... objArr) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, objArr));
        }
    }

    @CanIgnoreReturnValue
    public static <T> T verifyNotNull(@CheckForNull T t, String str, @CheckForNull Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new VerifyException(Strings.lenientFormat(str, objArr));
    }

    public static void verify(boolean z3, String str, char c6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c6)));
        }
    }

    public static void verify(boolean z3, String str, int i7) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i7)));
        }
    }

    public static void verify(boolean z3, String str, long j6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j6)));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj));
        }
    }

    public static void verify(boolean z3, String str, char c6, char c10) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c6), Character.valueOf(c10)));
        }
    }

    public static void verify(boolean z3, String str, int i7, char c6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i7), Character.valueOf(c6)));
        }
    }

    public static void verify(boolean z3, String str, long j6, char c6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j6), Character.valueOf(c6)));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, char c6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Character.valueOf(c6)));
        }
    }

    public static void verify(boolean z3, String str, char c6, int i7) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c6), Integer.valueOf(i7)));
        }
    }

    public static void verify(boolean z3, String str, int i7, int i10) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i7), Integer.valueOf(i10)));
        }
    }

    public static void verify(boolean z3, String str, long j6, int i7) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j6), Integer.valueOf(i7)));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, int i7) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Integer.valueOf(i7)));
        }
    }

    public static void verify(boolean z3, String str, char c6, long j6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c6), Long.valueOf(j6)));
        }
    }

    public static void verify(boolean z3, String str, int i7, long j6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i7), Long.valueOf(j6)));
        }
    }

    public static void verify(boolean z3, String str, long j6, long j10) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j6), Long.valueOf(j10)));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, long j6) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, Long.valueOf(j6)));
        }
    }

    public static void verify(boolean z3, String str, char c6, @CheckForNull Object obj) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Character.valueOf(c6), obj));
        }
    }

    public static void verify(boolean z3, String str, int i7, @CheckForNull Object obj) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Integer.valueOf(i7), obj));
        }
    }

    public static void verify(boolean z3, String str, long j6, @CheckForNull Object obj) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, Long.valueOf(j6), obj));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void verify(boolean z3, String str, @CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3, @CheckForNull Object obj4) {
        if (!z3) {
            throw new VerifyException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
