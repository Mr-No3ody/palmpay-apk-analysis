package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData;", "<init>", "(Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData;)V", "getData", "()Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData;", "setData", "CLTaskData", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLTaskResp extends CommonResult {

    @Nullable
    private CLTaskData data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001aB9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData;", "", "dailyTasks", "", "Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask;", "dayOfWeek", "", "themeDayContent", "", "themeTasks", "<init>", "(Ljava/util/List;ILjava/lang/String;Ljava/util/List;)V", "getDailyTasks", "()Ljava/util/List;", "setDailyTasks", "(Ljava/util/List;)V", "getDayOfWeek", "()I", "setDayOfWeek", "(I)V", "getThemeDayContent", "()Ljava/lang/String;", "setThemeDayContent", "(Ljava/lang/String;)V", "getThemeTasks", "setThemeTasks", "CLTask", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CLTaskData {

        @Nullable
        private List<CLTask> dailyTasks;
        private int dayOfWeek;

        @Nullable
        private String themeDayContent;

        @Nullable
        private List<CLTask> themeTasks;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bM\u0018\u00002\u00020\u0001:\u0001nB\u009b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010'\"\u0004\bG\u0010)R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bH\u0010B\"\u0004\bI\u0010DR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010'\"\u0004\bK\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010)R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010'\"\u0004\bS\u0010)R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010+\"\u0004\bU\u0010-R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010-R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010+\"\u0004\b_\u0010-R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010'\"\u0004\ba\u0010)R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010'\"\u0004\bc\u0010)R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010'\"\u0004\be\u0010)R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010'\"\u0004\bg\u0010)R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010+\"\u0004\bm\u0010-¨\u0006o"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask;", "", "businessAmtExpression", "", "curDayCompletionTimes", "", "curWeekCompletionTimes", GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL, "perDayMax", "perWeekMax", "perMonthMax", "priority", "prizeValue", "", "prizeType", "sign", "subtaskName", "taskBizType", "taskContentType", "taskJumpParam", "taskJumpParamIos", "taskJumpPath", "taskJumpPathIos", "taskJumpType", "taskName", "taskPicture", "taskType", "totalCompletionTimes", "totalMax", "visitEvent", "visitSeconds", "taskTitle", "buff", "cornerMarkDTO", "Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask$cornerMarkDTOBean;", "taskGroupType", "<init>", "(Ljava/lang/String;IILjava/lang/String;IIILjava/lang/String;Ljava/lang/Long;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask$cornerMarkDTOBean;I)V", "getBusinessAmtExpression", "()Ljava/lang/String;", "setBusinessAmtExpression", "(Ljava/lang/String;)V", "getCurDayCompletionTimes", "()I", "setCurDayCompletionTimes", "(I)V", "getCurWeekCompletionTimes", "setCurWeekCompletionTimes", "getOrder", "setOrder", "getPerDayMax", "setPerDayMax", "getPerWeekMax", "setPerWeekMax", "getPerMonthMax", "setPerMonthMax", "getPriority", "setPriority", "getPrizeValue", "()Ljava/lang/Long;", "setPrizeValue", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrizeType", "setPrizeType", "getSign", "()Ljava/lang/Integer;", "setSign", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSubtaskName", "setSubtaskName", "getTaskBizType", "setTaskBizType", "getTaskContentType", "setTaskContentType", "getTaskJumpParam", "setTaskJumpParam", "getTaskJumpParamIos", "setTaskJumpParamIos", "getTaskJumpPath", "setTaskJumpPath", "getTaskJumpPathIos", "setTaskJumpPathIos", "getTaskJumpType", "setTaskJumpType", "getTaskName", "setTaskName", "getTaskPicture", "setTaskPicture", "getTaskType", "setTaskType", "getTotalCompletionTimes", "setTotalCompletionTimes", "getTotalMax", "setTotalMax", "getVisitEvent", "setVisitEvent", "getVisitSeconds", "setVisitSeconds", "getTaskTitle", "setTaskTitle", "getBuff", "setBuff", "getCornerMarkDTO", "()Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask$cornerMarkDTOBean;", "setCornerMarkDTO", "(Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask$cornerMarkDTOBean;)V", "getTaskGroupType", "setTaskGroupType", "cornerMarkDTOBean", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CLTask {

            @Nullable
            private String buff;

            @Nullable
            private String businessAmtExpression;

            @Nullable
            private cornerMarkDTOBean cornerMarkDTO;
            private int curDayCompletionTimes;
            private int curWeekCompletionTimes;

            @Nullable
            private String order;
            private int perDayMax;
            private int perMonthMax;
            private int perWeekMax;

            @Nullable
            private String priority;
            private int prizeType;

            @Nullable
            private Long prizeValue;

            @Nullable
            private Integer sign;

            @Nullable
            private String subtaskName;

            @Nullable
            private Integer taskBizType;

            @NotNull
            private String taskContentType;
            private int taskGroupType;

            @Nullable
            private String taskJumpParam;

            @Nullable
            private String taskJumpParamIos;

            @Nullable
            private String taskJumpPath;

            @Nullable
            private String taskJumpPathIos;
            private int taskJumpType;

            @Nullable
            private String taskName;

            @Nullable
            private String taskPicture;

            @Nullable
            private String taskTitle;
            private int taskType;
            private int totalCompletionTimes;
            private int totalMax;

            @Nullable
            private String visitEvent;

            @Nullable
            private String visitSeconds;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLTaskResp$CLTaskData$CLTask$cornerMarkDTOBean;", "", "cornerType", "", "cornerContent", "", "<init>", "(ILjava/lang/String;)V", "getCornerType", "()I", "setCornerType", "(I)V", "getCornerContent", "()Ljava/lang/String;", "setCornerContent", "(Ljava/lang/String;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class cornerMarkDTOBean {

                @NotNull
                private String cornerContent;
                private int cornerType;

                public cornerMarkDTOBean(int i7, @NotNull String cornerContent) {
                    Intrinsics.checkNotNullParameter(cornerContent, "cornerContent");
                    this.cornerType = i7;
                    this.cornerContent = cornerContent;
                }

                @NotNull
                public final String getCornerContent() {
                    return this.cornerContent;
                }

                public final int getCornerType() {
                    return this.cornerType;
                }

                public final void setCornerContent(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    this.cornerContent = str;
                }

                public final void setCornerType(int i7) {
                    this.cornerType = i7;
                }
            }

            public CLTask(@Nullable String str, int i7, int i10, @Nullable String str2, int i11, int i12, int i13, @Nullable String str3, @Nullable Long l5, int i14, @Nullable Integer num, @Nullable String str4, @Nullable Integer num2, @NotNull String taskContentType, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, int i15, @Nullable String str9, @Nullable String str10, int i16, int i17, int i18, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable cornerMarkDTOBean cornermarkdtobean, int i19) {
                Intrinsics.checkNotNullParameter(taskContentType, "taskContentType");
                this.businessAmtExpression = str;
                this.curDayCompletionTimes = i7;
                this.curWeekCompletionTimes = i10;
                this.order = str2;
                this.perDayMax = i11;
                this.perWeekMax = i12;
                this.perMonthMax = i13;
                this.priority = str3;
                this.prizeValue = l5;
                this.prizeType = i14;
                this.sign = num;
                this.subtaskName = str4;
                this.taskBizType = num2;
                this.taskContentType = taskContentType;
                this.taskJumpParam = str5;
                this.taskJumpParamIos = str6;
                this.taskJumpPath = str7;
                this.taskJumpPathIos = str8;
                this.taskJumpType = i15;
                this.taskName = str9;
                this.taskPicture = str10;
                this.taskType = i16;
                this.totalCompletionTimes = i17;
                this.totalMax = i18;
                this.visitEvent = str11;
                this.visitSeconds = str12;
                this.taskTitle = str13;
                this.buff = str14;
                this.cornerMarkDTO = cornermarkdtobean;
                this.taskGroupType = i19;
            }

            @Nullable
            public final String getBuff() {
                return this.buff;
            }

            @Nullable
            public final String getBusinessAmtExpression() {
                return this.businessAmtExpression;
            }

            @Nullable
            public final cornerMarkDTOBean getCornerMarkDTO() {
                return this.cornerMarkDTO;
            }

            public final int getCurDayCompletionTimes() {
                return this.curDayCompletionTimes;
            }

            public final int getCurWeekCompletionTimes() {
                return this.curWeekCompletionTimes;
            }

            @Nullable
            public final String getOrder() {
                return this.order;
            }

            public final int getPerDayMax() {
                return this.perDayMax;
            }

            public final int getPerMonthMax() {
                return this.perMonthMax;
            }

            public final int getPerWeekMax() {
                return this.perWeekMax;
            }

            @Nullable
            public final String getPriority() {
                return this.priority;
            }

            public final int getPrizeType() {
                return this.prizeType;
            }

            @Nullable
            public final Long getPrizeValue() {
                return this.prizeValue;
            }

            @Nullable
            public final Integer getSign() {
                return this.sign;
            }

            @Nullable
            public final String getSubtaskName() {
                return this.subtaskName;
            }

            @Nullable
            public final Integer getTaskBizType() {
                return this.taskBizType;
            }

            @NotNull
            public final String getTaskContentType() {
                return this.taskContentType;
            }

            public final int getTaskGroupType() {
                return this.taskGroupType;
            }

            @Nullable
            public final String getTaskJumpParam() {
                return this.taskJumpParam;
            }

            @Nullable
            public final String getTaskJumpParamIos() {
                return this.taskJumpParamIos;
            }

            @Nullable
            public final String getTaskJumpPath() {
                return this.taskJumpPath;
            }

            @Nullable
            public final String getTaskJumpPathIos() {
                return this.taskJumpPathIos;
            }

            public final int getTaskJumpType() {
                return this.taskJumpType;
            }

            @Nullable
            public final String getTaskName() {
                return this.taskName;
            }

            @Nullable
            public final String getTaskPicture() {
                return this.taskPicture;
            }

            @Nullable
            public final String getTaskTitle() {
                return this.taskTitle;
            }

            public final int getTaskType() {
                return this.taskType;
            }

            public final int getTotalCompletionTimes() {
                return this.totalCompletionTimes;
            }

            public final int getTotalMax() {
                return this.totalMax;
            }

            @Nullable
            public final String getVisitEvent() {
                return this.visitEvent;
            }

            @Nullable
            public final String getVisitSeconds() {
                return this.visitSeconds;
            }

            public final void setBuff(@Nullable String str) {
                this.buff = str;
            }

            public final void setBusinessAmtExpression(@Nullable String str) {
                this.businessAmtExpression = str;
            }

            public final void setCornerMarkDTO(@Nullable cornerMarkDTOBean cornermarkdtobean) {
                this.cornerMarkDTO = cornermarkdtobean;
            }

            public final void setCurDayCompletionTimes(int i7) {
                this.curDayCompletionTimes = i7;
            }

            public final void setCurWeekCompletionTimes(int i7) {
                this.curWeekCompletionTimes = i7;
            }

            public final void setOrder(@Nullable String str) {
                this.order = str;
            }

            public final void setPerDayMax(int i7) {
                this.perDayMax = i7;
            }

            public final void setPerMonthMax(int i7) {
                this.perMonthMax = i7;
            }

            public final void setPerWeekMax(int i7) {
                this.perWeekMax = i7;
            }

            public final void setPriority(@Nullable String str) {
                this.priority = str;
            }

            public final void setPrizeType(int i7) {
                this.prizeType = i7;
            }

            public final void setPrizeValue(@Nullable Long l5) {
                this.prizeValue = l5;
            }

            public final void setSign(@Nullable Integer num) {
                this.sign = num;
            }

            public final void setSubtaskName(@Nullable String str) {
                this.subtaskName = str;
            }

            public final void setTaskBizType(@Nullable Integer num) {
                this.taskBizType = num;
            }

            public final void setTaskContentType(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.taskContentType = str;
            }

            public final void setTaskGroupType(int i7) {
                this.taskGroupType = i7;
            }

            public final void setTaskJumpParam(@Nullable String str) {
                this.taskJumpParam = str;
            }

            public final void setTaskJumpParamIos(@Nullable String str) {
                this.taskJumpParamIos = str;
            }

            public final void setTaskJumpPath(@Nullable String str) {
                this.taskJumpPath = str;
            }

            public final void setTaskJumpPathIos(@Nullable String str) {
                this.taskJumpPathIos = str;
            }

            public final void setTaskJumpType(int i7) {
                this.taskJumpType = i7;
            }

            public final void setTaskName(@Nullable String str) {
                this.taskName = str;
            }

            public final void setTaskPicture(@Nullable String str) {
                this.taskPicture = str;
            }

            public final void setTaskTitle(@Nullable String str) {
                this.taskTitle = str;
            }

            public final void setTaskType(int i7) {
                this.taskType = i7;
            }

            public final void setTotalCompletionTimes(int i7) {
                this.totalCompletionTimes = i7;
            }

            public final void setTotalMax(int i7) {
                this.totalMax = i7;
            }

            public final void setVisitEvent(@Nullable String str) {
                this.visitEvent = str;
            }

            public final void setVisitSeconds(@Nullable String str) {
                this.visitSeconds = str;
            }
        }

        public CLTaskData(@Nullable List<CLTask> list, int i7, @Nullable String str, @Nullable List<CLTask> list2) {
            this.dailyTasks = list;
            this.dayOfWeek = i7;
            this.themeDayContent = str;
            this.themeTasks = list2;
        }

        @Nullable
        public final List<CLTask> getDailyTasks() {
            return this.dailyTasks;
        }

        public final int getDayOfWeek() {
            return this.dayOfWeek;
        }

        @Nullable
        public final String getThemeDayContent() {
            return this.themeDayContent;
        }

        @Nullable
        public final List<CLTask> getThemeTasks() {
            return this.themeTasks;
        }

        public final void setDailyTasks(@Nullable List<CLTask> list) {
            this.dailyTasks = list;
        }

        public final void setDayOfWeek(int i7) {
            this.dayOfWeek = i7;
        }

        public final void setThemeDayContent(@Nullable String str) {
            this.themeDayContent = str;
        }

        public final void setThemeTasks(@Nullable List<CLTask> list) {
            this.themeTasks = list;
        }
    }

    public CLTaskResp(@Nullable CLTaskData cLTaskData) {
        this.data = cLTaskData;
    }

    @Nullable
    public final CLTaskData getData() {
        return this.data;
    }

    public final void setData(@Nullable CLTaskData cLTaskData) {
        this.data = cLTaskData;
    }
}
