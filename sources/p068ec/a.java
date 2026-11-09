package p068ec;

import Hb.L;
import L6.b;
import Pa.r0;
import Rd.C0599o;
import android.widget.ImageView;
import androidx.activity.H;
import androidx.activity.z;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.dialog.DataBundleCouponRetentionDialog;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.util.SPUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.y;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36246b;

    public /* synthetic */ a(BuyBundleHomePageActivity buyBundleHomePageActivity, int i7) {
        this.f36245a = i7;
        this.f36246b = buyBundleHomePageActivity;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BillerCouponRetentionBean billerCouponRetentionBean;
        String memberId;
        long j6;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        Object[] objArr = 0;
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36246b;
        switch (this.f36245a) {
            case 0:
                z addCallback = (z) obj;
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                BuyBundleHomePageActivity buyBundleHomePageActivity2 = this.f36246b;
                if (!BaseApplication.hasLogin() || buyBundleHomePageActivity2.f31757q0 || (billerCouponRetentionBean = buyBundleHomePageActivity2.f31756p0) == null) {
                    buyBundleHomePageActivity2.finish();
                } else {
                    List<String> institutionIdList = billerCouponRetentionBean.getInstitutionIdList();
                    List<String> list = institutionIdList;
                    if (list == null || list.isEmpty()) {
                        SPUtils sPUtils = SPUtils.get();
                        memberId = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                        if (memberId == null) {
                            memberId = "";
                        }
                        j6 = sPUtils.getLong("qt_data_bundle_exit_coupon_retention_last_show_time_".concat(memberId), 0L);
                        if (j6 > 0 || System.currentTimeMillis() - j6 >= 604800000) {
                            DataBundleCouponRetentionDialog dataBundleCouponRetentionDialog = new DataBundleCouponRetentionDialog(buyBundleHomePageActivity2, billerCouponRetentionBean, new H(0, buyBundleHomePageActivity2, BuyBundleHomePageActivity.class, "finishDataBundlePage", "finishDataBundlePage()V", 0, 2), new L(15, buyBundleHomePageActivity2, billerCouponRetentionBean));
                            dataBundleCouponRetentionDialog.setOnShowListener(new f(buyBundleHomePageActivity2, objArr == true ? 1 : 0));
                            dataBundleCouponRetentionDialog.show();
                        } else {
                            buyBundleHomePageActivity2.finish();
                        }
                    } else {
                        MobileWalletResp.MobileWallet mobileWalletR = buyBundleHomePageActivity2.r();
                        if (mobileWalletR != null) {
                            List<String> list2 = institutionIdList;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str = (String) it.next();
                                        if (y.h(str, mobileWalletR.operatorCode, true) || y.h(str, mobileWalletR.operatorName, true)) {
                                            SPUtils sPUtils2 = SPUtils.get();
                                            memberId = BaseApplication.getInstance().getUserDataSource().b().getMemberId();
                                            if (memberId == null) {
                                                memberId = "";
                                            }
                                            j6 = sPUtils2.getLong("qt_data_bundle_exit_coupon_retention_last_show_time_".concat(memberId), 0L);
                                            if (j6 > 0) {
                                            }
                                            DataBundleCouponRetentionDialog dataBundleCouponRetentionDialog2 = new DataBundleCouponRetentionDialog(buyBundleHomePageActivity2, billerCouponRetentionBean, new H(0, buyBundleHomePageActivity2, BuyBundleHomePageActivity.class, "finishDataBundlePage", "finishDataBundlePage()V", 0, 2), new L(15, buyBundleHomePageActivity2, billerCouponRetentionBean));
                                            dataBundleCouponRetentionDialog2.setOnShowListener(new f(buyBundleHomePageActivity2, objArr == true ? 1 : 0));
                                            dataBundleCouponRetentionDialog2.show();
                                        }
                                    }
                                }
                            }
                        }
                        buyBundleHomePageActivity2.finish();
                    }
                }
                break;
            case 1:
                KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter((String) obj, "errorMsg");
                buyBundleHomePageActivity.y(false);
                break;
            case 2:
                String errorMsg = (String) obj;
                KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                h.x(buyBundleHomePageActivity, errorMsg);
                break;
            case 3:
                IconicsDrawable apply = (IconicsDrawable) obj;
                KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 24);
                D3.a.F(apply, CommonViewExtKt.colorInt(b.ppColorTextPrimary, buyBundleHomePageActivity));
                break;
            case 4:
                DataBundleHighlyRecommendItemBean item = (DataBundleHighlyRecommendItemBean) obj;
                KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.checkNotNullParameter(item, "item");
                DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = item.item;
                if (dataBundleWalletItemChildBean != null) {
                    String strS = buyBundleHomePageActivity.s();
                    if (!r0.b1(strS)) {
                        C0599o c0599o = (C0599o) buyBundleHomePageActivity.f27334c;
                        if (c0599o != null) {
                            c0599o.f8429d.setError(buyBundleHomePageActivity.getString(v.cv_msg_enter_recipient_mobile_number));
                        }
                        buyBundleHomePageActivity.u();
                    } else {
                        DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
                        dataBundleWalletItemBean.setValidity(dataBundleWalletItemChildBean.getValidity());
                        dataBundleWalletItemBean.setBillerName(item.billerName);
                        dataBundleWalletItemBean.setBillerId(item.billerId);
                        dataBundleWalletItemBean.setCategoryId(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE);
                        dataBundleWalletItemBean.setItemId(dataBundleWalletItemChildBean.getItemId());
                        dataBundleWalletItemBean.setItemName(dataBundleWalletItemChildBean.getItemName());
                        dataBundleWalletItemBean.setDescription(dataBundleWalletItemChildBean.getDescription());
                        dataBundleWalletItemBean.setPrice(Long.valueOf(dataBundleWalletItemChildBean.getPrice()));
                        MobileWalletResp.MobileWallet mobileWalletR2 = buyBundleHomePageActivity.r();
                        dataBundleWalletItemBean.setInstitutionLogo(mobileWalletR2 != null ? mobileWalletR2.operatorUrl : null);
                        dataBundleWalletItemBean.setVolume(dataBundleWalletItemChildBean.getVolume());
                        dataBundleWalletItemBean.setVolumeUnit(dataBundleWalletItemChildBean.getVolumeUnit());
                        buyBundleHomePageActivity.p(dataBundleWalletItemBean, strS, dataBundleWalletItemBean.getPrice(), true, (24 & 16) != 0 ? null : TransType.TRANS_TYPE_CASH_LOAN);
                    }
                }
                break;
            default:
                Integer num = (Integer) obj;
                KProperty[] kPropertyArr6 = BuyBundleHomePageActivity.f31740t0;
                Intrinsics.e(num);
                int iIntValue = num.intValue();
                buyBundleHomePageActivity.getClass();
                boolean z3 = iIntValue == 0;
                C0599o c0599o2 = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o2 != null && (imageView4 = c0599o2.f8435o) != null) {
                    imageView4.setImageResource(z3 ? Pd.b.qt_data_bundle_grid_unselected : Pd.b.qt_data_bundle_grid_selected);
                }
                C0599o c0599o3 = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o3 != null && (imageView3 = c0599o3.f8434j) != null) {
                    imageView3.setImageResource(z3 ? Pd.b.qt_data_bundle_details_selected : Pd.b.qt_data_bundle_details_unselected);
                }
                C0599o c0599o4 = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o4 != null && (imageView2 = c0599o4.f8435o) != null) {
                    imageView2.setSelected(!z3);
                }
                C0599o c0599o5 = (C0599o) buyBundleHomePageActivity.f27334c;
                if (c0599o5 != null && (imageView = c0599o5.f8434j) != null) {
                    imageView.setSelected(z3);
                }
                break;
        }
        return Unit.f38893a;
    }
}
