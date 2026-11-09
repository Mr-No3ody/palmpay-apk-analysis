package com.transsnet.palmpay.core.ui.activity;

import android.content.Intent;
import android.view.View;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapsActivity f27735b;

    public /* synthetic */ Y(MapsActivity mapsActivity, int i7) {
        this.f27734a = i7;
        this.f27735b = mapsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CardView cardView;
        MapsActivity mapsActivity = this.f27735b;
        switch (this.f27734a) {
            case 0:
                Bc.i iVar = mapsActivity.f27671c;
                if (iVar != null && (cardView = (CardView) iVar.f730i) != null) {
                    p220oa.h.s(cardView, false);
                    break;
                }
                break;
            default:
                int i7 = MapsActivity.f27668e;
                Intent intent = new Intent();
                intent.putExtra("extra_data", mapsActivity.f27669a);
                mapsActivity.setResult(-1, intent);
                mapsActivity.finish();
                break;
        }
    }
}
