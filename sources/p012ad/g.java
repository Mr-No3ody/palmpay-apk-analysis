package p012ad;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f11898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11899b;

    public g(Bitmap bitmap, int i7) {
        this.f11898a = bitmap;
        this.f11899b = i7 % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
    }
}
