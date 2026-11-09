package Je;

import C0.G;
import Pa.C0525w;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageTypeBase;
import com.transsnet.palmpay.core.bean.message.MessageTypeCommon;
import com.transsnet.palmpay.core.bean.message.MessageTypePayment;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.json.JSONObject;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewFlipper f4811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f4812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f4813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4814g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f4815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f4816j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f4817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4818p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f4819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f4820w;

    static {
        new f(null);
    }

    public j(ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        this.f4817o = C2131j.b(new G9.j(25));
        this.f4818p = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_bottom_in;
        this.t = com.transsnet.palmpay.custom_view.m.cv_marquee_anim_top_out;
        this.f4820w = C2131j.b(new Ae.j(this, 23));
        View viewInflate = viewStub.inflate();
        this.f4810c = viewInflate;
        if (viewInflate != null) {
            ViewFlipper viewFlipper = (ViewFlipper) viewInflate.findViewById(Ac.e.viewFlipper);
            this.f4811d = viewFlipper;
            if (viewFlipper != null) {
                viewFlipper.setFlipInterval(5000);
            }
            this.f4812e = (TextView) viewInflate.findViewById(Ac.e.tvTime);
            this.f4813f = viewInflate.findViewById(Ac.e.ivIcon);
            this.f4814g = (TextView) viewInflate.findViewById(Ac.e.tvView);
            this.f4815i = (TextView) viewInflate.findViewById(Ac.e.tvLine1);
            this.f4816j = (TextView) viewInflate.findViewById(Ac.e.tvLine2);
        }
    }

    public static Integer c(String str, JSONObject jSONObject) {
        Float fValueOf;
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            Object objOpt = jSONObject.opt(str);
            if (objOpt instanceof Number) {
                return Integer.valueOf((int) ((Number) objOpt).floatValue());
            }
            if (!(objOpt instanceof String)) {
                return null;
            }
            String str2 = (String) objOpt;
            Intrinsics.checkNotNullParameter(str2, "<this>");
            try {
                fValueOf = x.d(str2) ? Float.valueOf(Float.parseFloat(str2)) : null;
            } catch (NumberFormatException unused) {
            }
            if (fValueOf != null) {
                return Integer.valueOf((int) fValueOf.floatValue());
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final void a(GetMsgRsp.DataBean.ListBean listBean, MsgContentBean msgContentBean) {
        MsgContentBean msgContentBean2;
        MsgContentBean msgContentBean3;
        ClickEvent clickEventAdd = new ClickEvent("Home_MessageBox_Click").add("msgScene", listBean != null ? listBean.msgScene : null);
        if (!TextUtils.isEmpty((listBean == null || (msgContentBean3 = listBean.contentBean) == null) ? null : msgContentBean3.bulkNo)) {
            clickEventAdd.add(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, (listBean == null || (msgContentBean2 = listBean.contentBean) == null) ? null : msgContentBean2.bulkNo);
        }
        n0.g().k(clickEventAdd);
        V v3 = V.f10828a;
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new h(listBean, null), 2);
        View view = this.f4810c;
        ActivityUtils.startActivity(F.a(view != null ? view.getContext() : null, msgContentBean.linkUrl));
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0359  */
    /* JADX WARN: Code duplicated, block: B:189:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0395  */
    /* JADX WARN: Multi-variable type inference failed */
    public final View b(int i7, final GetMsgRsp.DataBean.ListBean listBean) {
        CornerRadius cornerRadius;
        g gVar;
        CornerRadius cornerRadius2;
        int dp;
        Integer num = 0;
        ViewFlipper viewFlipper = this.f4811d;
        View childAt = (i7 >= (viewFlipper != null ? viewFlipper.getChildCount() : 0) || viewFlipper == null) ? null : viewFlipper.getChildAt(i7);
        if (childAt != null) {
            F6.d.h("HomeMessageViewHolder", 3, G.m(i7, "createView: use child view "));
        } else {
            t tVar = this.f4817o;
            childAt = ((CopyOnWriteArrayList) tVar.getValue()).isEmpty() ? null : (View) ((CopyOnWriteArrayList) tVar.getValue()).remove(C1850q.g((CopyOnWriteArrayList) tVar.getValue()));
            if (childAt == null || childAt.getParent() != null) {
                F6.d.h("HomeMessageViewHolder", 3, "createView: not cache");
                View view = this.f4810c;
                childAt = LayoutInflater.from(view != null ? view.getContext() : null).inflate(Ac.f.main_layout_home_message_item, (ViewGroup) null);
            } else {
                F6.d.h("HomeMessageViewHolder", 3, "createView: use cache");
            }
        }
        ViewEvent viewEventAdd = ((ViewEvent) G.g("Home_MessageBox_View", false)).add("msgScene", listBean.msgScene);
        MsgContentBean msgContentBean = listBean.contentBean;
        if (!TextUtils.isEmpty(msgContentBean != null ? msgContentBean.bulkNo : null)) {
            MsgContentBean msgContentBean2 = listBean.contentBean;
            viewEventAdd.add(LogConstants.Autotrack.ELEMENT_PUSH_BATCH_NO, msgContentBean2 != null ? msgContentBean2.bulkNo : null);
        }
        n0.g().u(viewEventAdd);
        final MsgContentBean content = listBean.getContent();
        if (content != null) {
            Intrinsics.e(childAt);
            TextView textView = (TextView) childAt.findViewById(Ac.e.tvTag);
            if (textView != null) {
                p220oa.h.s(textView, false);
            }
            if ("0".equals(listBean.getNotificationType())) {
                MessageTypeBase msgObj = content.getMsgObj();
                if (msgObj != null) {
                    MessageTypeBase messageTypeBase = msgObj instanceof MessageTypePayment ? msgObj : null;
                    if (messageTypeBase != null) {
                        MessageTypePayment messageTypePayment = (MessageTypePayment) messageTypeBase;
                        View viewFindViewById = childAt.findViewById(Ac.e.tvView);
                        if (viewFindViewById != null) {
                            p220oa.h.s(viewFindViewById, false);
                        }
                        View viewFindViewById2 = childAt.findViewById(Ac.e.ivIcon);
                        if (viewFindViewById2 != null) {
                            p220oa.h.s(viewFindViewById2, false);
                        }
                        View viewFindViewById3 = childAt.findViewById(Ac.e.tvTime);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                        p220oa.h.s(viewFindViewById3, true);
                        ((TextView) childAt.findViewById(Ac.e.tvLine1)).setText(messageTypePayment.insideTitle);
                        TextView textView2 = (TextView) childAt.findViewById(Ac.e.tvLine2);
                        if (textView2 != null) {
                            textView2.setText(r0.B(messageTypePayment.insideAmount, true) + " " + messageTypePayment.insideStatus);
                        }
                        ((TextView) childAt.findViewById(Ac.e.tvTime)).setText(r0.R(listBean.createtime));
                        final int i10 = 0;
                        childAt.setOnClickListener(new View.OnClickListener(this) { // from class: Je.e

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ j f4792b;

                            {
                                this.f4792b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        this.f4792b.a(listBean, content);
                                        break;
                                    default:
                                        this.f4792b.a(listBean, content);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else {
                MessageTypeBase msgObj2 = content.getMsgObj();
                if (msgObj2 != null) {
                    if (!(msgObj2 instanceof MessageTypeCommon)) {
                        msgObj2 = null;
                    }
                    if (msgObj2 != null) {
                        MessageTypeCommon messageTypeCommon = (MessageTypeCommon) msgObj2;
                        ((TextView) childAt.findViewById(Ac.e.tvLine1)).setText(messageTypeCommon.insideTitle);
                        ((TextView) childAt.findViewById(Ac.e.tvLine2)).setText(messageTypeCommon.insideContent);
                        View viewFindViewById4 = childAt.findViewById(Ac.e.tvTime);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                        p220oa.h.s(viewFindViewById4, false);
                        if (TextUtils.isEmpty(messageTypeCommon.outsideBtnText)) {
                            View viewFindViewById5 = childAt.findViewById(Ac.e.ivIcon);
                            if (viewFindViewById5 != null) {
                                p220oa.h.s(viewFindViewById5, true);
                            }
                            View viewFindViewById6 = childAt.findViewById(Ac.e.tvView);
                            if (viewFindViewById6 != null) {
                                p220oa.h.s(viewFindViewById6, false);
                            }
                        } else {
                            View viewFindViewById7 = childAt.findViewById(Ac.e.ivIcon);
                            if (viewFindViewById7 != null) {
                                p220oa.h.s(viewFindViewById7, false);
                            }
                            TextView textView3 = (TextView) childAt.findViewById(Ac.e.tvView);
                            if (textView3 != null) {
                                textView3.setText(messageTypeCommon.outsideBtnText);
                                p220oa.h.s(textView3, true);
                            }
                        }
                        final int i11 = 1;
                        childAt.setOnClickListener(new View.OnClickListener(this) { // from class: Je.e

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ j f4792b;

                            {
                                this.f4792b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        this.f4792b.a(listBean, content);
                                        break;
                                    default:
                                        this.f4792b.a(listBean, content);
                                        break;
                                }
                            }
                        });
                    }
                }
                TextView textView4 = (TextView) childAt.findViewById(Ac.e.tvTag);
                String strJ = C0525w.j(content.businessInfo, "titleLabel");
                if (strJ != null) {
                    try {
                        if (!StringsKt.F(strJ) && StringsKt.A(strJ, "bgColor", false)) {
                            JSONObject jSONObject = new JSONObject(strJ);
                            String strOptString = jSONObject.optString(ReactTextInputShadowNode.PROP_TEXT);
                            Intrinsics.e(strOptString);
                            String str = !StringsKt.F(strOptString) ? strOptString : null;
                            if (str != null) {
                                Context context = BaseApplication.getContext();
                                boolean zV = i0.V(childAt);
                                Integer numC = c("width", jSONObject);
                                Integer numC2 = c("height", jSONObject);
                                String strOptString2 = jSONObject.optString(zV ? "darkBgColor" : "bgColor");
                                String strOptString3 = jSONObject.optString(zV ? "darkStrokeColor" : "strokeColor");
                                Integer numValueOf = Integer.valueOf(strOptString3 != null ? CommonViewExtKt.hexToColorInt(strOptString3, context, L6.b.ppColorTextPrimary) : 0);
                                Integer numC3 = c("strokeWidth", jSONObject);
                                String strOptString4 = jSONObject.optString(zV ? "darkTextColor" : "textColor");
                                int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorError, context);
                                if (strOptString4 != null) {
                                    iColorInt = CommonViewExtKt.hexToColorInt(strOptString4, context, L6.b.ppColorTextPrimary);
                                }
                                Integer numValueOf2 = Integer.valueOf(iColorInt);
                                Integer numC4 = c("textWeight", jSONObject);
                                Integer numC5 = c("textSize", jSONObject);
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cornerRadius");
                                if (jSONObjectOptJSONObject != null) {
                                    CornerRadius cornerRadius3 = new CornerRadius();
                                    Integer numC6 = c("topLeft", jSONObjectOptJSONObject);
                                    if (numC6 == null) {
                                        numC6 = num;
                                    }
                                    cornerRadius3.setTopLeft(numC6);
                                    Integer numC7 = c("topRight", jSONObjectOptJSONObject);
                                    if (numC7 == null) {
                                        numC7 = num;
                                    }
                                    cornerRadius3.setTopRight(numC7);
                                    Integer numC8 = c("bottomLeft", jSONObjectOptJSONObject);
                                    if (numC8 == null) {
                                        numC8 = num;
                                    }
                                    cornerRadius3.setBottomLeft(numC8);
                                    Integer numC9 = c("bottomRight", jSONObjectOptJSONObject);
                                    if (numC9 != null) {
                                        num = numC9;
                                    }
                                    cornerRadius3.setBottomRight(num);
                                    cornerRadius = cornerRadius3;
                                } else {
                                    cornerRadius = null;
                                }
                                gVar = new g(numC, numC2, strOptString2, numValueOf, numC3, numValueOf2, numC4, str, numC5, cornerRadius);
                            }
                        }
                    } catch (Exception e10) {
                        F6.d.c("HomeMessageViewHolder", "parseTagStyle " + e10);
                    }
                    gVar = null;
                } else {
                    gVar = null;
                }
                if (textView4 != null && gVar != null) {
                    CharSequence charSequence = gVar.f4802h;
                    if (!StringsKt.F(charSequence)) {
                        String str2 = gVar.f4797c;
                        if (!TextUtils.isEmpty(str2) && (cornerRadius2 = gVar.f4804j) != null) {
                            p220oa.h.s(textView4, true);
                            textView4.setText(charSequence);
                            textView4.setTextColor(gVar.f4800f.intValue());
                            Typeface typeface = textView4.getTypeface();
                            Integer num2 = gVar.f4801g;
                            textView4.setTypeface(typeface, (num2 != null ? num2.intValue() : 400) >= 600 ? 1 : 0);
                            ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
                            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                            if (layoutParams2 != null) {
                                int dp2 = -2;
                                Integer num3 = gVar.f4795a;
                                if (num3 == null) {
                                    dp = -2;
                                } else {
                                    if ((num3.intValue() > 0) == false) {
                                        num3 = null;
                                    }
                                    if (num3 != null) {
                                        dp = CommonViewExtKt.getDp(num3.intValue());
                                    } else {
                                        dp = -2;
                                    }
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = dp;
                                Integer num4 = gVar.f4796b;
                                if (num4 != null) {
                                    Integer num5 = num4.intValue() > 0 ? num4 : null;
                                    if (num5 != null) {
                                        dp2 = CommonViewExtKt.getDp(num5.intValue());
                                    }
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = dp2;
                                textView4.setLayoutParams(layoutParams2);
                            }
                            Intrinsics.e(str2);
                            Integer num6 = gVar.f4799e;
                            textView4.setBackground(Eb.a.h(str2, cornerRadius2, num6 != null ? num6.intValue() : 0, gVar.f4798d.intValue()));
                        } else if (textView4 != null) {
                            p220oa.h.s(textView4, false);
                        }
                    } else if (textView4 != null) {
                        p220oa.h.s(textView4, false);
                    }
                } else if (textView4 != null) {
                    p220oa.h.s(textView4, false);
                }
            }
        }
        Intrinsics.e(childAt);
        return childAt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            view.getId();
        }
    }
}
