package Jb;

import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferByLoanOpenParams f4700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4704e;

    public G(TransferByLoanOpenParams params, String cardNo, List plans, int i7, boolean z3) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(cardNo, "cardNo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f4700a = params;
        this.f4701b = cardNo;
        this.f4702c = plans;
        this.f4703d = i7;
        this.f4704e = z3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static G a(G g7, int i7, boolean z3, int i10) {
        TransferByLoanOpenParams params = g7.f4700a;
        ?? plans = g7.f4702c;
        if ((i10 & 8) != 0) {
            i7 = g7.f4703d;
        }
        int i11 = i7;
        if ((i10 & 16) != 0) {
            z3 = g7.f4704e;
        }
        Intrinsics.checkNotNullParameter(params, "params");
        String cardNo = g7.f4701b;
        Intrinsics.checkNotNullParameter(cardNo, "cardNo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        return new G(params, cardNo, plans, i11, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return this.f4700a.equals(g7.f4700a) && Intrinsics.c(this.f4701b, g7.f4701b) && this.f4702c.equals(g7.f4702c) && this.f4703d == g7.f4703d && this.f4704e == g7.f4704e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4704e) + androidx.camera.video.u.b(this.f4703d, (this.f4702c.hashCode() + C0.G.c(this.f4700a.hashCode() * 31, 31, this.f4701b)) * 31, 31);
    }

    public final String toString() {
        return "Content(params=" + this.f4700a + ", cardNo=" + this.f4701b + ", plans=" + this.f4702c + ", selectedIndex=" + this.f4703d + ", agreed=" + this.f4704e + ")";
    }
}
