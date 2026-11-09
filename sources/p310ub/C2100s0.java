package p310ub;

import L6.b;
import O6.c;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.credit.bean.resp.MTNLoginResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: ub.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100s0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2102t0 f42917f;

    public C2100s0(C2102t0 c2102t0) {
        this.f42917f = c2102t0;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        ((OcOneLoopActivity) this.f42917f.f42923a).addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((OcOneLoopActivity) this.f42917f.f42923a).f29617t0.b(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        MTNLoginResp mTNLoginResp = (MTNLoginResp) obj;
        C2102t0 c2102t0 = this.f42917f;
        ((OcOneLoopActivity) c2102t0.f42923a).f29617t0.b(false);
        OcOneLoopActivity ocOneLoopActivity = (OcOneLoopActivity) c2102t0.f42923a;
        if (!"oc_use_type_router".equals(ocOneLoopActivity.f29249C)) {
            if (mTNLoginResp.isSuccess()) {
                ocOneLoopActivity.finish();
                return;
            } else if (TextUtils.isEmpty(mTNLoginResp.data.statusMessage)) {
                C2106v0.a(ocOneLoopActivity.f29618u0, mTNLoginResp.getRespMsg());
                return;
            } else {
                C2106v0.a(ocOneLoopActivity.f29618u0, mTNLoginResp.data.statusMessage);
                return;
            }
        }
        if (mTNLoginResp.isSuccess()) {
            ocOneLoopActivity.r();
            return;
        }
        if (MTNLoginResp.DataBean.OTP_INCORRECT.equals(mTNLoginResp.getRespCode()) || "408".equals(mTNLoginResp.getRespCode())) {
            if (TextUtils.isEmpty(mTNLoginResp.data.statusMessage)) {
                C2106v0.a(ocOneLoopActivity.f29618u0, mTNLoginResp.getRespMsg());
                return;
            } else {
                C2106v0.a(ocOneLoopActivity.f29618u0, mTNLoginResp.data.statusMessage);
                return;
            }
        }
        ocOneLoopActivity.f29623z0 = mTNLoginResp.data;
        c cVar = new c(ocOneLoopActivity);
        cVar.e(g.cs_oc_skip_one_loop_dialog_title);
        cVar.b(g.cs_oc_skip_one_loop_dialog_content);
        cVar.f6605k = false;
        final int i7 = 0;
        cVar.f6604j = new View.OnClickListener(this) { // from class: ub.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2100s0 f42912b;

            {
                this.f42912b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        OcOneLoopActivity ocOneLoopActivity2 = (OcOneLoopActivity) this.f42912b.f42917f.f42923a;
                        C2106v0.a(ocOneLoopActivity2.f29618u0, ocOneLoopActivity2.getString(g.cs_oc_too_many_otp_requests));
                        break;
                    default:
                        C2102t0 c2102t1 = this.f42912b.f42917f;
                        ((OcOneLoopActivity) c2102t1.f42923a).x("SKIP");
                        ((OcOneLoopActivity) c2102t1.f42923a).r();
                        break;
                }
            }
        };
        String string = ocOneLoopActivity.getString(g.cs_oc_skip_this_step);
        final int i10 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: ub.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2100s0 f42912b;

            {
                this.f42912b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        OcOneLoopActivity ocOneLoopActivity2 = (OcOneLoopActivity) this.f42912b.f42917f.f42923a;
                        C2106v0.a(ocOneLoopActivity2.f29618u0, ocOneLoopActivity2.getString(g.cs_oc_too_many_otp_requests));
                        break;
                    default:
                        C2102t0 c2102t1 = this.f42912b.f42917f;
                        ((OcOneLoopActivity) c2102t1.f42923a).x("SKIP");
                        ((OcOneLoopActivity) c2102t1.f42923a).r();
                        break;
                }
            }
        };
        cVar.f6600f = string;
        cVar.f6602h = onClickListener;
        cVar.a().show();
        ocOneLoopActivity.f29617t0.setText(ocOneLoopActivity.getString(g.cs_oc_skip_this_step));
        ocOneLoopActivity.f29614q0.setVisibility(8);
        OcOneLoopActivity ocOneLoopActivity2 = ocOneLoopActivity.f29618u0.f42934a;
        ocOneLoopActivity2.f29615r0.setBackgroundColor(ocOneLoopActivity2.getColor(b.ppColorTextPrimary));
        ocOneLoopActivity2.f29616s0.setVisibility(8);
    }
}
