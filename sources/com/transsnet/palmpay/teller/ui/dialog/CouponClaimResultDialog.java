package com.transsnet.palmpay.teller.ui.dialog;

import Pd.c;
import Pd.d;
import Rd.U;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001$B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u0016\u0010#¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/CouponClaimResultDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "", "initViews", "()V", "type", "setCouponType", "(I)Lcom/transsnet/palmpay/teller/ui/dialog/CouponClaimResultDialog;", "", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "item", "setCouponItem", "(Ljava/util/List;)Lcom/transsnet/palmpay/teller/ui/dialog/CouponClaimResultDialog;", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "completeCallback", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)Lcom/transsnet/palmpay/teller/ui/dialog/CouponClaimResultDialog;", "LRd/U;", "binding", "LRd/U;", "couponItem", "Ljava/util/List;", "mCouponType", "Ljava/lang/Integer;", "resultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "getResultCallback", "()Lcom/transsnet/palmpay/core/callback/ResultCallback;", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "P8/a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CouponClaimResultDialog extends b {

    @Nullable
    private U binding;

    @Nullable
    private List<BillerCouponItemBean> couponItem;

    @Nullable
    private Integer mCouponType;

    @Nullable
    private ResultCallback<List<BillerCouponItemBean>> resultCallback;

    @JvmOverloads
    public CouponClaimResultDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(CouponClaimResultDialog couponClaimResultDialog, View view) {
        ResultCallback<List<BillerCouponItemBean>> resultCallback = couponClaimResultDialog.resultCallback;
        if (resultCallback != null) {
            resultCallback.onComplete(couponClaimResultDialog.couponItem);
        }
    }

    @Nullable
    public final ResultCallback<List<BillerCouponItemBean>> getResultCallback() {
        return this.resultCallback;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ConstraintLayout constraintLayout;
        ViewTreeObserver viewTreeObserver;
        setContentView(d.qt_dialog_coupon_claim_result);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.btnNext;
        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
        if (ppButton != null) {
            i7 = c.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = c.ivResult;
                ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
                if (imageView != null) {
                    i7 = c.ryCoupon;
                    RecyclerView recyclerView = (RecyclerView) a.m(i7, viewFindViewById);
                    if (recyclerView != null) {
                        i7 = c.tvTitle;
                        TextView textView = (TextView) a.m(i7, viewFindViewById);
                        if (textView != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById;
                            this.binding = new U(constraintLayout2, ppButton, iconicsImageView, imageView, recyclerView, textView, constraintLayout2);
                            Window window = getWindow();
                            if (window != null) {
                                window.setGravity(17);
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.width = ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(32);
                                attributes.height = -2;
                                window.setAttributes(attributes);
                            }
                            U u6 = this.binding;
                            if (u6 != null && (constraintLayout = u6.f8160g) != null && (viewTreeObserver = constraintLayout.getViewTreeObserver()) != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(new Be.c(this, 6));
                            }
                            Integer num = this.mCouponType;
                            int type_coupon_packetage_item = ModelActivityBannerWithCoupon.f34320j.getTYPE_COUPON_PACKETAGE_ITEM();
                            if (num != null && num.intValue() == type_coupon_packetage_item) {
                                U u10 = this.binding;
                                if (u10 != null) {
                                    h.s(u10.f8157d, false);
                                }
                                U u11 = this.binding;
                                if (u11 != null) {
                                    u11.f8155b.setText(getContext().getString(k.core_confirm));
                                }
                            } else {
                                U u12 = this.binding;
                                if (u12 != null) {
                                    h.s(u12.f8157d, true);
                                }
                                U u13 = this.binding;
                                if (u13 != null) {
                                    u13.f8155b.setText(getContext().getString(k.core_use_now));
                                }
                            }
                            U u14 = this.binding;
                            if (u14 != null) {
                                u14.f8158e.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                            }
                            U u15 = this.binding;
                            if (u15 != null) {
                                RecyclerView recyclerView2 = u15.f8158e;
                                C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(p.transparent, getContext()), CommonViewExtKt.getDp(8), 0, 0);
                                c1548f.f31336e = false;
                                recyclerView2.addItemDecoration(c1548f);
                            }
                            U u16 = this.binding;
                            if (u16 != null) {
                                RecyclerView recyclerView3 = u16.f8158e;
                                P8.a aVar = new P8.a(d.qt_dialog_coupon_claim_result_item, null, 3);
                                aVar.setList(this.couponItem);
                                recyclerView3.setAdapter(aVar);
                            }
                            U u17 = this.binding;
                            if (u17 != null) {
                                final int i10 = 0;
                                u17.f8155b.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.g

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ CouponClaimResultDialog f11335b;

                                    {
                                        this.f11335b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i10) {
                                            case 0:
                                                CouponClaimResultDialog.initViews$lambda$3(this.f11335b, view);
                                                break;
                                            default:
                                                this.f11335b.dismiss();
                                                break;
                                        }
                                    }
                                });
                            }
                            U u18 = this.binding;
                            if (u18 != null) {
                                final int i11 = 1;
                                u18.f8156c.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.g

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ CouponClaimResultDialog f11335b;

                                    {
                                        this.f11335b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i11) {
                                            case 0:
                                                CouponClaimResultDialog.initViews$lambda$3(this.f11335b, view);
                                                break;
                                            default:
                                                this.f11335b.dismiss();
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @NotNull
    public final CouponClaimResultDialog setCouponItem(@Nullable List<BillerCouponItemBean> item) {
        this.couponItem = item;
        return this;
    }

    @NotNull
    public final CouponClaimResultDialog setCouponType(int type) {
        this.mCouponType = Integer.valueOf(type);
        return this;
    }

    /* JADX INFO: renamed from: setResultCallback, reason: collision with other method in class */
    public final void m124setResultCallback(@Nullable ResultCallback<List<BillerCouponItemBean>> resultCallback) {
        this.resultCallback = resultCallback;
    }

    @JvmOverloads
    public CouponClaimResultDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    @NotNull
    public final CouponClaimResultDialog setResultCallback(@NotNull ResultCallback<List<BillerCouponItemBean>> completeCallback) {
        Intrinsics.checkNotNullParameter(completeCallback, "completeCallback");
        this.resultCallback = completeCallback;
        return this;
    }

    public /* synthetic */ CouponClaimResultDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? 0 : i10);
    }

    @JvmOverloads
    public CouponClaimResultDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
    }
}
