package Zd;

import Bc.C0108e;
import C9.C0142i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends P0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BaseBillerActivity f11643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(BaseBillerActivity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11643g = context;
    }

    @Override // androidx.camera.camera2.internal.P0
    public final View c() {
        String phoneNumber;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        ImageView contactIv;
        View viewInflate = LayoutInflater.from(this.f11643g).inflate(Pd.d.qt_phone_network_not_connect_view, (ViewGroup) null);
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) viewInflate.findViewById(Pd.c.atuaInputPhoneNumArea);
        User user = BaseApplication.getInstance().getUser();
        if (user == null || (phoneNumber = user.getPhoneNumber()) == null) {
            phoneNumber = "";
        }
        if (modelMobileWithIconInputLayout != null && (contactIv = modelMobileWithIconInputLayout.getContactIv()) != null) {
            contactIv.setOnClickListener(new W8.d(14));
        }
        if (modelMobileWithIconInputLayout != null) {
            modelMobileWithIconInputLayout.setOperatorIconClickable(false);
        }
        if (!TextUtils.isEmpty(phoneNumber)) {
            if (modelMobileWithIconInputLayout != null && (phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit()) != null) {
                phoneNumberEdit.clearFocus();
            }
            String strSubstring = phoneNumber.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (modelMobileWithIconInputLayout != null) {
                modelMobileWithIconInputLayout.setPhoneNumber(strSubstring);
            }
        }
        NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) viewInflate.findViewById(Pd.c.networkView);
        if (networkNotConnectView != null) {
            String str = (String) this.f13249d;
            if (str != null && str.length() != 0) {
                networkNotConnectView.setMessage((String) this.f13249d);
            }
            networkNotConnectView.setRefreshListener(new C0142i(this, 12));
            String str2 = (String) this.f13248c;
            if (str2 != null && str2.length() != 0) {
                String str3 = (String) this.f13248c;
                View.OnClickListener onClickListener = (View.OnClickListener) this.f13250e;
                C0108e c0108e = networkNotConnectView.f27123c;
                if (c0108e != null) {
                    PpButton ppButton = (PpButton) c0108e.f691i;
                    ppButton.setText(str3);
                    p220oa.h.s(ppButton, !TextUtils.isEmpty(str3));
                    ppButton.setOnClickListener(onClickListener);
                }
            }
        }
        return viewInflate;
    }
}
