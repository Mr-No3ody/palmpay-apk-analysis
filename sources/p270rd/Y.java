package p270rd;

import F6.d;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBaseActivity f41715b;

    public /* synthetic */ Y(TransferToBaseActivity transferToBaseActivity, int i7) {
        this.f41714a = i7;
        this.f41715b = transferToBaseActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        switch (this.f41714a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                Object value = this.f41715b.f33270i.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(s3.length() + "/200");
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f41714a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                d.h("beforeTextChanged: " + ((Object) s3), 3, new Object[0]);
                s3.toString();
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f41714a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                d.h("onTextChanged: " + ((Object) s3), 3, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                TransferToBaseActivity transferToBaseActivity = this.f41715b;
                if (transferToBaseActivity.t() != null) {
                    transferToBaseActivity.q().setActionButtonEnable(!TextUtils.isEmpty(transferToBaseActivity.t().getString()) && transferToBaseActivity.t().c());
                    break;
                }
                break;
        }
    }
}
