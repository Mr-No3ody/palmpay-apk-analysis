package p307u8;

import com.transsnet.analysis.data.network.SignatureUtils;
import com.transsnet.analysis.utils.StringUtil;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42715a;

    public /* synthetic */ c(int i7) {
        this.f42715a = i7;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f42715a) {
            case 0:
                return SignatureUtils.lambda$getSignatureCache$0();
            default:
                return StringUtil.lambda$getMD5Digest$0();
        }
    }
}
