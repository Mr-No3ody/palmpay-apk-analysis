package p270rd;

import Pa.F;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972o extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayShopInputAmountActivity f41763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalanceAndLimitResp.BalanceAndLimitData f41764b;

    public C1972o(PayShopInputAmountActivity payShopInputAmountActivity, BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData) {
        this.f41763a = payShopInputAmountActivity;
        this.f41764b = balanceAndLimitData;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ActivityUtils.startActivity(F.a(this.f41763a, this.f41764b.amountLimitContentJumpUrl));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.linkColor = 0;
        ds.setUnderlineText(false);
    }
}
