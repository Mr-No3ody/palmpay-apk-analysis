package com.transsnet.mtn.sdk.ui;

import C0.G;
import android.R;
import android.view.Window;
import android.view.WindowManager;
import com.transsnet.mtn.sdk.http.resp.GetConfigInfoResp;
import eh.a;
import java.util.concurrent.ExecutorService;
import p1.c;
import p314uf.e;
import p349x8.b;

/* JADX INFO: loaded from: classes3.dex */
public class GateActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25687b = 0;

    @Override // eh.a
    public final void f() {
        Window window = getWindow();
        window.setBackgroundDrawableResource(R.color.transparent);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = p118hf.a.a(86.0f);
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    @Override // eh.a
    public final int g() {
        getWindow().setDimAmount(0.0f);
        return b.mtn_gate_page_layout;
    }

    @Override // eh.a
    public final void h() {
        p240pg.a aVar = new p240pg.a(this);
        p314uf.b bVar = new p314uf.b(GetConfigInfoResp.class, G.r(new StringBuilder(), p002a.a.f11813b, "/api/v1/openBanking/getConfigInfo"));
        ExecutorService executorService = p314uf.a.f42993a;
        e eVar = new e(new androidx.camera.core.impl.utils.executor.b(bVar, 2), new c(aVar, 11));
        bVar.f11185A = eVar;
        p314uf.a.f42993a.execute(eVar);
    }

    @Override // eh.a
    public final void i() {
    }
}
