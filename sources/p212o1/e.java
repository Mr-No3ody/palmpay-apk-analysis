package p212o1;

import androidx.camera.video.u;
import com.airbnb.lottie.model.KeyPathElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f40008c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public KeyPathElement f40010b;

    public e(String... strArr) {
        this.f40009a = Arrays.asList(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007e A[RETURN] */
    public final boolean a(int i7, String str) {
        List list = this.f40009a;
        if (i7 < list.size()) {
            boolean z3 = i7 == list.size() - 1;
            String str2 = (String) list.get(i7);
            if (!str2.equals("**")) {
                boolean z8 = str2.equals(str) || str2.equals("*");
                if ((z3 || (i7 == list.size() - 2 && ((String) u.e(1, list)).equals("**"))) && z8) {
                    return true;
                }
            } else {
                if (z3 || !((String) list.get(i7 + 1)).equals(str)) {
                    if (!z3) {
                        int i10 = i7 + 1;
                        if (i10 >= list.size() - 1) {
                            return ((String) list.get(i10)).equals(str);
                        }
                    }
                    return true;
                }
                if (i7 == list.size() - 2 || (i7 == list.size() - 3 && ((String) u.e(1, list)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i7, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f40009a;
        if (((String) list.get(i7)).equals("**")) {
            return (i7 != list.size() - 1 && ((String) list.get(i7 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i7, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f40009a;
        if (i7 >= list.size()) {
            return false;
        }
        return ((String) list.get(i7)).equals(str) || ((String) list.get(i7)).equals("**") || ((String) list.get(i7)).equals("*");
    }

    public final boolean d(int i7, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f40009a;
        return i7 < list.size() - 1 || ((String) list.get(i7)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f40009a.equals(eVar.f40009a)) {
                return false;
            }
            KeyPathElement keyPathElement = this.f40010b;
            KeyPathElement keyPathElement2 = eVar.f40010b;
            if (keyPathElement != null) {
                return keyPathElement.equals(keyPathElement2);
            }
            if (keyPathElement2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f40009a.hashCode() * 31;
        KeyPathElement keyPathElement = this.f40010b;
        return iHashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f40009a);
        sb2.append(",resolved=");
        sb2.append(this.f40010b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f40009a = new ArrayList(eVar.f40009a);
        this.f40010b = eVar.f40010b;
    }
}
