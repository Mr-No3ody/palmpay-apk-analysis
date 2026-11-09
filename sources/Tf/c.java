package Tf;

import E.AbstractC0198c;
import androidx.camera.camera2.internal.F;
import com.luck.picture.lib.config.FileSizeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f9078b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9080d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9081a;

    static {
        int i7 = d.f9082a;
        f9079c = AbstractC0198c.o(4611686018427387903L);
        f9080d = AbstractC0198c.o(-4611686018427387903L);
    }

    public /* synthetic */ c(long j6) {
        this.f9081a = j6;
    }

    public static final long a(long j6, long j10) {
        long j11 = FileSizeUnit.ACCURATE_MB;
        long j12 = j10 / j11;
        long j13 = j6 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return AbstractC0198c.o(kotlin.ranges.b.d(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC0198c.q((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb2, int i7, int i10, int i11, String str, boolean z3) {
        CharSequence charSequenceSubSequence;
        sb2.append(i7);
        if (i10 != 0) {
            sb2.append('.');
            String strValueOf = String.valueOf(i10);
            Intrinsics.checkNotNullParameter(strValueOf, "<this>");
            Intrinsics.checkNotNullParameter(strValueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(F.c(i11, "Desired length ", " is less than zero."));
            }
            if (i11 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i11);
                int length = i11 - strValueOf.length();
                int i12 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                sb3.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb3;
            }
            String string = charSequenceSubSequence.toString();
            int i13 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i13 = length2;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length2 = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z3 || i15 >= 3) {
                sb2.append((CharSequence) string, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) string, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static int c(long j6, long j10) {
        long j11 = j6 ^ j10;
        if (j11 >= 0 && (((int) j11) & 1) != 0) {
            int i7 = (((int) j6) & 1) - (((int) j10) & 1);
            return f(j6) ? -i7 : i7;
        }
        if (j6 < j10) {
            return -1;
        }
        return j6 == j10 ? 0 : 1;
    }

    public static final int d(long j6) {
        if (e(j6)) {
            return 0;
        }
        return (((int) j6) & 1) == 1 ? (int) (((j6 >> 1) % ((long) 1000)) * ((long) FileSizeUnit.ACCURATE_MB)) : (int) ((j6 >> 1) % ((long) FileSizeUnit.ACCURATE_GB));
    }

    public static final boolean e(long j6) {
        return j6 == f9079c || j6 == f9080d;
    }

    public static final boolean f(long j6) {
        return j6 < 0;
    }

    public static final long g(long j6, long j10) {
        if (e(j6)) {
            if (!e(j10) || (j10 ^ j6) >= 0) {
                return j6;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j10)) {
            return j10;
        }
        int i7 = ((int) j6) & 1;
        if (i7 != (((int) j10) & 1)) {
            return i7 == 1 ? a(j6 >> 1, j10 >> 1) : a(j10 >> 1, j6 >> 1);
        }
        long j11 = (j6 >> 1) + (j10 >> 1);
        if (i7 == 0) {
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? AbstractC0198c.o(j11 / ((long) FileSizeUnit.ACCURATE_MB)) : AbstractC0198c.q(j11);
        }
        return AbstractC0198c.p(j11);
    }

    public static final long h(long j6, e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 == f9079c) {
            return Long.MAX_VALUE;
        }
        if (j6 == f9080d) {
            return Long.MIN_VALUE;
        }
        return f.b(j6 >> 1, (((int) j6) & 1) == 0 ? e.NANOSECONDS : e.MILLISECONDS, unit);
    }

    public static final long i(long j6) {
        long j10 = ((-(j6 >> 1)) << 1) + ((long) (((int) j6) & 1));
        int i7 = d.f9082a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f9081a, ((c) obj).f9081a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f9081a == ((c) obj).f9081a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9081a);
    }

    public final String toString() {
        long jI = this.f9081a;
        if (jI == 0) {
            return "0s";
        }
        if (jI == f9079c) {
            return "Infinity";
        }
        if (jI == f9080d) {
            return "-Infinity";
        }
        boolean zF = f(jI);
        StringBuilder sb2 = new StringBuilder();
        if (zF) {
            sb2.append('-');
        }
        if (f(jI)) {
            jI = i(jI);
        }
        long jH = h(jI, e.DAYS);
        int i7 = 0;
        int iH = e(jI) ? 0 : (int) (h(jI, e.HOURS) % ((long) 24));
        int iH2 = e(jI) ? 0 : (int) (h(jI, e.MINUTES) % ((long) 60));
        int iH3 = e(jI) ? 0 : (int) (h(jI, e.SECONDS) % ((long) 60));
        int iD = d(jI);
        boolean z3 = jH != 0;
        boolean z8 = iH != 0;
        boolean z10 = iH2 != 0;
        boolean z11 = (iH3 == 0 && iD == 0) ? false : true;
        if (z3) {
            sb2.append(jH);
            sb2.append('d');
            i7 = 1;
        }
        if (z8 || (z3 && (z10 || z11))) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH);
            sb2.append('h');
            i7 = i10;
        }
        if (z10 || (z11 && (z8 || z3))) {
            int i11 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH2);
            sb2.append('m');
            i7 = i11;
        }
        if (z11) {
            int i12 = i7 + 1;
            if (i7 > 0) {
                sb2.append(' ');
            }
            if (iH3 != 0 || z3 || z8 || z10) {
                b(sb2, iH3, iD, 9, "s", false);
            } else if (iD >= 1000000) {
                b(sb2, iD / FileSizeUnit.ACCURATE_MB, iD % FileSizeUnit.ACCURATE_MB, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb2, iD / 1000, iD % 1000, 3, "us", false);
            } else {
                sb2.append(iD);
                sb2.append("ns");
            }
            i7 = i12;
        }
        if (zF && i7 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
