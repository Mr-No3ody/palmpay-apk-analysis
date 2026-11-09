package G6;

import C0.G;
import android.text.TextUtils;
import com.growingio.android.sdk.track.middleware.IEventNetSender;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import java.util.ArrayList;
import p198n5.h;
import p216o5.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements IEventNetSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3026c;

    public b(int i7) {
        this.f3024a = i7;
        switch (i7) {
            case 2:
                com.growingio.android.sdk.a aVar = (com.growingio.android.sdk.a) p279s5.d.b().f42025b;
                this.f3025b = aVar.f23183a;
                this.f3026c = aVar.f23191j;
                break;
        }
    }

    @Override // com.growingio.android.sdk.track.middleware.IEventNetSender
    public e send(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return new e(0L, false);
        }
        if (com.growingio.android.sdk.d.a().f23197a.a(p138j5.c.class) == null) {
            h.c("EventHttpSender", "please register http request component first", new Object[0]);
            return new e(0L, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        p138j5.c cVar = new p138j5.c(this.f3026c);
        ArrayList arrayList = cVar.f38326c;
        arrayList.add(TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW);
        arrayList.add("projects");
        arrayList.add(this.f3025b);
        arrayList.add(CoinRewardDialog.TYPE_URL_COLLECT);
        cVar.f38327d.put("stm", String.valueOf(jCurrentTimeMillis));
        cVar.f38328e = bArr;
        if (!TextUtils.isEmpty(str)) {
            cVar.f38329f = str;
        }
        com.growingio.android.sdk.d dVarA = com.growingio.android.sdk.d.a();
        p138j5.a aVar = new p138j5.a(cVar);
        ModelLoader modelLoaderA = dVarA.f23197a.a(p138j5.a.class);
        p138j5.a aVar2 = (p138j5.a) (modelLoaderA != null ? modelLoaderA.buildLoadData(aVar).f41455a.executeData() : null);
        if (aVar2 != null) {
            cVar = aVar2.f38321a;
        }
        byte[] bArr2 = cVar.f38328e;
        p247q5.a aVarBuildLoadData = com.growingio.android.sdk.d.a().f23197a.a(p138j5.c.class).buildLoadData(cVar);
        if (!aVarBuildLoadData.f41455a.getDataClass().isAssignableFrom(p138j5.b.class)) {
            h.b("EventHttpSender", new IllegalArgumentException("illegal data class for http response."));
            return new e(0L, false);
        }
        p138j5.b bVar = (p138j5.b) aVarBuildLoadData.f41455a.executeData();
        boolean z3 = bVar != null && bVar.f38322a;
        if (z3) {
            h.a("EventHttpSender", "Send events successfully", new Object[0]);
        } else {
            h.a("EventHttpSender", "Send events failed, response = " + bVar, new Object[0]);
        }
        return new e(bArr2 != null ? bArr2.length : 0L, z3);
    }

    public String toString() {
        switch (this.f3024a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("RomInfo{name=");
                sb2.append(this.f3025b);
                sb2.append(", version=");
                return G.r(sb2, this.f3026c, "}");
            case 1:
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f3025b);
                sb3.append("(");
                return G.r(sb3, this.f3026c, ")");
            default:
                return super.toString();
        }
    }

    public b(String str, String str2) {
        this.f3024a = 1;
        this.f3025b = str;
        this.f3026c = str2;
    }
}
