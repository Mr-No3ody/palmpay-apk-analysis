package p284sb;

import Pa.i0;
import android.view.View;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;

/* JADX INFO: renamed from: sb.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC2018p implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParseInstalmentsQrcodeRsp.DataBean f42176a;

    public ViewOnClickListenerC2018p(ParseInstalmentsQrcodeRsp.DataBean dataBean) {
        this.f42176a = dataBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i0.b0(this.f42176a.url);
    }
}
