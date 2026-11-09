package V9;

import Bc.C0104a;
import Ce.T;
import Pa.r0;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.navigation.NavigationBarView;
import com.transsnet.palmpay.contacts.bean.resp.QueryRelationShipResp;
import com.transsnet.palmpay.contacts.ui.activity.LinkFavePersonalInfoActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.custom_view.dialog.ToastDialog;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkFavePersonalInfoActivity f10227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkFavePersonalInfoActivity f10228c;

    public /* synthetic */ w(LinkFavePersonalInfoActivity linkFavePersonalInfoActivity, LinkFavePersonalInfoActivity linkFavePersonalInfoActivity2, int i7) {
        this.f10226a = i7;
        this.f10227b = linkFavePersonalInfoActivity;
        this.f10228c = linkFavePersonalInfoActivity2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConstraintLayout constraintLayout;
        switch (this.f10226a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                LinkFavePersonalInfoActivity linkFavePersonalInfoActivity = this.f10227b;
                if (z3) {
                    linkFavePersonalInfoActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    linkFavePersonalInfoActivity.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    boolean zIsSuccess = commonBeanResult.isSuccess();
                    LinkFavePersonalInfoActivity linkFavePersonalInfoActivity2 = this.f10228c;
                    if (zIsSuccess) {
                        QueryRelationShipResp queryRelationShipResp = (QueryRelationShipResp) commonBeanResult.data;
                        if (queryRelationShipResp != null) {
                            C0104a c0104a = linkFavePersonalInfoActivity2.f27223c;
                            r0.m1(queryRelationShipResp.bindingHeadPortrait, c0104a != null ? (ImageView) c0104a.f652d : null);
                            C0104a c0104a2 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a2 != null) {
                                ((TextView) c0104a2.f657j).setText(queryRelationShipResp.uniqueName);
                            }
                            C0104a c0104a3 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a3 != null) {
                                p220oa.h.s((ImageView) c0104a3.f653e, !TextUtils.isEmpty(queryRelationShipResp.relationship));
                            }
                            C0104a c0104a4 = linkFavePersonalInfoActivity2.f27223c;
                            r0.l1(queryRelationShipResp.relationshipPic, c0104a4 != null ? (ImageView) c0104a4.f653e : null);
                            long jCurrentTimeMillis = (System.currentTimeMillis() - queryRelationShipResp.gmtCreatedTimestamp) / 86400000;
                            C0104a c0104a5 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a5 != null) {
                                ((AppCompatTextView) c0104a5.f660v).setText(linkFavePersonalInfoActivity2.getString(R9.f.ct_this_relationship_has_lasted_for_s, String.valueOf(jCurrentTimeMillis + 1)));
                            }
                            C0104a c0104a6 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a6 != null) {
                                ((TextView) c0104a6.f651c).setText(queryRelationShipResp.remark);
                            }
                            String str = "";
                            String str2 = TextUtils.isEmpty(queryRelationShipResp.finalSource) ? !TextUtils.isEmpty(queryRelationShipResp.firstSource) ? queryRelationShipResp.firstSource : "" : queryRelationShipResp.finalSource;
                            if (str2 != null) {
                                switch (str2.hashCode()) {
                                    case 48:
                                        if (str2.equals("0")) {
                                            str = "Transfer Money";
                                        }
                                        break;
                                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                                        if (str2.equals("1")) {
                                            str = "Data Bundle";
                                        }
                                        break;
                                    case 50:
                                        if (str2.equals("2")) {
                                            str = "Airtime";
                                        }
                                        break;
                                    case 51:
                                        if (str2.equals("3")) {
                                            str = "Link Faves";
                                        }
                                        break;
                                }
                            }
                            C0104a c0104a7 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a7 != null) {
                                p220oa.h.s(c0104a7.f659p, !TextUtils.isEmpty(str));
                            }
                            C0104a c0104a8 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a8 != null) {
                                c0104a8.f659p.setText(linkFavePersonalInfoActivity2.getString(R9.f.ct_from_a_s_binding, str));
                            }
                            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, linkFavePersonalInfoActivity2);
                            C0104a c0104a9 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a9 != null && (constraintLayout = (ConstraintLayout) c0104a9.f654f) != null) {
                                constraintLayout.setBackgroundColor(iColorInt);
                            }
                            linkFavePersonalInfoActivity2.initStatusBar(iColorInt, true);
                            C0104a c0104a10 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a10 != null) {
                                p220oa.h.s((TextView) c0104a10.f658o, true ^ queryRelationShipResp.isFriend);
                            }
                            C0104a c0104a11 = linkFavePersonalInfoActivity2.f27223c;
                            if (c0104a11 != null) {
                                ((TextView) c0104a11.f656i).setVisibility(queryRelationShipResp.isFriend ? 0 : 4);
                            }
                        }
                    } else {
                        p220oa.h.x(linkFavePersonalInfoActivity2, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    linkFavePersonalInfoActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    linkFavePersonalInfoActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                LinkFavePersonalInfoActivity linkFavePersonalInfoActivity3 = this.f10227b;
                if (z8) {
                    linkFavePersonalInfoActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    linkFavePersonalInfoActivity3.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    boolean zIsSuccess2 = commonResult.isSuccess();
                    LinkFavePersonalInfoActivity linkFavePersonalInfoActivity4 = this.f10228c;
                    if (zIsSuccess2) {
                        S6.a aVar = S6.a.pay_SelectedOutline;
                        String string = linkFavePersonalInfoActivity4.getString(p025ba.k.core_delete_successfully);
                        ToastDialog toastDialog = new ToastDialog(linkFavePersonalInfoActivity4, com.transsnet.palmpay.custom_view.t.cv_toast_dialog);
                        toastDialog.setMessage(null);
                        toastDialog.setTitle(string);
                        toastDialog.setIcon(0);
                        if (aVar != null) {
                            toastDialog.setIcon(p059e1.a.h(linkFavePersonalInfoActivity4, aVar, null, linkFavePersonalInfoActivity4.getColor(L6.b.ppColorButtonTextWhite), 32.0f));
                        } else {
                            toastDialog.setIcon((Drawable) null);
                        }
                        toastDialog.setBackground(0);
                        toastDialog.show(2000L);
                        toastDialog.setOnDismissListener(new T(linkFavePersonalInfoActivity4, 6));
                    } else {
                        p220oa.h.x(linkFavePersonalInfoActivity4, commonResult.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    linkFavePersonalInfoActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    linkFavePersonalInfoActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof com.transsnet.palmpay.core.base.o;
                LinkFavePersonalInfoActivity linkFavePersonalInfoActivity5 = this.f10227b;
                if (z10) {
                    linkFavePersonalInfoActivity5.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    linkFavePersonalInfoActivity5.showLoadingDialog(false, true);
                    PalmPayContactQueryResp palmPayContactQueryResp = (PalmPayContactQueryResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (palmPayContactQueryResp.isSuccess()) {
                        ToastUtils.showLong(R9.f.ct_contact_request_sent);
                    } else {
                        p220oa.h.x(this.f10228c, palmPayContactQueryResp.getRespMsg());
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    linkFavePersonalInfoActivity5.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    linkFavePersonalInfoActivity5.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it3).getClass();
                }
                return Unit.f38893a;
        }
    }
}
