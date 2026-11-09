package p382zb;

import Ce.p0;
import Eb.e;
import Ef.a;
import Ff.h;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.ui.dialog.CLInstallmentCheckPlanDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f44556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment, CommonBeanResult commonBeanResult, Continuation continuation) {
        super(2, continuation);
        this.f44555a = ocHomeMobileInstalmentTabFragment;
        this.f44556b = commonBeanResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new X(this.f44555a, this.f44556b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        E activity;
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = this.f44556b;
        QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean = (QueryLoanDialogPopUpsBean) commonBeanResult.data;
        final QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = queryLoanDialogPopUpsBean != null ? queryLoanDialogPopUpsBean.getPhoneModelDto() : null;
        QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean2 = (QueryLoanDialogPopUpsBean) commonBeanResult.data;
        List<String> mobileInstallmentPopupBrands = queryLoanDialogPopUpsBean2 != null ? queryLoanDialogPopUpsBean2.getMobileInstallmentPopupBrands() : null;
        QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean3 = (QueryLoanDialogPopUpsBean) commonBeanResult.data;
        final boolean z3 = false;
        if (queryLoanDialogPopUpsBean3 != null && queryLoanDialogPopUpsBean3.getNeedFaceVerify()) {
            z3 = true;
        }
        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = this.f44555a;
        if (!ocHomeMobileInstalmentTabFragment.f30434A && (activity = ocHomeMobileInstalmentTabFragment.getActivity()) != null && ActivityUtils.isValidActivityContext(activity) && !"account.ui.activity.PinSafeWithPatternActivity".equals(activity.getLocalClassName()) && phoneModelDto != null) {
            ocHomeMobileInstalmentTabFragment.f30434A = true;
            CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog = new CLInstallmentCheckPlanDialog(activity);
            cLInstallmentCheckPlanDialog.setData(phoneModelDto, mobileInstallmentPopupBrands, new Function0() { // from class: zb.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z8 = z3;
                    QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto2 = phoneModelDto;
                    if (z8) {
                        Intrinsics.checkNotNullParameter("/credit_score/oc_home_mobile_installment_standalone_activity", "callbackRoute");
                        e.f2273a = true;
                        e.f2276d = phoneModelDto2;
                        String strG = d.g("/basic-h5/face-capture");
                        Intrinsics.checkNotNullExpressionValue(strG, "getFaceCaptureUrl(...)");
                        String string = Uri.parse(strG).buildUpon().appendQueryParameter("scene", "76").appendQueryParameter("callbackUrl", "/credit_score/oc_home_mobile_installment_standalone_activity").build().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        com.palmpay.lib.apm.launchcounter.util.d.Q(string);
                    }
                    return Unit.f38893a;
                }
            });
            cLInstallmentCheckPlanDialog.setOnDismissListener(new p0(10, ocHomeMobileInstalmentTabFragment, phoneModelDto));
            cLInstallmentCheckPlanDialog.show();
        }
        return Unit.f38893a;
    }
}
