package Dd;

import Bc.s;
import C0.G;
import C0.P;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBirthdayFragment;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelDayPick;
import com.flexibank.sdk.customview.model.FlexiBankTitleTextView1;
import com.google.api.Service;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.ui.activity.EditUserNameActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdV2Activity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep3Fragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.dialog.DayPickDialog;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.ui.activity.CommonClaimRewardActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import com.transsnet.palmpay.core.ui.activity.FinancialWithdrawalPreviewActivity;
import com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddUbaBankAccountFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBirthdayFragment;
import com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.web.JsInterface;
import com.transsnet.palmpay.credit.ui.activity.LoanLocationRequestPermissionActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.dialog.DatePickDialog;
import com.transsnet.palmpay.device.ui.activity.DeviceDetail2Activity;
import com.transsnet.palmpay.managemoney.ui.activity.InsuranceTakePhotoActivity;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarOnboardingFragment;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.send_money.viewmodel.KkCarPassengerViewModel;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import p223od.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1843b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f1842a = i7;
        this.f1843b = obj;
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
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        KkCarPassengerViewModel kkCarPassengerViewModel;
        P pF;
        TextView mTextView;
        String str;
        String nowPickDate = "";
        String str2 = null;
        Object obj = this.f1843b;
        switch (this.f1842a) {
            case 0:
                int i7 = KkCarOnboardingFragment.t;
                if (!((B) obj).f38947a) {
                    n0.g().k((ClickEvent) G.f("keke_auth_accounttopup_close_click", "app", "native"));
                }
                break;
            case 1:
                int i10 = KkCarPassengerFragment.f33729B;
                KkCarPassengerFragment kkCarPassengerFragment = (KkCarPassengerFragment) obj;
                kkCarPassengerFragment.z(kkCarPassengerFragment.x(), kkCarPassengerFragment.f33731o);
                u uVar = (u) kkCarPassengerFragment.f27335j;
                if (uVar != null && uVar.f40518i.e() && (kkCarPassengerViewModel = (KkCarPassengerViewModel) kkCarPassengerFragment.f27333i) != null) {
                    kkCarPassengerViewModel.f(true);
                    break;
                }
                break;
            case 2:
                UssdDialingDialog.initViews$lambda$2((UssdDialingDialog) obj, dialogInterface);
                break;
            case 3:
                AddUbaBankAccountFragment addUbaBankAccountFragment = (AddUbaBankAccountFragment) obj;
                DatePickDialog datePickDialog = addUbaBankAccountFragment.f27907H;
                String dateString = datePickDialog != null ? datePickDialog.getDateString() : null;
                DatePickDialog datePickDialog2 = addUbaBankAccountFragment.f27907H;
                addUbaBankAccountFragment.f27908L = datePickDialog2 != null ? datePickDialog2.getDate() : null;
                TitleEditView titleEditViewB = addUbaBankAccountFragment.B();
                if (titleEditViewB != null) {
                    titleEditViewB.setEditText(dateString);
                }
                addUbaBankAccountFragment.C();
                break;
            case 4:
                CheckBirthdayFragment checkBirthdayFragment = (CheckBirthdayFragment) obj;
                DayPickDialog dayPickDialog = checkBirthdayFragment.f27969j;
                String nowPickDate2 = dayPickDialog != null ? dayPickDialog.getNowPickDate() : null;
                checkBirthdayFragment.f27971p = nowPickDate2;
                PpFormVertical ppFormVertical = checkBirthdayFragment.f27968i;
                if (ppFormVertical != null) {
                    ppFormVertical.setEditContent(nowPickDate2);
                }
                PpFormVertical ppFormVertical2 = checkBirthdayFragment.f27968i;
                if (ppFormVertical2 != null) {
                    ppFormVertical2.setBottomText("");
                }
                break;
            case 5:
                int i11 = EditUserNameActivity.f25844i;
                ((EditUserNameActivity) obj).finish();
                break;
            case 6:
                int i12 = LogInActivity.f25877p0;
                LogInActivity logInActivity = (LogInActivity) obj;
                logInActivity.n();
                NavHostFragment navHostFragment = logInActivity.f25886Y;
                if (navHostFragment != null && (pF = navHostFragment.f()) != null) {
                    pF.k(F8.d.fragment_login_input_mobile, false);
                    break;
                }
                break;
            case 7:
                int i13 = SetTouchIdV2Activity.f26022g;
                SetTouchIdV2Activity setTouchIdV2Activity = (SetTouchIdV2Activity) obj;
                setTouchIdV2Activity.setResult(-1);
                setTouchIdV2Activity.finish();
                break;
            case 8:
                ((MediaStoreHelper$showLoadingDialogInterface) obj).completed();
                break;
            case 9:
                FlexiBankCheckBirthdayFragment flexiBankCheckBirthdayFragment = (FlexiBankCheckBirthdayFragment) obj;
                p033c4.b bVar = flexiBankCheckBirthdayFragment.f22015v;
                if (bVar != null) {
                    FlexiBankModelDayPick flexiBankModelDayPick = bVar.f18855e;
                    if (flexiBankModelDayPick == null) {
                        Log.e("FlexiBankDayPickDialog", "getNowPickDate() ,null == modelDatePick ");
                    } else {
                        nowPickDate = flexiBankModelDayPick.getNowPickDate();
                    }
                    str2 = nowPickDate;
                }
                flexiBankCheckBirthdayFragment.f22011A = str2;
                FlexiBankTitleTextView1 flexiBankTitleTextView1 = flexiBankCheckBirthdayFragment.f22014p;
                if (flexiBankTitleTextView1 != null && (mTextView = flexiBankTitleTextView1.getMTextView()) != null) {
                    mTextView.setText(flexiBankCheckBirthdayFragment.f22011A);
                }
                TextView textView = flexiBankCheckBirthdayFragment.t;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                break;
            case 10:
                ChangeMobileStep3Fragment.a aVar = ChangeMobileStep3Fragment.f26126w;
                ((ChangeMobileStep3Fragment) obj).w();
                break;
            case 11:
                int i14 = AddNewFaveActivity.f27138o;
                AddNewFaveActivity addNewFaveActivity = (AddNewFaveActivity) obj;
                addNewFaveActivity.setResult(-1);
                addNewFaveActivity.finish();
                break;
            case 12:
                HashSet hashSet = JsInterface.f28583f;
                ((Activity) obj).finish();
                break;
            case 13:
                int i15 = LogInInputMobileFragment.f26194C;
                LogInInputMobileFragment logInInputMobileFragment = (LogInInputMobileFragment) obj;
                if (logInInputMobileFragment.getActivity() instanceof AbstractActivityC0837o) {
                    E activity = logInInputMobileFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    r0.G1((AbstractActivityC0837o) activity);
                }
                break;
            case 14:
                int i16 = EditBeneficiaryActivity.f34202M;
                EditBeneficiaryActivity editBeneficiaryActivity = (EditBeneficiaryActivity) obj;
                if (i0.W(editBeneficiaryActivity)) {
                    ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", editBeneficiaryActivity.f34212i).navigation();
                    editBeneficiaryActivity.finish();
                    break;
                }
                break;
            case 15:
                SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                SignUpStep1Fragment signUpStep1Fragment = (SignUpStep1Fragment) obj;
                if (signUpStep1Fragment.getActivity() instanceof AbstractActivityC0837o) {
                    E activity2 = signUpStep1Fragment.getActivity();
                    Intrinsics.f(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    r0.G1((AbstractActivityC0837o) activity2);
                }
                break;
            case 16:
                SignUpStepInputPinV2Fragment.a aVar3 = SignUpStepInputPinV2Fragment.f26273A;
                SignUpActivity signUpActivity = (SignUpActivity) obj;
                if (i0.W(signUpActivity)) {
                    try {
                        signUpActivity.getSupportFragmentManager().T(0, "SignUpStep1Fragment");
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 17:
                SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = (SignUpStepInputPinV2Fragment) obj;
                if (signUpStepInputPinV2Fragment.f26277v == null) {
                    signUpStepInputPinV2Fragment.showLoadingDialog(true);
                    signUpStepInputPinV2Fragment.B(null, true);
                } else {
                    signUpStepInputPinV2Fragment.x(signUpStepInputPinV2Fragment.f26278w);
                }
                break;
            case 18:
                ((AbstractActivityC1479m) obj).finish();
                break;
            case 19:
                int i17 = CommonClaimRewardActivity.f27481a;
                ((CommonClaimRewardActivity) obj).finish();
                break;
            case 20:
                int i18 = CoreCashierPreviewActivity.f27486Y0;
                ((CoreCashierPreviewActivity) obj).finish();
                break;
            case 21:
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CORE_COMMENT_SUCCESS));
                ((CoreCommentActivity) obj).finish();
                break;
            case 22:
                int i19 = FinancialWithdrawalPreviewActivity.f27631H;
                ((FinancialWithdrawalPreviewActivity) obj).finish();
                break;
            case 23:
                int i20 = InsuranceTakePhotoActivity.f32109C;
                ((InsuranceTakePhotoActivity) obj).finish();
                break;
            case 24:
                TransactionHistoryDownloadFilterActivity transactionHistoryDownloadFilterActivity = (TransactionHistoryDownloadFilterActivity) obj;
                int i21 = TransactionHistoryDownloadFilterActivity.f34581B;
                try {
                    DayPickDialog dayPickDialog2 = transactionHistoryDownloadFilterActivity.f34591p;
                    String nowPickDate3 = dayPickDialog2 != null ? dayPickDialog2.getNowPickDate() : null;
                    try {
                        Locale locale = Locale.ENGLISH;
                        Date date = new SimpleDateFormat("dd-MM-yyyy", locale).parse(nowPickDate3);
                        str = date != null ? new SimpleDateFormat("MMM dd, yyyy", locale).format(date) : null;
                    } catch (ParseException e10) {
                        e10.printStackTrace();
                    }
                    if (str != null) {
                        long time = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).parse(str).getTime();
                        int i22 = transactionHistoryDownloadFilterActivity.f34590o;
                        if (i22 == 0) {
                            s sVar = transactionHistoryDownloadFilterActivity.f34583c;
                            if (!Intrinsics.c(sVar != null ? sVar.f842o.getText() : null, str)) {
                                transactionHistoryDownloadFilterActivity.f34584d = 2;
                                transactionHistoryDownloadFilterActivity.o();
                            }
                            s sVar2 = transactionHistoryDownloadFilterActivity.f34583c;
                            if (sVar2 != null) {
                                sVar2.f842o.setText(str);
                            }
                            transactionHistoryDownloadFilterActivity.f34586f = time;
                        } else if (i22 == 1) {
                            s sVar3 = transactionHistoryDownloadFilterActivity.f34583c;
                            if (!Intrinsics.c(sVar3 != null ? sVar3.f835c.getText() : null, str)) {
                                transactionHistoryDownloadFilterActivity.f34584d = 2;
                                transactionHistoryDownloadFilterActivity.o();
                            }
                            s sVar4 = transactionHistoryDownloadFilterActivity.f34583c;
                            if (sVar4 != null) {
                                sVar4.f835c.setText(str);
                            }
                            transactionHistoryDownloadFilterActivity.f34587g = time;
                        }
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Context context = (Context) obj;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
                break;
            case 26:
                ((DeviceDetail2Activity) obj).finish();
                break;
            case 27:
                int i23 = LoanLocationRequestPermissionActivity.f28692b;
                ((LoanLocationRequestPermissionActivity) obj).finish();
                break;
            case 28:
                F6.d.h("LocationManager", 3, "GooglePlayServices error could not have been resolved");
                ((ta.h) obj).e();
                break;
            default:
                int i24 = CLTakePhotoActivity.f29134F0;
                ((CLTakePhotoActivity) obj).finish();
                break;
        }
    }
}
