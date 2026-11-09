package Ja;

import android.os.Handler;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.QueryTransactionResultFragment;
import io.reactivex.disposables.Disposable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ QueryTransactionResultFragment f4638f;

    public N(QueryTransactionResultFragment queryTransactionResultFragment) {
        this.f4638f = queryTransactionResultFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f4638f.f(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f4638f.t();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        String strOptString;
        CheckPayResp checkPayResp = (CheckPayResp) obj;
        boolean zIsSuccess = checkPayResp.isSuccess();
        QueryTransactionResultFragment queryTransactionResultFragment = this.f4638f;
        if (!zIsSuccess || checkPayResp.getData() == null) {
            queryTransactionResultFragment.t();
            return;
        }
        PayByOrderResp.DataBean data = checkPayResp.getData();
        String str = data.businessData;
        queryTransactionResultFragment.getClass();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("payStatus")) {
            strOptString = "";
        } else {
            try {
                strOptString = new JSONObject(str).optString("payStatus");
            } catch (JSONException e10) {
                F6.d.c(queryTransactionResultFragment.f27317a, "parseBusinessDataJsonString: ", e10);
                strOptString = "";
            }
        }
        if (!data.flag || data.verifyMethod == 99) {
            Integer num = 1;
            if (!num.toString().equals(strOptString)) {
                Integer num2 = 2;
                if (!num2.toString().equals(strOptString)) {
                    return;
                }
            }
        }
        Handler handler = queryTransactionResultFragment.f28060v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (((PayVerificationActivity) queryTransactionResultFragment.getActivity()) != null) {
            ((PayVerificationActivity) queryTransactionResultFragment.getActivity()).showQueryPayResult(checkPayResp);
        }
    }
}
