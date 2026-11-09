package p052da;

import M1.d;
import com.transsnet.palmpay.core.bean.verify.VerifySafetyAssessmentResultGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends d {
    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.get(i7) instanceof VerifySafetyAssessmentResultGroup ? 1 : 2;
    }
}
