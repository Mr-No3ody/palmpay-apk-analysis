package com.transsnet.palmpay.managemoney.ui.view;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f32712b;

    public /* synthetic */ b(d dVar, int i7) {
        this.f32711a = i7;
        this.f32712b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.f32712b;
        switch (this.f32711a) {
            case 0:
                int i7 = PlanInfoItem.f32704e;
                dVar.f32721h.invoke();
                break;
            case 1:
                int i10 = PlanInfoItem.f32704e;
                dVar.f32721h.invoke();
                break;
            case 2:
                int i11 = PlanInfoItem.f32704e;
                dVar.f32719f.invoke();
                break;
            case 3:
                int i12 = PlanInfoItem.f32704e;
                dVar.f32719f.invoke();
                break;
            case 4:
                int i13 = PlanInfoItem.f32704e;
                dVar.f32721h.invoke();
                break;
            default:
                int i14 = PlanInfoItem.f32704e;
                dVar.f32721h.invoke();
                break;
        }
    }
}
