package p353xd;

import L6.b;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p118hf.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankInputAmountActivity f43898b;

    public /* synthetic */ s(TransferToBankInputAmountActivity transferToBankInputAmountActivity, int i7) {
        this.f43897a = i7;
        this.f43898b = transferToBankInputAmountActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferToBankInputAmountActivity transferToBankInputAmountActivity = this.f43898b;
        switch (this.f43897a) {
            case 0:
                IconicsDrawable apply = (IconicsDrawable) obj;
                TransferToBankInputAmountActivity.a aVar = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 12);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorPrimary, transferToBankInputAmountActivity));
                break;
            default:
                String it = (String) obj;
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                Intrinsics.checkNotNullParameter(it, "it");
                h.x(transferToBankInputAmountActivity, it);
                break;
        }
        return Unit.f38893a;
    }
}
