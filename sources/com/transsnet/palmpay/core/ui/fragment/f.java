package com.transsnet.palmpay.core.ui.fragment;

import Ua.C0617b;
import android.text.TextUtils;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.BindBankCardFeeBean;
import com.transsnet.palmpay.core.bean.BindCardBvnContent;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CardNoBankInfoRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddBankCardFragmentV2 f27917b;

    public /* synthetic */ f(AddBankCardFragmentV2 addBankCardFragmentV2, int i7) {
        this.f27916a = i7;
        this.f27917b = addBankCardFragmentV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27917b;
        switch (this.f27916a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        CardNoBankInfoRsp cardNoBankInfoRsp = (CardNoBankInfoRsp) ((p) it).f27360a;
                        int i7 = AddBankCardFragmentV2.f27826C0;
                        PpButton ppButtonB = addBankCardFragmentV2.B();
                        if (ppButtonB != null) {
                            ppButtonB.b(false);
                        }
                        if (cardNoBankInfoRsp.isSuccess()) {
                            BankInfo data = cardNoBankInfoRsp.getData();
                            if (data != null) {
                                addBankCardFragmentV2.f27846s0 = data;
                                AddBankCardFragmentV2.E(addBankCardFragmentV2.z(), "");
                                if (addBankCardFragmentV2.u()) {
                                    addBankCardFragmentV2.t();
                                }
                            }
                        } else {
                            AddBankCardFragmentV2.E(addBankCardFragmentV2.z(), cardNoBankInfoRsp.getRespMsg());
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        String str2 = ((n) it).f27358a;
                        int i10 = AddBankCardFragmentV2.f27826C0;
                        PpButton ppButtonB2 = addBankCardFragmentV2.B();
                        if (ppButtonB2 != null) {
                            ppButtonB2.b(false);
                        }
                        ToastUtils.showLong(str2, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            BindBankCardFeeBean bindBankCardFeeBean = (BindBankCardFeeBean) commonBeanResult.data;
                            if (bindBankCardFeeBean != null) {
                                ((C0617b) addBankCardFragmentV2.f27830B0.getValue()).f9382d.k(bindBankCardFeeBean);
                                TextView textView = (TextView) addBankCardFragmentV2.f27841o.getValue();
                                if (textView != null) {
                                    SpanUtils spanUtils = new SpanUtils();
                                    String str3 = bindBankCardFeeBean.beforeHighLightContent;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    SpanUtils spanUtilsAppend = spanUtils.append(str3);
                                    String str4 = bindBankCardFeeBean.highLightContent;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    SpanUtils fontFamily = spanUtilsAppend.append(str4).setForegroundColor(addBankCardFragmentV2.requireContext().getColor(L6.b.ppColorPrimary)).setFontFamily("sans-serif-medium");
                                    String str5 = bindBankCardFeeBean.afterHighLightContent;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    textView.setText(fontFamily.append(str5).create());
                                }
                                List<BindCardBvnContent> list = bindBankCardFeeBean.bindCardBvnContentDTOList;
                                if (list != null) {
                                    if (list.isEmpty()) {
                                        list = null;
                                    }
                                    if (list != null) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj2 : list) {
                                            Integer num = ((BindCardBvnContent) obj2).pageType;
                                            if (num != null && num.intValue() == 1) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                        BindCardBvnContent bindCardBvnContent = (BindCardBvnContent) arrayList.get(0);
                                        if (bindCardBvnContent != null) {
                                            SpanUtils spanUtils2 = new SpanUtils();
                                            List listSplit$default = z.f38935a;
                                            if (!TextUtils.isEmpty(bindCardBvnContent.highLightBindCardTips) && (str = bindCardBvnContent.bindCardTips) != null) {
                                                String str6 = TextUtils.isEmpty(str) ? null : str;
                                                if (str6 != null) {
                                                    String str7 = bindCardBvnContent.highLightBindCardTips;
                                                    Intrinsics.e(str7);
                                                    listSplit$default = StringsKt__StringsKt.split$default(str6, new String[]{str7}, false, 0, 6, null);
                                                }
                                            }
                                            if (listSplit$default.isEmpty()) {
                                                String str8 = bindCardBvnContent.bindCardTips;
                                                spanUtils2.append(str8 != null ? str8 : "");
                                            } else {
                                                spanUtils2.append((CharSequence) listSplit$default.get(0)).append(String.valueOf(bindCardBvnContent.highLightBindCardTips)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, addBankCardFragmentV2.requireActivity()));
                                                if (listSplit$default.size() >= 2) {
                                                    spanUtils2.append((CharSequence) listSplit$default.get(1));
                                                }
                                            }
                                            t tVar = addBankCardFragmentV2.f27837Y;
                                            TextView textView2 = (TextView) tVar.getValue();
                                            if (textView2 != null) {
                                                textView2.setText(spanUtils2.create());
                                            }
                                            TextView textView3 = (TextView) tVar.getValue();
                                            if (textView3 != null) {
                                                p220oa.h.C(textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int i11 = AddBankCardFragmentV2.f27826C0;
                            AddBankCardFragmentV2.E(addBankCardFragmentV2.z(), commonBeanResult.getRespMsg());
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
