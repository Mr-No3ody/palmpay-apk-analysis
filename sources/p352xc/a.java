package p352xc;

import Bc.k;
import android.view.View;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import p236pc.d;
import p295tc.f;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReferEarnHomePageActivity f43836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f43837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f43838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f43839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43840e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = d.jp_iv_expand;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            f fVar = this.f43839d;
            if (fVar == null || !fVar.f42562c) {
                if (fVar != null) {
                    fVar.f42562c = true;
                    fVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
            ReferEarnHomePageActivity referEarnHomePageActivity = this.f43836a;
            int i10 = referEarnHomePageActivity.f31896r0 + 1;
            referEarnHomePageActivity.f31896r0 = i10;
            ((m) referEarnHomePageActivity.f27350a).queryReferEarnRecords(referEarnHomePageActivity.f31894p0, i10, referEarnHomePageActivity.f31895q0);
            k kVar = this.f43838c;
            if (kVar != null) {
                ((ImageTextView) kVar.f752f).setEnabled(false);
            }
        }
    }
}
