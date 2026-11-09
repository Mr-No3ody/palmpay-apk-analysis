package S8;

import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.ChangePhoneNoTokenReq;
import com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep3Fragment;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1612i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements PinEntryView.OnPinEnteredListener, OnSendCodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChangeMobileStep3Fragment f8823a;

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        ChangeMobileStep3Fragment.a aVar = ChangeMobileStep3Fragment.f26126w;
        Intrinsics.checkNotNullParameter(code, "code");
        if (TextUtils.isEmpty(code) || code.length() < 4) {
            return;
        }
        ChangeMobileStep3Fragment changeMobileStep3Fragment = this.f8823a;
        KeyboardUtils.hideSoftInput(changeMobileStep3Fragment.getActivity());
        ChangePhoneNoTokenReq changePhoneNoTokenReq = new ChangePhoneNoTokenReq();
        ChangeMobileActivity changeMobileActivity = (ChangeMobileActivity) changeMobileStep3Fragment.getActivity();
        changePhoneNoTokenReq.securityVerifyToken = changeMobileActivity != null ? changeMobileActivity.f25841b : null;
        changePhoneNoTokenReq.newPhoneNo = changeMobileStep3Fragment.f26127j;
        ChangeMobileActivity changeMobileActivity2 = (ChangeMobileActivity) changeMobileStep3Fragment.getActivity();
        changePhoneNoTokenReq.oldPhoneNo = changeMobileActivity2 != null ? changeMobileActivity2.f25840a : null;
        C1612i c1612i = (C1612i) changeMobileStep3Fragment.f27328i;
        if (c1612i != null) {
            c1612i.changePhone(changePhoneNoTokenReq, code);
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        ChangeMobileStep3Fragment changeMobileStep3Fragment = this.f8823a;
        changeMobileStep3Fragment.t = i10;
        changeMobileStep3Fragment.f26128o = i7;
        if (i7 != 4 || TextUtils.isEmpty(str)) {
            changeMobileStep3Fragment.y();
            changeMobileStep3Fragment.x(i7);
        } else {
            Intrinsics.e(str);
            changeMobileStep3Fragment.u(str);
        }
    }
}
