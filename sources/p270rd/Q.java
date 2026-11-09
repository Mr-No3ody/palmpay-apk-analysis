package p270rd;

import C0.G;
import Pa.n0;
import android.os.SystemClock;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonBooleanResult;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.AddShortcutDialog;
import com.transsnet.palmpay.send_money.ui.dialog.RefundInAdvanceDialog;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p184m8.b;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41703c;

    public /* synthetic */ Q(TransferResultActivity transferResultActivity, TransferResultActivity transferResultActivity2, int i7) {
        this.f41701a = i7;
        this.f41702b = transferResultActivity;
        this.f41703c = transferResultActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        int i7;
        TransferResultActivity transferResultActivity = this.f41703c;
        TransferResultActivity transferResultActivity2 = this.f41702b;
        switch (this.f41701a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    transferResultActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    transferResultActivity2.showLoadingDialog(false, true);
                    CommonBooleanResult commonBooleanResult = (CommonBooleanResult) ((p) it).f27360a;
                    if (commonBooleanResult.isSuccess()) {
                        commonBooleanResult.getData();
                        ArrayList arrayList = TransferResultActivity.f33237Z;
                        String strO = G.o("REFUND_IA_", G.k());
                        int i10 = SPUtils.get().getInt(strO, 0);
                        if (i10 <= 3) {
                            SPUtils.get().put(strO, i10 + 1);
                            RefundInAdvanceDialog refundInAdvanceDialog = new RefundInAdvanceDialog(transferResultActivity);
                            transferResultActivity.showDialog(refundInAdvanceDialog, 99);
                            refundInAdvanceDialog.setListener(new b(10));
                        }
                    }
                } else if (it instanceof m) {
                    transferResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    transferResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                    ((n) it).getClass();
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    transferResultActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    transferResultActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult.isSuccess() && (bool = (Boolean) commonBeanResult.data) != null) {
                        if (!bool.booleanValue()) {
                            ArrayList arrayList2 = TransferResultActivity.f33237Z;
                            transferResultActivity.s();
                        } else if (transferResultActivity.f33240B == null && !SPUtils.getInstance("TRANS_SHORTCUTS").getBoolean("CREATE", false) && (i7 = SPUtils.getInstance("TRANS_SHORTCUTS").getInt("COUNT", 0)) < 3) {
                            int i11 = SPUtils.getInstance("TRANS_SHORTCUTS").getInt("SHOW_TIME", 0);
                            if (i11 == 0) {
                                SPUtils.getInstance("TRANS_SHORTCUTS").put("SHOW_TIME", SystemClock.elapsedRealtime());
                            } else if (SystemClock.elapsedRealtime() - ((long) i11) >= 604800000) {
                            }
                            SPUtils.getInstance("TRANS_SHORTCUTS").put("COUNT", i7 + 1);
                            SPUtils.getInstance("TRANS_SHORTCUTS").put("SHOW_TIME", SystemClock.elapsedRealtime());
                            n0.g().l("bankTransfer_viewShortCutPop");
                            AddShortcutDialog addShortcutDialog = new AddShortcutDialog(transferResultActivity);
                            transferResultActivity.f33240B = addShortcutDialog;
                            transferResultActivity.showDialog(addShortcutDialog, 98);
                        }
                    }
                } else if (it2 instanceof m) {
                    transferResultActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    transferResultActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
