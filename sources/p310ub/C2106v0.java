package p310ub;

import android.graphics.Color;
import com.transsnet.palmpay.credit.bean.resp.QueryOneLoopInfoNetworkItem;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;

/* JADX INFO: renamed from: ub.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106v0 implements OnOperatorItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcOneLoopActivity f42934a;

    public C2106v0(OcOneLoopActivity ocOneLoopActivity) {
        this.f42934a = ocOneLoopActivity;
    }

    public static void a(C2106v0 c2106v0, String str) {
        OcOneLoopActivity ocOneLoopActivity = c2106v0.f42934a;
        ocOneLoopActivity.f29615r0.setBackgroundColor(Color.parseColor("#EC2424"));
        ocOneLoopActivity.f29616s0.setVisibility(0);
        ocOneLoopActivity.f29616s0.setText(str);
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener
    public final void onOperatorItemClick(Object obj) {
        this.f42934a.f29608C0 = ((QueryOneLoopInfoNetworkItem) obj).getName();
    }
}
