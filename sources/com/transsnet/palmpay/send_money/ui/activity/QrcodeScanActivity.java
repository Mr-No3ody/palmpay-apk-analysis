package com.transsnet.palmpay.send_money.ui.activity;

import F6.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/qrcode/scan")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/QrcodeScanActivity;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nQrcodeScanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeScanActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/QrcodeScanActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,79:1\n562#2,10:80\n*S KotlinDebug\n*F\n+ 1 QrcodeScanActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/QrcodeScanActivity\n*L\n52#1:80,10\n*E\n"})
public final class QrcodeScanActivity extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33185b = "COMMON";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f33186c = 0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_qrcode_scan_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            Uri data = intent.getData();
            String strDecode = null;
            if (data != null && !TextUtils.isEmpty("qr")) {
                String string = data.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                try {
                    String strSubstring = string.substring(StringsKt.E(string, "qr", 0, false, 6) + 3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    strDecode = URLDecoder.decode(strSubstring, "utf-8");
                } catch (Exception e10) {
                    d.c(this.TAG, "parseKey: ", e10);
                }
            }
            this.f33184a = strDecode;
            Integer num = this.f33186c;
            if (num != null && num.intValue() == 0) {
                this.f33186c = Integer.valueOf(intent.getIntExtra("SCAN_TRANS_TYPE", 0));
            }
        }
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 1, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
