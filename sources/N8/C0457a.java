package N8;

import Ad.C0058e;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBirthdayFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayOtpFragment;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckPalmPayPinFragment;
import com.flexibank.sdk.core.callback.FlexiBankArgument2Callback;
import com.flexibank.sdk.customview.FlexiBankPinEntryView;
import com.flexibank.sdk.customview.model.FlexiBankTitleTextView1;
import com.flexibank.sdk.security.utils.FlexiBankSecurityUtils;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.play.core.review.ReviewInfo;
import com.growingio.android.sdk.track.modelloader.data.HybridDom$OnDomChangedListener;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import com.transsnet.palmpay.account.bean.req.ApplyT3QuotaReq;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.activity.AskEnableTouchIdActivity;
import com.transsnet.palmpay.account.ui.activity.AuthenticationOtpActivity;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.account.ui.activity.ResetPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPswFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyPatternFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifySafePinFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtra2Fragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtraFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationGetBvnFragment;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.account.ui.viewmodel.SafeVerifyViewModel;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyRegisterInfoViewModel;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.dialog.CouponListDialog;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeSimpleView;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0457a implements Argument2Callback, PinEntryView.OnPinEnteredListener, NestedScrollView.OnScrollChangeListener, Consumer, Function, OnItemClickListener, FlexiBankArgument2Callback, OnItemChildClickListener, AmountEditText.OnTextInputListener, FlexiBankTitleTextView1.Callback, FlexiBankPinEntryView.OnPinEnteredListener, PatternLockView.UnlockListener, OnCompleteListener, HybridDom$OnDomChangedListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, GoogleMap.OnMarkerClickListener, NavigationBarView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6191b;

    public /* synthetic */ C0457a(Object obj, int i7) {
        this.f6190a = i7;
        this.f6191b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        CouponItem data = (CouponItem) obj;
        int i7 = ModelAvailableCouponItem.f28246o;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(data, "data");
        if (view.getId() == p025ba.e.llDetailArrow) {
            data.layoutExpand = !data.layoutExpand;
            CouponListDialog couponListDialog = ((ModelAvailableCouponItem) this.f6191b).f28254i;
            if (couponListDialog != null) {
                couponListDialog.refresh();
            }
        }
    }

    @Override // com.palmpay.lib.ui.edit.AmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        String string;
        PpAmountEditText ppAmountEditText = (PpAmountEditText) this.f6191b;
        ppAmountEditText.f24367d.setVisibility(TextUtils.isEmpty(str) ? 0 : 8);
        ppAmountEditText.c(false);
        if (ppAmountEditText.f24360H) {
            Context context = ppAmountEditText.getContext();
            double doubleAmount = ppAmountEditText.getDoubleAmount();
            if (doubleAmount >= 1.0E9d) {
                string = context.getResources().getString(L6.h.lib_ui_str_billions);
            } else if (doubleAmount >= 1.0E8d) {
                string = context.getResources().getString(L6.h.lib_ui_str_h_millions);
            } else if (doubleAmount >= 1.0E7d) {
                string = context.getResources().getString(L6.h.lib_ui_str_t_millions);
            } else if (doubleAmount >= 1000000.0d) {
                string = context.getResources().getString(L6.h.lib_ui_str_millions);
            } else if (doubleAmount >= 100000.0d) {
                string = context.getResources().getString(L6.h.lib_ui_str_h_thousands);
            } else if (doubleAmount >= 10000.0d) {
                string = context.getResources().getString(L6.h.lib_ui_str_t_thousands);
            } else if (doubleAmount >= 1000.0d) {
                string = context.getResources().getString(L6.h.lib_ui_str_thousands);
            } else {
                string = doubleAmount >= 100.0d ? context.getResources().getString(L6.h.lib_ui_str_hundreds) : "";
            }
            ppAmountEditText.t.setText(string);
            ppAmountEditText.f24377v.setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
        }
        if (ppAmountEditText.f24371i != null) {
            boolean z3 = !TextUtils.isEmpty(ppAmountEditText.getAmountString());
            TextView textView = ppAmountEditText.f24371i;
            if (textView != null) {
                textView.setEnabled(z3);
            }
        }
        PpAmountEditText.OnTextInputListener onTextInputListener = ppAmountEditText.f24363Q;
        if (onTextInputListener != null) {
            onTextInputListener.OnTextInput(str);
        }
        ppAmountEditText.e(ppAmountEditText.f24366c.isFocused());
        if (ppAmountEditText.f24359C || !ppAmountEditText.f24366c.isFocused()) {
            return;
        }
        ppAmountEditText.f24375p.setBackgroundColor(ppAmountEditText.getResources().getColor(PpAmountEditText.f24355q0));
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        Object obj2 = this.f6191b;
        switch (this.f6190a) {
            case 4:
                int i7 = SetNewPinV2Activity.f25976v;
                ((C0463g) obj2).invoke(obj);
                break;
            default:
                ((CompleteCallback) obj2).onComplete((File) obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        return SetUserPhotoActivity.compressPhoto$lambda$18((C0058e) this.f6191b, obj);
    }

    @Override // com.transsnet.palmpay.custom_view.PatternLockView.UnlockListener
    public void drawOver(int[] iArr) {
        VerifyPatternFragment.B((VerifyPatternFragment) this.f6191b, iArr);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3 = "";
        Object obj3 = this.f6191b;
        Integer num = (Integer) obj;
        switch (this.f6190a) {
            case 0:
                num.intValue();
                AskEnableTouchIdActivity.a aVar = AskEnableTouchIdActivity.f25828b;
                ((AskEnableTouchIdActivity) obj3).finish();
                break;
            case 7:
                Intent intent = (Intent) obj2;
                if (num.intValue() != -1) {
                    int i7 = Tier3QuotaManageActivity.f26091f;
                } else {
                    Tier3QuotaManageActivity tier3QuotaManageActivity = (Tier3QuotaManageActivity) obj3;
                    ApplyT3QuotaReq req = tier3QuotaManageActivity.f26093d;
                    req.faceToken = intent != null ? intent.getStringExtra("extra_data") : null;
                    PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) tier3QuotaManageActivity.l();
                    if (palmPayLevelViewModel != null) {
                        Intrinsics.checkNotNullParameter(req, "req");
                        p140j8.f.s(palmPayLevelViewModel, new p097g9.L(req, null), palmPayLevelViewModel.f26432g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                }
                break;
            case 8:
                Intent intent2 = (Intent) obj2;
                P3.k kVar = (P3.k) obj3;
                if (num.intValue() == -1) {
                    kVar.onPayVerificationSuccess(intent2 != null ? (FlexiBankPayByOrderResp.DataBean) intent2.getParcelableExtra("key_pay_response") : null);
                } else {
                    if (intent2 == null || (stringExtra = intent2.getStringExtra("key_error_code")) == null) {
                        stringExtra = "";
                    }
                    if (intent2 != null && (stringExtra2 = intent2.getStringExtra("key_error_msg")) != null) {
                        stringExtra3 = stringExtra2;
                    }
                    kVar.onPayVerificationFail(stringExtra, stringExtra3);
                }
                kVar.onPayVerificationComplete();
                break;
            case 16:
                int iIntValue = num.intValue();
                Intent intent3 = (Intent) obj2;
                AuthPswFragment.a aVar2 = AuthPswFragment.f26101w;
                if (iIntValue == -1) {
                    ((Fe.h0) obj3).invoke(intent3 != null ? intent3.getStringExtra("extra_data") : null);
                }
                break;
            case 20:
                Intent intent4 = (Intent) obj2;
                if (num.intValue() == -1) {
                    Uri data = intent4 != null ? intent4.getData() : null;
                    AddGuardianExtra2Fragment addGuardianExtra2Fragment = (AddGuardianExtra2Fragment) obj3;
                    addGuardianExtra2Fragment.f26132v = data;
                    if (data != null) {
                        FileUploadManager.getInstance().uploadFile(new File(data.getPath()), true, new T8.c(addGuardianExtra2Fragment));
                        I8.l lVar = addGuardianExtra2Fragment.f26131p;
                        r0.g1(lVar != null ? lVar.f4146o : null, data, null);
                    }
                    addGuardianExtra2Fragment.C();
                }
                break;
            case 21:
                Intent intent5 = (Intent) obj2;
                if (num.intValue() == -1) {
                    Uri data2 = intent5 != null ? intent5.getData() : null;
                    AddGuardianExtraFragment addGuardianExtraFragment = (AddGuardianExtraFragment) obj3;
                    addGuardianExtraFragment.f26134v = data2;
                    if (data2 != null) {
                        FileUploadManager.getInstance().uploadFile(new File(data2.getPath()), true, new T8.h(addGuardianExtraFragment));
                        I8.l lVar2 = addGuardianExtraFragment.f26133p;
                        r0.f1(lVar2 != null ? lVar2.f4146o : null, data2);
                    }
                    addGuardianExtraFragment.C();
                }
                break;
            case 22:
                int iIntValue2 = num.intValue();
                Intent intent6 = (Intent) obj2;
                stringExtra3 = intent6 != null ? intent6.getStringExtra("extra_data") : "";
                if (iIntValue2 == -1 && !TextUtils.isEmpty(stringExtra3)) {
                    ((AddGuardianRelationShipFragment) obj3).C(stringExtra3);
                } else {
                    ToastUtils.showLong("Verify failed", new Object[0]);
                }
                break;
            case 23:
                Intent intent7 = (Intent) obj2;
                if (num.intValue() == -1) {
                    Uri data3 = intent7 != null ? intent7.getData() : null;
                    GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment = (GuardianApproveBirthCertificateFragment) obj3;
                    guardianApproveBirthCertificateFragment.f26148v = data3;
                    if (data3 != null) {
                        T8.q qVar = new T8.q(guardianApproveBirthCertificateFragment);
                        String path = data3.getPath();
                        if (path != null) {
                            FileUploadManager.getInstance().uploadFile(new File(path), true, qVar);
                        }
                        Bc.B b7 = guardianApproveBirthCertificateFragment.f26147p;
                        r0.f1(b7 != null ? (ImageView) b7.f600p : null, data3);
                    }
                    Bc.B b10 = guardianApproveBirthCertificateFragment.f26147p;
                    if (b10 != null) {
                        p220oa.h.c((Group) b10.f595f);
                    }
                    Bc.B b11 = guardianApproveBirthCertificateFragment.f26147p;
                    if (b11 != null) {
                        p220oa.h.C((ConstraintLayout) b11.f591b);
                    }
                    Bc.B b12 = guardianApproveBirthCertificateFragment.f26147p;
                    if (b12 != null) {
                        ((PpButton) b12.f597i).setEnabled(true);
                    }
                }
                break;
            default:
                int iIntValue3 = num.intValue();
                Intent intent8 = (Intent) obj2;
                int i10 = IdentityVerificationGetBvnFragment.t;
                if (iIntValue3 == -1) {
                    BankInfo bankInfo = intent8 != null ? (BankInfo) intent8.getParcelableExtra("BANK_CARD_INFO") : null;
                    if (bankInfo != null) {
                        ((IdentityVerificationGetBvnFragment) obj3).u(bankInfo);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
            androidx.camera.core.impl.utils.executor.g.f14173d = reviewInfo;
            if (reviewInfo == null || androidx.camera.core.impl.utils.executor.g.f14172c == null) {
                return;
            }
            androidx.camera.core.impl.utils.executor.g.D((androidx.fragment.app.E) this.f6191b);
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.data.HybridDom$OnDomChangedListener
    public void onDomChanged() {
        ((U4.i) this.f6191b).x();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j adapter, View view, int i7) {
        Long startTime;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Q3.c cVar = (Q3.c) this.f6191b;
        M3.a aVarC = cVar.c();
        FlexiBankCashierCouponItem flexiBankCashierCouponItem = aVarC != null ? (FlexiBankCashierCouponItem) aVarC.getItem(i7) : null;
        int id2 = view.getId();
        if (((flexiBankCashierCouponItem == null || (startTime = flexiBankCashierCouponItem.getStartTime()) == null) ? 0L : startTime.longValue()) > System.currentTimeMillis()) {
            return;
        }
        if (id2 != com.flexibank.sdk.p.fb_imageViewCheck) {
            if (id2 == com.flexibank.sdk.p.fb_llDetailArrow) {
                if (flexiBankCashierCouponItem != null) {
                    Boolean layoutExpand = flexiBankCashierCouponItem.getLayoutExpand();
                    flexiBankCashierCouponItem.u(Boolean.valueOf(!(layoutExpand != null ? layoutExpand.booleanValue() : false)));
                }
                cVar.c().notifyItemChanged(i7);
                return;
            }
            return;
        }
        M3.a aVarC2 = cVar.c();
        FlexiBankCashierCouponItem flexiBankCashierCouponItem2 = aVarC2 != null ? (FlexiBankCashierCouponItem) aVarC2.getItem(i7) : null;
        if (flexiBankCashierCouponItem2 == null || Intrinsics.c(flexiBankCashierCouponItem2.getAvailable(), Boolean.TRUE)) {
            M3.a aVarC3 = cVar.c();
            if (aVarC3 == null || i7 != aVarC3.f5748b) {
                M3.a aVarC4 = cVar.c();
                aVarC4.f5748b = i7;
                aVarC4.notifyDataSetChanged();
            } else {
                M3.a aVarC5 = cVar.c();
                aVarC5.f5748b = -1;
                aVarC5.notifyDataSetChanged();
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        Object obj = this.f6191b;
        switch (this.f6190a) {
            case 6:
                int i10 = SignUpSuccessActivity.f26045o;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                ((SignUpSuccessActivity) obj).m();
                break;
            default:
                ModelDataPlanFlashSaleItem.c((ModelDataPlanFlashSaleItem) obj, jVar, view, i7);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker it) {
        int i7 = MapPage.f32859u0;
        Intrinsics.checkNotNullParameter(it, "it");
        ((MapPage) this.f6191b).r().f9599e = false;
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        TabsHost.a((TabsHost) this.f6191b, menuItem);
        return true;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        Bc.p pVar;
        TextView textView;
        SafeVerifyViewModel safeVerifyViewModel;
        int i7 = 1;
        Object obj = this.f6191b;
        switch (this.f6190a) {
            case 1:
                int i10 = AuthenticationOtpActivity.f25835f;
                Intrinsics.checkNotNullParameter(code, "code");
                AuthenticationOtpActivity authenticationOtpActivity = (AuthenticationOtpActivity) obj;
                if (!TextUtils.isEmpty(code) && code.length() >= 4) {
                    VerifyRegisterInfoViewModel verifyRegisterInfoViewModel = (VerifyRegisterInfoViewModel) authenticationOtpActivity.l();
                    String strA = C0.G.A();
                    int i11 = authenticationOtpActivity.f25837d;
                    verifyRegisterInfoViewModel.getClass();
                    SmsActionReq smsActionReq = new SmsActionReq();
                    smsActionReq.businessType = i11;
                    smsActionReq.phoneNo = strA;
                    smsActionReq.smsCode = code;
                    p140j8.f.s(verifyRegisterInfoViewModel, new p097g9.c0(smsActionReq, null), verifyRegisterInfoViewModel.f26447e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                } else if (code.length() != 0 && (pVar = authenticationOtpActivity.f25838e) != null && (textView = ((OneTimeCodeSimpleView) pVar.f813d).f28446f) != null) {
                    textView.setVisibility(8);
                }
                break;
            case 3:
                int i12 = ResetPinActivity.f25967o;
                Intrinsics.checkNotNullParameter(code, "code");
                if (!TextUtils.isEmpty(code) && code.length() >= 4) {
                    ResetPinActivity resetPinActivity = (ResetPinActivity) obj;
                    KeyboardUtils.hideSoftInput(resetPinActivity);
                    SmsActionReq smsActionReq2 = new SmsActionReq();
                    GetSecurityFlowRsp getSecurityFlowRsp = resetPinActivity.f25973g;
                    if (getSecurityFlowRsp != null && getSecurityFlowRsp.action == 14) {
                        i7 = 3;
                    }
                    smsActionReq2.businessType = i7;
                    smsActionReq2.phoneNo = resetPinActivity.p();
                    smsActionReq2.smsCode = code;
                    smsActionReq2.email = resetPinActivity.o();
                    p051d9.D d2 = (p051d9.D) resetPinActivity.f27350a;
                    if (d2 != null) {
                        d2.checkSmsCode(smsActionReq2);
                    }
                    break;
                }
                break;
            case 13:
                FlexiBankCheckPalmPayOtpFragment.a aVar = FlexiBankCheckPalmPayOtpFragment.f22023p;
                if (!TextUtils.isEmpty(code)) {
                    if ((code == null ? "" : code).length() >= 6) {
                        FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = (FlexiBankCheckPalmPayOtpFragment) obj;
                        KeyboardUtils.hideSoftInput(flexiBankCheckPalmPayOtpFragment.getActivity());
                        FlexiBankPayVerificationCallback flexiBankPayVerificationCallback = (FlexiBankPayVerificationCallback) flexiBankCheckPalmPayOtpFragment.getActivity();
                        if (flexiBankPayVerificationCallback != null) {
                            if (code == null) {
                                code = "";
                            }
                            flexiBankPayVerificationCallback.verifyPayMethod(code, 8);
                        }
                        break;
                    }
                }
                break;
            case 14:
                FlexiBankCheckPalmPayPinFragment flexiBankCheckPalmPayPinFragment = (FlexiBankCheckPalmPayPinFragment) obj;
                FlexiBankCheckPalmPayPinFragment.a aVar2 = FlexiBankCheckPalmPayPinFragment.f22024C;
                if (code != null && code.length() == 4) {
                    try {
                        FlexiBankPayVerificationCallback flexiBankPayVerificationCallback2 = (FlexiBankPayVerificationCallback) flexiBankCheckPalmPayPinFragment.getActivity();
                        if (flexiBankPayVerificationCallback2 != null) {
                            flexiBankPayVerificationCallback2.verifyPayMethod(FlexiBankSecurityUtils.a(code), 7);
                        }
                    } catch (Exception e10) {
                        Log.e(flexiBankCheckPalmPayPinFragment.f21940b, "onPinEntered: ", e10);
                        return;
                    }
                    break;
                }
                break;
            case 15:
                AuthPswFragment.a aVar3 = AuthPswFragment.f26101w;
                if (code != null && code.length() == L8.c.f5561b && (safeVerifyViewModel = (SafeVerifyViewModel) ((AuthPswFragment) obj).f27333i) != null) {
                    p140j8.f.s(safeVerifyViewModel, new p097g9.V(SecurityUtils.a(code), true, null), safeVerifyViewModel.f26439e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    break;
                }
                break;
            default:
                if (code != null) {
                    int length = code.length();
                    VerifySafePinFragment verifySafePinFragment = (VerifySafePinFragment) obj;
                    int i13 = verifySafePinFragment.f26122o;
                    if (length == (i13 == 2 ? L8.c.f5561b : L8.c.f5560a)) {
                        if (i13 != 1) {
                            p115ha.b.f37362a.f37366d = false;
                            SafeVerifyViewModel safeVerifyViewModel2 = (SafeVerifyViewModel) verifySafePinFragment.f27333i;
                            if (safeVerifyViewModel2 != null) {
                                p140j8.f.s(safeVerifyViewModel2, new p097g9.V(SecurityUtils.a(code), false, null), safeVerifyViewModel2.f26439e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                        } else {
                            p115ha.b.f37362a.f37366d = false;
                            SafeVerifyViewModel safeVerifyViewModel3 = (SafeVerifyViewModel) verifySafePinFragment.f27333i;
                            if (safeVerifyViewModel3 != null) {
                                String strA2 = SecurityUtils.a(code);
                                p097g9.W w3 = new p097g9.W(strA2, null);
                                String str = strA2 != null ? strA2 : "";
                                com.transsnet.palmpay.core.base.l lVar = safeVerifyViewModel3.f26440f;
                                lVar.f27356m = str;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(safeVerifyViewModel3, w3, lVar, 0L);
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12) {
        PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        ((PreviewPdfActivity) this.f6191b).q();
    }

    @Override // com.flexibank.sdk.customview.model.FlexiBankTitleTextView1.Callback
    public void onTextTvClick() {
        p033c4.b bVar = ((FlexiBankCheckBirthdayFragment) this.f6191b).f22015v;
        if (bVar != null) {
            bVar.show();
        }
    }
}
