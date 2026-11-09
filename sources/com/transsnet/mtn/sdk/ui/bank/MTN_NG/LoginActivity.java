package com.transsnet.mtn.sdk.ui.bank.MTN_NG;

import ch.d;
import com.transsnet.adsdk.b;
import com.transsnet.mtn.sdk.ui.view.InputView;
import p073f.a;
import p073f.c;

/* JADX INFO: loaded from: classes3.dex */
public class LoginActivity extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f25690j = 0;

    @Override // eh.a
    public final void e() {
        getIntent().putExtra("LOGIN_MODEL", 3);
        this.f19042g = getIntent().getIntExtra("LOGIN_MODEL", 1);
    }

    @Override // ch.e
    public final a j() {
        return a.f36324e;
    }

    @Override // ch.d
    public final void m() {
        ch.a aVar = (ch.a) this.f19043i;
        aVar.f19030b.setHint(getString(p349x8.d.mtn_str_hint_phone_number));
        aVar.f19029a.setVisibility(8);
        aVar.f19030b.setInputType(7);
        aVar.f19032d.setOnFDSClickListener(new b(19, this, aVar));
        InputView inputView = aVar.f19030b;
        String str = c.a().f36338f;
        if (str == null) {
            str = "";
        }
        inputView.setText(str);
    }
}
