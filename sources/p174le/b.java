package p174le;

import Pa.F;
import android.content.Intent;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.BalanceAccountInfo;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.me.MeBalanceAccountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BalanceAccountInfo.DataBean f39349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeBalanceAccountActivity f39350b;

    public b(BalanceAccountInfo.DataBean dataBean, MeBalanceAccountActivity meBalanceAccountActivity) {
        this.f39349a = dataBean;
        this.f39350b = meBalanceAccountActivity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intent intentA;
        Intrinsics.checkNotNullParameter(widget, "widget");
        String str = this.f39349a.frozenAmountAndroidLink;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str == null || (intentA = F.a(this.f39350b, str)) == null) {
                return;
            }
            ActivityUtils.startActivity(intentA);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        ds.setColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this.f39350b));
    }
}
