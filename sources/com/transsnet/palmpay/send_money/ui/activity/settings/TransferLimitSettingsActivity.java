package com.transsnet.palmpay.send_money.ui.activity.settings;

import Kd.C0;
import Kd.D0;
import Pa.n0;
import Pa.r0;
import Rf.g;
import Wd.C0742p;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.TransferLimitSettingResp;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferLimitSettingsActivity;
import com.transsnet.palmpay.send_money.viewmodel.TransferLimitSettingsViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p159kd.f;
import p159kd.h;
import p223od.e;
import p284sb.C2023v;
import p327vd.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/transfer_limit_settings")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/settings/TransferLimitSettingsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferLimitSettingsViewModel;", "Lod/e;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferLimitSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferLimitSettingsActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/settings/TransferLimitSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,348:1\n1#2:349\n171#3,12:350\n215#3:362\n171#3,12:363\n215#3:375\n257#4,2:376\n425#5:378\n507#5,5:379\n*S KotlinDebug\n*F\n+ 1 TransferLimitSettingsActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/settings/TransferLimitSettingsActivity\n*L\n85#1:350,12\n85#1:362\n98#1:363,12\n98#1:375\n275#1:376,2\n331#1:378\n331#1:379,5\n*E\n"})
public final class TransferLimitSettingsActivity extends BaseMvvmVBActivity<TransferLimitSettingsViewModel, e> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33418i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TransferLimitSettingResp f33419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f33420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f33421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33422g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static String o(long j6) {
        String strF = r0.F(j6);
        Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
        return strF;
    }

    public static Long p(Editable editable) {
        Long lU;
        if (editable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = editable.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = editable.charAt(i7);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (string == null || (lU = StringsKt.U(string)) == null) {
            return null;
        }
        try {
            return Long.valueOf(Math.multiplyExact(lU.longValue(), 100L));
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((TransferLimitSettingsViewModel) l()).f34032e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new b(this, this, 0), 14));
        }
        l lVar2 = ((TransferLimitSettingsViewModel) l()).f34033f;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new b(this, this, 1), 14));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.sm_activity_transfer_limit_settings, (ViewGroup) null, false);
        int i7 = p159kd.e.dailyLimitDivider;
        View viewM2 = p059e1.a.m(i7, viewInflate);
        if (viewM2 != null) {
            i7 = p159kd.e.dailyLimitEditIcon;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = p159kd.e.dailyLimitError;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = p159kd.e.dailyLimitInput;
                    EditText editText = (EditText) p059e1.a.m(i7, viewInflate);
                    if (editText != null) {
                        i7 = p159kd.e.dailyLimitLabel;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = p159kd.e.kycLimitDescription;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = p159kd.e.limitCard;
                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = p159kd.e.saveChangesButton;
                                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                    if (ppButton != null && (viewM = p059e1.a.m((i7 = p159kd.e.singleLimitDivider), viewInflate)) != null) {
                                        i7 = p159kd.e.singleLimitEditIcon;
                                        IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                        if (iconicsImageView2 != null) {
                                            i7 = p159kd.e.singleLimitError;
                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = p159kd.e.singleLimitInput;
                                                EditText editText2 = (EditText) p059e1.a.m(i7, viewInflate);
                                                if (editText2 != null) {
                                                    i7 = p159kd.e.singleLimitLabel;
                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView5 != null) {
                                                        i7 = p159kd.e.titleBar;
                                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                        if (ppTitleBar != null) {
                                                            e eVar = new e((ConstraintLayout) viewInflate, viewM2, iconicsImageView, textView, editText, textView2, textView3, ppButton, viewM, iconicsImageView2, textView4, editText2, textView5, ppTitleBar);
                                                            Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                                                            return eVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.requestFocus();
        editText.selectAll();
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 4203 && i10 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("extra_data") : null;
            if (stringExtra == null || StringsKt.F(stringExtra)) {
                ToastUtils.showLong(getString(h.sm_kk_verify_token_missing), new Object[0]);
                return;
            }
            e eVar = (e) this.f27334c;
            Long lP = p(eVar != null ? eVar.f40329e.getText() : null);
            if (lP != null) {
                long jLongValue = lP.longValue();
                e eVar2 = (e) this.f27334c;
                Long lP2 = p(eVar2 != null ? eVar2.t.getText() : null);
                if (lP2 != null) {
                    long jLongValue2 = lP2.longValue();
                    TransferLimitSettingsViewModel transferLimitSettingsViewModel = (TransferLimitSettingsViewModel) l();
                    transferLimitSettingsViewModel.getClass();
                    p140j8.f.s(transferLimitSettingsViewModel, new D0(jLongValue2, jLongValue, null), transferLimitSettingsViewModel.f34033f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        TransferLimitSettingsViewModel transferLimitSettingsViewModel = (TransferLimitSettingsViewModel) l();
        transferLimitSettingsViewModel.getClass();
        p140j8.f.s(transferLimitSettingsViewModel, new C0(1, null), transferLimitSettingsViewModel.f34032e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final void q(boolean z3, boolean z8, long j6, long j10, String str) {
        TextView textView;
        View view = null;
        if (z3) {
            e eVar = (e) this.f27334c;
            if (eVar != null) {
                textView = eVar.f40328d;
            } else {
                textView = null;
            }
        } else {
            e eVar2 = (e) this.f27334c;
            if (eVar2 != null) {
                textView = eVar2.f40335p;
            } else {
                textView = null;
            }
        }
        if (z3) {
            e eVar3 = (e) this.f27334c;
            if (eVar3 != null) {
                view = eVar3.f40326b;
            }
        } else {
            e eVar4 = (e) this.f27334c;
            if (eVar4 != null) {
                view = eVar4.f40333j;
            }
        }
        if (textView != null) {
            textView.setVisibility(z8 ? 0 : 8);
        }
        if (z8 && textView != null) {
            if (str == null) {
                str = getString(h.sm_transfer_limit_range_error, o(j6), o(j10));
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            textView.setText(str);
        }
        if (view != null) {
            view.setBackgroundColor(z8 ? CommonViewExtKt.colorInt(L6.b.ppColorError, this) : CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    public final boolean r() {
        boolean z3;
        boolean z8;
        long jLongValue;
        boolean z10;
        String string;
        boolean z11;
        e eVar;
        boolean z12;
        TransferLimitSettingResp transferLimitSettingResp = this.f33419d;
        if (transferLimitSettingResp == null) {
            e eVar2 = (e) this.f27334c;
            if (eVar2 == null) {
                return false;
            }
            eVar2.f40332i.setEnabled(false);
            return false;
        }
        e eVar3 = (e) this.f27334c;
        Long lP = p(eVar3 != null ? eVar3.f40329e.getText() : null);
        e eVar4 = (e) this.f27334c;
        Long lP2 = p(eVar4 != null ? eVar4.t.getText() : null);
        Long dailyLimitMin = transferLimitSettingResp.getDailyLimitMin();
        if (dailyLimitMin == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue2 = dailyLimitMin.longValue();
        Long dailyLimitMax = transferLimitSettingResp.getDailyLimitMax();
        if (dailyLimitMax == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue3 = dailyLimitMax.longValue();
        Long singleLimitMin = transferLimitSettingResp.getSingleLimitMin();
        if (singleLimitMin == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue4 = singleLimitMin.longValue();
        if (lP != null) {
            z3 = false;
            if (new g(jLongValue2, jLongValue3).a(lP.longValue())) {
                z8 = true;
            }
            if (z8) {
                jLongValue = jLongValue3;
            } else {
                if (lP != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                jLongValue = lP.longValue();
            }
            if (z8 || lP2 == null || lP2.longValue() < jLongValue4 || lP2.longValue() > jLongValue) {
                z10 = z3;
            } else {
                z10 = true;
            }
            q(true, !z8, jLongValue2, jLongValue3, null);
            boolean z13 = !z10;
            if (z8) {
                string = null;
            } else {
                string = getString(h.sm_set_valid_daily_limit_first);
            }
            q(false, z13, jLongValue4, jLongValue, string);
            if (Intrinsics.c(lP, this.f33420e) || !Intrinsics.c(lP2, this.f33421f)) {
                z11 = true;
            } else {
                z11 = z3;
            }
            eVar = (e) this.f27334c;
            if (eVar != null) {
                PpButton ppButton = eVar.f40332i;
                if (!z8 && z10 && z11) {
                    z12 = true;
                } else {
                    z12 = z3;
                }
                ppButton.setEnabled(z12);
            }
            if (!z8 && z10) {
                return true;
            }
        }
        z3 = false;
        z8 = z3;
        if (z8) {
            jLongValue = jLongValue3;
        } else {
            if (lP != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            jLongValue = lP.longValue();
        }
        if (z8) {
            z10 = z3;
        } else {
            z10 = z3;
        }
        q(true, !z8, jLongValue2, jLongValue3, null);
        boolean z14 = !z10;
        if (z8) {
            string = null;
        } else {
            string = getString(h.sm_set_valid_daily_limit_first);
        }
        q(false, z14, jLongValue4, jLongValue, string);
        if (Intrinsics.c(lP, this.f33420e)) {
            z11 = true;
        } else {
            z11 = true;
        }
        eVar = (e) this.f27334c;
        if (eVar != null) {
            PpButton ppButton2 = eVar.f40332i;
            if (!z8) {
                z12 = z3;
            } else {
                z12 = z3;
            }
            ppButton2.setEnabled(z12);
        }
        return !z8 ? z3 : z3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView backImageView;
        super.setupView();
        n0.g().v("Transfer_LimitSettings_View");
        e eVar = (e) this.f27334c;
        if (eVar != null && (backImageView = eVar.f40337w.getBackImageView()) != null) {
            final int i7 = 0;
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: vd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferLimitSettingsActivity f43155b;

                {
                    this.f43155b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferLimitSettingsActivity transferLimitSettingsActivity = this.f43155b;
                    switch (i7) {
                        case 0:
                            int i10 = TransferLimitSettingsActivity.f33418i;
                            transferLimitSettingsActivity.finish();
                            break;
                        case 1:
                            int i11 = TransferLimitSettingsActivity.f33418i;
                            e eVar2 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar2 != null ? eVar2.f40329e : null);
                            break;
                        case 2:
                            int i12 = TransferLimitSettingsActivity.f33418i;
                            e eVar3 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar3 != null ? eVar3.t : null);
                            break;
                        default:
                            int i13 = TransferLimitSettingsActivity.f33418i;
                            if (!r0.U0()) {
                                n0.g().l("Transfer_LimitSettings_Save_Click");
                                e eVar4 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP = TransferLimitSettingsActivity.p(eVar4 != null ? eVar4.f40329e.getText() : null);
                                e eVar5 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP2 = TransferLimitSettingsActivity.p(eVar5 != null ? eVar5.t.getText() : null);
                                if (transferLimitSettingsActivity.r() && lP != null && lP2 != null) {
                                    if (lP2.longValue() <= lP.longValue()) {
                                        ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.TRANSFER_SETTINGS).navigation(transferLimitSettingsActivity, 4203);
                                    } else {
                                        ToastUtils.showLong(transferLimitSettingsActivity.getString(h.sm_single_limit_exceeds_daily), new Object[0]);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        e eVar2 = (e) this.f27334c;
        if (eVar2 != null) {
            final int i10 = 1;
            eVar2.f40327c.setOnClickListener(new View.OnClickListener(this) { // from class: vd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferLimitSettingsActivity f43155b;

                {
                    this.f43155b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferLimitSettingsActivity transferLimitSettingsActivity = this.f43155b;
                    switch (i10) {
                        case 0:
                            int i11 = TransferLimitSettingsActivity.f33418i;
                            transferLimitSettingsActivity.finish();
                            break;
                        case 1:
                            int i12 = TransferLimitSettingsActivity.f33418i;
                            e eVar3 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar3 != null ? eVar3.f40329e : null);
                            break;
                        case 2:
                            int i13 = TransferLimitSettingsActivity.f33418i;
                            e eVar4 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar4 != null ? eVar4.t : null);
                            break;
                        default:
                            int i14 = TransferLimitSettingsActivity.f33418i;
                            if (!r0.U0()) {
                                n0.g().l("Transfer_LimitSettings_Save_Click");
                                e eVar5 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP = TransferLimitSettingsActivity.p(eVar5 != null ? eVar5.f40329e.getText() : null);
                                e eVar6 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP2 = TransferLimitSettingsActivity.p(eVar6 != null ? eVar6.t.getText() : null);
                                if (transferLimitSettingsActivity.r() && lP != null && lP2 != null) {
                                    if (lP2.longValue() <= lP.longValue()) {
                                        ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.TRANSFER_SETTINGS).navigation(transferLimitSettingsActivity, 4203);
                                    } else {
                                        ToastUtils.showLong(transferLimitSettingsActivity.getString(h.sm_single_limit_exceeds_daily), new Object[0]);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        e eVar3 = (e) this.f27334c;
        if (eVar3 != null) {
            final int i11 = 2;
            eVar3.f40334o.setOnClickListener(new View.OnClickListener(this) { // from class: vd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferLimitSettingsActivity f43155b;

                {
                    this.f43155b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferLimitSettingsActivity transferLimitSettingsActivity = this.f43155b;
                    switch (i11) {
                        case 0:
                            int i12 = TransferLimitSettingsActivity.f33418i;
                            transferLimitSettingsActivity.finish();
                            break;
                        case 1:
                            int i13 = TransferLimitSettingsActivity.f33418i;
                            e eVar4 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar4 != null ? eVar4.f40329e : null);
                            break;
                        case 2:
                            int i14 = TransferLimitSettingsActivity.f33418i;
                            e eVar5 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar5 != null ? eVar5.t : null);
                            break;
                        default:
                            int i15 = TransferLimitSettingsActivity.f33418i;
                            if (!r0.U0()) {
                                n0.g().l("Transfer_LimitSettings_Save_Click");
                                e eVar6 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP = TransferLimitSettingsActivity.p(eVar6 != null ? eVar6.f40329e.getText() : null);
                                e eVar7 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP2 = TransferLimitSettingsActivity.p(eVar7 != null ? eVar7.t.getText() : null);
                                if (transferLimitSettingsActivity.r() && lP != null && lP2 != null) {
                                    if (lP2.longValue() <= lP.longValue()) {
                                        ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.TRANSFER_SETTINGS).navigation(transferLimitSettingsActivity, 4203);
                                    } else {
                                        ToastUtils.showLong(transferLimitSettingsActivity.getString(h.sm_single_limit_exceeds_daily), new Object[0]);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        e eVar4 = (e) this.f27334c;
        if (eVar4 != null) {
            EditText editText = eVar4.f40329e;
            editText.addTextChangedListener(new C0742p(5, this, editText));
        }
        e eVar5 = (e) this.f27334c;
        if (eVar5 != null) {
            EditText editText2 = eVar5.t;
            editText2.addTextChangedListener(new C0742p(5, this, editText2));
        }
        e eVar6 = (e) this.f27334c;
        if (eVar6 != null) {
            final int i12 = 3;
            eVar6.f40332i.setOnClickListener(new View.OnClickListener(this) { // from class: vd.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferLimitSettingsActivity f43155b;

                {
                    this.f43155b = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransferLimitSettingsActivity transferLimitSettingsActivity = this.f43155b;
                    switch (i12) {
                        case 0:
                            int i13 = TransferLimitSettingsActivity.f33418i;
                            transferLimitSettingsActivity.finish();
                            break;
                        case 1:
                            int i14 = TransferLimitSettingsActivity.f33418i;
                            e eVar7 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar7 != null ? eVar7.f40329e : null);
                            break;
                        case 2:
                            int i15 = TransferLimitSettingsActivity.f33418i;
                            e eVar8 = (e) transferLimitSettingsActivity.f27334c;
                            transferLimitSettingsActivity.n(eVar8 != null ? eVar8.t : null);
                            break;
                        default:
                            int i16 = TransferLimitSettingsActivity.f33418i;
                            if (!r0.U0()) {
                                n0.g().l("Transfer_LimitSettings_Save_Click");
                                e eVar9 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP = TransferLimitSettingsActivity.p(eVar9 != null ? eVar9.f40329e.getText() : null);
                                e eVar10 = (e) transferLimitSettingsActivity.f27334c;
                                Long lP2 = TransferLimitSettingsActivity.p(eVar10 != null ? eVar10.t.getText() : null);
                                if (transferLimitSettingsActivity.r() && lP != null && lP2 != null) {
                                    if (lP2.longValue() <= lP.longValue()) {
                                        ARouter.getInstance().build("/account/verifyAccount").withString("extra_type", SecurityVerifyMethodReq.TRANSFER_SETTINGS).navigation(transferLimitSettingsActivity, 4203);
                                    } else {
                                        ToastUtils.showLong(transferLimitSettingsActivity.getString(h.sm_single_limit_exceeds_daily), new Object[0]);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
    }
}
