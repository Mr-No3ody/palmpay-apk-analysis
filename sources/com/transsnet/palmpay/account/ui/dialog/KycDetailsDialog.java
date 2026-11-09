package com.transsnet.palmpay.account.ui.dialog;

import C9.C0142i;
import F8.e;
import I8.j;
import K8.a;
import Pa.i0;
import Pa.r0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.UserRawIdNo;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.TimeUtils;
import io.fastkv.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010BC\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010\u0012J\u0019\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/KycDetailsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "activity", "Lcom/transsnet/palmpay/account/bean/RealNameAuthInfoRsp;", "rsp", "Lcom/transsnet/palmpay/account/bean/rsp/UserRawIdNo;", "userRawIdNo", "Lkotlin/Function1;", "", "", "logClickEvent", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/core/base/BaseActivity;Lcom/transsnet/palmpay/account/bean/RealNameAuthInfoRsp;Lcom/transsnet/palmpay/account/bean/rsp/UserRawIdNo;Lkotlin/jvm/functions/Function1;)V", "updateNinBvnInfo", "()V", ReactTextInputShadowNode.PROP_TEXT, "", "labelResId", "copyToClipboard", "(Ljava/lang/String;I)V", "updateUserInfo", "handleFacePhoto", "showFacePhoto", "handleUpdateInfo", "dateStr", "Ljava/util/Calendar;", "parseDate", "(Ljava/lang/String;)Ljava/util/Calendar;", "initViews", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/account/bean/RealNameAuthInfoRsp;", "Lcom/transsnet/palmpay/account/bean/rsp/UserRawIdNo;", "Lkotlin/jvm/functions/Function1;", "LI8/j;", "binding", "LI8/j;", "Ljava/lang/ref/WeakReference;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Companion", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKycDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycDetailsDialog.kt\ncom/transsnet/palmpay/account/ui/dialog/KycDetailsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n1#2:257\n*E\n"})
public final class KycDetailsDialog extends b implements View.OnClickListener {

    @NotNull
    private static final String DISPLAY_DATE_FORMAT = "dd/MM/yyyy";

    @NotNull
    private static final String HIDE_DATE_FORMAT = "MMM dd,yyyy";

    @NotNull
    private static final String UPLOAD_DATE_FORMAT = "yyyy-MM-dd";

    @Nullable
    private final BaseActivity activity;

    @Nullable
    private j binding;

    @NotNull
    private final Function1<String, Unit> logClickEvent;

    @Nullable
    private final RealNameAuthInfoRsp rsp;

    @Nullable
    private final UserRawIdNo userRawIdNo;

    @Nullable
    private WeakReference<BaseActivity> weakActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KycDetailsDialog(@Nullable Context context, @Nullable BaseActivity baseActivity, @Nullable RealNameAuthInfoRsp realNameAuthInfoRsp, @Nullable UserRawIdNo userRawIdNo, @NotNull Function1<? super String, Unit> logClickEvent) {
        super(context, e.ac_dialog_kyc_details);
        Intrinsics.checkNotNullParameter(logClickEvent, "logClickEvent");
        this.activity = baseActivity;
        this.rsp = realNameAuthInfoRsp;
        this.userRawIdNo = userRawIdNo;
        this.logClickEvent = logClickEvent;
    }

