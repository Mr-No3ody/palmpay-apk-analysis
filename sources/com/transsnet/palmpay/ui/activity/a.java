package com.transsnet.palmpay.ui.activity;

import Ac.h;
import Bc.C0106c;
import Pa.i0;
import Pa.n0;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.bean.CoinRainConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.CoinRainNewView;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.F;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements CoinRainNewView.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoinRainActivity f34609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f34610b;

    public a(CoinRainActivity coinRainActivity, F f10) {
        this.f34609a = coinRainActivity;
        this.f34610b = f10;
    }

    @Override // com.transsnet.palmpay.custom_view.CoinRainNewView.Callback
    public final void onAnimEnd() {
        CoinRainActivity coinRainActivity = this.f34609a;
        if (i0.W(coinRainActivity)) {
            if (coinRainActivity.f34451a <= 0) {
                coinRainActivity.n();
                return;
            }
            CoinRainConfig coinRainConfig = coinRainActivity.f34456f;
            if (TextUtils.isEmpty(coinRainConfig != null ? coinRainConfig.androidLinkUrl : null)) {
                GetCoinRewardsActivity.f34458e.startAct(coinRainActivity, coinRainActivity.f34451a, coinRainActivity.f34456f, (Uri) this.f34610b.f38951a);
                coinRainActivity.overridePendingTransition(0, 0);
                return;
            }
            CoinRainConfig coinRainConfig2 = coinRainActivity.f34456f;
            if (TextUtils.isEmpty(coinRainConfig2 != null ? coinRainConfig2.linkTo : null)) {
                CoinRainConfig coinRainConfig3 = coinRainActivity.f34456f;
                ActivityUtils.startActivity(Pa.F.a(coinRainActivity, coinRainConfig3 != null ? coinRainConfig3.androidLinkUrl : null));
            } else {
                CoinRainConfig coinRainConfig4 = coinRainActivity.f34456f;
                Pa.F.f(coinRainConfig4 != null ? coinRainConfig4.androidLinkUrl : null, coinRainConfig4 != null ? coinRainConfig4.linkTo : null, null);
            }
            coinRainActivity.finish();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.CoinRainNewView.Callback
    public final int onIconClicked(float f10, float f11) {
        String str;
        ValueAnimator valueAnimator;
        n0 n0VarG = n0.g();
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.ELEMENT_ID, "coin_rain_view");
        CoinRainActivity coinRainActivity = this.f34609a;
        CoinRainConfig coinRainConfig = coinRainActivity.f34456f;
        if (coinRainConfig == null || (str = coinRainConfig.multiActivityCode) == null) {
            str = "";
        }
        map.put("activity_code", str);
        Unit unit = Unit.f38893a;
        n0VarG.n("PalmPay_GiftRain_Click", map);
        if (BaseApplication.getInstance().getUser().getSvaStatus() == 3) {
            int i7 = coinRainActivity.f34451a + 1;
            coinRainActivity.f34451a = i7;
            C0106c c0106c = coinRainActivity.f34457g;
            if (c0106c != null) {
                ((TextView) c0106c.f672e).setText(coinRainActivity.getString(h.main_cake_number_format, Integer.valueOf(i7)));
            }
        } else {
            d.H("/account/ask_apply_for_balance", "extra_data", "/app/coin_rain_page");
            C0106c c0106c2 = coinRainActivity.f34457g;
            if (c0106c2 != null && (valueAnimator = ((CoinRainNewView) c0106c2.t).t) != null) {
                valueAnimator.cancel();
            }
        }
        return coinRainActivity.f34451a;
    }
}
