package p024b9;

import F8.e;
import F8.h;
import L6.f;
import O6.c;
import Pa.n0;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p010a9.b;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f18795f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseMVPFragment f18796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PalmPayLevelUpTier3V2Activity f18797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f18798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f18799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f18800e;

    public d(BaseMVPFragment fragment, PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity, Function0 presenterProvider, Function0 navControllerProvider, Function1 showLoading) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(presenterProvider, "presenterProvider");
        Intrinsics.checkNotNullParameter(navControllerProvider, "navControllerProvider");
        Intrinsics.checkNotNullParameter(showLoading, "showLoading");
        this.f18796a = fragment;
        this.f18797b = palmPayLevelUpTier3V2Activity;
        this.f18798c = presenterProvider;
        this.f18799d = navControllerProvider;
        this.f18800e = showLoading;
    }

    public final void a(QueryAddressFromBillRsp queryAddressFromBillRsp) {
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity = this.f18797b;
        QueryAddressFromBillRsp queryAddressFromBillRsp2 = palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25921f : null;
        if (palmPayLevelUpTier3V2Activity != null) {
            if (queryAddressFromBillRsp2 != null) {
                queryAddressFromBillRsp = f18795f.mergeNonEmptyAddressFields(queryAddressFromBillRsp2, queryAddressFromBillRsp);
            }
            palmPayLevelUpTier3V2Activity.f25921f = queryAddressFromBillRsp;
        }
        if (!TextUtils.isEmpty(palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25922g : null) || palmPayLevelUpTier3V2Activity == null) {
            return;
        }
        palmPayLevelUpTier3V2Activity.f25922g = palmPayLevelUpTier3V2Activity != null ? palmPayLevelUpTier3V2Activity.f25917b : null;
    }

    public final void b(QueryAddressFromBillRsp queryAddressFromBillRsp) {
        if (queryAddressFromBillRsp == null) {
            return;
        }
        a(queryAddressFromBillRsp);
        E activity = this.f18796a.getActivity();
        a aVar = new a(this, queryAddressFromBillRsp, 0);
        a aVar2 = new a(this, queryAddressFromBillRsp, 1);
        if (activity != null) {
            if (TextUtils.isEmpty(queryAddressFromBillRsp.getStateCode()) || TextUtils.isEmpty(queryAddressFromBillRsp.getStateName()) || TextUtils.isEmpty(queryAddressFromBillRsp.getAreaCode()) || TextUtils.isEmpty(queryAddressFromBillRsp.getAreaName()) || TextUtils.isEmpty(queryAddressFromBillRsp.getLgaCode()) || TextUtils.isEmpty(queryAddressFromBillRsp.getLgaName())) {
                aVar2.invoke();
                return;
            }
            c cVar = new c(activity);
            cVar.f6614u = 3;
            cVar.f(activity.getString(h.ac_confirm_address_title));
            View viewInflate = LayoutInflater.from(activity).inflate(e.ac_dialog_confirm_address, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(F8.d.tvMsg);
            if (textView != null) {
                textView.setText(Html.fromHtml(activity.getString(h.ac_msg_confirm_address), 0));
            }
            TextView textView2 = (TextView) viewInflate.findViewById(F8.d.tvAddressLevel1);
            if (textView2 != null) {
                String stateName = queryAddressFromBillRsp.getStateName();
                if (stateName == null) {
                    stateName = "";
                }
                textView2.setText(stateName);
            }
            TextView textView3 = (TextView) viewInflate.findViewById(F8.d.tvAddressLevel2);
            if (textView3 != null) {
                String areaName = queryAddressFromBillRsp.getAreaName();
                if (areaName == null) {
                    areaName = "";
                }
                textView3.setText(areaName);
            }
            TextView textView4 = (TextView) viewInflate.findViewById(F8.d.tvAddressLevel3);
            if (textView4 != null) {
                String lgaName = queryAddressFromBillRsp.getLgaName();
                textView4.setText(lgaName != null ? lgaName : "");
            }
            TextView textView5 = (TextView) viewInflate.findViewById(F8.d.tvAddress);
            if (textView5 != null) {
                String addressDetails = queryAddressFromBillRsp.getAddressDetails();
                String string = addressDetails != null ? StringsKt.V(addressDetails).toString() : null;
                if (string == null || string.length() == 0) {
                    String[] elements = {queryAddressFromBillRsp.getLgaName(), queryAddressFromBillRsp.getAreaName(), queryAddressFromBillRsp.getStateName()};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    ArrayList arrayListR = C1847n.r(elements);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : arrayListR) {
                        if (!TextUtils.isEmpty((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    string = CollectionsKt.J(arrayList, ", ", null, null, null, 62);
                }
                textView5.setText(string);
            }
            cVar.f6616w = viewInflate;
            cVar.d(k.core_confirm, new b(2, activity, aVar));
            String string2 = activity.getString(h.ac_modify);
            b bVar = new b(3, activity, aVar2);
            cVar.f6601g = string2;
            cVar.f6603i = bVar;
            View viewFindViewById = cVar.g().findViewById(f.viewContainer);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = CommonViewExtKt.getDp(8.0f);
                    viewFindViewById.setLayoutParams(marginLayoutParams);
                }
            }
            n0.g().v("kyc_address_confirm_popup_exposure");
        }
    }

    public final void c(File file, Function1 onUploaded) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(onUploaded, "onUploaded");
        this.f18800e.invoke(Boolean.TRUE);
        FileUploadManager.getInstance().uploadFile(file, true, new c(this, onUploaded));
    }
}
