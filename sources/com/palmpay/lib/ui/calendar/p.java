package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24219A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public CalendarView.OnYearViewChangeListener f24220A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f24221B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public CalendarView.OnClassInitializeListener f24222B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f24223C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public CalendarView.OnVerticalItemInitializeListener f24224C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f24225D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public C1435e f24226D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f24227E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public C1435e f24228E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f24229F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final HashMap f24230F0 = new HashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f24231G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f24232G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f24233H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public C1435e f24234H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f24235I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public C1435e f24236I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f24237J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final int f24238J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f24239K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final int f24240K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24241L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final boolean f24242L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24243M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final int f24244M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f24245N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final int f24246N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f24247O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f24248P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f24249Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f24250R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Class f24251S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Class f24252T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final String f24253U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Class f24254V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Class f24255W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final String f24256X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f24257Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f24258Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24259a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f24260a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24261b;
    public final int b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24262c;
    public final int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24263d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f24264d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24265e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f24266e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24267f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f24268f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24269g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f24270g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24271h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f24272h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24273i;
    public final int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24274j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C1435e f24275j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24276k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f24277k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f24278l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f24279l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24280m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f24281m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f24282n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int f24283n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24284o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Map f24285o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f24286p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CalendarView.OnClickCalendarPaddingListener f24287p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f24288q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CalendarView.OnCalendarInterceptListener f24289q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f24290r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CalendarView.OnCalendarSelectListener f24291r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f24292s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CalendarView.OnCalendarRangeSelectListener f24293s0;
    public final int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CalendarView.OnCalendarMultiSelectListener f24294t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f24295u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public CalendarView.OnCalendarLongClickListener f24296u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f24297v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CalendarView.OnInnerDateSelectedListener f24298v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24299w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CalendarView.OnYearChangeListener f24300w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24301x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CalendarView.OnMonthChangeListener f24302x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24303y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public CalendarView.OnWeekChangeListener f24304y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f24305z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public CalendarView.OnViewChangeListener f24306z0;

    public p(Context context, AttributeSet attributeSet) {
        Class cls;
        Class cls2;
        this.f24263d = false;
        this.f24242L0 = false;
        int i7 = L6.a.pp_week_string_array;
        this.f24244M0 = i7;
        int i10 = L6.a.pp_month_string_array;
        this.f24246N0 = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.j.PpCalendarView);
        if (r.f24307a == null) {
            if (s.f24335v == null) {
                s.f24335v = context.getResources().getStringArray(L6.a.pp_trunk_string_array);
                context.getResources().getStringArray(L6.a.pp_branch_string_array);
            }
            s.f24317c = context.getResources().getStringArray(L6.a.pp_solar_term);
            r.f24307a = context.getResources().getStringArray(L6.a.pp_lunar_first_of_month);
            r.f24308b = context.getResources().getStringArray(L6.a.pp_tradition_festival);
            r.f24309c = context.getResources().getStringArray(L6.a.pp_lunar_str);
            r.f24310d = context.getResources().getStringArray(L6.a.pp_special_festivals);
            r.f24312f = context.getResources().getStringArray(L6.a.pp_solar_festival);
        }
        this.f24299w = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_calendar_padding, 0.0f);
        this.f24301x = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_calendar_padding_left, 0.0f);
        this.f24303y = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_calendar_padding_right, 0.0f);
        int i11 = this.f24299w;
        if (i11 != 0) {
            this.f24301x = i11;
            this.f24303y = i11;
        }
        this.f24273i = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_scheme_text_color, -1);
        this.f24274j = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_scheme_lunar_text_color, -1973791);
        int color = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_scheme_theme_color, 1355796431);
        this.f24249Q = color;
        String string = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_month_view);
        String string2 = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_year_view);
        this.f24253U = string2;
        String string3 = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_week_view);
        String string4 = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_week_bar_view);
        this.f24248P = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_week_text_size, s.e(context, 12.0f));
        this.i0 = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_week_bar_height, s.e(context, 40.0f));
        this.f24247O = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_week_line_margin, s.e(context, 0.0f));
        this.f24245N = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_week_line_show, true);
        String string5 = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_scheme_text);
        this.f24256X = string5;
        if (TextUtils.isEmpty(string5)) {
            this.f24256X = "记";
        }
        this.f24277k0 = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_month_view_scrollable, true);
        this.f24279l0 = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_week_view_scrollable, true);
        this.f24281m0 = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_year_view_scrollable, true);
        this.f24259a = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_month_view_auto_select_day, 0);
        this.f24262c = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_month_view_show_mode, 0);
        this.f24263d = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_month_priority_show_week_mode, false);
        this.f24261b = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_week_start_with, 1);
        this.f24265e = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_select_mode, 0);
        this.f24232G0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_max_multi_select_size, Integer.MAX_VALUE);
        this.f24238J0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_min_select_range, -1);
        int i12 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_max_select_range, -1);
        this.f24240K0 = i12;
        int i13 = this.f24238J0;
        if (i13 <= i12 || i12 <= 0) {
            if (i13 <= 0) {
                this.f24238J0 = -1;
            } else {
                this.f24238J0 = i13;
            }
            if (i12 <= 0) {
                this.f24240K0 = -1;
            } else {
                this.f24240K0 = i12;
            }
        } else {
            this.f24240K0 = i13;
            this.f24238J0 = i13;
        }
        this.f24243M = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_week_background, -1);
        this.f24239K = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_week_line_background, 0);
        this.f24241L = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_background, -1);
        this.f24271h = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_week_text_color, -13421773);
        int color2 = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_current_day_text_color, -65536);
        this.f24267f = color2;
        this.f24269g = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_current_day_lunar_text_color, -65536);
        this.f24250R = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_selected_theme_color, 1355796431);
        this.f24280m = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_selected_text_color, -15658735);
        this.f24282n = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_selected_lunar_text_color, -15658735);
        this.f24278l = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_current_month_text_color, -15658735);
        this.f24276k = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_other_month_text_color, -1973791);
        this.f24284o = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_current_month_lunar_text_color, -1973791);
        this.f24286p = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_other_month_lunar_text_color, -1973791);
        this.f24257Y = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_min_year, 1971);
        this.f24258Z = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_max_year, 2055);
        this.f24260a0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_min_year_month, 1);
        this.b0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_max_year_month, 12);
        this.c0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_min_year_day, 1);
        this.f24264d0 = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarView_max_year_day, -1);
        this.f24266e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_day_text_size, s.e(context, 16.0f));
        this.f24268f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_lunar_text_size, s.e(context, 10.0f));
        this.f24270g0 = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_calendar_height, s.e(context, 56.0f));
        this.f24272h0 = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_calendar_match_parent, false);
        this.f24305z = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_year_view_month_text_size, s.e(context, 18.0f));
        this.f24219A = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_year_view_day_text_size, s.e(context, 7.0f));
        this.f24227E = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_month_text_color, -15658735);
        this.f24229F = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_day_text_color, -15658735);
        this.f24231G = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_scheme_color, color);
        this.f24237J = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_week_text_color, -13421773);
        this.f24235I = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_current_day_text_color, color2);
        this.f24233H = typedArrayObtainStyledAttributes.getColor(L6.j.PpCalendarView_year_view_select_text_color, -13421773);
        this.f24221B = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_year_view_week_text_size, s.e(context, 8.0f));
        this.f24223C = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_year_view_month_height, s.e(context, 32.0f));
        this.f24225D = typedArrayObtainStyledAttributes.getDimensionPixelSize(L6.j.PpCalendarView_year_view_week_height, s.e(context, 0.0f));
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_padding, s.e(context, 12.0f));
        this.f24288q = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_padding_left, s.e(context, 12.0f));
        this.f24290r = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_padding_right, s.e(context, 12.0f));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_year_view_show, false);
        this.f24242L0 = z3;
        this.f24245N = typedArrayObtainStyledAttributes.getBoolean(L6.j.PpCalendarView_year_view_show, z3);
        this.f24244M0 = typedArrayObtainStyledAttributes.getResourceId(L6.j.PpCalendarView_week_string_id, i7);
        this.f24246N0 = typedArrayObtainStyledAttributes.getResourceId(L6.j.PpCalendarView_month_string_id, i10);
        String string6 = typedArrayObtainStyledAttributes.getString(L6.j.PpCalendarView_preview_calendar);
        if (dimension != 0) {
            this.f24288q = dimension;
            this.f24290r = dimension;
        }
        this.f24295u = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_month_padding_top, s.e(context, 4.0f));
        this.f24297v = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_month_padding_bottom, s.e(context, 4.0f));
        this.f24292s = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_month_padding_left, s.e(context, 4.0f));
        this.t = (int) typedArrayObtainStyledAttributes.getDimension(L6.j.PpCalendarView_year_view_month_padding_right, s.e(context, 4.0f));
        if (this.f24257Y <= 1900) {
            this.f24257Y = 1900;
        }
        if (this.f24258Z >= 2099) {
            this.f24258Z = 2099;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f24275j0 = new C1435e();
        Date date = new Date();
        if (!TextUtils.isEmpty(string6)) {
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getInstance();
            simpleDateFormat.applyPattern("yyyyMMdd");
            try {
                date = simpleDateFormat.parse(string6);
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
        this.f24275j0.f24201a = s.h("yyyy", date);
        this.f24275j0.f24202b = s.h("MM", date);
        this.f24275j0.f24203c = s.h("dd", date);
        C1435e c1435e = this.f24275j0;
        c1435e.f24205e = true;
        r.c(c1435e);
        int i14 = this.f24257Y;
        int i15 = this.f24260a0;
        int i16 = this.f24258Z;
        int i17 = this.b0;
        this.f24257Y = i14;
        this.f24260a0 = i15;
        this.f24258Z = i16;
        this.b0 = i17;
        int i18 = this.f24275j0.f24201a;
        if (i16 < i18) {
            this.f24258Z = i18;
        }
        if (this.f24264d0 == -1) {
            this.f24264d0 = s.k(this.f24258Z, i17);
        }
        C1435e c1435e2 = this.f24275j0;
        this.f24283n0 = (((c1435e2.f24201a - this.f24257Y) * 12) + c1435e2.f24202b) - this.f24260a0;
        try {
            if (TextUtils.isEmpty(string4)) {
                cls2 = WeekBar.class;
                this.f24255W = cls2;
            } else {
                cls2 = Class.forName(string4);
            }
            this.f24255W = cls2;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            if (TextUtils.isEmpty(string2)) {
                cls = DefaultYearView.class;
                this.f24254V = cls;
            } else {
                cls = Class.forName(string2);
            }
            this.f24254V = cls;
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            this.f24251S = TextUtils.isEmpty(string) ? DefaultMonthView.class : Class.forName(string);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        try {
            this.f24252T = TextUtils.isEmpty(string3) ? DefaultWeekView.class : Class.forName(string3);
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    public final void a(ArrayList arrayList) {
        Map map = this.f24285o0;
        if (map == null || map.size() == 0) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1435e c1435e = (C1435e) it.next();
            if (this.f24285o0.containsKey(c1435e.toString())) {
                C1435e c1435e2 = (C1435e) this.f24285o0.get(c1435e.toString());
                if (c1435e2 != null) {
                    c1435e.f24207g = TextUtils.isEmpty(c1435e2.f24207g) ? this.f24256X : c1435e2.f24207g;
                }
            } else {
                c1435e.f24207g = "";
            }
        }
    }

    public final C1435e b() {
        C1435e c1435e = new C1435e();
        C1435e c1435e2 = this.f24275j0;
        c1435e.f24201a = c1435e2.f24201a;
        c1435e.f24202b = c1435e2.f24202b;
        c1435e.f24203c = c1435e2.f24203c;
        c1435e.f24205e = true;
        r.c(c1435e);
        return c1435e;
    }

    public final C1435e c() {
        C1435e c1435e = new C1435e();
        c1435e.f24201a = this.f24258Z;
        c1435e.f24202b = this.b0;
        c1435e.f24203c = this.f24264d0;
        c1435e.f24205e = c1435e.equals(this.f24275j0);
        r.c(c1435e);
        return c1435e;
    }

    public final C1435e d() {
        C1435e c1435e = new C1435e();
        c1435e.f24201a = this.f24257Y;
        c1435e.f24202b = this.f24260a0;
        c1435e.f24203c = this.c0;
        c1435e.f24205e = c1435e.equals(this.f24275j0);
        r.c(c1435e);
        return c1435e;
    }

    public final void e() {
        Map map = this.f24285o0;
        if (map == null || map.size() <= 0) {
            this.f24226D0.f24207g = "";
            return;
        }
        String string = this.f24226D0.toString();
        if (this.f24285o0.containsKey(string)) {
            C1435e c1435e = (C1435e) this.f24285o0.get(string);
            C1435e c1435e2 = this.f24226D0;
            String str = this.f24256X;
            c1435e2.getClass();
            if (c1435e == null) {
                return;
            }
            if (!TextUtils.isEmpty(c1435e.f24207g)) {
                str = c1435e.f24207g;
            }
            c1435e2.f24207g = str;
        }
    }
}
