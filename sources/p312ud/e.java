package p312ud;

import Jd.b;
import android.view.View;
import android.view.ViewStub;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmActivity f42970b;

    public /* synthetic */ e(BaseMvvmActivity baseMvvmActivity, int i7) {
        this.f42969a = i7;
        this.f42970b = baseMvvmActivity;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i7) {
        TextView textView;
        BaseMvvmActivity baseMvvmActivity = this.f42970b;
        int i10 = this.f42969a;
        Intrinsics.checkNotNullParameter(radioGroup, "<unused var>");
        switch (i10) {
            case 0:
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = (ScheduleTransferCreateActivity) baseMvvmActivity;
                if (i7 == p159kd.e.rb_monthly) {
                    if (scheduleTransferCreateActivity.f33368y0 == null) {
                        ViewStub viewStub = (ViewStub) scheduleTransferCreateActivity.findViewById(p159kd.e.vst_monthly);
                        View viewInflate = viewStub != null ? viewStub.inflate() : null;
                        scheduleTransferCreateActivity.f33368y0 = viewInflate != null ? (ConstraintLayout) viewInflate.findViewById(p159kd.e.cl_monthly) : null;
                        TextView textView2 = viewInflate != null ? (TextView) viewInflate.findViewById(p159kd.e.tv_monthly_tips) : null;
                        scheduleTransferCreateActivity.f33326B0 = textView2;
                        if (textView2 != null) {
                            textView2.setGravity(8388613);
                        }
                        TextView textView3 = viewInflate != null ? (TextView) viewInflate.findViewById(p159kd.e.tv_monthly_end_time) : null;
                        scheduleTransferCreateActivity.f33324A0 = textView3;
                        if (textView3 != null) {
                            textView3.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        TextView textView4 = viewInflate != null ? (TextView) viewInflate.findViewById(p159kd.e.tv_monthly_day) : null;
                        scheduleTransferCreateActivity.f33369z0 = textView4;
                        if (textView4 != null) {
                            textView4.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        scheduleTransferCreateActivity.w();
                        scheduleTransferCreateActivity.x();
                    }
                    ConstraintLayout constraintLayout = scheduleTransferCreateActivity.f33368y0;
                    if (constraintLayout != null) {
                        h.C(constraintLayout);
                    }
                    scheduleTransferCreateActivity.f33366w0 = 4;
                } else {
                    ConstraintLayout constraintLayout2 = scheduleTransferCreateActivity.f33368y0;
                    if (constraintLayout2 != null) {
                        h.c(constraintLayout2);
                    }
                }
                if (i7 == p159kd.e.rb_weekly) {
                    if (scheduleTransferCreateActivity.f33328C0 == null) {
                        ViewStub viewStub2 = (ViewStub) scheduleTransferCreateActivity.findViewById(p159kd.e.vst_weekly);
                        View viewInflate2 = viewStub2 != null ? viewStub2.inflate() : null;
                        scheduleTransferCreateActivity.f33328C0 = viewInflate2 != null ? (ConstraintLayout) viewInflate2.findViewById(p159kd.e.cl_weekly) : null;
                        TextView textView5 = viewInflate2 != null ? (TextView) viewInflate2.findViewById(p159kd.e.tv_weekly_tips) : null;
                        scheduleTransferCreateActivity.f33331F0 = textView5;
                        if (textView5 != null) {
                            textView5.setGravity(8388613);
                        }
                        TextView textView6 = viewInflate2 != null ? (TextView) viewInflate2.findViewById(p159kd.e.tv_weekly_end_time) : null;
                        scheduleTransferCreateActivity.f33330E0 = textView6;
                        if (textView6 != null) {
                            textView6.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        TextView textView7 = viewInflate2 != null ? (TextView) viewInflate2.findViewById(p159kd.e.tv_weekly_day) : null;
                        scheduleTransferCreateActivity.f33329D0 = textView7;
                        if (textView7 != null) {
                            textView7.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        scheduleTransferCreateActivity.y();
                        scheduleTransferCreateActivity.z();
                    }
                    ConstraintLayout constraintLayout3 = scheduleTransferCreateActivity.f33328C0;
                    if (constraintLayout3 != null) {
                        h.C(constraintLayout3);
                    }
                    scheduleTransferCreateActivity.f33366w0 = 3;
                } else {
                    ConstraintLayout constraintLayout4 = scheduleTransferCreateActivity.f33328C0;
                    if (constraintLayout4 != null) {
                        h.c(constraintLayout4);
                    }
                }
                if (i7 == p159kd.e.rb_every_day) {
                    if (scheduleTransferCreateActivity.f33332G0 == null) {
                        ViewStub viewStub3 = (ViewStub) scheduleTransferCreateActivity.findViewById(p159kd.e.vst_daily);
                        View viewInflate3 = viewStub3 != null ? viewStub3.inflate() : null;
                        scheduleTransferCreateActivity.f33332G0 = viewInflate3 != null ? (ConstraintLayout) viewInflate3.findViewById(p159kd.e.cl_every_day) : null;
                        TextView textView8 = viewInflate3 != null ? (TextView) viewInflate3.findViewById(p159kd.e.tv_daily_tips) : null;
                        scheduleTransferCreateActivity.f33336J0 = textView8;
                        if (textView8 != null) {
                            textView8.setGravity(8388613);
                        }
                        TextView textView9 = viewInflate3 != null ? (TextView) viewInflate3.findViewById(p159kd.e.tv_daily_start_time) : null;
                        scheduleTransferCreateActivity.f33334H0 = textView9;
                        if (textView9 != null) {
                            textView9.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        textView = viewInflate3 != null ? (TextView) viewInflate3.findViewById(p159kd.e.tv_daily_end_time) : null;
                        scheduleTransferCreateActivity.f33335I0 = textView;
                        if (textView != null) {
                            textView.setOnClickListener(scheduleTransferCreateActivity);
                        }
                        SimpleDateFormat simpleDateFormat = b.f4773a;
                        String strB = b.b(scheduleTransferCreateActivity.f33360s0);
                        TextView textView10 = scheduleTransferCreateActivity.f33334H0;
                        if (textView10 != null) {
                            textView10.setText(strB);
                        }
                        scheduleTransferCreateActivity.v();
                    }
                    ConstraintLayout constraintLayout5 = scheduleTransferCreateActivity.f33332G0;
                    if (constraintLayout5 != null) {
                        h.C(constraintLayout5);
                    }
                    scheduleTransferCreateActivity.f33366w0 = 2;
                } else {
                    ConstraintLayout constraintLayout6 = scheduleTransferCreateActivity.f33332G0;
                    if (constraintLayout6 != null) {
                        h.c(constraintLayout6);
                    }
                }
                scheduleTransferCreateActivity.A(i7 == p159kd.e.rb_only_once);
                break;
            default:
                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = (ScheduleTransferCreateV2Activity) baseMvvmActivity;
                if (i7 == p159kd.e.rb_monthly) {
                    if (scheduleTransferCreateV2Activity.f33383X == null) {
                        ViewStub viewStub4 = (ViewStub) scheduleTransferCreateV2Activity.findViewById(p159kd.e.vst_monthly);
                        View viewInflate4 = viewStub4 != null ? viewStub4.inflate() : null;
                        scheduleTransferCreateV2Activity.f33383X = viewInflate4 != null ? (ConstraintLayout) viewInflate4.findViewById(p159kd.e.cl_monthly) : null;
                        scheduleTransferCreateV2Activity.f33392k0 = viewInflate4 != null ? (TextView) viewInflate4.findViewById(p159kd.e.tv_monthly_tips) : null;
                        TextView textView11 = viewInflate4 != null ? (TextView) viewInflate4.findViewById(p159kd.e.tv_monthly_end_time) : null;
                        scheduleTransferCreateV2Activity.f33385Z = textView11;
                        if (textView11 != null) {
                            textView11.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        TextView textView12 = viewInflate4 != null ? (TextView) viewInflate4.findViewById(p159kd.e.tv_monthly_day) : null;
                        scheduleTransferCreateV2Activity.f33384Y = textView12;
                        if (textView12 != null) {
                            textView12.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        scheduleTransferCreateV2Activity.u();
                        scheduleTransferCreateV2Activity.v();
                    }
                    ConstraintLayout constraintLayout7 = scheduleTransferCreateV2Activity.f33383X;
                    if (constraintLayout7 != null) {
                        h.C(constraintLayout7);
                    }
                    scheduleTransferCreateV2Activity.f33381M = 4;
                } else {
                    ConstraintLayout constraintLayout8 = scheduleTransferCreateV2Activity.f33383X;
                    if (constraintLayout8 != null) {
                        h.c(constraintLayout8);
                    }
                }
                if (i7 == p159kd.e.rb_weekly) {
                    if (scheduleTransferCreateV2Activity.f33395p0 == null) {
                        ViewStub viewStub5 = (ViewStub) scheduleTransferCreateV2Activity.findViewById(p159kd.e.vst_weekly);
                        View viewInflate5 = viewStub5 != null ? viewStub5.inflate() : null;
                        scheduleTransferCreateV2Activity.f33395p0 = viewInflate5 != null ? (ConstraintLayout) viewInflate5.findViewById(p159kd.e.cl_weekly) : null;
                        scheduleTransferCreateV2Activity.f33398s0 = viewInflate5 != null ? (TextView) viewInflate5.findViewById(p159kd.e.tv_weekly_tips) : null;
                        TextView textView13 = viewInflate5 != null ? (TextView) viewInflate5.findViewById(p159kd.e.tv_weekly_end_time) : null;
                        scheduleTransferCreateV2Activity.f33397r0 = textView13;
                        if (textView13 != null) {
                            textView13.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        TextView textView14 = viewInflate5 != null ? (TextView) viewInflate5.findViewById(p159kd.e.tv_weekly_day) : null;
                        scheduleTransferCreateV2Activity.f33396q0 = textView14;
                        if (textView14 != null) {
                            textView14.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        scheduleTransferCreateV2Activity.w();
                        scheduleTransferCreateV2Activity.x();
                    }
                    ConstraintLayout constraintLayout9 = scheduleTransferCreateV2Activity.f33395p0;
                    if (constraintLayout9 != null) {
                        h.C(constraintLayout9);
                    }
                    scheduleTransferCreateV2Activity.f33381M = 3;
                } else {
                    ConstraintLayout constraintLayout10 = scheduleTransferCreateV2Activity.f33395p0;
                    if (constraintLayout10 != null) {
                        h.c(constraintLayout10);
                    }
                }
                if (i7 == p159kd.e.rb_every_day) {
                    if (scheduleTransferCreateV2Activity.f33399t0 == null) {
                        ViewStub viewStub6 = (ViewStub) scheduleTransferCreateV2Activity.findViewById(p159kd.e.vst_daily);
                        View viewInflate6 = viewStub6 != null ? viewStub6.inflate() : null;
                        scheduleTransferCreateV2Activity.f33399t0 = viewInflate6 != null ? (ConstraintLayout) viewInflate6.findViewById(p159kd.e.cl_every_day) : null;
                        scheduleTransferCreateV2Activity.f33404w0 = viewInflate6 != null ? (TextView) viewInflate6.findViewById(p159kd.e.tv_daily_tips) : null;
                        TextView textView15 = viewInflate6 != null ? (TextView) viewInflate6.findViewById(p159kd.e.tv_daily_start_time) : null;
                        scheduleTransferCreateV2Activity.f33400u0 = textView15;
                        if (textView15 != null) {
                            textView15.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        textView = viewInflate6 != null ? (TextView) viewInflate6.findViewById(p159kd.e.tv_daily_end_time) : null;
                        scheduleTransferCreateV2Activity.f33402v0 = textView;
                        if (textView != null) {
                            textView.setOnClickListener(scheduleTransferCreateV2Activity);
                        }
                        SimpleDateFormat simpleDateFormat2 = b.f4773a;
                        String strB2 = b.b(scheduleTransferCreateV2Activity.f33376B);
                        TextView textView16 = scheduleTransferCreateV2Activity.f33400u0;
                        if (textView16 != null) {
                            textView16.setText(strB2);
                        }
                        scheduleTransferCreateV2Activity.t();
                    }
                    ConstraintLayout constraintLayout11 = scheduleTransferCreateV2Activity.f33399t0;
                    if (constraintLayout11 != null) {
                        h.C(constraintLayout11);
                    }
                    scheduleTransferCreateV2Activity.f33381M = 2;
                } else {
                    ConstraintLayout constraintLayout12 = scheduleTransferCreateV2Activity.f33399t0;
                    if (constraintLayout12 != null) {
                        h.c(constraintLayout12);
                    }
                }
                scheduleTransferCreateV2Activity.y(i7 == p159kd.e.rb_only_once);
                scheduleTransferCreateV2Activity.z();
                break;
        }
    }
}
