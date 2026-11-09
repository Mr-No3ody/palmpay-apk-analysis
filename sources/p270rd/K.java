package p270rd;

import L6.b;
import androidx.activity.z;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p118hf.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41691b;

    public /* synthetic */ K(TransferResultActivity transferResultActivity, int i7) {
        this.f41690a = i7;
        this.f41691b = transferResultActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferResultActivity transferResultActivity = this.f41691b;
        switch (this.f41690a) {
            case 0:
                z addCallback = (z) obj;
                ArrayList arrayList = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                TransferResultActivity.p(transferResultActivity, "TransferPaymentResultsClick", "BackTransferPage");
                transferResultActivity.q();
                break;
            case 1:
                IconicsDrawable apply = (IconicsDrawable) obj;
                ArrayList arrayList2 = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                a.I(apply, 24);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorTextPrimary, transferResultActivity));
                break;
            case 2:
                IconicsDrawable apply2 = (IconicsDrawable) obj;
                ArrayList arrayList3 = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(apply2, "$this$apply");
                a.I(apply2, 16);
                D3.a.F(apply2, CommonViewExtKt.colorInt(b.ppColorPrimary, transferResultActivity));
                break;
            case 3:
                String it = (String) obj;
                ArrayList arrayList4 = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(it, "it");
                h.x(transferResultActivity, it);
                break;
            default:
                IconicsDrawable apply3 = (IconicsDrawable) obj;
                ArrayList arrayList5 = TransferResultActivity.f33237Z;
                Intrinsics.checkNotNullParameter(apply3, "$this$apply");
                a.I(apply3, 24);
                D3.a.F(apply3, CommonViewExtKt.colorInt(b.ppColorTextPrimary, transferResultActivity));
                break;
        }
        return Unit.f38893a;
    }
}
