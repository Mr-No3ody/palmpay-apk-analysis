package com.transsnet.palmpay.credit.view;

import Ab.D;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chuanyi.ad.BaseViewGroupManager;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p071ef.b;
import p220oa.h;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/view/FlexiPaymentMenuView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgf/a;", "j", "Lgf/a;", "getMCompositeDisposableNet", "()Lgf/a;", "setMCompositeDisposableNet", "(Lgf/a;)V", "mCompositeDisposableNet", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiPaymentMenuView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f30754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f30755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f30756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f30757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f30758g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f30759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public p103gf.a mCompositeDisposableNet;

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
    public FlexiPaymentMenuView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, f.cs_view_flexi_payment_menu, this);
        this.f30754c = viewInflate != null ? viewInflate.findViewById(e.menu_internet) : null;
        this.f30755d = viewInflate != null ? viewInflate.findViewById(e.menu_electricity) : null;
        this.f30756e = viewInflate != null ? viewInflate.findViewById(e.menu_tv) : null;
        this.f30757f = viewInflate != null ? viewInflate.findViewById(e.menu_betting) : null;
        this.f30758g = viewInflate != null ? viewInflate.findViewById(e.menu_data) : null;
        View viewFindViewById = viewInflate != null ? viewInflate.findViewById(e.menu_airtime) : null;
        this.f30759i = viewFindViewById;
        Uri icon = Ea.a.c("04", (14 & 2) != 0 ? null : -1, null, null);
        String title = n.m(k.core_airtime, this);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("DE44A1B15CB24244880510F401673FD5", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/airtime/top_up_airtime", "arouterPath");
        if (viewFindViewById != null) {
            r0.f1((ImageView) viewFindViewById.findViewById(e.icon), icon);
            ((TextView) viewFindViewById.findViewById(e.text)).setText(title);
            ((SingleAdView) viewFindViewById.findViewById(e.ad_view)).setSlotId("DE44A1B15CB24244880510F401673FD5");
            h.l(new Ib.a(viewFindViewById, "/airtime/top_up_airtime", 0), viewFindViewById);
        }
        View view = this.f30758g;
        Uri icon2 = Ea.a.c(TransType.TRANS_TYPE_BUNDLE, (14 & 2) != 0 ? null : -1, null, null);
        String title2 = n.m(k.core_data, this);
        Intrinsics.checkNotNullParameter(icon2, "icon");
        Intrinsics.checkNotNullParameter(title2, "title");
        Intrinsics.checkNotNullParameter("9E188E1FFF8841D7B1D4B6D3205E41A6", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/quick_teller/buy_bundle_ng", "arouterPath");
        if (view != null) {
            r0.f1((ImageView) view.findViewById(e.icon), icon2);
            ((TextView) view.findViewById(e.text)).setText(title2);
            ((SingleAdView) view.findViewById(e.ad_view)).setSlotId("9E188E1FFF8841D7B1D4B6D3205E41A6");
            h.l(new Ib.a(view, "/quick_teller/buy_bundle_ng", 0), view);
        }
        View view2 = this.f30757f;
        Uri icon3 = Ea.a.c(TransType.TRANS_TYPE_BILLER_BETTING, (14 & 2) != 0 ? null : -1, null, null);
        String title3 = n.m(k.core_betting, this);
        Intrinsics.checkNotNullParameter(icon3, "icon");
        Intrinsics.checkNotNullParameter(title3, "title");
        Intrinsics.checkNotNullParameter("64EB6F672D71451CBB44E24D96031D41", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/quick_teller/betting_home", "arouterPath");
        if (view2 != null) {
            r0.f1((ImageView) view2.findViewById(e.icon), icon3);
            ((TextView) view2.findViewById(e.text)).setText(title3);
            ((SingleAdView) view2.findViewById(e.ad_view)).setSlotId("64EB6F672D71451CBB44E24D96031D41");
            h.l(new Ib.a(view2, "/quick_teller/betting_home", 0), view2);
        }
        View view3 = this.f30756e;
        Uri icon4 = Ea.a.c("17", (14 & 2) != 0 ? null : -1, null, null);
        String title4 = n.m(k.core_tv, this);
        Intrinsics.checkNotNullParameter(icon4, "icon");
        Intrinsics.checkNotNullParameter(title4, "title");
        Intrinsics.checkNotNullParameter("F453C7EBD64B461F95D22393EA24A4A4", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/quick_teller/tv_home", "arouterPath");
        if (view3 != null) {
            r0.f1((ImageView) view3.findViewById(e.icon), icon4);
            ((TextView) view3.findViewById(e.text)).setText(title4);
            ((SingleAdView) view3.findViewById(e.ad_view)).setSlotId("F453C7EBD64B461F95D22393EA24A4A4");
            h.l(new Ib.a(view3, "/quick_teller/tv_home", 0), view3);
        }
        View view4 = this.f30755d;
        Uri icon5 = Ea.a.c("16", (14 & 2) != 0 ? null : -1, null, null);
        String title5 = n.m(k.core_electricity, this);
        Intrinsics.checkNotNullParameter(icon5, "icon");
        Intrinsics.checkNotNullParameter(title5, "title");
        Intrinsics.checkNotNullParameter("AA45DED11407400A866B3EF8FCE6502F", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/quick_teller/electricity_home", "arouterPath");
        if (view4 != null) {
            r0.f1((ImageView) view4.findViewById(e.icon), icon5);
            ((TextView) view4.findViewById(e.text)).setText(title5);
            ((SingleAdView) view4.findViewById(e.ad_view)).setSlotId("AA45DED11407400A866B3EF8FCE6502F");
            h.l(new Ib.a(view4, "/quick_teller/electricity_home", 0), view4);
        }
        View view5 = this.f30754c;
        Uri icon6 = Ea.a.c("29", (14 & 2) != 0 ? null : -1, null, null);
        String title6 = n.m(k.core_internet, this);
        Intrinsics.checkNotNullParameter(icon6, "icon");
        Intrinsics.checkNotNullParameter(title6, "title");
        Intrinsics.checkNotNullParameter("E7FAC1B456B44CBC90CB5B30E3F9A274", BaseViewGroupManager.PROP_SLOT_ID);
        Intrinsics.checkNotNullParameter("/quick_teller/internet_home", "arouterPath");
        if (view5 != null) {
            r0.f1((ImageView) view5.findViewById(e.icon), icon6);
            ((TextView) view5.findViewById(e.text)).setText(title6);
            ((SingleAdView) view5.findViewById(e.ad_view)).setSlotId("E7FAC1B456B44CBC90CB5B30E3F9A274");
            h.l(new Ib.a(view5, "/quick_teller/internet_home", 0), view5);
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @Nullable
    public final p103gf.a getMCompositeDisposableNet() {
        return this.mCompositeDisposableNet;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.mCompositeDisposableNet;
        if (aVar != null) {
            aVar.dispose();
            this.mCompositeDisposableNet = null;
        }
    }

    public final void setMCompositeDisposableNet(@Nullable p103gf.a aVar) {
        this.mCompositeDisposableNet = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiPaymentMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiPaymentMenuView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiPaymentMenuView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCompositeDisposableNet = new p103gf.a();
        TypedArray typedArrayObtainStyledAttributes = this.f31417a.obtainStyledAttributes(attributeSet, Ya.h.FlexiPaymentMenuView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i10 = typedArrayObtainStyledAttributes.getInt(Ya.h.FlexiPaymentMenuView_fpmv_businessType, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (i10 == -1) {
            return;
        }
        c.f40268a.getInstance().getClass();
        c.a().queryFlexiPaymentSwitch(i10).k(p298tf.f.f42629b).i(b.a()).subscribe(new D(this, 7));
    }
}
