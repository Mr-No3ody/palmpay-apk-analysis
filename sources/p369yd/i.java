package p369yd;

import Z4.e;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.RecipientDetailData;
import com.transsnet.palmpay.send_money.bean.RecipientDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.RequestPermissionDetailsActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RequestPermissionDetailsActivity f44296g;

    public /* synthetic */ i(RequestPermissionDetailsActivity requestPermissionDetailsActivity, int i7) {
        this.f44295f = i7;
        this.f44296g = requestPermissionDetailsActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44295f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44296g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44296g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f44295f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44296g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44296g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        RequestPermissionDetailsActivity requestPermissionDetailsActivity = this.f44296g;
        switch (this.f44295f) {
            case 0:
                Intrinsics.checkNotNullParameter((CommonResult) obj, "response");
                int i7 = RequestPermissionDetailsActivity.f33585f;
                requestPermissionDetailsActivity.l();
                break;
            default:
                RecipientDetailResp response = (RecipientDetailResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                requestPermissionDetailsActivity.showLoadingDialog(false);
                requestPermissionDetailsActivity.f33589d = response;
                Object value = requestPermissionDetailsActivity.f33586a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).setVisibility(response.getData() == null ? 8 : 0);
                RecipientDetailData data = response.getData();
                if (data != null) {
                    boolean request = data.getRequest();
                    Object value2 = requestPermissionDetailsActivity.f33587b.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((CheckBox) value2).setChecked(request);
                }
                break;
        }
    }
}
