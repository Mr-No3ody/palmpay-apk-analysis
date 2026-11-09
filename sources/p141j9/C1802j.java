package p141j9;

import Ka.b;
import android.content.Context;
import android.content.Intent;
import com.transsnet.palmpay.airtime.ui.CashierGroupPurchasePreviewActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1802j extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f38408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f38409l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38408k = context;
    }

    @Override // Ka.b
    public final Intent a() {
        Intent intent = new Intent(this.f38408k, (Class<?>) CashierGroupPurchasePreviewActivity.class);
        intent.putExtra("business_data", this.f38409l);
        return intent;
    }
}