    private final void copyToClipboard(String text, int labelResId) {
        if (TextUtils.isEmpty(text)) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            h.x(context, getContext().getString(F8.h.ac_guardian_copy_nothing));
            return;
        }
        Object systemService = getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(getContext().getString(labelResId), text));
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        h.x(context2, getContext().getString(F8.h.ac_copied));
    }

    private final void handleFacePhoto() {
        if (this.userRawIdNo != null) {
            showFacePhoto();
        }
        dismiss();
    }

    private final void handleUpdateInfo() {
        RealNameAuthInfoRsp realNameAuthInfoRsp = this.rsp;
        if (TextUtils.isEmpty(realNameAuthInfoRsp != null ? realNameAuthInfoRsp.bvn : null)) {
            Context context = getContext();
            if (context != null) {
                Context context2 = getContext();
                String string = context2 != null ? context2.getString(F8.h.ac_update_failed) : null;
                Context context3 = getContext();
                String string2 = context3 != null ? context3.getString(F8.h.ac_verify_bvn_first_and_sync_info) : null;
                Context context4 = getContext();
                n.O(context, 0, null, string, null, null, null, string2, null, context4 != null ? context4.getString(F8.h.ac_verify_bvn) : null, new a(21), null, null, null, null, false, 0, 8386939);
            }
        } else {
            Bundle bundle = new Bundle();
            RealNameAuthInfoRsp realNameAuthInfoRsp2 = this.rsp;
            bundle.putString("bvn", realNameAuthInfoRsp2 != null ? realNameAuthInfoRsp2.bvn : null);
            User user = BaseApplication.get().getUser();
            if (user != null) {
                bundle.putString("birthday", user.getBirthdayHide());
                bundle.putString("name", user.getFullName());
                bundle.putString("gender", user.getDisplayGender());
            }
            d.x(bundle, "UpdateBvnInfo");
        }
        dismiss();
    }

    private final Calendar parseDate(String dateStr) {
        Date date;
        if (dateStr == null) {
            return null;
        }
        try {
            try {
                date = new SimpleDateFormat(DISPLAY_DATE_FORMAT, Locale.ENGLISH).parse(dateStr);
            } catch (Exception unused) {
                date = new SimpleDateFormat(UPLOAD_DATE_FORMAT, Locale.ENGLISH).parse(dateStr);
            }
        } catch (Exception unused2) {
            date = null;
        }
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    private final void showFacePhoto() {
        RealNameAuthInfoRsp realNameAuthInfoRsp;
        RealNameAuthInfoRsp.NinInfo ninInfo;
        BaseActivity baseActivity;
        RealNameAuthInfoRsp realNameAuthInfoRsp2;
        RealNameAuthInfoRsp.NinInfo ninInfo2;
        RealNameAuthInfoRsp realNameAuthInfoRsp3 = this.rsp;
        String str = (!TextUtils.isEmpty((realNameAuthInfoRsp3 == null || (ninInfo2 = realNameAuthInfoRsp3.bvnInfo) == null) ? null : ninInfo2.s3Url) ? !((realNameAuthInfoRsp = this.rsp) == null || (ninInfo = realNameAuthInfoRsp.bvnInfo) == null) : !((realNameAuthInfoRsp2 = this.rsp) == null || (ninInfo = realNameAuthInfoRsp2.ninInfo) == null)) ? null : ninInfo.s3Url;
        if (TextUtils.isEmpty(str)) {
            Context context = getContext();
            if (context != null) {
                Context context2 = getContext();
                h.x(context, context2 != null ? context2.getString(F8.h.ac_face_photo_not_available) : null);
                return;
            }
            return;
        }
        if (str != null) {
            String str2 = TextUtils.isEmpty(str) ? null : str;
            if (str2 != null) {
                WeakReference<BaseActivity> weakReference = this.weakActivity;
                if (weakReference != null && (baseActivity = weakReference.get()) != null) {
                    baseActivity.showLoadingDialog(true);
                }
                r0.E1(getContext(), str2, new C0142i(this, 6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFacePhoto$lambda$5$lambda$4(KycDetailsDialog kycDetailsDialog, File[] fileArr) {
        BaseActivity baseActivity;
        WeakReference<BaseActivity> weakReference = kycDetailsDialog.weakActivity;
        if (weakReference != null && (baseActivity = weakReference.get()) != null) {
            baseActivity.showLoadingDialog(false);
        }
        File file = fileArr[0];
        if (file != null) {
            WeakReference<BaseActivity> weakReference2 = kycDetailsDialog.weakActivity;
            Intent intent = new Intent(weakReference2 != null ? weakReference2.get() : null, (Class<?>) PhotoViewerActivity.class);
            intent.setData(Uri.fromFile(file));
            ActivityUtils.startActivity(intent);
        }
    }

    private final void updateNinBvnInfo() {
        j jVar;
        TextView textView;
        j jVar2;
        TextView textView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        UserRawIdNo userRawIdNo = this.userRawIdNo;
        String authIdNum = userRawIdNo != null ? userRawIdNo.getAuthIdNum() : null;
        UserRawIdNo userRawIdNo2 = this.userRawIdNo;
        String bvn = userRawIdNo2 != null ? userRawIdNo2.getBvn() : null;
        boolean zIsEmpty = TextUtils.isEmpty(authIdNum);
        boolean z3 = !zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(bvn);
        boolean z8 = !zIsEmpty2;
        j jVar3 = this.binding;
        if (jVar3 != null && (linearLayout4 = jVar3.f4095A) != null) {
            h.s(linearLayout4, z3);
        }
        j jVar4 = this.binding;
        if (jVar4 != null && (linearLayout3 = jVar4.f4121w) != null) {
            h.s(linearLayout3, zIsEmpty);
        }
        j jVar5 = this.binding;
        if (jVar5 != null && (linearLayout2 = jVar5.t) != null) {
            h.s(linearLayout2, zIsEmpty2);
        }
        j jVar6 = this.binding;
        if (jVar6 != null && (linearLayout = jVar6.f4120v) != null) {
            h.s(linearLayout, z8);
        }
        if (!zIsEmpty && (jVar2 = this.binding) != null && (textView2 = jVar2.f4118q0) != null) {
            textView2.setText(i0.m(authIdNum));
        }
        if (zIsEmpty2 || (jVar = this.binding) == null || (textView = jVar.f4114k0) == null) {
            return;
        }
        textView.setText(i0.m(bvn));
    }

    private final void updateUserInfo() {
        j jVar;
        TextView textView;
        TextView textView2;
        j jVar2;
        TextView textView3;
        TextView textView4;
        j jVar3;
        TextView textView5;
        TextView textView6;
        j jVar4;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        User user = BaseApplication.get().getUser();
        if (user != null) {
            j jVar5 = this.binding;
            if (jVar5 != null && (textView9 = jVar5.f4097C) != null) {
                textView9.setText(user.getFullName());
            }
            j jVar6 = this.binding;
            if (jVar6 != null && (textView8 = jVar6.f4099L) != null) {
                textView8.setText(user.getDisplayGender());
            }
            Calendar date = parseDate(user.getBirthday());
            if (date != null && (jVar4 = this.binding) != null && (textView7 = jVar4.f4101Q) != null) {
                textView7.setText(TimeUtils.millis2String(date.getTimeInMillis(), new SimpleDateFormat(HIDE_DATE_FORMAT, Locale.ENGLISH)));
            }
            j jVar7 = this.binding;
            if (TextUtils.isEmpty((jVar7 == null || (textView6 = jVar7.f4101Q) == null) ? null : textView6.getText()) && (jVar3 = this.binding) != null && (textView5 = jVar3.f4101Q) != null) {
                Context context = getContext();
                textView5.setText(context != null ? context.getString(F8.h.ac_minor_info_placeholder) : null);
            }
            j jVar8 = this.binding;
            if (TextUtils.isEmpty((jVar8 == null || (textView4 = jVar8.f4097C) == null) ? null : textView4.getText()) && (jVar2 = this.binding) != null && (textView3 = jVar2.f4097C) != null) {
                Context context2 = getContext();
                textView3.setText(context2 != null ? context2.getString(F8.h.ac_minor_info_placeholder) : null);
            }
            j jVar9 = this.binding;
            if (!TextUtils.isEmpty((jVar9 == null || (textView2 = jVar9.f4099L) == null) ? null : textView2.getText()) || (jVar = this.binding) == null || (textView = jVar.f4099L) == null) {
                return;
            }
            Context context3 = getContext();
            textView.setText(context3 != null ? context3.getString(F8.h.ac_minor_info_placeholder) : null);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewM2;
        View viewM3;
        View viewM4;
        View viewM5;
        View viewM6;
        TextView textView;
        View viewFindViewById = findViewById(F8.d.rootView);
        int i7 = F8.d.btnUpdateInfo;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewFindViewById);
        if (ppButton != null && (viewM = p059e1.a.m((i7 = F8.d.dividerBvn), viewFindViewById)) != null && (viewM2 = p059e1.a.m((i7 = F8.d.dividerDob), viewFindViewById)) != null && (viewM3 = p059e1.a.m((i7 = F8.d.dividerFacePhoto), viewFindViewById)) != null && (viewM4 = p059e1.a.m((i7 = F8.d.dividerGender), viewFindViewById)) != null && (viewM5 = p059e1.a.m((i7 = F8.d.dividerName), viewFindViewById)) != null && (viewM6 = p059e1.a.m((i7 = F8.d.dividerNin), viewFindViewById)) != null) {
            i7 = F8.d.ivBvnCopy;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = F8.d.ivClose;
                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
                if (iconicsImageView2 != null) {
                    i7 = F8.d.ivNinCopy;
                    IconicsImageView iconicsImageView3 = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
                    if (iconicsImageView3 != null) {
                        i7 = F8.d.layoutBvnUnVerified;
                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                        if (linearLayout != null) {
                            i7 = F8.d.layoutBvnVerified;
                            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                            if (linearLayout2 != null) {
                                i7 = F8.d.layoutInfo;
                                if (((LinearLayout) p059e1.a.m(i7, viewFindViewById)) != null) {
                                    i7 = F8.d.layoutNinUnVerified;
                                    LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                                    if (linearLayout3 != null) {
                                        i7 = F8.d.layoutNinVerified;
                                        LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                                        if (linearLayout4 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                                            i7 = F8.d.tv11;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                            if (textView2 != null) {
                                                i7 = F8.d.tv12;
                                                TextView textView3 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                if (textView3 != null) {
                                                    i7 = F8.d.tv21;
                                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                    if (textView4 != null) {
                                                        i7 = F8.d.tv22;
                                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                        if (textView5 != null) {
                                                            i7 = F8.d.tv31;
                                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                            if (textView6 != null) {
                                                                i7 = F8.d.tv32;
                                                                TextView textView7 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                if (textView7 != null) {
                                                                    i7 = F8.d.tv51;
                                                                    TextView textView8 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                    if (textView8 != null) {
                                                                        i7 = F8.d.tv52;
                                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewFindViewById);
                                                                        if (iconicsTextView != null) {
                                                                            i7 = F8.d.tvBvnLabel;
                                                                            TextView textView9 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                            if (textView9 != null) {
                                                                                i7 = F8.d.tvBvnValue;
                                                                                TextView textView10 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                                if (textView10 != null) {
                                                                                    i7 = F8.d.tvNinLabel;
                                                                                    TextView textView11 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                                    if (textView11 != null) {
                                                                                        i7 = F8.d.tvNinValue;
                                                                                        TextView textView12 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                                        if (textView12 != null) {
                                                                                            i7 = F8.d.tvTitle;
                                                                                            TextView textView13 = (TextView) p059e1.a.m(i7, viewFindViewById);
                                                                                            if (textView13 != null) {
                                                                                                this.binding = new j(constraintLayout, ppButton, viewM, viewM2, viewM3, viewM4, viewM5, viewM6, iconicsImageView, iconicsImageView2, iconicsImageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView2, textView3, textView4, textView5, textView6, textView7, textView8, iconicsTextView, textView9, textView10, textView11, textView12, textView13);
                                                                                                this.weakActivity = new WeakReference<>(this.activity);
                                                                                                showAtBottom(getWindow());
                                                                                                j jVar = this.binding;
                                                                                                if (jVar != null && (textView = jVar.f4106b.getTextView()) != null) {
                                                                                                    textView.setCompoundDrawables(p059e1.a.h(getContext(), S6.a.pay_Update, null, CommonViewExtKt.colorInt(L6.b.ppColorTextBase, this.mContext), 20.0f), null, null, null);
                                                                                                }
                                                                                                j jVar2 = this.binding;
                                                                                                h.q(this, jVar2 != null ? jVar2.f4115o : null, jVar2 != null ? jVar2.f4103Y : null, jVar2 != null ? jVar2.f4106b : null, jVar2 != null ? jVar2.f4116p : null, jVar2 != null ? jVar2.f4113j : null, jVar2 != null ? jVar2.t : null, jVar2 != null ? jVar2.f4121w : null);
                                                                                                updateNinBvnInfo();
                                                                                                updateUserInfo();
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        if (r0.U0()) {
            return;
        }
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = F8.d.ivClose;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            dismiss();
            return;
        }
        int i10 = F8.d.tv52;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            handleFacePhoto();
            return;
        }
        int i11 = F8.d.btnUpdateInfo;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            handleUpdateInfo();
            return;
        }
        int i12 = F8.d.layoutBvnUnVerified;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            this.logClickEvent.invoke("verifybvn");
            d.F("/account/add_extra");
            dismiss();
            return;
        }
        int i13 = F8.d.layoutNinUnVerified;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            this.logClickEvent.invoke("verifynin");
            d.F("/account/add_extra");
            dismiss();
            return;
        }
        int i14 = F8.d.ivNinCopy;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            this.logClickEvent.invoke("copyNIN");
            UserRawIdNo userRawIdNo = this.userRawIdNo;
            copyToClipboard(userRawIdNo != null ? userRawIdNo.getAuthIdNum() : null, F8.h.ac_nin);
            return;
        }
        int i15 = F8.d.ivBvnCopy;
        if (numValueOf != null && numValueOf.intValue() == i15) {
            this.logClickEvent.invoke("copyBVN");
            UserRawIdNo userRawIdNo2 = this.userRawIdNo;
            copyToClipboard(userRawIdNo2 != null ? userRawIdNo2.getBvn() : null, F8.h.ac_bvn);
        }
    }
}
