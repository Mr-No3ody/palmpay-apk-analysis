package com.transsnet.palmpay.credit.view;

import C0.G;
import F6.d;
import Gb.Q;
import N6.e;
import Ya.f;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.credit.bean.resp.IndexRange;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/view/RepayStampDutyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRepayStampDutyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayStampDutyView.kt\ncom/transsnet/palmpay/credit/view/RepayStampDutyView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n774#2:111\n865#2,2:112\n1563#2:114\n1634#2,3:115\n1056#2:118\n1869#2,2:119\n*S KotlinDebug\n*F\n+ 1 RepayStampDutyView.kt\ncom/transsnet/palmpay/credit/view/RepayStampDutyView\n*L\n56#1:111\n56#1:112,2\n60#1:114\n60#1:115,3\n71#1:118\n76#1:119,2\n*E\n"})
public final class RepayStampDutyView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f30879a;

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
    public RepayStampDutyView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = View.inflate(context, f.cs_oc_repay_stamp_duty, this);
        int i7 = Ya.e.tvStampDuty;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        this.f30879a = new e((ConstraintLayout) viewInflate, textView, 2);
    }

    public final SpannableString c(String str, List list) {
        List list2;
        int i7;
        d.h("RepayStampDutyView", 3, G.o("highlight >>> promptText=", str));
        if (str == null || str.length() == 0 || (list2 = list) == null || list2.isEmpty()) {
            return new SpannableString(str);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            IndexRange indexRange = (IndexRange) obj;
            if (indexRange.getStartIndex() >= 0 && indexRange.getEndIndex() > indexRange.getStartIndex() && indexRange.getEndIndex() <= str.length()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            IndexRange indexRange2 = (IndexRange) it.next();
            int iC = b.c(indexRange2.getStartIndex(), 0, str.length());
            int iC2 = b.c(indexRange2.getEndIndex(), iC + 1, str.length());
            int i11 = iC - 1;
            if (i11 >= 0) {
                i10 = i11;
            }
            arrayList2.add(new IndexRange(i10, iC2));
        }
        if (arrayList2.isEmpty()) {
            return new SpannableString(str);
        }
        List<IndexRange> listT = CollectionsKt.T(arrayList2, new Q(0));
        d.h("RepayStampDutyView", 3, "fixeRangeIfNeed >>>");
        if (listT.size() > 1) {
            ArrayList arrayList3 = new ArrayList();
            IndexRange indexRange3 = (IndexRange) listT.get(0);
            int size = listT.size();
            for (i7 = 1; i7 < size; i7++) {
                IndexRange indexRange4 = (IndexRange) listT.get(i7);
                if (indexRange3.getEndIndex() >= indexRange4.getStartIndex()) {
                    int startIndex = indexRange3.getStartIndex();
                    int endIndex = indexRange3.getEndIndex();
                    int endIndex2 = indexRange4.getEndIndex();
                    if (endIndex < endIndex2) {
                        endIndex = endIndex2;
                    }
                    indexRange3 = new IndexRange(startIndex, endIndex);
                } else {
                    arrayList3.add(indexRange3);
                    indexRange3 = indexRange4;
                }
            }
            arrayList3.add(indexRange3);
            listT = arrayList3;
        }
        SpannableString spannableString = new SpannableString(str);
        for (IndexRange indexRange5 : listT) {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(L6.b.ppColorWarning)), indexRange5.getStartIndex(), indexRange5.getEndIndex(), 33);
        }
        return spannableString;
    }

    public final void d(boolean z3, StampDutyPromptInfo stampDutyPromptInfo) {
        e eVar = this.f30879a;
        d.h("RepayStampDutyView", 3, "update >>> show=" + z3 + ", stampDutyInfo=" + stampDutyPromptInfo);
        h.s(this, z3);
        if (eVar != null) {
            try {
                eVar.f6098c.setText(c(stampDutyPromptInfo.getPromptText(), stampDutyPromptInfo.getHighlightRanges()));
            } catch (Exception e10) {
                e10.printStackTrace();
                eVar.f6098c.setText(stampDutyPromptInfo.getPromptText());
            }
        }
    }
}
