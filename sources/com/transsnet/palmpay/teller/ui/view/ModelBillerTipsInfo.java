package com.transsnet.palmpay.teller.ui.view;

import C0.G;
import Pa.i0;
import Pa.r0;
import Rd.s0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.BaseFrameLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.CommonBillerTipsBean;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.F;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p041ce.B;
import p042cg.f;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelBillerTipsInfo;", "Lcom/transsnet/palmpay/custom_view/model/BaseFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillerTipsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillerTipsInfo.kt\ncom/transsnet/palmpay/teller/ui/view/ModelBillerTipsInfo\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n138#2,6:139\n1#3:145\n*S KotlinDebug\n*F\n+ 1 ModelBillerTipsInfo.kt\ncom/transsnet/palmpay/teller/ui/view/ModelBillerTipsInfo\n*L\n54#1:139,6\n*E\n"})
public final class ModelBillerTipsInfo extends BaseFrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34341f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f34342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f34344e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerTipsInfo(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String str, Function0 onInitSuccess) {
        Intrinsics.checkNotNullParameter(onInitSuccess, "onInitSuccess");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strP = G.p("Pref_", "queryBillerTipsInfoVM_".concat(str), "_", BaseApplication.getCountryLocale());
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new B(strP, null, str, this, onInitSuccess), 2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    public final void b(String str, String str2) {
        Unit unit;
        Object next;
        CommonBillerTipsBean.BillerTips billerTipsDto;
        String icon;
        String fontColor;
        View view;
        CommonBillerTipsBean commonBillerTipsBean;
        List list = this.f34344e;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                unit = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                commonBillerTipsBean = (CommonBillerTipsBean) next;
                if (y.h(commonBillerTipsBean.getBillerId(), str, false)) {
                    break;
                }
            } while (!y.h(commonBillerTipsBean.getBillerId(), str2, false));
            CommonBillerTipsBean commonBillerTipsBean2 = (CommonBillerTipsBean) next;
            if (commonBillerTipsBean2 != null) {
                if (this.f34343d) {
                    CommonBillerTipsBean.BillerTips billerTipsDto2 = commonBillerTipsBean2.getBillerTipsDto();
                    if (TextUtils.isEmpty(billerTipsDto2 != null ? billerTipsDto2.getDarkIcon() : null)) {
                        billerTipsDto = commonBillerTipsBean2.getBillerTipsDto();
                        if (billerTipsDto != null) {
                            icon = billerTipsDto.getIcon();
                        } else {
                            icon = null;
                        }
                    } else {
                        CommonBillerTipsBean.BillerTips billerTipsDto3 = commonBillerTipsBean2.getBillerTipsDto();
                        if (billerTipsDto3 != null) {
                            icon = billerTipsDto3.getDarkIcon();
                        } else {
                            icon = null;
                        }
                    }
                } else {
                    billerTipsDto = commonBillerTipsBean2.getBillerTipsDto();
                    if (billerTipsDto != null) {
                        icon = billerTipsDto.getIcon();
                    } else {
                        icon = null;
                    }
                }
                s0 s0Var = this.f34342c;
                if (icon == null || icon.length() == 0) {
                    if (s0Var != null) {
                        h.s(s0Var.f8485c, false);
                    }
                    CommonBillerTipsBean.BillerTips billerTipsDto4 = commonBillerTipsBean2.getBillerTipsDto();
                    if (TextUtils.isEmpty(billerTipsDto4 != null ? billerTipsDto4.getTipsText() : null)) {
                        h.s(this, false);
                    } else {
                        try {
                            CommonBillerTipsBean.BillerTips billerTipsDto5 = commonBillerTipsBean2.getBillerTipsDto();
                            if (!TextUtils.isEmpty(billerTipsDto5 != null ? billerTipsDto5.getFontColor() : null)) {
                                CommonBillerTipsBean.BillerTips billerTipsDto6 = commonBillerTipsBean2.getBillerTipsDto();
                                int iColorInt = (billerTipsDto6 == null || (fontColor = billerTipsDto6.getFontColor()) == null) ? CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext()) : CommonViewExtKt.hexToColorInt(fontColor, getContext(), CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, getContext()));
                                if (s0Var != null) {
                                    s0Var.f8486d.setTextColor(iColorInt);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        if (s0Var != null) {
                            TextView textView = s0Var.f8486d;
                            CommonBillerTipsBean.BillerTips billerTipsDto7 = commonBillerTipsBean2.getBillerTipsDto();
                            String tipsText = billerTipsDto7 != null ? billerTipsDto7.getTipsText() : null;
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            Intrinsics.checkNotNullParameter(textView, "<this>");
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (TextUtils.isEmpty(tipsText)) {
                                textView.setText("");
                                textView.setVisibility(8);
                            } else {
                                if ((tipsText != null ? tipsText.length() : 0) > 100) {
                                    String strZ = tipsText != null ? F.z(100, tipsText) : null;
                                    G.w(context, L6.b.ppColorPrimary, new SpanUtils().append(strZ != null ? strZ : "").append("...More"), textView);
                                } else {
                                    if (tipsText == null) {
                                        tipsText = "";
                                    }
                                    textView.setText(tipsText);
                                }
                                textView.setVisibility(0);
                            }
                        }
                        h.s(this, true);
                    }
                } else {
                    if (s0Var != null) {
                        h.s(s0Var.f8485c, true);
                    }
                    if (s0Var != null) {
                        h.s(s0Var.f8486d, false);
                    }
                    r0.l1(icon, s0Var != null ? s0Var.f8485c : null);
                    h.s(this, true);
                }
                if (s0Var != null && (view = s0Var.f8484b) != null) {
                    view.setOnClickListener(new p010a9.b(6, commonBillerTipsBean2, this));
                    unit = Unit.f38893a;
                }
                if (unit != null) {
                    return;
                }
            }
        }
        h.s(this, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerTipsInfo(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillerTipsInfo(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerTipsInfo(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, Pd.d.qt_view_layout_biller_tips_info, this);
        int i10 = Pd.c.operatorMsgIv;
        ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
        if (imageView != null) {
            i10 = Pd.c.operatorMsgTv;
            TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
            if (textView != null) {
                this.f34342c = new s0(viewInflate, imageView, textView);
                setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.f34343d = i0.V(this);
                setVisibility(8);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
