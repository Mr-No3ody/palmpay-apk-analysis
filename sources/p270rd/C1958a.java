package p270rd;

import Ka.b;
import android.content.Context;
import android.content.Intent;
import com.transsnet.palmpay.send_money.ui.activity.CashierTransferPreviewActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1958a extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f41717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f41718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41720n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1958a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41717k = context;
    }

    @Override // Ka.b
    public final Intent a() {
        Intent intent = new Intent(this.f41717k, (Class<?>) CashierTransferPreviewActivity.class);
        intent.putExtra("business_type", this.f41718l);
        intent.putExtra("quick_pay", this.f41719m);
        intent.putExtra("payee_account_type", this.f4976g);
        intent.putExtra("accountNo", this.f41720n);
        return intent;
    }
}
