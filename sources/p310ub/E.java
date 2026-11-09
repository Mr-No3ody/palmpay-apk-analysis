package p310ub;

import O6.c;
import Pa.n0;
import Pa.r0;
import Ya.d;
import Ya.g;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p355xf.t;
import p368yb.K;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcContactActivity f42749b;

    public /* synthetic */ E(OcContactActivity ocContactActivity, int i7) {
        this.f42748a = i7;
        this.f42749b = ocContactActivity;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:117:0x045e A[PHI: r0
      0x045e: PHI (r0v35 boolean) = (r0v29 boolean), (r0v29 boolean), (r0v29 boolean), (r0v83 boolean), (r0v83 boolean), (r0v83 boolean) binds: [B:153:0x0616, B:148:0x05d4, B:143:0x0592, B:126:0x04d9, B:121:0x0498, B:114:0x0451] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0522  */
    /* JADX WARN: Code duplicated, block: B:177:0x0728 A[PHI: r0
      0x0728: PHI (r0v42 boolean) = (r0v37 boolean), (r0v77 boolean) binds: [B:196:0x0824, B:174:0x071c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0137  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[PHI: r0
      0x01b4: PHI (r0v25 boolean) = (r0v19 boolean), (r0v19 boolean), (r0v19 boolean), (r0v94 boolean), (r0v94 boolean), (r0v94 boolean) binds: [B:87:0x036c, B:82:0x032a, B:77:0x02e8, B:60:0x022f, B:55:0x01ee, B:48:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0278  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z3;
        boolean z8;
        OcContactActivity ocContactActivity = this.f42749b;
        switch (this.f42748a) {
            case 0:
                int i7 = OcContactActivity.f29378l1;
                ocContactActivity.onBackPressed();
                n0 n0VarG = n0.g();
                OcApplyData ocApplyData = ocContactActivity.f29248B;
                n0VarG.m("OcContactActivity_element_click", "router_back_img", ocApplyData != null ? ocApplyData.getProduct() : null);
                return;
            case 1:
                int i10 = OcContactActivity.f29378l1;
                ARouter.getInstance().build("/credit_score/oc_phone_temp_activity").navigation(ocContactActivity);
                n0.g().m("OcContactActivity_element_click", "phone_num_one_tv", "");
                return;
            case 2:
                int i11 = OcContactActivity.f29378l1;
                ARouter.getInstance().build("/credit_score/oc_phone_temp_activity").navigation(ocContactActivity);
                n0.g().m("OcContactActivity_element_click", "phone_num_two_tv", "");
                return;
            case 3:
                int i12 = OcContactActivity.f29378l1;
                ocContactActivity.F().setText((CharSequence) null);
                n0.g().m("OcContactActivity_element_click", "clear_first_name_img", "");
                return;
            case 4:
                int i13 = OcContactActivity.f29378l1;
                ocContactActivity.I().setText((CharSequence) null);
                n0.g().m("OcContactActivity_element_click", "clear_first_phone_img", "");
                return;
            case 5:
                int i14 = OcContactActivity.f29378l1;
                ocContactActivity.O().setText((CharSequence) null);
                n0.g().m("OcContactActivity_element_click", "clear_second_name_img", "");
                return;
            case 6:
                int i15 = OcContactActivity.f29378l1;
                ocContactActivity.R().setText((CharSequence) null);
                n0.g().m("OcContactActivity_element_click", "clear_second_phone_img", "");
                return;
            case 7:
                int i16 = OcContactActivity.f29378l1;
                ocContactActivity.Y().setText((CharSequence) null);
                n0.g().m("OcContactActivity_element_click", "clear_self_phone_img", "");
                return;
            case 8:
                int i17 = OcContactActivity.f29378l1;
                String strW0 = r0.w0(BaseApplication.get().getUser().getPhoneNumber());
                K k2 = ocContactActivity.d1;
                if (k2 == null) {
                    Intrinsics.n("mFirstLabelAdapter");
                    throw null;
                }
                boolean z10 = true;
                if (k2.f44185g == -1) {
                    t tVar = ocContactActivity.f29389K0;
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setVisibility(0);
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ocContactActivity.b0((TextView) value2);
                    z8 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z8 = true;
                }
                if (ocContactActivity.f29409g1 < 2) {
                    Editable text = ocContactActivity.F().getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text))) {
                        ocContactActivity.L().setText(ocContactActivity.getString(g.cs_input_full_name));
                        ocContactActivity.L().setVisibility(0);
                        ocContactActivity.F().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.L());
                            z8 = false;
                            z3 = true;
                        }
                    } else {
                        Editable text2 = ocContactActivity.F().getText();
                        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                        if (StringsKt.V(text2).length() < 2) {
                            ocContactActivity.L().setText(ocContactActivity.getString(g.cs_name_more_than_two_char));
                            ocContactActivity.L().setVisibility(0);
                            ocContactActivity.F().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.L());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    Editable text3 = ocContactActivity.I().getText();
                    Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text3))) {
                        ocContactActivity.K().setText(ocContactActivity.getString(g.cs_oc_please_input_phone_number));
                        ocContactActivity.K().setVisibility(0);
                        ocContactActivity.I().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.K());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (!OcContactActivity.z(StringsKt.V(ocContactActivity.I().getText().toString()).toString())) {
                        ocContactActivity.K().setText(ocContactActivity.getString(g.cs_oc_input_correct_number));
                        ocContactActivity.K().setVisibility(0);
                        ocContactActivity.I().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.K());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (Intrinsics.c(strW0, StringsKt.V(ocContactActivity.I().getText().toString()).toString())) {
                        ocContactActivity.K().setText(ocContactActivity.getString(g.cs_oc_not_use_own_phone_number));
                        ocContactActivity.K().setVisibility(0);
                        ocContactActivity.I().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.K());
                            z8 = false;
                            z3 = true;
                        }
                    }
                } else {
                    CharSequence text4 = ocContactActivity.G().getText();
                    Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text4))) {
                        ocContactActivity.M().setText(ocContactActivity.getString(g.cs_input_full_name));
                        ocContactActivity.M().setVisibility(0);
                        ocContactActivity.G().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.M());
                            z8 = false;
                            z3 = true;
                        }
                    } else {
                        CharSequence text5 = ocContactActivity.G().getText();
                        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
                        if (StringsKt.V(text5).length() < 2) {
                            ocContactActivity.M().setText(ocContactActivity.getString(g.cs_name_more_than_two_char));
                            ocContactActivity.M().setVisibility(0);
                            ocContactActivity.N().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.L());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    CharSequence text6 = ocContactActivity.H().getText();
                    Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text6))) {
                        ocContactActivity.M().setText(ocContactActivity.getString(g.cs_oc_please_input_phone_number));
                        ocContactActivity.M().setVisibility(0);
                        ocContactActivity.N().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.M());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (!OcContactActivity.z(StringsKt.V(ocContactActivity.H().getText().toString()).toString())) {
                        ocContactActivity.M().setText(ocContactActivity.getString(g.cs_oc_input_correct_number));
                        ocContactActivity.M().setVisibility(0);
                        ocContactActivity.N().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.M());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (Intrinsics.c(strW0, StringsKt.V(ocContactActivity.H().getText().toString()).toString())) {
                        ocContactActivity.M().setText(ocContactActivity.getString(g.cs_oc_not_use_own_phone_number));
                        ocContactActivity.M().setVisibility(0);
                        ocContactActivity.N().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.M());
                            z8 = false;
                            z3 = true;
                        }
                    }
                }
                K k8 = ocContactActivity.f1;
                if (k8 == null) {
                    Intrinsics.n("mSecondLabelAdapter");
                    throw null;
                }
                if (k8.f44185g == -1) {
                    t tVar2 = ocContactActivity.f29420v0;
                    Object value3 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                    ((TextView) value3).setVisibility(0);
                    if (z3) {
                        z8 = false;
                    } else {
                        Object value4 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ocContactActivity.b0((TextView) value4);
                        z8 = false;
                        z3 = true;
                    }
                }
                if (ocContactActivity.f29409g1 < 2) {
                    Editable text7 = ocContactActivity.O().getText();
                    Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text7))) {
                        ocContactActivity.U().setText(ocContactActivity.getString(g.cs_input_full_name));
                        ocContactActivity.U().setVisibility(0);
                        ocContactActivity.O().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.U());
                            z8 = false;
                            z3 = true;
                        }
                    } else {
                        Editable text8 = ocContactActivity.O().getText();
                        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
                        if (StringsKt.V(text8).length() < 2) {
                            ocContactActivity.U().setText(ocContactActivity.getString(g.cs_name_more_than_two_char));
                            ocContactActivity.U().setVisibility(0);
                            ocContactActivity.O().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.U());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    Editable text9 = ocContactActivity.R().getText();
                    Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text9))) {
                        ocContactActivity.T().setText(ocContactActivity.getString(g.cs_oc_please_input_phone_number));
                        ocContactActivity.T().setVisibility(0);
                        ocContactActivity.R().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.T());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (!OcContactActivity.z(StringsKt.V(ocContactActivity.R().getText().toString()).toString())) {
                        ocContactActivity.T().setText(ocContactActivity.getString(g.cs_oc_input_correct_number));
                        ocContactActivity.T().setVisibility(0);
                        ocContactActivity.R().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.T());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (Intrinsics.c(strW0, StringsKt.V(ocContactActivity.R().getText().toString()).toString())) {
                        ocContactActivity.T().setText(ocContactActivity.getString(g.cs_oc_not_use_own_phone_number));
                        ocContactActivity.T().setVisibility(0);
                        ocContactActivity.R().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.T());
                            z8 = false;
                            z3 = true;
                        }
                    }
                } else {
                    CharSequence text10 = ocContactActivity.P().getText();
                    Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text10))) {
                        ocContactActivity.V().setText(ocContactActivity.getString(g.cs_input_full_name));
                        ocContactActivity.V().setVisibility(0);
                        ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.V());
                            z8 = false;
                            z3 = true;
                        }
                    } else {
                        CharSequence text11 = ocContactActivity.P().getText();
                        Intrinsics.checkNotNullExpressionValue(text11, "getText(...)");
                        if (StringsKt.V(text11).length() < 2) {
                            ocContactActivity.V().setText(ocContactActivity.getString(g.cs_name_more_than_two_char));
                            ocContactActivity.V().setVisibility(0);
                            ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.V());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    CharSequence text12 = ocContactActivity.Q().getText();
                    Intrinsics.checkNotNullExpressionValue(text12, "getText(...)");
                    if (TextUtils.isEmpty(StringsKt.V(text12))) {
                        ocContactActivity.V().setText(ocContactActivity.getString(g.cs_oc_please_input_phone_number));
                        ocContactActivity.V().setVisibility(0);
                        ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.V());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (!OcContactActivity.z(StringsKt.V(ocContactActivity.Q().getText().toString()).toString())) {
                        ocContactActivity.V().setText(ocContactActivity.getString(g.cs_oc_input_correct_number));
                        ocContactActivity.V().setVisibility(0);
                        ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.V());
                            z8 = false;
                            z3 = true;
                        }
                    } else if (Intrinsics.c(strW0, StringsKt.V(ocContactActivity.Q().getText().toString()).toString())) {
                        ocContactActivity.V().setText(ocContactActivity.getString(g.cs_oc_not_use_own_phone_number));
                        ocContactActivity.V().setVisibility(0);
                        ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                        if (z3) {
                            z8 = false;
                        } else {
                            ocContactActivity.b0(ocContactActivity.V());
                            z8 = false;
                            z3 = true;
                        }
                    }
                }
                if (ocContactActivity.f29409g1 < 2) {
                    Editable text13 = ocContactActivity.F().getText();
                    Intrinsics.checkNotNullExpressionValue(text13, "getText(...)");
                    if (!TextUtils.isEmpty(StringsKt.V(text13))) {
                        Editable text14 = ocContactActivity.O().getText();
                        Intrinsics.checkNotNullExpressionValue(text14, "getText(...)");
                        if (!TextUtils.isEmpty(StringsKt.V(text14)) && Intrinsics.c(StringsKt.V(ocContactActivity.F().getText().toString()).toString(), StringsKt.V(ocContactActivity.O().getText().toString()).toString())) {
                            ocContactActivity.U().setText(ocContactActivity.getString(g.cs_same_name_warn));
                            ocContactActivity.U().setVisibility(0);
                            ocContactActivity.O().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.U());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    Editable text15 = ocContactActivity.I().getText();
                    Intrinsics.checkNotNullExpressionValue(text15, "getText(...)");
                    if (!TextUtils.isEmpty(StringsKt.V(text15))) {
                        Editable text16 = ocContactActivity.R().getText();
                        Intrinsics.checkNotNullExpressionValue(text16, "getText(...)");
                        if (!TextUtils.isEmpty(StringsKt.V(text16)) && Intrinsics.c(StringsKt.V(ocContactActivity.I().getText().toString()).toString(), StringsKt.V(ocContactActivity.R().getText().toString()).toString())) {
                            ocContactActivity.T().setText(ocContactActivity.getString(g.cs_same_phone_num_warn));
                            ocContactActivity.T().setVisibility(0);
                            ocContactActivity.R().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z10 = z3;
                            } else {
                                ocContactActivity.b0(ocContactActivity.T());
                            }
                            z8 = false;
                        }
                    }
                    z10 = z3;
                } else {
                    CharSequence text17 = ocContactActivity.G().getText();
                    Intrinsics.checkNotNullExpressionValue(text17, "getText(...)");
                    if (!TextUtils.isEmpty(StringsKt.V(text17))) {
                        CharSequence text18 = ocContactActivity.P().getText();
                        Intrinsics.checkNotNullExpressionValue(text18, "getText(...)");
                        if (!TextUtils.isEmpty(StringsKt.V(text18)) && Intrinsics.c(StringsKt.V(ocContactActivity.G().getText().toString()).toString(), StringsKt.V(ocContactActivity.P().getText().toString()).toString())) {
                            ocContactActivity.V().setText(ocContactActivity.getString(g.cs_same_name_warn));
                            ocContactActivity.V().setVisibility(0);
                            ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z8 = false;
                            } else {
                                ocContactActivity.b0(ocContactActivity.V());
                                z8 = false;
                                z3 = true;
                            }
                        }
                    }
                    CharSequence text19 = ocContactActivity.H().getText();
                    Intrinsics.checkNotNullExpressionValue(text19, "getText(...)");
                    if (!TextUtils.isEmpty(StringsKt.V(text19))) {
                        CharSequence text20 = ocContactActivity.Q().getText();
                        Intrinsics.checkNotNullExpressionValue(text20, "getText(...)");
                        if (!TextUtils.isEmpty(StringsKt.V(text20)) && Intrinsics.c(StringsKt.V(ocContactActivity.H().getText().toString()).toString(), StringsKt.V(ocContactActivity.Q().getText().toString()).toString())) {
                            ocContactActivity.V().setText(ocContactActivity.getString(g.cs_same_phone_num_warn));
                            ocContactActivity.V().setVisibility(0);
                            ocContactActivity.W().setBackgroundResource(d.cs_oc_contact_et_bg);
                            if (z3) {
                                z10 = z3;
                            } else {
                                ocContactActivity.b0(ocContactActivity.V());
                            }
                            z8 = false;
                        }
                    }
                    z10 = z3;
                }
                Editable text21 = ocContactActivity.Y().getText();
                Intrinsics.checkNotNullExpressionValue(text21, "getText(...)");
                if (TextUtils.isEmpty(StringsKt.V(text21))) {
                    ocContactActivity.X().setVisibility(8);
                } else {
                    if (!OcContactActivity.z(StringsKt.V(ocContactActivity.Y().getText().toString()).toString())) {
                        ocContactActivity.X().setText(ocContactActivity.getString(g.cs_oc_input_correct_number));
                        ocContactActivity.X().setVisibility(0);
                        if (!z10) {
                            ocContactActivity.b0(ocContactActivity.X());
                        }
                    } else if (Intrinsics.c(strW0, StringsKt.V(ocContactActivity.Y().getText().toString()).toString())) {
                        ocContactActivity.X().setText(ocContactActivity.getString(g.cs_oc_not_use_own_phone_number));
                        ocContactActivity.X().setVisibility(0);
                        if (!z10) {
                            ocContactActivity.b0(ocContactActivity.X());
                        }
                    } else if (Intrinsics.c(StringsKt.V(ocContactActivity.Y().getText().toString()).toString(), StringsKt.V(ocContactActivity.I().getText().toString()).toString()) || Intrinsics.c(StringsKt.V(ocContactActivity.Y().getText().toString()).toString(), StringsKt.V(ocContactActivity.R().getText().toString()).toString())) {
                        ocContactActivity.X().setText(ocContactActivity.getString(g.cs_same_phone_num_warn));
                        ocContactActivity.X().setVisibility(0);
                        if (!z10) {
                            ocContactActivity.b0(ocContactActivity.X());
                        }
                    }
                    z8 = false;
                }
                if (z8) {
                    ocContactActivity.a0(0, ocContactActivity.f29409g1 < 2 ? StringsKt.V(ocContactActivity.I().getText().toString()).toString() : StringsKt.V(ocContactActivity.H().getText().toString()).toString());
                }
                n0 n0VarG2 = n0.g();
                OcApplyData ocApplyData2 = ocContactActivity.f29248B;
                n0VarG2.m("OcContactActivity_element_click", "contact_next_bt", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                return;
            case 9:
                int i18 = OcContactActivity.f29378l1;
                ocContactActivity.v();
                n0 n0VarG3 = n0.g();
                OcApplyData ocApplyData3 = ocContactActivity.f29248B;
                n0VarG3.m("OcContactActivity_element_click", "router_close_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                return;
            case 10:
                int i19 = OcContactActivity.f29378l1;
                c cVar = new c(ocContactActivity);
                cVar.f6605k = false;
                cVar.f6596b = O6.d.f(ocContactActivity.getString(g.cs_oc_filling_out_contacts));
                cVar.f6598d = ocContactActivity.getString(g.cs_oc_skip_contact_content);
                String string = ocContactActivity.getString(g.cs_oc_exit);
                E e10 = new E(ocContactActivity, 13);
                cVar.f6601g = string;
                cVar.f6603i = e10;
                cVar.f6600f = ocContactActivity.getString(k.core_continue);
                cVar.f6602h = null;
                cVar.a().show();
                n0.g().m("OcContactActivity_element_click", "router_right_tv", "");
                return;
            case 11:
                int i20 = OcContactActivity.f29378l1;
                try {
                    ocContactActivity.j1 = 1000;
                    ocContactActivity.f29413k1.a(null);
                    break;
                } catch (Exception unused) {
                    ToastUtils.showLong("Can't select contact", new Object[0]);
                }
                n0.g().m("OcContactActivity_element_click", "first_select_ll", "");
                return;
            case 12:
                int i21 = OcContactActivity.f29378l1;
                try {
                    ocContactActivity.j1 = 1001;
                    ocContactActivity.f29413k1.a(null);
                    break;
                } catch (Exception unused2) {
                    ToastUtils.showLong("Can't select contact", new Object[0]);
                }
                n0.g().m("OcContactActivity_element_click", "second_select_ll", "");
                return;
            default:
                int i22 = OcContactActivity.f29378l1;
                ocContactActivity.r();
                return;
        }
    }
}
