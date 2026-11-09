package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PalmZoneTasksRspV2 {
    public long expireTime;
    public int finishTaskNum;
    public int progressBarNum;
    public List<RewardsBean> progressBarRewardDTOList;
    public String progressBarTips;
    public long rewardSpecialMemberCycleId;
    public String taskActivityTitle;
    public List<PalmZoneTaskBean> taskRespList;

    public static class RewardsBean {
        public String completedIcon;
        public String completedIconDark;
        public long displayAmount;
        public boolean finish;
        public String incompleteIcon;
        public String incompleteIconDark;
        public String remark;
        public int taskNum;
    }
}
