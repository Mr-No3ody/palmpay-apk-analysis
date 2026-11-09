package com.transsnet.mtn.sdk.ui.bank._common;

import A8.b;
import android.view.View;
import android.widget.TextView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import eh.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LoginSuccessActivity extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MTNButton f25692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f25693c;

    public void close(View view) {
        if (Oe.a.f6828d == null) {
            Oe.a.f6828d = new Oe.a(23);
        }
        Oe.a aVar = Oe.a.f6828d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList((ArrayList) aVar.f6830b);
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            it.remove();
            aVar2.finish();
        }
    }

    @Override // eh.a
    public final void f() {
        this.f25692b = (MTNButton) findViewById(p349x8.a.mtn_continue_btn);
        this.f25693c = (TextView) findViewById(p349x8.a.mtn_close_btn);
        int i7 = 0;
        this.f25692b.setOnFDSClickListener(new A8.a(this, i7));
        this.f25693c.setOnClickListener(new b(this, i7));
    }

    @Override // eh.a
    public final int g() {
        return p349x8.b.mtn_login_success_activity_layout;
    }

    @Override // eh.a
    public final void h() {
    }

    @Override // eh.a
    public final void i() {
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
    }
}
