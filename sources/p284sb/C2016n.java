package p284sb;

import C0.G;
import F6.d;
import V9.C0714c;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.bean.req.UploadMonoTokenReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import kotlin.jvm.internal.Intrinsics;
import mono.connect.kit.ConnectCloseCallback;
import mono.connect.kit.ConnectSuccessCallback;
import p221ob.c;
import p273rg.b;
import p298tf.f;

/* JADX INFO: renamed from: sb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2016n implements ConnectSuccessCallback, ConnectCloseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MonoConnectActivity f42174a;

    @Override // mono.connect.kit.ConnectSuccessCallback
    public void run(b code) {
        int i7 = MonoConnectActivity.f28694q0;
        Intrinsics.checkNotNullParameter(code, "code");
        d.c("MONOSDK", G.o("Successfully linked account. Code: ", code.f41983a));
        String str = code.f41983a;
        Intrinsics.checkNotNullExpressionValue(str, "getCode(...)");
        MonoConnectActivity monoConnectActivity = this.f42174a;
        monoConnectActivity.showLoadingDialog(true);
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        UploadMonoTokenReq uploadMonoTokenReq = new UploadMonoTokenReq(null, null, null, null, null, 31, null);
        uploadMonoTokenReq.setApplicationSource("2");
        uploadMonoTokenReq.setCode(str);
        uploadMonoTokenReq.setMemberId(BaseApplication.get().getUser().getMemberId());
        OcApplyData ocApplyData = monoConnectActivity.f29248B;
        uploadMonoTokenReq.setApplyId(ocApplyData != null ? ocApplyData.getApplyId() : null);
        uploadMonoTokenReq.setScene(monoConnectActivity.f28698p0);
        iApiCreditServiceH.uploadMonoToken(uploadMonoTokenReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(monoConnectActivity, 24));
        Intrinsics.checkNotNullExpressionValue(str, "getCode(...)");
        monoConnectActivity.f28697k0 = str;
    }

    @Override // mono.connect.kit.ConnectCloseCallback
    public void run() {
        int i7 = MonoConnectActivity.f28694q0;
        d.c("MONOSDK", "Widget closed.");
        this.f42174a.finish();
    }
}
