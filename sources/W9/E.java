package W9;

import android.view.View;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f10605c;

    public /* synthetic */ E(G g7, int i7, int i10) {
        this.f10603a = i10;
        this.f10605c = g7;
        this.f10604b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10603a) {
            case 0:
                G g7 = this.f10605c;
                C2085k0 c2085k0 = g7.f10614d;
                if (c2085k0 != null) {
                    c2085k0.onItemViewOnClick((RequestContact) g7.f10613c.get(this.f10604b));
                }
                break;
            default:
                G g10 = this.f10605c;
                C2085k0 c2085k1 = g10.f10614d;
                if (c2085k1 != null) {
                    c2085k1.onDeleteViewOnClick((RequestContact) g10.f10613c.get(this.f10604b));
                }
                break;
        }
    }
}
