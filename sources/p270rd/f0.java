package p270rd;

import Pa.F;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawInputAmountActivity f41742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalanceAndLimitResp.BalanceAndLimitData f41743b;

    public f0(WithdrawInputAmountActivity withdrawInputAmountActivity, BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData) {
        this.f41742a = withdrawInputAmountActivity;
        this.f41743b = balanceAndLimitData;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ActivityUtils.startActivity(F.a(this.f41742a, this.f41743b.amountLimitContentJumpUrl));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.linkColor = 0;
        ds.setUnderlineText(false);
    }
}
