package com.transsnet.palmpay.main.export.bean;

import C0.G;
import Pa.F;
import android.content.Context;
import android.text.TextUtils;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PalmZoneTaskBean {
    public static final String BTN_TYPE_CLAIM = "CLAIM";
    public static final String BTN_TYPE_DONE = "DONE";
    public static final String BTN_TYPE_GO = "GO";
    public static final String BTN_TYPE_LOCK = "LOCK";
    public String activityCode;
    public String buttonType;
    public CornerMarkDTO cornerMarkDTO;
    public long curDayCompletionTimes;
    public long curWeekCompletionTimes;
    public String darkModeTaskPicture;
    public int frequencyCurrent;
    public String frequencyDisplayType;
    public int frequencyMax;
    public String memberTaskNo;
    public long perDayMax;
    public long perWeekMax;
    public long status;
    public String subtaskName;
    public String taskJumpParam;
    public String taskJumpPath;
    public String taskJumpType;
    public String taskName;
    public String taskPicture;
    public long taskType;
    public long totalCompletionTimes;
    public long totalMax;

    public static class CornerMarkDTO {
        public String displayText;
        public int itemType;
    }

    public String getFrequencyDisplayText() {
        if (BTN_TYPE_LOCK.equals(this.buttonType)) {
            return "(Tomorrow)";
        }
        if ("ONCE".equals(this.frequencyDisplayType)) {
            return "(Once)";
        }
        if ("DAILY".equals(this.frequencyDisplayType)) {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.frequencyCurrent);
            sb2.append("/");
            return G.n(this.frequencyMax, " per day)", sb2);
        }
        if (!"WEEKLY".equals(this.frequencyDisplayType) && !"MONTHLY".equals(this.frequencyDisplayType) && !"TOTAL".equals(this.frequencyDisplayType)) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(this.frequencyCurrent);
        sb3.append("/");
        return G.n(this.frequencyMax, ")", sb3);
    }

    public void itemClick(Context context) {
        if (TextUtils.isEmpty(this.taskJumpParam)) {
            ActivityUtils.startActivity(F.a(context, this.taskJumpPath));
        } else {
            F.f(this.taskJumpPath, this.taskJumpType, this.taskJumpParam);
        }
    }
}
