package com.transsnet.palmpay.databundle.ui.view;

import Dd.g;
import L6.b;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import hc.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042cg.e;
import p042cg.f;
import p052da.ViewOnClickListenerC1649v;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0011\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010#\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u001cR\u001b\u0010&\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u001cR\u001b\u0010)\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u001cR\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/view/ModelDataBundleHighlyRecommendItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lcom/transsnet/palmpay/teller/bean/DataBundleHighlyRecommendItemBean;", "Lkotlin/ParameterName;", "name", "item", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/ImageView;", "c", "Lkotlin/Lazy;", "getBadgeImage", "()Landroid/widget/ImageView;", "badgeImage", "Landroid/widget/TextView;", "d", "getTagText", "()Landroid/widget/TextView;", "tagText", "e", "getVolumeText", "volumeText", "f", "getPriceText", "priceText", "g", "getBusinessPriceText", "businessPriceText", "i", "getValidityText", "validityText", "Lcom/mikepenz/iconics/view/IconicsImageView;", "j", "getInfoImage", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "infoImage", "Lcom/palmpay/lib/ui/button/PpButton;", "o", "getBuyButton", "()Lcom/palmpay/lib/ui/button/PpButton;", "buyButton", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelDataBundleHighlyRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelDataBundleHighlyRecommendItem.kt\ncom/transsnet/palmpay/databundle/ui/view/ModelDataBundleHighlyRecommendItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n176#2,2:285\n116#3:287\n1#4:288\n*S KotlinDebug\n*F\n+ 1 ModelDataBundleHighlyRecommendItem.kt\ncom/transsnet/palmpay/databundle/ui/view/ModelDataBundleHighlyRecommendItem\n*L\n68#1:285,2\n111#1:287\n*E\n"})
public final class ModelDataBundleHighlyRecommendItem extends BaseConstraintLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f31780B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public t0 f31781A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31786g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31788j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f31790p;
    public DataBundleHighlyRecommendItemBean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f31791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31792w;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataBundleHighlyRecommendItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getBadgeImage() {
        Object value = this.f31782c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getBusinessPriceText() {
        Object value = this.f31786g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final PpButton getBuyButton() {
        Object value = this.f31789o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpButton) value;
    }

    private final IconicsImageView getInfoImage() {
        Object value = this.f31788j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final TextView getPriceText() {
        Object value = this.f31785f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTagText() {
        Object value = this.f31783d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getValidityText() {
        Object value = this.f31787i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getVolumeText() {
        Object value = this.f31784e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    public final Map c(DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean) {
        int i7;
        String str;
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = dataBundleHighlyRecommendItemBean.item;
        String itemId = dataBundleWalletItemChildBean != null ? dataBundleWalletItemChildBean.getItemId() : null;
        String str2 = "";
        if (itemId == null) {
            itemId = "";
        }
        Pair pair = new Pair("ItemID", itemId);
        String itemName = dataBundleWalletItemChildBean != null ? dataBundleWalletItemChildBean.getItemName() : null;
        if (itemName == null) {
            itemName = "";
        }
        Pair pair2 = new Pair("ItemName", itemName);
        Integer num = dataBundleHighlyRecommendItemBean.packageType;
        if (num != null) {
            i7 = 1;
            if (num.intValue() != 1) {
                if (num == null) {
                    i7 = 3;
                } else {
                    i7 = 2;
                    if (num.intValue() != 2) {
                        i7 = 3;
                    }
                }
            }
        } else if (num == null) {
            i7 = 3;
        } else {
            i7 = 2;
            if (num.intValue() != 2) {
                i7 = 3;
            }
        }
        LinkedHashMap linkedHashMapF = G.f(pair, pair2, new Pair("ItemStyleType", Integer.valueOf(i7)));
        String str3 = dataBundleHighlyRecommendItemBean.billerName;
        if (str3 == null) {
            str = this.f31792w;
            if (str != null) {
                str2 = str;
            }
        } else {
            String str4 = StringsKt.F(str3) ? null : str3;
            if (str4 != null) {
                str2 = str4;
            } else {
                str = this.f31792w;
                if (str != null) {
                    str2 = str;
                }
            }
        }
        return G.g(new Pair("Biller", str2), new Pair("ItemDetail", ((Gson) C0525w.f().f7166b).toJson(linkedHashMapF)));
    }

    public final void d(String str, String str2) {
        this.f31791v = str;
        this.f31792w = str2;
        if (!BaseApplication.hasLogin() || ((str == null || StringsKt.F(str)) && (str2 == null || StringsKt.F(str2)))) {
            e(null);
            return;
        }
        t0 t0Var = this.f31781A;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        t0 t0VarM = AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new d(null, this), 2);
        this.f31781A = t0VarM;
        addJob(t0VarM);
    }

    public final void e(DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean) {
        String string;
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean;
        this.t = dataBundleHighlyRecommendItemBean;
        int i7 = 8;
        if (((dataBundleHighlyRecommendItemBean == null || (dataBundleWalletItemChildBean = dataBundleHighlyRecommendItemBean.item) == null) ? null : Long.valueOf(dataBundleWalletItemChildBean.getPrice())) == null) {
            setVisibility(8);
            return;
        }
        DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean2 = dataBundleHighlyRecommendItemBean.item;
        if (dataBundleWalletItemChildBean2 != null) {
            String volume = dataBundleWalletItemChildBean2.getVolume();
            if (volume == null) {
                volume = "";
            }
            String volumeUnit = dataBundleWalletItemChildBean2.getVolumeUnit();
            if (volumeUnit == null) {
                volumeUnit = "";
            }
            TextView volumeText = getVolumeText();
            if (volume.length() > 0 && volumeUnit.length() > 0) {
                volume = volume.concat(volumeUnit);
            } else if (volume.length() <= 0 && (volume = dataBundleWalletItemChildBean2.getItemName()) == null) {
                volume = "";
            }
            volumeText.setText(volume);
            Long deductionAmount = dataBundleWalletItemChildBean2.getDeductionAmount();
            long price = 0;
            if (deductionAmount == null || deductionAmount.longValue() <= 0) {
                deductionAmount = null;
            }
            if (deductionAmount != null) {
                long price2 = dataBundleWalletItemChildBean2.getPrice() - deductionAmount.longValue();
                if (price2 >= 0) {
                    price = price2;
                }
            } else {
                price = dataBundleWalletItemChildBean2.getPrice();
            }
            getPriceText().setText(r0.F(price));
            getBusinessPriceText().setText(deductionAmount == null ? "" : r0.F(dataBundleWalletItemChildBean2.getPrice()));
            getBusinessPriceText().setVisibility(deductionAmount == null ? 8 : 0);
            String validity = dataBundleWalletItemChildBean2.getValidity();
            String string2 = validity != null ? StringsKt.V(validity).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            if (string2.length() > 0) {
                string = getResources().getString(Pd.f.qt_data_bundle_valid_for, string2);
            } else {
                Integer validityDay = dataBundleWalletItemChildBean2.getValidityDay();
                if ((validityDay != null ? validityDay.intValue() : 0) > 0) {
                    Resources resources = getResources();
                    int i10 = Pd.f.qt_data_bundle_valid_days;
                    Integer validityDay2 = dataBundleWalletItemChildBean2.getValidityDay();
                    string = resources.getString(i10, Integer.valueOf(validityDay2 != null ? validityDay2.intValue() : 0));
                } else {
                    string = null;
                }
            }
            getValidityText().setText(string == null ? "" : string);
            getValidityText().setVisibility(string == null ? 8 : 0);
            TextView tagText = getTagText();
            String str = dataBundleHighlyRecommendItemBean.cornerMark;
            if (str == null) {
                str = "";
            }
            tagText.setText(str);
            TextView tagText2 = getTagText();
            String str2 = dataBundleHighlyRecommendItemBean.cornerMark;
            tagText2.setVisibility(str2 == null || StringsKt.F(str2) ? 8 : 0);
            String str3 = dataBundleHighlyRecommendItemBean.color;
            int iHexToColorInt = CommonViewExtKt.hexToColorInt(str3 != null ? str3 : "", getContext(), b.ppColorSuccess);
            getTagText().setBackgroundTintList(ColorStateList.valueOf(iHexToColorInt));
            getBuyButton().setBackgroundTintList(ColorStateList.valueOf(iHexToColorInt));
            String str4 = dataBundleHighlyRecommendItemBean.badgeUrl;
            if (str4 == null || StringsKt.F(str4)) {
                getBadgeImage().setImageDrawable(null);
            } else {
                r0.l1(str4, getBadgeImage());
            }
            DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean3 = dataBundleHighlyRecommendItemBean.item;
            String description = dataBundleWalletItemChildBean3 != null ? dataBundleWalletItemChildBean3.getDescription() : null;
            IconicsImageView infoImage = getInfoImage();
            if (description != null && !StringsKt.F(description)) {
                i7 = 0;
            }
            infoImage.setVisibility(i7);
            g gVar = new g(dataBundleWalletItemChildBean3, description, this, dataBundleHighlyRecommendItemBean);
            getInfoImage().setOnClickListener(gVar);
            getValidityText().setOnClickListener(gVar);
        }
        setVisibility(0);
        n0.g().w("data_home_topoffer_show", c(dataBundleHighlyRecommendItemBean));
    }

    public final void setOnItemClickListener(@NotNull Function1<? super DataBundleHighlyRecommendItemBean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31790p = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataBundleHighlyRecommendItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelDataBundleHighlyRecommendItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataBundleHighlyRecommendItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31782c = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i10) {
                    case 0:
                        int i11 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i12 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i13 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i14 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i15 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i11 = 1;
        this.f31783d = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i11) {
                    case 0:
                        int i12 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i13 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i14 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i15 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i12 = 2;
        this.f31784e = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i12) {
                    case 0:
                        int i13 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i14 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i15 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i13 = 3;
        this.f31785f = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i13) {
                    case 0:
                        int i14 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i15 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i111 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i14 = 4;
        this.f31786g = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i14) {
                    case 0:
                        int i15 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i111 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i112 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i15 = 5;
        this.f31787i = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i15) {
                    case 0:
                        int i16 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i111 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i112 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i113 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i16 = 6;
        this.f31788j = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i16) {
                    case 0:
                        int i17 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i111 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i112 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i113 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i114 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        final int i17 = 7;
        this.f31789o = C2131j.b(new Function0(this) { // from class: hc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataBundleHighlyRecommendItem f37372b;

            {
                this.f37372b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = this.f37372b;
                switch (i17) {
                    case 0:
                        int i18 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (ImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_badge);
                    case 1:
                        int i19 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_tag);
                    case 2:
                        int i110 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_volume);
                    case 3:
                        int i111 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_price);
                    case 4:
                        int i112 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_business_price);
                    case 5:
                        int i113 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (TextView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.tv_recommend_validity);
                    case 6:
                        int i114 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (IconicsImageView) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.iv_recommend_info);
                    default:
                        int i115 = ModelDataBundleHighlyRecommendItem.f31780B;
                        return (PpButton) modelDataBundleHighlyRecommendItem.findViewById(Pd.c.btn_recommend_buy);
                }
            }
        });
        View.inflate(context, Pd.d.qt_model_data_bundle_highly_recommend_item, this);
        setBackgroundResource(r.cv_rect_corner_12_bg_white);
        int dp = CommonViewExtKt.getDp(12);
        setPadding(dp, dp, dp, dp);
        setMinimumHeight(CommonViewExtKt.getDp(95));
        getBusinessPriceText().setPaintFlags(getBusinessPriceText().getPaintFlags() | 16);
        ViewOnClickListenerC1649v viewOnClickListenerC1649v = new ViewOnClickListenerC1649v(this, 8);
        setOnClickListener(viewOnClickListenerC1649v);
        getBuyButton().setOnClickListener(viewOnClickListenerC1649v);
        setVisibility(8);
    }
}
