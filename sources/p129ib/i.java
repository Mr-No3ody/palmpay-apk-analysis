package p129ib;

import Ef.a;
import F6.d;
import Ff.h;
import android.app.Activity;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.ui.dialog.CLHighQualityIncreaseAmountDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreditIncreaseInfo f37467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f37468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f37469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryLoanDialogPopUpsBean f37470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CreditIncreaseInfo creditIncreaseInfo, m mVar, Activity activity, QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean, Continuation continuation) {
        super(2, continuation);
        this.f37467a = creditIncreaseInfo;
        this.f37468b = mVar;
        this.f37469c = activity;
        this.f37470d = queryLoanDialogPopUpsBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f37467a, this.f37468b, this.f37469c, this.f37470d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        List<CreditIncreaseInfo.Data.OkCardQuotaLog> list;
        CreditIncreaseInfo.Data data;
        a aVar = a.f2423a;
        g.M(obj);
        int i7 = m.f37481g;
        StringBuilder sb2 = new StringBuilder("showIncreaseDialog >>> ");
        CreditIncreaseInfo creditIncreaseInfo = this.f37467a;
        sb2.append(creditIncreaseInfo);
        d.h("HomeDialogHandler", 3, sb2.toString());
        List<CreditIncreaseInfo.Data.OkCardQuotaLog> okCardQuotaLogList = (creditIncreaseInfo == null || (data = creditIncreaseInfo.getData()) == null) ? null : data.getOkCardQuotaLogList();
        m mVar = this.f37468b;
        if ((creditIncreaseInfo != null && !creditIncreaseInfo.isSuccess()) || (list = okCardQuotaLogList) == null || list.isEmpty()) {
            mVar.f37484c = false;
        } else {
            Activity activity = this.f37469c;
            if (ActivityUtils.isValidActivityContext(activity)) {
                QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean = this.f37470d;
                if (queryLoanDialogPopUpsBean.getInstallmentCreditIncreaseWhitelistHit()) {
                    CLHighQualityIncreaseAmountDialog cLHighQualityIncreaseAmountDialog = new CLHighQualityIncreaseAmountDialog(activity, "quotaChange", queryLoanDialogPopUpsBean.getLoanProduct(), queryLoanDialogPopUpsBean.getBusinessInfo(), okCardQuotaLogList);
                    cLHighQualityIncreaseAmountDialog.setOnShowListener(new a(mVar, 13));
                    cLHighQualityIncreaseAmountDialog.setOnDismissListener(new b(mVar, 16));
                    cLHighQualityIncreaseAmountDialog.show();
                } else {
                    CLIncreaseAmountDialog cLIncreaseAmountDialog = new CLIncreaseAmountDialog(activity, "quotaChange", queryLoanDialogPopUpsBean.getLoanProduct(), queryLoanDialogPopUpsBean.getBusinessInfo(), okCardQuotaLogList);
                    cLIncreaseAmountDialog.setOnShowListener(new a(mVar, 15));
                    cLIncreaseAmountDialog.setOnDismissListener(new b(mVar, 17));
                    cLIncreaseAmountDialog.show();
                }
            }
        }
        return Unit.f38893a;
    }
}
