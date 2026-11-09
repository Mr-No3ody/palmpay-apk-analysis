package Ad;

import B6.ViewOnClickListenerC0087i;
import E.m0;
import Kd.C0405p1;
import Kd.R1;
import Kd.S0;
import Kd.i2;
import Pa.C0525w;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.api.Service;
import com.google.gson.Gson;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.ui.activity.AuthenticationOtpActivity;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyRegisterInfoViewModel;
import com.transsnet.palmpay.core.bean.KeyValue;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.async.PpAsyncInflateQueue$OnInflateFinished;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements WheelView.OnWheelItemSelectedListener, OnCompleteListener, Config.OptionMatcher, CallbackToFutureAdapter$Resolver, ImageReaderProxy.OnImageAvailableListener, OnItemChildClickListener, ObservableOnSubscribe, AccountUnavailableDialog.OnAccountUnavailableListener, ResultCallback, OnItemClickListener, PpAsyncInflateQueue$OnInflateFinished, OnSendCodeListener, Argument2Callback, BaseRecyclerViewAdapter$ItemViewOnClickListener, com.transsnet.palmpay.custom_view.interfac.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f208c;

    public /* synthetic */ c0(int i7, Object obj, Object obj2) {
        this.f206a = i7;
        this.f207b = obj;
        this.f208c = obj2;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        switch (this.f206a) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Na.b.b((Na.a) this.f207b, (Na.b) this.f208c, (KeyValue) obj);
                break;
            default:
                Na.d.b((Na.d) this.f207b, (p052da.A) this.f208c, (BillType) obj);
                break;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        switch (this.f206a) {
            case 3:
                androidx.camera.core.c cVar = (androidx.camera.core.c) this.f207b;
                cVar.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context context = (Context) this.f208c;
                Executor executor = cVar.f13719d;
                executor.execute(new E.r(cVar, context, executor, 1, kVar, jElapsedRealtime));
                return "CameraX initInternal";
            default:
                m0 m0Var = (m0) this.f207b;
                m0Var.getClass();
                ((AtomicReference) this.f208c).set(kVar);
                return "SurfaceRequest-surface-recreation(" + m0Var.hashCode() + ")";
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        String stringExtra;
        String stringExtra2;
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        LogInActivity logInActivity = (LogInActivity) this.f207b;
        LogInReq logInReq = logInActivity.f25888b;
        String str = null;
        if (iIntValue == -1) {
            if (intent == null || (stringExtra = intent.getStringExtra("_token")) == null) {
                stringExtra = null;
            } else {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra == null) {
                    stringExtra = null;
                } else if (logInReq != null) {
                    logInReq.verifyTokenNumber = logInActivity.f25879B;
                    logInReq.verifyToken = stringExtra;
                    logInReq.supplement = true;
                }
            }
            if (intent != null && (stringExtra2 = intent.getStringExtra("_face_token")) != null) {
                str = TextUtils.isEmpty(stringExtra2) ? null : stringExtra2;
                if (str != null && logInReq != null) {
                    logInReq.faceToken = str;
                    logInReq.supplement = true;
                }
            }
            if (intent != null && logInReq != null) {
                logInReq.supplement = true;
                logInReq.stateCode = LogInActivity.q(intent, "stateCode");
                logInReq.stateName = LogInActivity.q(intent, "stateName");
                logInReq.lgaCode = LogInActivity.q(intent, "lgaCode");
                logInReq.lgaName = LogInActivity.q(intent, "lgaName");
                logInReq.areaCode = LogInActivity.q(intent, "areaCode");
                logInReq.areaName = LogInActivity.q(intent, "areaName");
                logInReq.street = LogInActivity.q(intent, "street");
                logInReq.industry = LogInActivity.q(intent, "industry");
                logInReq.profession = LogInActivity.q(intent, "profession");
                logInReq.sourceOfFunds = LogInActivity.q(intent, "sourceOfFunds");
                String strQ = LogInActivity.q(intent, "annualIncome");
                logInReq.annualIncome = strQ;
                if (!TextUtils.isEmpty(strQ)) {
                    logInReq.currentPolitically = intent.getBooleanExtra("currentPolitically", false);
                    logInReq.politicallyExposedPerson = intent.getBooleanExtra("politicallyExposedPerson", false);
                    logInReq.positionHeld = LogInActivity.q(intent, "positionHeld");
                    logInReq.nationality = LogInActivity.q(intent, "nationality");
                }
            }
            str = stringExtra;
        }
        ((Argument2Callback) this.f208c).invoke(str, Boolean.valueOf(iIntValue == -1));
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        TransferToBankAccountView.a((TransferToBankAccountView) this.f207b, (ConfirmRecipientInfoDialog) this.f208c, (Boolean) obj);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        E.d0 d0Var = (E.d0) this.f207b;
        d0Var.getClass();
        ((ImageReaderProxy.OnImageAvailableListener) this.f208c).onImageAvailable(d0Var);
    }

    @Override // com.transsnet.palmpay.custom_view.async.PpAsyncInflateQueue$OnInflateFinished
    public void onInflateFinished(View view) {
        int i7 = AsyncViewStub.f31184d;
        Intrinsics.checkNotNullParameter(view, "view");
        ((AsyncViewStub) this.f207b).a(view, (Function1) this.f208c);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j adapter, View view, int i7) {
        RecipientListResp.RecipientBean recipientBean;
        RecipientListResp.RecipientBean recipientBean2;
        TransferToBankHomeViewModel transferToBankHomeViewModel;
        G7.q qVar = G7.q.f3135a;
        G7.c cVar = G7.c.f3055b;
        Object obj = this.f208c;
        Object obj2 = this.f207b;
        int i10 = 3;
        switch (this.f206a) {
            case 6:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                int id2 = view.getId();
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) obj2;
                if (id2 == p159kd.e.ivMore) {
                    if (adapter.getItemCount() >= 5) {
                        int iFindLastVisibleItemPosition = ((LinearLayoutManager) obj).findLastVisibleItemPosition() - 3;
                    }
                    RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) bankAccountBeneficiaryFragment.u().getItem(i7);
                    View layout = LayoutInflater.from(bankAccountBeneficiaryFragment.getContext()).inflate(p159kd.f.sm_popup_beneficiaries_operation, (ViewGroup) null);
                    Context contextRequireContext = bankAccountBeneficiaryFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    G7.g gVar = new G7.g(contextRequireContext);
                    Intrinsics.e(layout);
                    Intrinsics.checkNotNullParameter(layout, "layout");
                    gVar.f3068G = layout;
                    gVar.d(10);
                    gVar.i(21);
                    gVar.b(G7.b.f3050c);
                    gVar.c(cVar);
                    gVar.e(4);
                    gVar.g(8.0f);
                    gVar.t = CommonViewExtKt.colorInt(L6.b.ppColorPopupWhiteBg, bankAccountBeneficiaryFragment.requireContext());
                    gVar.f(qVar);
                    gVar.f3076O = bankAccountBeneficiaryFragment.getViewLifecycleOwner();
                    Balloon balloonA = gVar.a();
                    p002a.a.B(view, balloonA);
                    ((TextView) layout.findViewById(p159kd.e.tv_delete)).setOnClickListener(new ViewOnClickListenerC0087i(balloonA, 2, bankAccountBeneficiaryFragment, recipientBean3));
                    break;
                } else if (id2 == p159kd.e.ivFavorite) {
                    RecipientListResp.RecipientBean recipientBean4 = (RecipientListResp.RecipientBean) bankAccountBeneficiaryFragment.u().getData().get(i7);
                    if (recipientBean4 != null) {
                        if (!recipientBean4.favorite) {
                            com.horcrux.svg.d0.g(2, "/sm/add_beneficiary", "beneficiary_type").withString("beneficiary_bean", ((Gson) C0525w.f().f7166b).toJson(recipientBean4)).navigation(bankAccountBeneficiaryFragment.requireContext());
                        } else {
                            TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment.f27333i;
                            if (transferToBankHomeViewModel2 != null) {
                                String recipientId = recipientBean4.getRecipientId();
                                C0405p1 c0405p1 = new C0405p1(recipientId, !recipientBean4.favorite, null);
                                com.transsnet.palmpay.core.base.l lVar = transferToBankHomeViewModel2.f34049g;
                                lVar.f27356m = recipientId;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(transferToBankHomeViewModel2, c0405p1, lVar, 0L);
                            }
                        }
                    }
                    break;
                } else if (id2 == p159kd.e.btnSetup && (recipientBean = (RecipientListResp.RecipientBean) bankAccountBeneficiaryFragment.u().getItem(i7)) != null) {
                    TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment.f27333i;
                    if (transferToBankHomeViewModel3 != null) {
                        p140j8.f.s(transferToBankHomeViewModel3, new S0(recipientBean.getRecipientId(), null), new com.transsnet.palmpay.core.base.l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                    com.horcrux.svg.d0.g(2, "/sm/add_beneficiary", "beneficiary_type").withString("beneficiary_bean", ((Gson) C0525w.f().f7166b).toJson(recipientBean)).navigation(bankAccountBeneficiaryFragment.requireContext());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                int id3 = view.getId();
                BankAccountFavoriteFragment bankAccountFavoriteFragment = (BankAccountFavoriteFragment) obj2;
                if (id3 == p159kd.e.ivMore) {
                    if (bankAccountFavoriteFragment.t().getItemCount() >= 5) {
                        int iFindLastVisibleItemPosition2 = ((LinearLayoutManager) obj).findLastVisibleItemPosition() - 3;
                    }
                    RecipientListResp.RecipientBean recipientBean5 = (RecipientListResp.RecipientBean) bankAccountFavoriteFragment.t().getItem(i7);
                    View layout2 = LayoutInflater.from(bankAccountFavoriteFragment.getContext()).inflate(p159kd.f.sm_popup_beneficiaries_operation, (ViewGroup) null);
                    Context contextRequireContext2 = bankAccountFavoriteFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    G7.g gVar2 = new G7.g(contextRequireContext2);
                    Intrinsics.e(layout2);
                    Intrinsics.checkNotNullParameter(layout2, "layout");
                    gVar2.f3068G = layout2;
                    gVar2.d(10);
                    gVar2.i(21);
                    gVar2.b(G7.b.f3050c);
                    gVar2.c(cVar);
                    gVar2.e(4);
                    gVar2.g(8.0f);
                    gVar2.t = CommonViewExtKt.colorInt(L6.b.ppColorPopupWhiteBg, bankAccountFavoriteFragment.requireContext());
                    gVar2.f(qVar);
                    gVar2.f3076O = bankAccountFavoriteFragment.getViewLifecycleOwner();
                    Balloon balloonA2 = gVar2.a();
                    p002a.a.B(view, balloonA2);
                    ((TextView) layout2.findViewById(p159kd.e.tv_delete)).setOnClickListener(new ViewOnClickListenerC0087i(balloonA2, i10, bankAccountFavoriteFragment, recipientBean5));
                    break;
                } else if (id3 == p159kd.e.ivFavorite && (recipientBean2 = (RecipientListResp.RecipientBean) bankAccountFavoriteFragment.t().getItem(i7)) != null && (transferToBankHomeViewModel = (TransferToBankHomeViewModel) bankAccountFavoriteFragment.f27333i) != null) {
                    String recipientId2 = recipientBean2.getRecipientId();
                    C0405p1 c0405p2 = new C0405p1(recipientId2, false, null);
                    com.transsnet.palmpay.core.base.l lVar2 = transferToBankHomeViewModel.f34049g;
                    lVar2.f27356m = recipientId2;
                    Unit unit2 = Unit.f38893a;
                    p140j8.f.v(transferToBankHomeViewModel, c0405p2, lVar2, 0L);
                    break;
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        TransactionFilterResp.PaymentTypeBean paymentType;
        ArrayList<TransactionFilterResp.FilterBean> conditions;
        TransactionFilterResp.PaymentTypeBean paymentType2;
        ArrayList<TransactionFilterResp.FilterBean> conditions2;
        TransactionFilterResp.PaymentTypeBean paymentType3;
        ArrayList<TransactionFilterResp.FilterBean> conditions3;
        switch (this.f206a) {
            case 20:
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                TransactionFilterResp.FilterBean filterBean = (TransactionFilterResp.FilterBean) ((p052da.b0) this.f207b).getData().get(i7);
                filterBean.setSelected(!filterBean.getIsSelected());
                Ge.d dVar = (Ge.d) this.f208c;
                TransactionFilterResp transactionFilterResp = dVar.f3387b;
                if (transactionFilterResp == null || (paymentType = transactionFilterResp.getPaymentType()) == null || (conditions = paymentType.getConditions()) == null) {
                    filterBean.setSelected(true);
                    ToastUtils.showLong("Please select at least one Payment Type.", new Object[0]);
                } else {
                    Iterator<T> it = conditions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ArrayList<TransactionFilterResp.FilterBean> childTypeParam = ((TransactionFilterResp.FilterBean) it.next()).getChildTypeParam();
                            if (childTypeParam != null) {
                                Iterator<T> it2 = childTypeParam.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        continue;
                                    } else if (((TransactionFilterResp.FilterBean) it2.next()).getIsSelected()) {
                                        boolean all = filterBean.getAll();
                                        TransactionFilterResp transactionFilterResp2 = dVar.f3387b;
                                        if (all) {
                                            if (filterBean.getIsSelected() && transactionFilterResp2 != null && (paymentType3 = transactionFilterResp2.getPaymentType()) != null && (conditions3 = paymentType3.getConditions()) != null) {
                                                Iterator<T> it3 = conditions3.iterator();
                                                while (it3.hasNext()) {
                                                    ArrayList<TransactionFilterResp.FilterBean> childTypeParam2 = ((TransactionFilterResp.FilterBean) it3.next()).getChildTypeParam();
                                                    if (childTypeParam2 != null) {
                                                        for (TransactionFilterResp.FilterBean filterBean2 : childTypeParam2) {
                                                            filterBean2.setSelected(kotlin.text.y.h(filterBean2.getCode(), filterBean.getCode(), false));
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (transactionFilterResp2 != null && (paymentType2 = transactionFilterResp2.getPaymentType()) != null && (conditions2 = paymentType2.getConditions()) != null) {
                                            Iterator<T> it4 = conditions2.iterator();
                                            while (it4.hasNext()) {
                                                ArrayList<TransactionFilterResp.FilterBean> childTypeParam3 = ((TransactionFilterResp.FilterBean) it4.next()).getChildTypeParam();
                                                if (childTypeParam3 != null) {
                                                    for (TransactionFilterResp.FilterBean filterBean3 : childTypeParam3) {
                                                        if (filterBean3.getAll()) {
                                                            filterBean3.setSelected(false);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            filterBean.setSelected(true);
                            ToastUtils.showLong("Please select at least one Payment Type.", new Object[0]);
                        }
                    }
                }
                Iterator it5 = dVar.f3392g.iterator();
                while (it5.hasNext()) {
                    ((p052da.b0) it5.next()).notifyDataSetChanged();
                }
                break;
            default:
                ModelPremiumBenefits.c((ModelPremiumBenefits) this.f207b, (Context) this.f208c, jVar, view, i7);
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public void onItemSelected(int i7, Object obj) {
        WeekDayPickerDialog.initViews$lambda$7$lambda$6((WeekDayPickerDialog) this.f207b, (WheelView) this.f208c, i7, (f0) obj);
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(androidx.camera.core.impl.V v3) {
        C0992m0 c0992m0 = ((D.e) this.f207b).f1584a;
        Config config = (Config) this.f208c;
        c0992m0.insertOption(v3, config.getOptionPriority(v3), config.retrieveOption(v3));
        return true;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog.OnAccountUnavailableListener
    public void onRemoveClick() {
        Object obj = this.f208c;
        Object obj2 = this.f207b;
        switch (this.f206a) {
            case 8:
                TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) ((BankAccountBeneficiaryFragment) obj2).f27333i;
                if (transferToBankHomeViewModel != null) {
                    RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) obj;
                    transferToBankHomeViewModel.j(5, recipientBean != null ? recipientBean.getRecipientId() : null);
                }
                break;
            case 9:
            default:
                int i7 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) ((TransferToPalmPayHomeRecentlyFragment) obj2).f27333i;
                if (transferToPalmPayHomeViewModel != null) {
                    RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayHomeViewModel, new i2(3, recipientBeanV2 != null ? recipientBeanV2.getRelationId() : null, null), transferToPalmPayHomeViewModel.f34083o, 0L);
                }
                break;
            case 10:
                TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) ((BankAccountFavoriteFragment) obj2).f27333i;
                if (transferToBankHomeViewModel2 != null) {
                    RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) obj;
                    transferToBankHomeViewModel2.j(5, recipientBean2 != null ? recipientBean2.getRecipientId() : null);
                }
                break;
            case 11:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) ((BankAccountPalmPayContactFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel != null) {
                    RecipientBeanV2 recipientBeanV3 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayContactViewModel, new R1(recipientBeanV3 != null ? recipientBeanV3.getRelationId() : null, null), transferToPalmPayContactViewModel.f34076j, 0L);
                }
                break;
            case 12:
                TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) ((TransferToBankHomeBeneficiariesFragment) obj2).f27333i;
                if (transferToBankHomeViewModel3 != null) {
                    RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) obj;
                    transferToBankHomeViewModel3.j(5, recipientBean3 != null ? recipientBean3.getRecipientId() : null);
                }
                break;
            case 13:
                TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) ((TransferToBankHomeFavoriteFragment) obj2).f27333i;
                if (transferToBankHomeViewModel4 != null) {
                    RecipientListResp.RecipientBean recipientBean4 = (RecipientListResp.RecipientBean) obj;
                    transferToBankHomeViewModel4.j(5, recipientBean4 != null ? recipientBean4.getRecipientId() : null);
                }
                break;
            case 14:
                TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = (TransferToPalmPayHomeViewModel) ((TransferToBankHomePalmPayContactsFragment) obj2).f27333i;
                if (transferToPalmPayHomeViewModel2 != null) {
                    RecipientBeanV2 recipientBeanV4 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayHomeViewModel2, new i2(3, recipientBeanV4 != null ? recipientBeanV4.getRelationId() : null, null), transferToPalmPayHomeViewModel2.f34083o, 0L);
                }
                break;
            case 15:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) ((TransferToPalmPayContactAllFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel2 != null) {
                    RecipientBeanV2 recipientBeanV5 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayContactViewModel2, new R1(recipientBeanV5 != null ? recipientBeanV5.getRelationId() : null, null), transferToPalmPayContactViewModel2.f34076j, 0L);
                }
                break;
            case 16:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel3 = (TransferToPalmPayContactViewModel) ((TransferToPalmPayContactFavoriteFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel3 != null) {
                    RecipientBeanV2 recipientBeanV6 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayContactViewModel3, new R1(recipientBeanV6 != null ? recipientBeanV6.getRelationId() : null, null), transferToPalmPayContactViewModel3.f34076j, 0L);
                }
                break;
            case 17:
                TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel3 = (TransferToPalmPayHomeViewModel) ((TransferToPalmPayHomeFavoriteFragment) obj2).f27333i;
                if (transferToPalmPayHomeViewModel3 != null) {
                    RecipientBeanV2 recipientBeanV7 = (RecipientBeanV2) obj;
                    p140j8.f.v(transferToPalmPayHomeViewModel3, new i2(1, recipientBeanV7 != null ? recipientBeanV7.getRelationId() : null, null), transferToPalmPayHomeViewModel3.f34083o, 0L);
                }
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        int i11 = AuthenticationOtpActivity.f25835f;
        VerifyRegisterInfoViewModel verifyRegisterInfoViewModel = (VerifyRegisterInfoViewModel) ((AuthenticationOtpActivity) this.f207b).l();
        SmsActionReq req = (SmsActionReq) ((kotlin.jvm.internal.F) this.f208c).f38951a;
        verifyRegisterInfoViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p097g9.d0 d0Var = new p097g9.d0(req, null);
        com.transsnet.palmpay.core.base.l lVar = verifyRegisterInfoViewModel.f26448f;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        p140j8.f.v(verifyRegisterInfoViewModel, d0Var, lVar, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0079  */
    /* JADX WARN: Code duplicated, block: B:15:0x0083  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0014 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0050  */
    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter emitter) {
        String str;
        String strL;
        String upperCase;
        String upperCase2;
        String upperCase3;
        String upperCase4;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        ArrayList arrayList = new ArrayList();
        for (RecipientListResp.RecipientBean recipientBean : ((BankAccountBeneficiaryFragment) this.f207b).f33738H) {
            boolean zIsEmpty = TextUtils.isEmpty(recipientBean.getRecipientAccountNumber());
            String str2 = (String) this.f208c;
            if (!zIsEmpty) {
                String recipientAccountNumber = recipientBean.getRecipientAccountNumber();
                Intrinsics.checkNotNullExpressionValue(recipientAccountNumber, "getRecipientAccountNumber(...)");
                Locale locale = Locale.ROOT;
                String upperCase5 = recipientAccountNumber.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                String upperCase6 = str2.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase6, "toUpperCase(...)");
                if (!StringsKt.A(upperCase5, upperCase6, false)) {
                    if (!TextUtils.isEmpty(recipientBean.getRecipientBankName())) {
                        String recipientBankName = recipientBean.getRecipientBankName();
                        Intrinsics.checkNotNullExpressionValue(recipientBankName, "getRecipientBankName(...)");
                        Locale locale2 = Locale.ROOT;
                        upperCase3 = recipientBankName.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                        upperCase4 = str2.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                        if (!StringsKt.A(upperCase3, upperCase4, false)) {
                            if (!TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                                String recipientNickname = recipientBean.getRecipientNickname();
                                Intrinsics.checkNotNullExpressionValue(recipientNickname, "getRecipientNickname(...)");
                                Locale locale3 = Locale.ROOT;
                                upperCase = recipientNickname.toUpperCase(locale3);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                upperCase2 = str2.toUpperCase(locale3);
                                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                if (!StringsKt.A(upperCase, upperCase2, false)) {
                                    if (TextUtils.isEmpty(recipientBean.accountNo) && (str = recipientBean.accountNo) != null && (strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", str, "toUpperCase(...)")) != null) {
                                        Locale locale4 = Locale.getDefault();
                                        Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                                        String upperCase7 = str2.toUpperCase(locale4);
                                        Intrinsics.checkNotNullExpressionValue(upperCase7, "toUpperCase(...)");
                                        if (StringsKt.A(strL, upperCase7, false)) {
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(recipientBean.accountNo)) {
                            }
                        }
                    } else if (!TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                        String recipientNickname2 = recipientBean.getRecipientNickname();
                        Intrinsics.checkNotNullExpressionValue(recipientNickname2, "getRecipientNickname(...)");
                        Locale locale5 = Locale.ROOT;
                        upperCase = recipientNickname2.toUpperCase(locale5);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        upperCase2 = str2.toUpperCase(locale5);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        if (!StringsKt.A(upperCase, upperCase2, false)) {
                            if (TextUtils.isEmpty(recipientBean.accountNo)) {
                            }
                        }
                    } else if (TextUtils.isEmpty(recipientBean.accountNo)) {
                    }
                }
                arrayList.add(recipientBean);
            } else if (!TextUtils.isEmpty(recipientBean.getRecipientBankName())) {
                String recipientBankName2 = recipientBean.getRecipientBankName();
                Intrinsics.checkNotNullExpressionValue(recipientBankName2, "getRecipientBankName(...)");
                Locale locale6 = Locale.ROOT;
                upperCase3 = recipientBankName2.toUpperCase(locale6);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                upperCase4 = str2.toUpperCase(locale6);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                if (!StringsKt.A(upperCase3, upperCase4, false)) {
                    if (!TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                        String recipientNickname3 = recipientBean.getRecipientNickname();
                        Intrinsics.checkNotNullExpressionValue(recipientNickname3, "getRecipientNickname(...)");
                        Locale locale7 = Locale.ROOT;
                        upperCase = recipientNickname3.toUpperCase(locale7);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        upperCase2 = str2.toUpperCase(locale7);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        if (!StringsKt.A(upperCase, upperCase2, false)) {
                            if (TextUtils.isEmpty(recipientBean.accountNo)) {
                            }
                        }
                    } else if (TextUtils.isEmpty(recipientBean.accountNo)) {
                    }
                }
                arrayList.add(recipientBean);
            } else if (!TextUtils.isEmpty(recipientBean.getRecipientNickname())) {
                String recipientNickname4 = recipientBean.getRecipientNickname();
                Intrinsics.checkNotNullExpressionValue(recipientNickname4, "getRecipientNickname(...)");
                Locale locale8 = Locale.ROOT;
                upperCase = recipientNickname4.toUpperCase(locale8);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                upperCase2 = str2.toUpperCase(locale8);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                if (!StringsKt.A(upperCase, upperCase2, false)) {
                    if (TextUtils.isEmpty(recipientBean.accountNo)) {
                    }
                }
                arrayList.add(recipientBean);
            } else if (TextUtils.isEmpty(recipientBean.accountNo)) {
            }
        }
        emitter.onNext(arrayList);
        emitter.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ImageProxy) this.f207b).close();
        ((ProducerScope) this.f208c).close(null);
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnItemClickListener
    public void onItemClick(Object obj) {
        com.transsnet.palmpay.custom_view.interfac.OnItemClickListener onItemClickListener;
        com.palmpay.lib.bridgewrapper.photo.upload.a aVar;
        ArrayList arrayList;
        PayoutOption payoutOption;
        switch (this.f206a) {
            case 27:
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f207b;
                if (cashBoxTransaction != null && (onItemClickListener = ((Nc.e) this.f208c).f6314d) != null) {
                    onItemClickListener.onItemClick(cashBoxTransaction);
                    break;
                }
                break;
            case 28:
                QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction2 = (QueryCashBoxTransactionListResp.CashBoxTransaction) this.f207b;
                if (cashBoxTransaction2 != null && (aVar = ((Nc.k) this.f208c).f6332c) != null) {
                    aVar.onItemClick(cashBoxTransaction2);
                    break;
                }
                break;
            default:
                int adapterPosition = ((Nc.t) this.f207b).getAdapterPosition();
                Nc.u uVar = (Nc.u) this.f208c;
                if (uVar.f6359c != adapterPosition && (arrayList = uVar.f6357a) != null && (payoutOption = (PayoutOption) arrayList.get(adapterPosition)) != null) {
                    uVar.f6359c = adapterPosition;
                    uVar.notifyDataSetChanged();
                    defpackage.a aVar2 = uVar.f6358b;
                    if (aVar2 != null) {
                        aVar2.onItemClick(payoutOption);
                    }
                }
                break;
        }
    }
}
