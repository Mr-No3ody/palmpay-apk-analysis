package Dg;

import B6.RunnableC0085g;
import C0.G;
import E.AbstractC0198c;
import E.W;
import Ed.C0224d;
import F6.d;
import Ie.s;
import Ie.w;
import Jb.C0356o;
import Jb.v;
import M1.j;
import M7.C0442b;
import M7.H;
import Me.o;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Rd.k0;
import Ya.e;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.utils.futures.l;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.m;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.scanplus.code.YuvUtils;
import com.palmpay.lib.scanplus.view.CameraXView;
import com.swmansion.rnscreens.CustomSearchView;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.SearchBarView;
import com.transsnet.palmpay.account.kotlin.ui.activity.SelectResetPinVerifyTypeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.rsp.TransactionFilterResp;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayPinFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentFirstPayCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.ProductInfoChangeData;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import com.transsnet.palmpay.main.export.bean.rsp.HomeSlideMenuBean;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHotStockModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModul;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.AdvancedRefundViewHolderListener;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailQuestionView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import com.transsnet.palmpay.ui.viewhandler.MenuModelViewHandler$OnMenuItemClickListener;
import com.transsnet.palmpay.util.ActivityUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.AbstractC1956y;
import okhttp3.Call;
import okhttp3.EventListener$Factory;
import p052da.b0;
import p140j8.f;
import p294tb.K;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements EventListener$Factory, CallbackToFutureAdapter$Resolver, ResolutionFilter, ImageAnalysis$Analyzer, ImageReaderProxy.OnImageAvailableListener, OnItemClickListener, Consumer, AdvancedRefundViewHolderListener, AddFromContactsDialog.OnAddFromContactsListener, TabLayoutMediator.TabConfigurationStrategy, ObservableOnSubscribe, OnItemChildClickListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, PinEntryView.OnPinEnteredListener, SearchView.OnCloseListener, UIBlock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1876b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f1875a = i7;
        this.f1876b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        Integer num;
        Integer num2;
        Long l5;
        Object obj2 = this.f1876b;
        switch (this.f1875a) {
            case 14:
                OutstandingAccount outstandingAccount = (OutstandingAccount) obj;
                int i7 = TotalOutstandingView.f30883d;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                d.h("TotalOutstandingView", 3, com.airbnb.lottie.model.layer.d.j("OutstandingDetailItem >>> click, position=", viewHolder.getLayoutPosition(), ", loanProduct=", outstandingAccount != null ? outstandingAccount.loanProduct : null));
                n0.g().k(new ClickEvent("outstanding_loan_item_click").add("loanProduct", outstandingAccount != null ? outstandingAccount.loanProduct : null).add("billId", String.valueOf((outstandingAccount == null || (l5 = outstandingAccount.billId) == null) ? 0L : l5.longValue())));
                TotalOutstandingView totalOutstandingView = (TotalOutstandingView) obj2;
                if (outstandingAccount != null && (num2 = outstandingAccount.accountType) != null && num2.intValue() == 6) {
                    ARouter.getInstance().build("/credit_score/oc_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, outstandingAccount.cardNo).navigation(totalOutstandingView.getContext());
                } else if (outstandingAccount == null || (num = outstandingAccount.accountType) == null || num.intValue() != 13) {
                    Bundle bundle = new Bundle();
                    bundle.putString("billId", String.valueOf(outstandingAccount != null ? outstandingAccount.billId : null));
                    bundle.putString("accountType", String.valueOf(outstandingAccount != null ? outstandingAccount.accountType : null));
                    bundle.putString("cardNo", String.valueOf(outstandingAccount != null ? outstandingAccount.cardNo : null));
                    bundle.putString("loanProduct", String.valueOf(outstandingAccount != null ? outstandingAccount.loanProduct : null));
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                } else {
                    totalOutstandingView.getClass();
                    TotalOutstandingView.g(outstandingAccount);
                }
                break;
            case 19:
                HomePageMenuData homePageMenuData = (HomePageMenuData) obj;
                s sVar = (s) obj2;
                sVar.getClass();
                n0.g().k(new ClickEvent("MySerview_Entrance_Click").add("menuName", homePageMenuData.menuName).add("menuName", homePageMenuData.menuName).add("menuGroupName", homePageMenuData.menuGroupName).add("type", String.valueOf(homePageMenuData.type)).add("menuId", String.valueOf(homePageMenuData.menuId)));
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, F.b(homePageMenuData.jumpPath, homePageMenuData.jumpType, homePageMenuData.jumpParams));
                } else {
                    MenuModelViewHandler$OnMenuItemClickListener menuModelViewHandler$OnMenuItemClickListener = sVar.f4393d;
                    if (menuModelViewHandler$OnMenuItemClickListener != null) {
                        menuModelViewHandler$OnMenuItemClickListener.onMenuItemClick(homePageMenuData);
                    }
                    if (!TextUtils.isEmpty(homePageMenuData.jumpPath)) {
                        F.d(homePageMenuData);
                    }
                }
                break;
            case 22:
                SelectResetPinVerifyTypeActivity.a aVar = SelectResetPinVerifyTypeActivity.f25791g;
                SelectResetPinVerifyTypeActivity selectResetPinVerifyTypeActivity = (SelectResetPinVerifyTypeActivity) obj2;
                ARouter.getInstance().build("/account/reset_pin_verify").withString("extra_data", selectResetPinVerifyTypeActivity.f25795d).withString("extra_type", (String) obj).withString("extra_data_1", selectResetPinVerifyTypeActivity.f25792a).withString("extra_data_2", selectResetPinVerifyTypeActivity.f25793b).withParcelable("_security_flow_info", selectResetPinVerifyTypeActivity.f25794c).navigation();
                selectResetPinVerifyTypeActivity.finish();
                break;
            default:
                HomeSlideMenuBean data = (HomeSlideMenuBean) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                int i10 = data.menuId;
                if (i10 == 6) {
                    n0.g().l("PalmPay_Me_Banks_Cards_Click");
                } else if (i10 == 26) {
                    n0.g().l("PalmPay_Me_Help_One_Click");
                } else if (i10 == 47) {
                    n0.g().l("PalmPay_Me_Invitation_Click");
                } else if (i10 == 50) {
                    n0.g().l("PalmPay_Me_Palm_Official_Click");
                } else if (i10 == 56) {
                    n0.g().l("PalmPay_Me_MyAssets_Click");
                } else if (i10 != 68) {
                    n0.g().k(new ClickEvent("PalmPay_Me_Click").add("module_name", data.menuName));
                } else {
                    n0.g().l("PalmPay_Me_Report_Scam_Click");
                }
                String str = data.jumpPath;
                if (str != null && y.m(str, "arouter://", false)) {
                    Activity activity = (Activity) ((Ke.d) obj2).f5435b.get();
                    if (activity != null) {
                        ActivityUtils.startActivity(F.a(activity, data.jumpPath));
                    }
                } else {
                    F.d(data);
                }
                break;
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ((C0224d) this.f1876b).invoke(obj);
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void analyze(ImageProxy image) {
        float f10;
        Object obj = this.f1876b;
        switch (this.f1875a) {
            case 3:
                ((ImageAnalysis$Analyzer) obj).analyze(image);
                break;
            default:
                int i7 = CameraXView.t;
                CameraXView this$0 = (CameraXView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(image, "imageProxy");
                if (this$0.f24002f == null) {
                    int width = this$0.getWidth();
                    int height = this$0.getHeight();
                    float height2 = image.getHeight() / image.getWidth();
                    float f11 = width;
                    float f12 = height;
                    float f13 = f11 / f12;
                    float f14 = 1.0f;
                    if (f13 < height2) {
                        float f15 = height2 / f13;
                        f10 = 1.0f;
                        f14 = f15;
                    } else {
                        f10 = f13 / height2;
                    }
                    float f16 = 2;
                    float f17 = (f11 - (f11 * f14)) / f16;
                    float f18 = (f12 - (f12 * f10)) / f16;
                    Matrix matrix = new Matrix();
                    matrix.postScale(f14, f10);
                    matrix.postTranslate(f17, f18);
                    this$0.f24002f = matrix;
                }
                Function4 function4 = this$0.f24005j;
                if (function4 != null) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    byte[] bArr = new byte[((image.getHeight() * image.getWidth()) * 3) / 2];
                    new YuvUtils().Android420ToI420(image.getPlanes()[0].getBuffer(), image.getPlanes()[1].getBuffer(), image.getPlanes()[2].getBuffer(), image.getPlanes()[0].getRowStride(), image.getPlanes()[1].getRowStride(), image.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride(), bArr, image.getWidth(), image.getHeight());
                    int width2 = image.getWidth();
                    int height3 = image.getHeight();
                    float[] fArr = new float[9];
                    Matrix matrix2 = this$0.f24002f;
                    if (matrix2 != null) {
                        matrix2.getValues(fArr);
                    }
                    int width3 = (int) (this$0.getWidth() * fArr[0]);
                    int height4 = (int) (this$0.getHeight() * fArr[4]);
                    byte[] bArr2 = new byte[((this$0.getHeight() * this$0.getWidth()) * 3) / 2];
                    this$0.f24007p.scaleAndclipping(bArr, bArr2, width2, height3, (int) Math.abs(fArr[5]), (int) Math.abs(fArr[2]), this$0.getHeight(), this$0.getWidth(), height4, width3);
                    function4.invoke(image, bArr2, Integer.valueOf(this$0.getHeight()), Integer.valueOf(this$0.getWidth()));
                }
                break;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(k kVar) {
        ListenableFuture listenableFuture;
        androidx.camera.core.c cVar = (androidx.camera.core.c) this.f1876b;
        N2.a aVar = cVar.f13716a;
        synchronized (aVar.f6064a) {
            try {
                if (((LinkedHashMap) aVar.f6065b).isEmpty()) {
                    listenableFuture = (m) aVar.f6067d;
                    if (listenableFuture == null) {
                        listenableFuture = l.f14212c;
                    }
                } else {
                    m mVarY = (m) aVar.f6067d;
                    if (mVarY == null) {
                        mVarY = AbstractC0198c.y(new L(aVar, 0));
                        aVar.f6067d = mVarY;
                    }
                    ((HashSet) aVar.f6066c).addAll(((LinkedHashMap) aVar.f6065b).values());
                    for (CameraInternal cameraInternal : ((LinkedHashMap) aVar.f6065b).values()) {
                        cameraInternal.release().addListener(new RunnableC0903g(10, aVar, cameraInternal), org.chromium.support_lib_boundary.util.b.u());
                    }
                    ((LinkedHashMap) aVar.f6065b).clear();
                    listenableFuture = mVarY;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        listenableFuture.addListener(new RunnableC0085g(7, cVar, kVar), cVar.f13719d);
        return "CameraX shutdownInternal";
    }

    @Override // okhttp3.EventListener$Factory
    public AbstractC1956y create(Call it) {
        AbstractC1956y this_asFactory = (AbstractC1956y) this.f1876b;
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        if (nativeViewHierarchyManager == null) {
            return;
        }
        View viewResolveView = nativeViewHierarchyManager.resolveView(((H) this.f1876b).getReactTag());
        if (viewResolveView instanceof ScreenContainer) {
            ((ScreenContainer) viewResolveView).g();
        }
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    public List filter(List list, int i7) {
        ArrayList arrayList = new ArrayList(list);
        Size size = (Size) this.f1876b;
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // com.transsnet.palmpay.send_money.ui.view.AdvancedRefundViewHolderListener
    public void onAdvancedCountDownEnd() {
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) ((TransferToBankHomeFragment) this.f1876b).f27333i;
        if (transferToBankHomeViewModel != null) {
            transferToBankHomeViewModel.e();
        }
    }

    @Override // androidx.appcompat.widget.SearchView.OnCloseListener
    public boolean onClose() {
        switch (this.f1875a) {
            case 26:
                CustomSearchView customSearchView = (CustomSearchView) this.f1876b;
                SearchView.OnCloseListener onCloseListener = customSearchView.f25248M0;
                boolean zOnClose = onCloseListener != null ? onCloseListener.onClose() : false;
                C0442b c0442b = customSearchView.f25250O0;
                if (c0442b.f5805a) {
                    ((K) c0442b.f5808d).remove();
                    c0442b.f5805a = false;
                }
                return zOnClose;
            default:
                SearchBarView.c((SearchBarView) this.f1876b);
                return false;
        }
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i7) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.setText((CharSequence) ((ArrayList) ((TransferToPalmPayHomeFragment) this.f1876b).f33820p.getValue()).get(i7));
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        W w3 = (W) this.f1876b;
        synchronized (w3.f1958a) {
            w3.f1960c++;
        }
        w3.c(imageReaderProxy);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j adapter, View view, int i7) {
        ProductInfoChangeData productInfoChangeData;
        Integer repaymentStatus;
        OcHomeFinanceViewModel ocHomeFinanceViewModel;
        MobileInstallmentCardData mobileInstallmentCardData;
        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment;
        HomeCouponRewardsItems homeCouponRewardsItems;
        switch (this.f1875a) {
            case 13:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                Object item = adapter.getItem(i7);
                Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData");
                CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) item;
                Integer itemLayoutType = cLPhoneInstallmentMainData.getItemLayoutType();
                Gb.y yVar = (Gb.y) this.f1876b;
                if (itemLayoutType != null && itemLayoutType.intValue() == 0) {
                    MobileInstallmentCardData mobileInstallmentCardData2 = cLPhoneInstallmentMainData.getMobileInstallmentCardData();
                    int id2 = view.getId();
                    if (id2 != e.ivRefreshLockTime && id2 != e.tvDeviceActiveTime) {
                        if (id2 == e.btnRepay) {
                            String loanTermSpanUnit = mobileInstallmentCardData2 != null ? mobileInstallmentCardData2.getLoanTermSpanUnit() : null;
                            if (!"D".equalsIgnoreCase(loanTermSpanUnit != null ? StringsKt.V(loanTermSpanUnit).toString() : null)) {
                                com.palmpay.lib.apm.launchcounter.util.d.x(null, "MobileInstallmentRepaymentHome");
                            } else {
                                D3.a.w(mobileInstallmentCardData2);
                            }
                            break;
                        } else if (id2 == e.btnDailyRepay) {
                            D3.a.w(mobileInstallmentCardData2);
                            break;
                        } else if (id2 == e.llDailyRepaymentHistory) {
                            Bundle bundle = new Bundle();
                            String loanNo = mobileInstallmentCardData2 != null ? mobileInstallmentCardData2.getLoanNo() : null;
                            if (loanNo == null) {
                                loanNo = "";
                            }
                            bundle.putString("loanNo", loanNo);
                            String cardNo = mobileInstallmentCardData2 != null ? mobileInstallmentCardData2.getCardNo() : null;
                            bundle.putString("cardNo", cardNo != null ? cardNo : "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "MobileInstallmentDailyRepaymentHistory");
                            break;
                        } else if (id2 == e.btnUnlock) {
                            WeakReference weakReference = yVar.f3311b;
                            if (weakReference != null && (ocHomeMobileInstalmentTabFragment = (OcHomeMobileInstalmentTabFragment) weakReference.get()) != null) {
                                String loanNo2 = mobileInstallmentCardData2 != null ? mobileInstallmentCardData2.getLoanNo() : null;
                                OcHomeFinanceViewModel ocHomeFinanceViewModelX = ocHomeMobileInstalmentTabFragment.x();
                                if (ocHomeFinanceViewModelX != null) {
                                    f.s(ocHomeFinanceViewModelX, new v(loanNo2, null), ocHomeFinanceViewModelX.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            }
                        } else if (id2 == e.llTotalOutstanding && (mobileInstallmentCardData = cLPhoneInstallmentMainData.getMobileInstallmentCardData()) != null) {
                            Bundle bundle2 = new Bundle();
                            String loanNo3 = mobileInstallmentCardData.getLoanNo();
                            bundle2.putString("loanNo", loanNo3 != null ? loanNo3 : "");
                            bundle2.putString("loanProduct", "HIRE_PURCHASE");
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "MobileInstallmentOverview");
                            break;
                        }
                    } else {
                        OcHomeFinanceViewModel ocHomeFinanceViewModel2 = yVar.f3314e;
                        if (ocHomeFinanceViewModel2 != null) {
                            ocHomeFinanceViewModel2.d();
                        }
                        break;
                    }
                } else if (itemLayoutType == null || itemLayoutType.intValue() != 3) {
                    if (itemLayoutType != null && itemLayoutType.intValue() == 5 && (productInfoChangeData = cLPhoneInstallmentMainData.getProductInfoChangeData()) != null) {
                        F.f(productInfoChangeData.getJumpPath(), productInfoChangeData.getJumpType(), productInfoChangeData.getJumpParams());
                    }
                    break;
                } else {
                    MobileInstallmentFirstPayCardData hirePurchaseDownPayCardData = cLPhoneInstallmentMainData.getHirePurchaseDownPayCardData();
                    if (view.getId() == e.btnConfirmPay && hirePurchaseDownPayCardData != null && (repaymentStatus = hirePurchaseDownPayCardData.getRepaymentStatus()) != null && repaymentStatus.intValue() == 6 && (ocHomeFinanceViewModel = yVar.f3314e) != null) {
                        f.s(ocHomeFinanceViewModel, new C0356o(hirePurchaseDownPayCardData.getOrderNo(), null), ocHomeFinanceViewModel.f30915i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                int id3 = view.getId();
                o oVar = (o) this.f1876b;
                P8.a aVar = oVar.f5989c;
                if (aVar != null && (homeCouponRewardsItems = (HomeCouponRewardsItems) aVar.getItem(i7)) != null) {
                    ClickEvent clickEvent = new ClickEvent("new_reward_hub_click");
                    clickEvent.add("reward_type", Intrinsics.c(homeCouponRewardsItems.claimType, "combo") ? "coupons_combo" : FirebaseAnalytics.Param.COUPON);
                    clickEvent.add("reward_title", homeCouponRewardsItems.couponName);
                    clickEvent.add("reward_value", String.valueOf(homeCouponRewardsItems.nominalValue));
                    clickEvent.add("id", String.valueOf(homeCouponRewardsItems.couponId));
                    clickEvent.add("priority", String.valueOf(i7));
                    if (id3 == Ac.e.btnClaim) {
                        clickEvent.add("button", "Claim");
                        homeCouponRewardsItems.isLoading = true;
                        oVar.a(i7, true);
                        oVar.f5988b.invoke(homeCouponRewardsItems, Integer.valueOf(i7));
                    } else if (id3 == Ac.e.btnUse) {
                        clickEvent.add("button", "Use");
                        if (TextUtils.isEmpty(homeCouponRewardsItems.androidLinkUrl)) {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                        } else {
                            ActivityUtils.startActivity(F.a(oVar.f5990d, homeCouponRewardsItems.androidLinkUrl));
                        }
                    }
                    n0.g().q(clickEvent);
                    break;
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j adapter, View view, int i7) {
        switch (this.f1875a) {
            case 5:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) this.f1876b;
                bankAccountBeneficiaryFragment.t("History Bank");
                RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) bankAccountBeneficiaryFragment.u().getData().get(i7);
                if (bankAccountBeneficiaryFragment.f33744w) {
                    Intent intent = new Intent();
                    intent.putExtra("BANK_ACCOUNT_NUMBER", recipientBean.getRecipientAccountNumber());
                    if (!TextUtils.isEmpty(recipientBean.getRecipientPhone())) {
                        intent.putExtra("PHONE_NUMBER", recipientBean.getRecipientPhone());
                    }
                    BankInfo bankInfo = new BankInfo();
                    bankInfo.bankCode = recipientBean.getRecipientBankCode();
                    bankInfo.bankCardNo = recipientBean.getRecipientAccountNumber();
                    bankInfo.bankUrl = recipientBean.getRecipientHeadImage();
                    bankInfo.bankName = recipientBean.getRecipientBankName();
                    bankInfo.mmo = recipientBean.getRecipientType() == 2 ? 0 : 1;
                    intent.putExtra("BANK_CARD_INFO", bankInfo);
                    intent.putExtra("trans_amount", recipientBean.getAmount());
                    E activity = bankAccountBeneficiaryFragment.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                } else if (recipientBean.tagType != 2) {
                    TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment.f27333i;
                    if (transferToBankHomeViewModel != null) {
                        transferToBankHomeViewModel.f(recipientBean);
                    }
                } else {
                    TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment.f27333i;
                    if (transferToBankHomeViewModel2 != null) {
                        transferToBankHomeViewModel2.d(recipientBean);
                    }
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                BankAccountFavoriteFragment bankAccountFavoriteFragment = (BankAccountFavoriteFragment) this.f1876b;
                RecipientListResp.RecipientBean recipientBean2 = (RecipientListResp.RecipientBean) bankAccountFavoriteFragment.t().getData().get(i7);
                if (bankAccountFavoriteFragment.f33746o) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("BANK_ACCOUNT_NUMBER", recipientBean2.getRecipientAccountNumber());
                    if (!TextUtils.isEmpty(recipientBean2.getRecipientPhone())) {
                        intent2.putExtra("PHONE_NUMBER", recipientBean2.getRecipientPhone());
                    }
                    BankInfo bankInfo2 = new BankInfo();
                    bankInfo2.bankCode = recipientBean2.getRecipientBankCode();
                    bankInfo2.bankCardNo = recipientBean2.getRecipientAccountNumber();
                    bankInfo2.bankUrl = recipientBean2.getRecipientHeadImage();
                    bankInfo2.bankName = recipientBean2.getRecipientBankName();
                    bankInfo2.mmo = recipientBean2.getRecipientType() == 2 ? 0 : 1;
                    intent2.putExtra("BANK_CARD_INFO", bankInfo2);
                    intent2.putExtra("trans_amount", recipientBean2.getAmount());
                    E activity2 = bankAccountFavoriteFragment.getActivity();
                    if (activity2 != null) {
                        activity2.setResult(-1, intent2);
                        activity2.finish();
                    }
                } else if (recipientBean2.tagType != 2) {
                    TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) bankAccountFavoriteFragment.f27333i;
                    if (transferToBankHomeViewModel3 != null) {
                        transferToBankHomeViewModel3.f(recipientBean2);
                    }
                } else {
                    TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) bankAccountFavoriteFragment.f27333i;
                    if (transferToBankHomeViewModel4 != null) {
                        transferToBankHomeViewModel4.d(recipientBean2);
                    }
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment = (TransferToBankHomeFavoriteFragment) this.f1876b;
                RecipientListResp.RecipientBean recipientBean3 = (RecipientListResp.RecipientBean) transferToBankHomeFavoriteFragment.t().getData().get(i7);
                if (recipientBean3 != null) {
                    n0.g().k((ClickEvent) G.f("Transfer_ToBank_ContactZone_Click", "element_name", "Favorites"));
                    if (recipientBean3.tagType != 2) {
                        TransferToBankHomeViewModel transferToBankHomeViewModel5 = (TransferToBankHomeViewModel) transferToBankHomeFavoriteFragment.f27333i;
                        if (transferToBankHomeViewModel5 != null) {
                            transferToBankHomeViewModel5.f(recipientBean3);
                        }
                    } else {
                        TransferToBankHomeViewModel transferToBankHomeViewModel6 = (TransferToBankHomeViewModel) transferToBankHomeFavoriteFragment.f27333i;
                        if (transferToBankHomeViewModel6 != null) {
                            transferToBankHomeViewModel6.d(recipientBean3);
                        }
                    }
                }
                break;
            case 15:
                SearchRecipientAccountToBankView.a((SearchRecipientAccountToBankView) this.f1876b, adapter, view, i7);
                break;
            case 16:
                TransferDetailQuestionView.a((TransferDetailQuestionView) this.f1876b, adapter, view, i7);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(adapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                b0 b0Var = (b0) this.f1876b;
                int size = b0Var.getData().size();
                int i10 = 0;
                while (i10 < size) {
                    ((TransactionFilterResp.FilterBean) b0Var.getData().get(i10)).setSelected(i10 == i7);
                    b0Var.notifyDataSetChanged();
                    i10++;
                }
                break;
            case 18:
                ModelPalmPrizeBanner.c((ModelPalmPrizeBanner) this.f1876b, adapter, view, i7);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item = adapter.getItem(i7);
                Intrinsics.f(item, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.QueryHotStockModuleResp");
                n0.g().k(new ClickEvent("FinanceTab_USStock_Company_Click").add("stockName", ((QueryHotStockModuleResp) item).stockName));
                String str = ((Ie.v) this.f1876b).f4408d;
                if (str != null) {
                    i0.b0(str);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Object item2 = adapter.getItem(i7);
                Intrinsics.f(item2, "null cannot be cast to non-null type com.transsnet.palmpay.main.export.bean.rsp.QueryTargetSavingsModul");
                QueryTargetSavingsModul queryTargetSavingsModul = (QueryTargetSavingsModul) item2;
                n0.g().k(new ClickEvent("FinanceTab_TargetSavings_Target_Click").add("element_name", queryTargetSavingsModul.publicTsId));
                if (!TextUtils.isEmpty(queryTargetSavingsModul.androidUrl)) {
                    View view2 = ((w) this.f1876b).f4410a;
                    Intent intentA = F.a(view2 != null ? view2.getContext() : null, queryTargetSavingsModul.androidUrl);
                    if (intentA != null) {
                        ActivityUtils.startActivity(intentA);
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("tsId", queryTargetSavingsModul.tsId);
                    bundle.putString("publicTsId", queryTargetSavingsModul.publicTsId);
                    bundle.putBoolean("isJoined", Intrinsics.c(queryTargetSavingsModul.isJoined, Boolean.TRUE));
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "PublicSavingTargetDetail");
                }
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String str) {
        CheckPalmPayPinFragment checkPalmPayPinFragment = (CheckPalmPayPinFragment) this.f1876b;
        int i7 = CheckPalmPayPinFragment.f27991L;
        if (str == null || str.length() != 4) {
            return;
        }
        try {
            PayVerificationCallback payVerificationCallbackU = checkPalmPayPinFragment.u();
            if (payVerificationCallbackU != null) {
                payVerificationCallbackU.verifyPayMethod(SecurityUtils.a(str), 7);
            }
        } catch (Exception e10) {
            d.c(checkPalmPayPinFragment.f27317a, "onPinEntered: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog.OnAddFromContactsListener
    public void onSelected(AddFromContactListResp addFromContactListResp) {
        EditText editText;
        String recipientPhone;
        k0 k0Var = ((TransferToPalmPayAddMobileAccountFragment) this.f1876b).f33791H;
        if (k0Var == null || (editText = (EditText) k0Var.f8375i) == null) {
            return;
        }
        editText.setText((addFromContactListResp == null || (recipientPhone = addFromContactListResp.getRecipientPhone()) == null) ? null : r0.w(recipientPhone));
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        File file = new File(BaseApplication.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES), FirebaseAnalytics.Event.SHARE);
        if (!file.exists()) {
            file.mkdirs();
        }
        String strO = J3.a.O((Bitmap) this.f1876b, file);
        r0.N1(BaseApplication.getContext(), strO);
        observableEmitter.onNext(strO);
        observableEmitter.onComplete();
    }
}
