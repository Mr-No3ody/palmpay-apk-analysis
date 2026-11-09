package com.transsnet.palmpay.account.ui.dialog;

import C0.G;
import F8.d;
import F8.e;
import I8.g;
import Nc.x;
import Pa.n0;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.TeenagerPopInfo;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/ConfirmDobDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/account/bean/rsp/CheckIdentifyRsp;", "rsp", "Lkotlin/Function0;", "", "onCompleted", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/account/bean/rsp/CheckIdentifyRsp;Lkotlin/jvm/functions/Function0;)V", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/account/bean/rsp/CheckIdentifyRsp;", "Lkotlin/jvm/functions/Function0;", "LI8/g;", "binding", "LI8/g;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmDobDialog extends b implements View.OnClickListener {

    @Nullable
    private g binding;

    @Nullable
    private Function0<Unit> onCompleted;

    @Nullable
    private CheckIdentifyRsp rsp;

    public /* synthetic */ ConfirmDobDialog(Context context, CheckIdentifyRsp checkIdentifyRsp, Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, checkIdentifyRsp, (i7 & 4) != 0 ? null : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1$lambda$0(ConfirmDobDialog confirmDobDialog, View view) {
        TeenagerPopInfo teenagerPopInfo;
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("Popup_Confirm_DOB_Click_Close");
        CheckIdentifyRsp checkIdentifyRsp = confirmDobDialog.rsp;
        n0VarG.k(clickEvent.add("age-type", (checkIdentifyRsp == null || (teenagerPopInfo = checkIdentifyRsp.teenagerPop) == null) ? null : Integer.valueOf(teenagerPopInfo.ageGrade).toString()));
        confirmDobDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TeenagerPopInfo teenagerPopInfo;
        View viewFindViewById = findViewById(d.rootView);
        int i7 = d.btnCancel;
        TextView textView = (TextView) a.m(i7, viewFindViewById);
        if (textView != null) {
            i7 = d.btnContinue;
            PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
            if (ppButton != null) {
                i7 = d.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = d.layoutInfo;
                    if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                        i7 = d.tv1;
                        TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                        if (textView2 != null) {
                            i7 = d.tvLevel;
                            TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                            if (textView3 != null) {
                                i7 = d.tvMsg;
                                TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                                if (textView4 != null) {
                                    i7 = d.tvTitle;
                                    TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView5 != null) {
                                        this.binding = new g(constraintLayout, textView, ppButton, iconicsImageView, textView2, textView3, textView4, textView5);
                                        h.q(this, ppButton, textView);
                                        CheckIdentifyRsp checkIdentifyRsp = this.rsp;
                                        if (checkIdentifyRsp == null || (teenagerPopInfo = checkIdentifyRsp.teenagerPop) == null) {
                                            return;
                                        }
                                        g gVar = this.binding;
                                        if (gVar != null) {
                                            gVar.f4083g.setText(teenagerPopInfo.popTitle);
                                        }
                                        g gVar2 = this.binding;
                                        if (gVar2 != null) {
                                            gVar2.f4082f.setText(new SpanUtils().append(teenagerPopInfo.popMsg).append(teenagerPopInfo.popHighlightMsg).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())).create());
                                        }
                                        g gVar3 = this.binding;
                                        if (gVar3 != null) {
                                            gVar3.f4081e.setText(teenagerPopInfo.birthday);
                                        }
                                        g gVar4 = this.binding;
                                        if (gVar4 != null) {
                                            gVar4.f4079c.setOnClickListener(new x(this, 16));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        TeenagerPopInfo teenagerPopInfo;
        TeenagerPopInfo teenagerPopInfo2;
        String string = null;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = d.btnContinue;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = (ClickEvent) G.f("Popup_Confirm_DOB_Click", FirebaseAnalytics.Param.CONTENT, "Continue");
            CheckIdentifyRsp checkIdentifyRsp = this.rsp;
            if (checkIdentifyRsp != null && (teenagerPopInfo2 = checkIdentifyRsp.teenagerPop) != null) {
                string = Integer.valueOf(teenagerPopInfo2.ageGrade).toString();
            }
            n0VarG.k(clickEvent.add("age-type", string));
            Function0<Unit> function0 = this.onCompleted;
            if (function0 != null) {
                function0.invoke();
            }
            dismiss();
            return;
        }
        int i10 = d.btnCancel;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            n0 n0VarG2 = n0.g();
            ClickEvent clickEvent2 = (ClickEvent) G.f("Popup_Confirm_DOB_Click", FirebaseAnalytics.Param.CONTENT, "Re-enter ID");
            CheckIdentifyRsp checkIdentifyRsp2 = this.rsp;
            if (checkIdentifyRsp2 != null && (teenagerPopInfo = checkIdentifyRsp2.teenagerPop) != null) {
                string = Integer.valueOf(teenagerPopInfo.ageGrade).toString();
            }
            n0VarG2.k(clickEvent2.add("age-type", string));
            dismiss();
        }
    }

    public ConfirmDobDialog(@Nullable Context context, @Nullable CheckIdentifyRsp checkIdentifyRsp, @Nullable Function0<Unit> function0) {
        super(context, e.ac_dialog_confirm_dob);
        this.rsp = checkIdentifyRsp;
        this.onCompleted = function0;
    }
}
