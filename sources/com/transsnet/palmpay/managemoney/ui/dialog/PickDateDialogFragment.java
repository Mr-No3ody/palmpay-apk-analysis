package com.transsnet.palmpay.managemoney.ui.dialog;

import Ad.L;
import Jc.c;
import Jc.d;
import O6.f;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.managemoney.ui.dialog.PickDateDialogFragment;
import dc.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/PickDateDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "OnDateSelectedListener", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickDateDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final a f32299v0 = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OnDateSelectedListener f32300C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public WheelView f32301H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public WheelView f32302L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public WheelView f32303M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public TextView f32304Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Date f32305X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Date f32306Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f32307Z = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f32308k0 = -1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32309p0 = -1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ArrayList f32310q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArrayList f32311r0 = new ArrayList();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f32312s0 = new ArrayList();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f32313t0 = true;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f32314u0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/PickDateDialogFragment$OnDateSelectedListener;", "", "onDateSelected", "", "endDate", "", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDateSelectedListener {
        void onDateSelected(long endDate);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PickDateDialogFragment newInstance$default(a aVar, long j6, long j10, OnDateSelectedListener onDateSelectedListener, boolean z3, int i7, Object obj) {
            if ((i7 & 8) != 0) {
                z3 = false;
            }
            return aVar.newInstance(j6, j10, onDateSelectedListener, z3);
        }

        @NotNull
        public final PickDateDialogFragment newInstance(long j6, long j10, @Nullable OnDateSelectedListener onDateSelectedListener, boolean z3) {
            PickDateDialogFragment pickDateDialogFragment = new PickDateDialogFragment();
            pickDateDialogFragment.f32300C = onDateSelectedListener;
            Bundle bundle = new Bundle();
            bundle.putLong("min_duration_day", j6);
            bundle.putLong("max_duration_day", j10);
            bundle.putBoolean("isShowInterval", z3);
            pickDateDialogFragment.setArguments(bundle);
            return pickDateDialogFragment;
        }

        private a() {
        }

        @NotNull
        public final PickDateDialogFragment newInstance(long j6, long j10, int i7, @Nullable OnDateSelectedListener onDateSelectedListener, boolean z3) {
            PickDateDialogFragment pickDateDialogFragment = new PickDateDialogFragment();
            pickDateDialogFragment.f32300C = onDateSelectedListener;
            Bundle bundle = new Bundle();
            bundle.putLong("min_duration_day", j6);
            bundle.putLong("max_duration_day", j10);
            bundle.putBoolean("isShowInterval", z3);
            bundle.putInt("intervalDay", i7);
            pickDateDialogFragment.setArguments(bundle);
            return pickDateDialogFragment;
        }
    }

    public static int k(Date date, int i7) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i7);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_pick_date_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        this.f32301H = (WheelView) viewF.findViewById(c.wvYear);
        this.f32302L = (WheelView) viewF.findViewById(c.wvMonth);
        this.f32303M = (WheelView) viewF.findViewById(c.wvDay);
        this.f32304Q = (TextView) viewF.findViewById(c.tv_interval);
        final int i7 = 0;
        viewF.findViewById(c.tvCancel).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickDateDialogFragment f6789b;

            {
                this.f6789b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickDateDialogFragment pickDateDialogFragment = this.f6789b;
                switch (i7) {
                    case 0:
                        PickDateDialogFragment.a aVar = PickDateDialogFragment.f32299v0;
                        pickDateDialogFragment.dismiss();
                        break;
                    default:
                        PickDateDialogFragment.a aVar2 = PickDateDialogFragment.f32299v0;
                        pickDateDialogFragment.dismiss();
                        PickDateDialogFragment.OnDateSelectedListener onDateSelectedListener = pickDateDialogFragment.f32300C;
                        if (onDateSelectedListener != null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, pickDateDialogFragment.f32307Z);
                            calendar.set(2, pickDateDialogFragment.f32308k0 - 1);
                            calendar.set(5, pickDateDialogFragment.f32309p0);
                            Log.e("PickDateDialogFragment", pickDateDialogFragment.f32307Z + ":" + pickDateDialogFragment.f32308k0 + ":" + pickDateDialogFragment.f32309p0 + ":" + calendar.getTimeInMillis());
                            onDateSelectedListener.onDateSelected(calendar.getTimeInMillis());
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        viewF.findViewById(c.tvConfirm).setOnClickListener(new View.OnClickListener(this) { // from class: Oc.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickDateDialogFragment f6789b;

            {
                this.f6789b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PickDateDialogFragment pickDateDialogFragment = this.f6789b;
                switch (i10) {
                    case 0:
                        PickDateDialogFragment.a aVar = PickDateDialogFragment.f32299v0;
                        pickDateDialogFragment.dismiss();
                        break;
                    default:
                        PickDateDialogFragment.a aVar2 = PickDateDialogFragment.f32299v0;
                        pickDateDialogFragment.dismiss();
                        PickDateDialogFragment.OnDateSelectedListener onDateSelectedListener = pickDateDialogFragment.f32300C;
                        if (onDateSelectedListener != null) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, pickDateDialogFragment.f32307Z);
                            calendar.set(2, pickDateDialogFragment.f32308k0 - 1);
                            calendar.set(5, pickDateDialogFragment.f32309p0);
                            Log.e("PickDateDialogFragment", pickDateDialogFragment.f32307Z + ":" + pickDateDialogFragment.f32308k0 + ":" + pickDateDialogFragment.f32309p0 + ":" + calendar.getTimeInMillis());
                            onDateSelectedListener.onDateSelected(calendar.getTimeInMillis());
                        }
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        long j6 = arguments != null ? arguments.getLong("min_duration_day") : 0L;
        Bundle arguments2 = getArguments();
        long j10 = arguments2 != null ? arguments2.getLong("max_duration_day") : 0L;
        Bundle arguments3 = getArguments();
        int i11 = arguments3 != null ? arguments3.getInt("intervalDay") : 0;
        Bundle arguments4 = getArguments();
        boolean z3 = arguments4 != null ? arguments4.getBoolean("isShowInterval") : false;
        this.f32314u0 = z3;
        if (z3) {
            TextView textView = this.f32304Q;
            if (textView == null) {
                Intrinsics.n("mTextInterval");
                throw null;
            }
            textView.setText("Your deposit term is " + i11 + " days.");
        }
        TextView textView2 = this.f32304Q;
        if (textView2 == null) {
            Intrinsics.n("mTextInterval");
            throw null;
        }
        textView2.setVisibility(this.f32314u0 ? 0 : 8);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, (int) j6);
        this.f32307Z = calendar.get(1);
        this.f32308k0 = calendar.get(2);
        this.f32305X = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, (int) j10);
        this.f32306Y = calendar2.getTime();
        ArrayList arrayList = new ArrayList();
        Date date = this.f32305X;
        if (date == null) {
            Intrinsics.n("mStartDate");
            throw null;
        }
        int iK = k(date, 1);
        Date date2 = this.f32306Y;
        if (date2 == null) {
            Intrinsics.n("mEndDate");
            throw null;
        }
        int iK2 = k(date2, 1);
        if (iK <= iK2) {
            while (true) {
                arrayList.add(String.valueOf(iK));
                if (iK == iK2) {
                    break;
                }
                iK++;
            }
        }
        this.f32310q0 = arrayList;
        WheelView wheelView = this.f32301H;
        if (wheelView == null) {
            Intrinsics.n("mWheelViewYear");
            throw null;
        }
        wheelView.setWheelAdapter(new L(requireContext(), 4, false));
        WheelView wheelView2 = this.f32301H;
        if (wheelView2 == null) {
            Intrinsics.n("mWheelViewYear");
            throw null;
        }
        wheelView2.setWheelSize(5);
        WheelView wheelView3 = this.f32301H;
        if (wheelView3 == null) {
            Intrinsics.n("mWheelViewYear");
            throw null;
        }
        wheelView3.setWheelData(this.f32310q0);
        WheelView wheelView4 = this.f32301H;
        if (wheelView4 == null) {
            Intrinsics.n("mWheelViewYear");
            throw null;
        }
        b bVar = new b();
        bVar.f35864a = 0;
        bVar.f35866c = requireContext().getColor(Jc.a.mm_color_9ca2aa);
        bVar.f35867d = requireContext().getColor(Jc.a.mm_color_202046);
        bVar.f35868e = 16;
        bVar.f35869f = 22;
        wheelView4.setStyle(bVar);
        WheelView wheelView5 = this.f32301H;
        if (wheelView5 == null) {
            Intrinsics.n("mWheelViewYear");
            throw null;
        }
        final int i12 = 2;
        wheelView5.setOnWheelItemSelectedListener(new WheelView.OnWheelItemSelectedListener(this) { // from class: Oc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickDateDialogFragment f6791b;

            {
                this.f6791b = this;
            }

            @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
            public final void onItemSelected(int i13, Object obj) {
                int i14;
                String[] months = r0.f7152a;
                PickDateDialogFragment pickDateDialogFragment = this.f6791b;
                switch (i12) {
                    case 0:
                        PickDateDialogFragment.a aVar = PickDateDialogFragment.f32299v0;
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView6 = pickDateDialogFragment.f32302L;
                        if (wheelView6 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT = C1847n.t(months, wheelView6.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT;
                        ArrayList arrayListJ = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT);
                        pickDateDialogFragment.f32312s0 = arrayListJ;
                        WheelView wheelView7 = pickDateDialogFragment.f32303M;
                        if (wheelView7 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView7.h(arrayListJ);
                        WheelView wheelView8 = pickDateDialogFragment.f32303M;
                        if (wheelView8 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView8.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                    case 1:
                        WheelView wheelView9 = pickDateDialogFragment.f32303M;
                        if (wheelView9 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        pickDateDialogFragment.f32309p0 = r0.q((String) wheelView9.getSelectionItem());
                        int i15 = 0;
                        if (pickDateDialogFragment.f32313t0) {
                            pickDateDialogFragment.f32313t0 = false;
                            return;
                        }
                        if (pickDateDialogFragment.f32314u0) {
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.set(1, pickDateDialogFragment.f32307Z);
                            calendar3.set(2, pickDateDialogFragment.f32308k0 - 1);
                            calendar3.set(5, pickDateDialogFragment.f32309p0);
                            Log.e("PickDateDialogFragment", pickDateDialogFragment.f32307Z + ":" + pickDateDialogFragment.f32308k0 + ":" + pickDateDialogFragment.f32309p0 + ":" + calendar3.getTimeInMillis());
                            long timeInMillis = calendar3.getTimeInMillis();
                            TextView textView3 = pickDateDialogFragment.f32304Q;
                            if (textView3 == null) {
                                Intrinsics.n("mTextInterval");
                                throw null;
                            }
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.setTimeInMillis(timeInMillis);
                            Calendar.getInstance().get(1);
                            long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                            long timeInMillis3 = calendar4.getTimeInMillis();
                            calendar4.setTimeInMillis(timeInMillis3);
                            calendar4.get(1);
                            Date date3 = new Date(timeInMillis2);
                            Date date4 = new Date(timeInMillis3);
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.setTime(date3);
                            Calendar calendar6 = Calendar.getInstance();
                            calendar6.setTime(date4);
                            int i16 = calendar5.get(6);
                            int i17 = calendar6.get(6);
                            int i18 = calendar5.get(1);
                            int i19 = calendar6.get(1);
                            if (i18 != i19) {
                                while (i18 < i19) {
                                    i15 += ((i18 % 4 != 0 || i18 % 100 == 0) && i18 % 400 != 0) ? 365 : 366;
                                    i18++;
                                }
                                i14 = (i17 - i16) + i15;
                            } else {
                                i14 = i17 - i16;
                            }
                            textView3.setText("Your deposit term is " + i14 + " days.");
                            return;
                        }
                        return;
                    default:
                        WheelView wheelView10 = pickDateDialogFragment.f32301H;
                        if (wheelView10 == null) {
                            Intrinsics.n("mWheelViewYear");
                            throw null;
                        }
                        int iQ = r0.q((String) wheelView10.getSelectionItem());
                        pickDateDialogFragment.f32307Z = iQ;
                        ArrayList arrayListL = pickDateDialogFragment.l(iQ);
                        pickDateDialogFragment.f32311r0 = arrayListL;
                        WheelView wheelView11 = pickDateDialogFragment.f32302L;
                        if (wheelView11 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        wheelView11.h(arrayListL);
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView12 = pickDateDialogFragment.f32302L;
                        if (wheelView12 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT2 = C1847n.t(months, wheelView12.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT2;
                        ArrayList arrayListJ2 = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT2);
                        pickDateDialogFragment.f32312s0 = arrayListJ2;
                        WheelView wheelView13 = pickDateDialogFragment.f32303M;
                        if (wheelView13 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView13.h(arrayListJ2);
                        WheelView wheelView14 = pickDateDialogFragment.f32303M;
                        if (wheelView14 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView14.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                }
            }
        });
        this.f32311r0 = l(this.f32307Z);
        WheelView wheelView6 = this.f32302L;
        if (wheelView6 == null) {
            Intrinsics.n("mWheelViewMonth");
            throw null;
        }
        wheelView6.setWheelAdapter(new L(requireContext(), 4, false));
        WheelView wheelView7 = this.f32302L;
        if (wheelView7 == null) {
            Intrinsics.n("mWheelViewMonth");
            throw null;
        }
        wheelView7.setWheelSize(5);
        WheelView wheelView8 = this.f32302L;
        if (wheelView8 == null) {
            Intrinsics.n("mWheelViewMonth");
            throw null;
        }
        wheelView8.setWheelData(this.f32311r0);
        WheelView wheelView9 = this.f32302L;
        if (wheelView9 == null) {
            Intrinsics.n("mWheelViewMonth");
            throw null;
        }
        b bVar2 = new b();
        bVar2.f35864a = 0;
        bVar2.f35866c = requireContext().getColor(Jc.a.mm_color_9ca2aa);
        bVar2.f35867d = requireContext().getColor(Jc.a.mm_color_202046);
        bVar2.f35868e = 16;
        bVar2.f35869f = 22;
        wheelView9.setStyle(bVar2);
        WheelView wheelView10 = this.f32302L;
        if (wheelView10 == null) {
            Intrinsics.n("mWheelViewMonth");
            throw null;
        }
        final int i13 = 0;
        wheelView10.setOnWheelItemSelectedListener(new WheelView.OnWheelItemSelectedListener(this) { // from class: Oc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickDateDialogFragment f6791b;

            {
                this.f6791b = this;
            }

            @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
            public final void onItemSelected(int i14, Object obj) {
                int i15;
                String[] months = r0.f7152a;
                PickDateDialogFragment pickDateDialogFragment = this.f6791b;
                switch (i13) {
                    case 0:
                        PickDateDialogFragment.a aVar = PickDateDialogFragment.f32299v0;
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView11 = pickDateDialogFragment.f32302L;
                        if (wheelView11 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT = C1847n.t(months, wheelView11.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT;
                        ArrayList arrayListJ = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT);
                        pickDateDialogFragment.f32312s0 = arrayListJ;
                        WheelView wheelView12 = pickDateDialogFragment.f32303M;
                        if (wheelView12 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView12.h(arrayListJ);
                        WheelView wheelView13 = pickDateDialogFragment.f32303M;
                        if (wheelView13 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView13.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                    case 1:
                        WheelView wheelView14 = pickDateDialogFragment.f32303M;
                        if (wheelView14 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        pickDateDialogFragment.f32309p0 = r0.q((String) wheelView14.getSelectionItem());
                        int i16 = 0;
                        if (pickDateDialogFragment.f32313t0) {
                            pickDateDialogFragment.f32313t0 = false;
                            return;
                        }
                        if (pickDateDialogFragment.f32314u0) {
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.set(1, pickDateDialogFragment.f32307Z);
                            calendar3.set(2, pickDateDialogFragment.f32308k0 - 1);
                            calendar3.set(5, pickDateDialogFragment.f32309p0);
                            Log.e("PickDateDialogFragment", pickDateDialogFragment.f32307Z + ":" + pickDateDialogFragment.f32308k0 + ":" + pickDateDialogFragment.f32309p0 + ":" + calendar3.getTimeInMillis());
                            long timeInMillis = calendar3.getTimeInMillis();
                            TextView textView3 = pickDateDialogFragment.f32304Q;
                            if (textView3 == null) {
                                Intrinsics.n("mTextInterval");
                                throw null;
                            }
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.setTimeInMillis(timeInMillis);
                            Calendar.getInstance().get(1);
                            long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                            long timeInMillis3 = calendar4.getTimeInMillis();
                            calendar4.setTimeInMillis(timeInMillis3);
                            calendar4.get(1);
                            Date date3 = new Date(timeInMillis2);
                            Date date4 = new Date(timeInMillis3);
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.setTime(date3);
                            Calendar calendar6 = Calendar.getInstance();
                            calendar6.setTime(date4);
                            int i17 = calendar5.get(6);
                            int i18 = calendar6.get(6);
                            int i19 = calendar5.get(1);
                            int i110 = calendar6.get(1);
                            if (i19 != i110) {
                                while (i19 < i110) {
                                    i16 += ((i19 % 4 != 0 || i19 % 100 == 0) && i19 % 400 != 0) ? 365 : 366;
                                    i19++;
                                }
                                i15 = (i18 - i17) + i16;
                            } else {
                                i15 = i18 - i17;
                            }
                            textView3.setText("Your deposit term is " + i15 + " days.");
                            return;
                        }
                        return;
                    default:
                        WheelView wheelView15 = pickDateDialogFragment.f32301H;
                        if (wheelView15 == null) {
                            Intrinsics.n("mWheelViewYear");
                            throw null;
                        }
                        int iQ = r0.q((String) wheelView15.getSelectionItem());
                        pickDateDialogFragment.f32307Z = iQ;
                        ArrayList arrayListL = pickDateDialogFragment.l(iQ);
                        pickDateDialogFragment.f32311r0 = arrayListL;
                        WheelView wheelView16 = pickDateDialogFragment.f32302L;
                        if (wheelView16 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        wheelView16.h(arrayListL);
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView17 = pickDateDialogFragment.f32302L;
                        if (wheelView17 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT2 = C1847n.t(months, wheelView17.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT2;
                        ArrayList arrayListJ2 = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT2);
                        pickDateDialogFragment.f32312s0 = arrayListJ2;
                        WheelView wheelView18 = pickDateDialogFragment.f32303M;
                        if (wheelView18 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView18.h(arrayListJ2);
                        WheelView wheelView19 = pickDateDialogFragment.f32303M;
                        if (wheelView19 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView19.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                }
            }
        });
        this.f32312s0 = j(this.f32307Z, this.f32308k0);
        WheelView wheelView11 = this.f32303M;
        if (wheelView11 == null) {
            Intrinsics.n("mWheelViewDay");
            throw null;
        }
        wheelView11.setWheelAdapter(new L(requireContext(), 4, false));
        WheelView wheelView12 = this.f32303M;
        if (wheelView12 == null) {
            Intrinsics.n("mWheelViewDay");
            throw null;
        }
        wheelView12.setWheelSize(5);
        WheelView wheelView13 = this.f32303M;
        if (wheelView13 == null) {
            Intrinsics.n("mWheelViewDay");
            throw null;
        }
        wheelView13.setWheelData(this.f32312s0);
        WheelView wheelView14 = this.f32303M;
        if (wheelView14 == null) {
            Intrinsics.n("mWheelViewDay");
            throw null;
        }
        b bVar3 = new b();
        bVar3.f35864a = 0;
        bVar3.f35866c = requireContext().getColor(Jc.a.mm_color_9ca2aa);
        bVar3.f35867d = requireContext().getColor(Jc.a.mm_color_202046);
        bVar3.f35868e = 16;
        bVar3.f35869f = 22;
        wheelView14.setStyle(bVar3);
        WheelView wheelView15 = this.f32303M;
        if (wheelView15 == null) {
            Intrinsics.n("mWheelViewDay");
            throw null;
        }
        final int i14 = 1;
        wheelView15.setOnWheelItemSelectedListener(new WheelView.OnWheelItemSelectedListener(this) { // from class: Oc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickDateDialogFragment f6791b;

            {
                this.f6791b = this;
            }

            @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
            public final void onItemSelected(int i15, Object obj) {
                int i16;
                String[] months = r0.f7152a;
                PickDateDialogFragment pickDateDialogFragment = this.f6791b;
                switch (i14) {
                    case 0:
                        PickDateDialogFragment.a aVar = PickDateDialogFragment.f32299v0;
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView16 = pickDateDialogFragment.f32302L;
                        if (wheelView16 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT = C1847n.t(months, wheelView16.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT;
                        ArrayList arrayListJ = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT);
                        pickDateDialogFragment.f32312s0 = arrayListJ;
                        WheelView wheelView17 = pickDateDialogFragment.f32303M;
                        if (wheelView17 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView17.h(arrayListJ);
                        WheelView wheelView18 = pickDateDialogFragment.f32303M;
                        if (wheelView18 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView18.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                    case 1:
                        WheelView wheelView19 = pickDateDialogFragment.f32303M;
                        if (wheelView19 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        pickDateDialogFragment.f32309p0 = r0.q((String) wheelView19.getSelectionItem());
                        int i17 = 0;
                        if (pickDateDialogFragment.f32313t0) {
                            pickDateDialogFragment.f32313t0 = false;
                            return;
                        }
                        if (pickDateDialogFragment.f32314u0) {
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.set(1, pickDateDialogFragment.f32307Z);
                            calendar3.set(2, pickDateDialogFragment.f32308k0 - 1);
                            calendar3.set(5, pickDateDialogFragment.f32309p0);
                            Log.e("PickDateDialogFragment", pickDateDialogFragment.f32307Z + ":" + pickDateDialogFragment.f32308k0 + ":" + pickDateDialogFragment.f32309p0 + ":" + calendar3.getTimeInMillis());
                            long timeInMillis = calendar3.getTimeInMillis();
                            TextView textView3 = pickDateDialogFragment.f32304Q;
                            if (textView3 == null) {
                                Intrinsics.n("mTextInterval");
                                throw null;
                            }
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.setTimeInMillis(timeInMillis);
                            Calendar.getInstance().get(1);
                            long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                            long timeInMillis3 = calendar4.getTimeInMillis();
                            calendar4.setTimeInMillis(timeInMillis3);
                            calendar4.get(1);
                            Date date3 = new Date(timeInMillis2);
                            Date date4 = new Date(timeInMillis3);
                            Calendar calendar5 = Calendar.getInstance();
                            calendar5.setTime(date3);
                            Calendar calendar6 = Calendar.getInstance();
                            calendar6.setTime(date4);
                            int i18 = calendar5.get(6);
                            int i19 = calendar6.get(6);
                            int i110 = calendar5.get(1);
                            int i111 = calendar6.get(1);
                            if (i110 != i111) {
                                while (i110 < i111) {
                                    i17 += ((i110 % 4 != 0 || i110 % 100 == 0) && i110 % 400 != 0) ? 365 : 366;
                                    i110++;
                                }
                                i16 = (i19 - i18) + i17;
                            } else {
                                i16 = i19 - i18;
                            }
                            textView3.setText("Your deposit term is " + i16 + " days.");
                            return;
                        }
                        return;
                    default:
                        WheelView wheelView110 = pickDateDialogFragment.f32301H;
                        if (wheelView110 == null) {
                            Intrinsics.n("mWheelViewYear");
                            throw null;
                        }
                        int iQ = r0.q((String) wheelView110.getSelectionItem());
                        pickDateDialogFragment.f32307Z = iQ;
                        ArrayList arrayListL = pickDateDialogFragment.l(iQ);
                        pickDateDialogFragment.f32311r0 = arrayListL;
                        WheelView wheelView111 = pickDateDialogFragment.f32302L;
                        if (wheelView111 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        wheelView111.h(arrayListL);
                        Intrinsics.checkNotNullExpressionValue(months, "months");
                        WheelView wheelView112 = pickDateDialogFragment.f32302L;
                        if (wheelView112 == null) {
                            Intrinsics.n("mWheelViewMonth");
                            throw null;
                        }
                        int iT2 = C1847n.t(months, wheelView112.getSelectionItem()) + 1;
                        pickDateDialogFragment.f32308k0 = iT2;
                        ArrayList arrayListJ2 = pickDateDialogFragment.j(pickDateDialogFragment.f32307Z, iT2);
                        pickDateDialogFragment.f32312s0 = arrayListJ2;
                        WheelView wheelView113 = pickDateDialogFragment.f32303M;
                        if (wheelView113 == null) {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                        wheelView113.h(arrayListJ2);
                        WheelView wheelView114 = pickDateDialogFragment.f32303M;
                        if (wheelView114 != null) {
                            pickDateDialogFragment.f32309p0 = r0.q((String) wheelView114.getSelectionItem());
                            return;
                        } else {
                            Intrinsics.n("mWheelViewDay");
                            throw null;
                        }
                }
            }
        });
        return baseDialog;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public final ArrayList j(int i7, int i10) {
        int iK;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, i7);
        calendar.set(2, i10 - 1);
        int actualMaximum = calendar.getActualMaximum(5);
        Date date = this.f32305X;
        if (date == null) {
            Intrinsics.n("mStartDate");
            throw null;
        }
        if (i7 != k(date, 1)) {
            iK = 1;
        } else {
            Date date2 = this.f32305X;
            if (date2 == null) {
                Intrinsics.n("mStartDate");
                throw null;
            }
            if (i10 == k(date2, 2) + 1) {
                Date date3 = this.f32305X;
                if (date3 == null) {
                    Intrinsics.n("mStartDate");
                    throw null;
                }
                iK = k(date3, 5);
            } else {
                iK = 1;
            }
        }
        Date date4 = this.f32306Y;
        if (date4 == null) {
            Intrinsics.n("mEndDate");
            throw null;
        }
        if (i7 == k(date4, 1)) {
            Date date5 = this.f32306Y;
            if (date5 == null) {
                Intrinsics.n("mEndDate");
                throw null;
            }
            if (i10 == k(date5, 2) + 1) {
                Date date6 = this.f32306Y;
                if (date6 == null) {
                    Intrinsics.n("mEndDate");
                    throw null;
                }
                actualMaximum = k(date6, 5);
            }
        }
        if (iK <= actualMaximum) {
            while (true) {
                if (iK < 10) {
                    arrayList.add("0" + iK);
                } else {
                    arrayList.add(String.valueOf(iK));
                }
                if (iK == actualMaximum) {
                    break;
                }
                iK++;
            }
        }
        return arrayList;
    }

    public final ArrayList l(int i7) {
        int iK;
        int iK2;
        ArrayList arrayList = new ArrayList();
        Date date = this.f32305X;
        if (date == null) {
            Intrinsics.n("mStartDate");
            throw null;
        }
        if (i7 == k(date, 1)) {
            Date date2 = this.f32305X;
            if (date2 == null) {
                Intrinsics.n("mStartDate");
                throw null;
            }
            iK = k(date2, 2) + 1;
        } else {
            iK = 1;
        }
        Date date3 = this.f32306Y;
        if (date3 == null) {
            Intrinsics.n("mEndDate");
            throw null;
        }
        if (i7 == k(date3, 1)) {
            Date date4 = this.f32306Y;
            if (date4 == null) {
                Intrinsics.n("mEndDate");
                throw null;
            }
            iK2 = k(date4, 2) + 1;
        } else {
            iK2 = 12;
        }
        if (iK <= iK2) {
            while (true) {
                String str = r0.f7152a[iK - 1];
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                arrayList.add(str);
                if (iK == iK2) {
                    break;
                }
                iK++;
            }
        }
        return arrayList;
    }
}
