package com.transsnet.palmpay.managemoney.ui.activity;

import android.content.Intent;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectStateActivity f32185a;

    public S(SelectStateActivity selectStateActivity) {
        this.f32185a = selectStateActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = new Intent();
        SelectStateActivity selectStateActivity = this.f32185a;
        intent.putExtra("state_info", selectStateActivity.f32190f);
        Unit unit = Unit.f38893a;
        selectStateActivity.setResult(-1, intent);
        selectStateActivity.finish();
    }
}
