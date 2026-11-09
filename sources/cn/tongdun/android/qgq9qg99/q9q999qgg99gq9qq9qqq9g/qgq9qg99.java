package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import C0.G;
import N8.q0;
import com.alibaba.android.arouter.utils.Consts;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qgq9qg99 extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public qgq9qg99(String str, String[] strArr, String[] strArr2) {
        StringBuilder sbQ = q0.q("Could not find '", str, "'. Looked for: ");
        sbQ.append(Arrays.toString(strArr));
        sbQ.append(", but only found: ");
        super(G.r(sbQ, Arrays.toString(strArr2), Consts.DOT));
    }
}
