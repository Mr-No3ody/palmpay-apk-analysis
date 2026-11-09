package p353xd;

import Pa.F;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BalanceAndLimitResp.BalanceAndLimitData f43907b;

    public w(TransferToBankInputAmountActivity transferToBankInputAmountActivity, BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData) {
        this.f43906a = transferToBankInputAmountActivity;
        this.f43907b = balanceAndLimitData;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ActivityUtils.startActivity(F.a(this.f43906a, this.f43907b.amountLimitContentJumpUrl));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.linkColor = 0;
        ds.setUnderlineText(false);
    }
}
