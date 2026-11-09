package M;

import androidx.camera.camera2.internal.F;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f5691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5692b;

    public m(int i7) {
        this.f5691a = i7 == 0 ? i.f5683a : new float[i7];
    }

    public static String c(m mVar, int i7) {
        String prefix = (i7 & 2) != 0 ? "" : "[";
        String postfix = (i7 & 4) == 0 ? "]" : "";
        mVar.getClass();
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) prefix);
        float[] fArr = mVar.f5691a;
        int i10 = mVar.f5692b;
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(f10);
        }
        sb2.append((CharSequence) postfix);
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final void a(float f10) {
        int i7 = this.f5692b + 1;
        float[] fArr = this.f5691a;
        if (fArr.length < i7) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i7, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.f5691a = fArrCopyOf;
        }
        float[] fArr2 = this.f5691a;
        int i10 = this.f5692b;
        fArr2[i10] = f10;
        this.f5692b = i10 + 1;
    }

    public final float b(int i7) {
        if (i7 >= 0 && i7 < this.f5692b) {
            return this.f5691a[i7];
        }
        StringBuilder sbE = F.e(i7, "Index ", " must be in 0..");
        sbE.append(this.f5692b - 1);
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            int i7 = mVar.f5692b;
            int i10 = this.f5692b;
            if (i7 == i10) {
                float[] fArr = this.f5691a;
                float[] fArr2 = mVar.f5691a;
                IntRange intRangeF = kotlin.ranges.b.f(0, i10);
                int i11 = intRangeF.f38977a;
                int i12 = intRangeF.f38978b;
                if (i11 > i12) {
                    return true;
                }
                while (fArr[i11] == fArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f5691a;
        int i7 = this.f5692b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            iHashCode += Float.hashCode(fArr[i10]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        return c(this, 25);
    }
}
