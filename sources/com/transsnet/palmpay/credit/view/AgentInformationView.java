package com.transsnet.palmpay.credit.view;

import Bc.q;
import Ce.ViewOnClickListenerC0159a;
import Fb.j;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.AgentInformationCardData;
import com.transsnet.palmpay.credit.bean.style.AgentInformationStyleConfig;
import com.transsnet.palmpay.credit.bean.style.StyleConfigConstant;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/view/AgentInformationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "styleKeyFromCard", "", "setViewStyleConfig", "(Ljava/lang/String;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgentInformationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentInformationView.kt\ncom/transsnet/palmpay/credit/view/AgentInformationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class AgentInformationView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30713b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f30714a;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentInformationView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = View.inflate(context, f.cs_cl_phone_installment_agent_info_layout, this);
        int i7 = e.ivAgentNameIcon;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = e.ivAgentPhoneIcon;
            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView2 != null) {
                i7 = e.ivAgentPhoneIconTitle;
                ImageView imageView3 = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView3 != null) {
                    i7 = e.llAgentInfoRows;
                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.tvAgentInfoTitle;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = e.tvAgentName;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = e.tvAgentNameTitle;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = e.tvAgentPhoneNo;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = e.tvAgentPhoneNoTitle;
                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            this.f30714a = new q(viewInflate, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5);
                                            if (viewInflate != null) {
                                                viewInflate.setPadding(CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000d  */
    private final void setViewStyleConfig(String styleKeyFromCard) {
        if (styleKeyFromCard == null) {
            styleKeyFromCard = StyleConfigConstant.CONFIG_AGENT_INFORMATION;
        } else {
            if (StringsKt.F(styleKeyFromCard)) {
                styleKeyFromCard = null;
            }
            if (styleKeyFromCard == null) {
                styleKeyFromCard = StyleConfigConstant.CONFIG_AGENT_INFORMATION;
            }
        }
        AgentInformationStyleConfig agentInformationStyleConfig = (AgentInformationStyleConfig) l.l(styleKeyFromCard, "getAgentInfoStyleConfig", AgentInformationStyleConfig.class);
        if (agentInformationStyleConfig != null) {
            q qVar = this.f30714a;
            j.a(qVar != null ? (View) qVar.f821i : null, agentInformationStyleConfig.agentInfoBg);
            j.c(qVar != null ? qVar.f816c : null, agentInformationStyleConfig.agentInfoTitle);
            j.c(qVar != null ? (TextView) qVar.f819f : null, agentInformationStyleConfig.agentInfoNameTitle);
            j.c(qVar != null ? qVar.f822j : null, agentInformationStyleConfig.agentInfoName);
            j.c(qVar != null ? (TextView) qVar.f823o : null, agentInformationStyleConfig.agentInfoPhoneNoTitle);
            j.a(qVar != null ? (ImageView) qVar.f817d : null, agentInformationStyleConfig.agentInfoRowLeadingIcon);
            j.a(qVar != null ? (ImageView) qVar.f818e : null, agentInformationStyleConfig.agentInfoRowLeadingIcon);
            j.a(qVar != null ? (ImageView) qVar.f815b : null, agentInformationStyleConfig.agentInfoPhoneIcon);
        }
    }

    public final void c(AgentInformationCardData agentInformationCardData) {
        if (agentInformationCardData == null) {
            return;
        }
        setViewStyleConfig(agentInformationCardData.getItemStyle());
        q qVar = this.f30714a;
        if (qVar != null) {
            qVar.f816c.setText(agentInformationCardData.getTitle());
        }
        r0.q1(qVar != null ? (ImageView) qVar.f817d : null, agentInformationCardData.getNameImage(), agentInformationCardData.getNameImageDark());
        if (qVar != null) {
            ((TextView) qVar.f819f).setText(agentInformationCardData.getAgentNameTitle());
        }
        if (qVar != null) {
            qVar.f822j.setText(agentInformationCardData.getAgentName());
        }
        r0.q1(qVar != null ? (ImageView) qVar.f818e : null, agentInformationCardData.getPhoneImage(), agentInformationCardData.getPhoneImageDark());
        if (qVar != null) {
            ((TextView) qVar.f823o).setText(agentInformationCardData.getAgentPhoneNoTitle());
        }
        if (qVar != null) {
            ((TextView) qVar.f820g).setText(r0.Y(agentInformationCardData.getAgentPhoneNo()));
        }
        r0.q1(qVar != null ? (ImageView) qVar.f815b : null, agentInformationCardData.getAgentPhoneIcon(), agentInformationCardData.getAgentPhoneIconDark());
        ViewOnClickListenerC0159a viewOnClickListenerC0159a = new ViewOnClickListenerC0159a(agentInformationCardData, 16);
        if (qVar != null) {
            ((ImageView) qVar.f815b).setOnClickListener(viewOnClickListenerC0159a);
        }
        if (qVar != null) {
            ((TextView) qVar.f820g).setOnClickListener(viewOnClickListenerC0159a);
        }
    }
}
