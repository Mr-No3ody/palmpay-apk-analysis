package N9;

import android.content.Context;
import android.content.Intent;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f6273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f6274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f6277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f6280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f6281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f6283n;

    public final void a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("TransactionID", this.f6270a);
        intent.putExtra("Payee", this.f6271b);
        intent.putExtra("PayeeNIF", this.f6272c);
        intent.putExtra(HttpHeaders.DATE, this.f6273d);
        intent.putExtra("TransactionAmount", this.f6274e);
        intent.putExtra("TransactionType", this.f6275f);
        intent.putExtra("PaymentMethod", this.f6276g);
        intent.putExtra("PayerName", this.f6277h);
        intent.putExtra("PayerNIF", this.f6278i);
        intent.putExtra("PayerAccountNumber", this.f6279j);
        intent.putExtra("CashbackUsed", this.f6280k);
        intent.putExtra("Fees", this.f6281l);
        intent.putExtra("Narration", this.f6282m);
        intent.putExtra("Status", this.f6283n);
        intent.addFlags(268435456);
        if (context != null) {
            intent.setClassName(context, "com.transsnet.palmpay.core.ui.activity.CoreReceiptPrintActivity");
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }
}
