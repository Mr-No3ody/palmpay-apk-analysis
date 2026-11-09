package p307u8;

import com.transsnet.analysis.data.network.SignatureUtils;
import com.transsnet.analysis.utils.StringUtil;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f42717b;

    public /* synthetic */ d(Supplier supplier, int i7) {
        this.f42716a = i7;
        this.f42717b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f42716a) {
            case 0:
                ((c) this.f42717b).getClass();
                return SignatureUtils.lambda$getSignatureCache$0();
            default:
                ((c) this.f42717b).getClass();
                return StringUtil.lambda$getMD5Digest$0();
        }
    }
}
